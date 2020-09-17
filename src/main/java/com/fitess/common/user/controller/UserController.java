package com.fitess.common.user.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fitess.common.user.service.UserKakaoService;
import com.fitess.common.user.service.UserService;
import com.fitess.common.user.vo.UserVO;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserKakaoService userkakaoService;
	
	@RequestMapping("/kakaoredirect.do")
	public String K_loginUser(@RequestParam("code") String code, HttpSession session) {
		//System.out.println("code : " + code);
		
		String access_Token = userkakaoService.getAccessToken(code);
		HashMap<String, Object> userInfo = userkakaoService.getUserInfo(access_Token);
		System.out.println("login Controller :" + userInfo);
		
		// 클라이언트의 이메일이 존재할 때 세션에 해당 이메일과 토큰등록
		if (userInfo.get("email") != null) {
			session.setAttribute("userId", userInfo.get("email"));
			session.setAttribute("userNick", userInfo.get("nickname"));
			session.setAttribute("access_Token", access_Token);
		}
		return "redirect:/kakaoredirect.jsp";
	}
	
	@RequestMapping("/login.do")
	public String loginUser(UserVO vo, HttpServletResponse response,HttpServletRequest request , Model model) throws IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println("controller 로그인");
		PrintWriter out = response.getWriter();
		
		//유저 아이디를 기준으로 DB로 부터 내용을 가져옴
		UserVO user_pwd = userService.userLogin(vo.getUser_email());
		
		if(user_pwd == null) {
			out.println("<script>");
			out.println("alert('유저 정보가 없습니다.');");
			out.println("history.back()");
			out.println("</script>");
		}else {
			if(!user_pwd.getUser_pw().equals(vo.getUser_pw())) {
				out.println("<script>");
				out.println("alert('유저 비민번호가 다릅니다.')");
				out.println("history.go(-1);");
				out.println("</script>");
			}else {
				
				model.addAttribute("userInfo", user_pwd);
				return "check";
			}
		}
		return null;
	}
	
	@RequestMapping("/insertUser.do")
	public String insertUser(UserVO vo) {
		System.out.println("controller에서 글 등록 ");
		userService.insertUser(vo);
		return "redirect:/getUserList.do";
	}
	
	@RequestMapping("/insertKakaoUser.do")
	public String insertKakaoUser(UserVO vo) {
		System.out.println("controller에서 kakao 유저 회원가입");
		userkakaoService.insertKakaoUser(vo);
		return "getUserList";
	}
	
	@RequestMapping("/getUserList.do")
	public String getUserList(UserVO vo, Model model) {
		System.out.println("controller에서 회원 목록 보기");
		model.addAttribute("userList", userService.getUserList(vo));
		return "getUserList";
	}
}