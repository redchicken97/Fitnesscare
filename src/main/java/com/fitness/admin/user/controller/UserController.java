package com.fitness.admin.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.common.paging.PageMaker;
import com.fitness.admin.user.service.UserService;
import com.fitness.admin.user.vo.UserVO;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("suspendUser.admin")
	public String suspendUser(UserVO vo) {
		System.out.println("UserController.suspendUser 角青");
		userService.suspendUser(vo);
		return "redirect:/getUserList.admin";
	}
	
	@RequestMapping("unsuspendUser.admin")
	public String unsuspendUser(UserVO vo) {
		System.out.println("UserController.unsuspendUser 角青");
		userService.unsuspendUser(vo);
		return "redirect:/getUserList.admin";
	}
	
	@RequestMapping("getUser.admin")
	public String getUser(UserVO vo, Model model) {
		System.out.println("UserController.getUser 角青");
		model.addAttribute("user", userService.getUser(vo));
		return "getUser";
	}
	
	@RequestMapping("getUserList.admin")
	public String getUserList(Model model, Criteria cri) {
		System.out.println("UserController.getUserList 角青");
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(userService.getUserCount());
		cri = pageMaker.getCri();
		model.addAttribute("pageMaker", pageMaker);
		
		model.addAttribute("userList", userService.getUserList(cri));
		return "getUserList";
	}
	
}
