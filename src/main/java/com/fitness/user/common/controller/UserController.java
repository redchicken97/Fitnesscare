package com.fitness.user.common.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.user.common.service.UserService;
import com.fitness.user.common.vo.UserVO;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;	
	
	@RequestMapping("/login.do")
	public String loginUser(UserVO vo, HttpServletResponse response,HttpServletRequest request , Model model, HttpSession session) throws IOException {
//		request.setCharacterEncoding("UTF-8");
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
				out.println("alert('유저 비밀번호가 다릅니다.')");
				out.println("history.go(-1);");
				out.println("</script>");
			}else {
				session.setAttribute("userInfo", user_pwd);
				session.setMaxInactiveInterval(30*60);
	//			model.addAttribute("userInfo", user_pwd);
				return "redirect:/getUser.do";
			} 
		}
		return null;
	}
	@RequestMapping("/logout.do")
	public String logoutUser(HttpSession session) {
		session.removeAttribute("userInfo");
		return "redirect:/index.jsp";
	}
	@RequestMapping("/getUser.do")
	public String getUser(UserVO vo, HttpSession session, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
//		String user_pwd = (String)session.getAttribute("user_pwd");
	//	model.addAttribute("user_pwd");
		return "getUser";
	}
	
	@RequestMapping("/insertUser.do")
	public String insertUser(UserVO vo) {
		System.out.println("controller에서 회원 등록 ");
		userService.insertUser(vo);
		return "redirect:/getUserList.do";
	}
	
	@RequestMapping("/getUserList.do")
	public String getUserList(UserVO vo, Model model) {
		System.out.println("controller에서 회원 목록 보기");
		model.addAttribute("userList", userService.getUserList(vo));
		return "getUserList";
	}
	
	@RequestMapping("/deleteUser.do")
	public String deleteUser(UserVO vo) {
		System.out.println("controller에서 유저 삭제");
		userService.deleteUser(vo);
		return "redirect:/getUserList.do";
	}
}