package com.fitess.common.user.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitess.common.user.service.UserService;
import com.fitess.common.user.vo.UserVO;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login.do")
	public String loginUser(UserVO vo, HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		
		//유저 아이디를 기준으로 DB로 부터 내용을 가져옴
		UserVO user_pwd = userService.userLogin(vo.getUser_email());
		
		if(user_pwd == null) {
			out.println("<script>");
			out.println("alert('관리자 정보가 없습니다.');");
			out.println("history.back()");
			out.println("</script>");
		}
		
		return "check.jsp";
	}
	
	@RequestMapping("/insertUser.do")
	public String insertUser(UserVO vo) {
		System.out.println("controller에서 글 등록 ");
		userService.insertUser(vo);
		return "redirect:/getUserList.do";
	}
	@RequestMapping("/getUserList.do")
	public String getUserList(UserVO vo, Model model) {
		System.out.println("controller에서 회원 목록 보기");
		model.addAttribute("userList", userService.getUserList(vo));
		return "getUserList";
	}
}