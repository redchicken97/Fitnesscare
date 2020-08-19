package com.fitess.common.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fitess.common.user.service.UserService;
import com.fitess.common.user.vo.UserVO;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	
	public String insertUser(UserVO vo) {
		System.out.println("controller에서 글 등록 ");
		userService.insertUser(vo);
		return "UserList.jsp";
	}
}
