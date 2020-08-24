package com.fitess.common.user.controller;

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
	
	@RequestMapping("/insertUser.do")
	public String insertUser(UserVO vo) {
		System.out.println("controller에서 글 등록 ");
		userService.insertUser(vo);
		return "UserList.do";
	}
	@RequestMapping("/getUserList.do")
	public String getUserList(UserVO vo, Model model) {
		System.out.println("controller에서 회원 목록 보기");
		model.addAttribute("userList", userService.getUserList(vo));
		return "getUserList";
	}
}
