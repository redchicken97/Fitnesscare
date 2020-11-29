package com.fitness.admin.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.admin.common.mail.MailService;
import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.common.paging.PageMaker;
import com.fitness.admin.user.service.UserService;
import com.fitness.admin.user.vo.UserVO;

@Controller
@EnableAsync
public class UserManController {

	@Autowired
	private UserService userService;
	@Autowired
	private MailService mailService;
	
	@RequestMapping("suspendUser.admin")
	public String suspendUser(UserVO vo, HttpServletRequest request,
				HttpServletResponse response) throws Exception {
		System.out.println("UserController.suspendUser 실행");
		userService.suspendUser(vo);
		
		// 사용 정지된 사실에 대한 메일을 대상 사용자에게 전송한다.
		StringBuffer sb = new StringBuffer();
		sb.append("관리자에 의해 " + vo.getUser_email() + "계정이 정지되었습니다.<br />");
		sb.append("자세한 사항은 관리자(ghp0405@gmail.com)에게 문의하여 주십시오.");
		String str = sb.toString();
		mailService.sendMail(vo.getUser_email().toString(), 
				vo.getUser_email().toString() + " 계정이 정지되었습니다.", str);
		
		return "redirect:/getUserList.admin";
	}
	
	@RequestMapping("unsuspendUser.admin")
	public String unsuspendUser(UserVO vo, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("UserController.unsuspendUser 실행");
		userService.unsuspendUser(vo);
		
		// 사용 정지 해제된 사실에 대한 메일을 대상 사용자에게 전송한다.
		StringBuffer sb = new StringBuffer();
		sb.append(vo.getUser_email() + "계정에 대한 정지가 해제되었습니다. <br />");
		sb.append("자세한 사항은 관리자(ghp0405@gmail.com)에게 문의하여 주십시오.");
		String str = sb.toString();
		mailService.sendMail(vo.getUser_email().toString(), 
				vo.getUser_email().toString() + " 계정에 대한 정지가 해제되었습니다.", str);
		
		return "redirect:/getUserList.admin";
	}
	
	@RequestMapping("getUser.admin")
	public String getUser(UserVO vo, Model model) {
		System.out.println("UserController.getUser 실행");
		model.addAttribute("user", userService.getUser(vo));
		return "getUser";
	}
	
	@RequestMapping("getUserList.admin")
	public String getUserList(Model model, Criteria cri) {
		System.out.println("UserController.getUserList 실행");
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(userService.getUserCount());
		cri = pageMaker.getCri();
		model.addAttribute("pageMaker", pageMaker);
		
		model.addAttribute("userList", userService.getUserList(cri));
		return "getUserList";
	}
	
}
