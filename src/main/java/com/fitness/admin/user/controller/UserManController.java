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
import com.fitness.admin.user.service.UserManService;
import com.fitness.admin.user.vo.UserManVO;

@Controller
@EnableAsync
public class UserManController {

	@Autowired
	private UserManService userManService;
	@Autowired
	private MailService mailService;
	
	@RequestMapping("suspendUser.admin")
	public String suspendUser(UserManVO vo, HttpServletRequest request,
				HttpServletResponse response) throws Exception {
		System.out.println("UserController.suspendUser 실행");
		userManService.suspendUser(vo);
		
		// 사용 정지된 사실에 대한 메일을 대상 사용자에게 전송한다.
		StringBuffer sb = new StringBuffer();
		sb.append("관리자에 의해 " + vo.getUser_email() + "계정이 정지되었습니다.<br />");
		sb.append("자세한 사항은 관리자(ghp0405@gmail.com)에게 문의하여 주십시오.");
		String str = sb.toString();
		mailService.sendMail(vo.getUser_email().toString(), 
				vo.getUser_email().toString() + " 계정이 정지되었습니다.", str);
		
		return "redirect:/getUserInfoList.admin";
	}
	
	@RequestMapping("unsuspendUser.admin")
	public String unsuspendUser(UserManVO vo, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("UserController.unsuspendUser 실행");
		userManService.unsuspendUser(vo);
		
		// 사용 정지 해제된 사실에 대한 메일을 대상 사용자에게 전송한다.
		StringBuffer sb = new StringBuffer();
		sb.append(vo.getUser_email() + "계정에 대한 정지가 해제되었습니다. <br />");
		sb.append("자세한 사항은 관리자(ghp0405@gmail.com)에게 문의하여 주십시오.");
		String str = sb.toString();
		mailService.sendMail(vo.getUser_email().toString(), 
				vo.getUser_email().toString() + " 계정에 대한 정지가 해제되었습니다.", str);
		
		return "redirect:/getUserInfoList.admin";
	}
	
	@RequestMapping("getUserInfo.admin")
	public String getUser(UserManVO vo, Model model) {
		System.out.println("UserController.getUserInfo 실행");
		model.addAttribute("user", userManService.getUserInfo(vo));
		return "getUserInfo";
	}
	
	@RequestMapping("getUserInfoList.admin")
	public String getUserInfoList(Model model, Criteria cri) {
		System.out.println("UserController.getUserInfoList 실행");
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(userManService.getUserCount());
		cri = pageMaker.getCri();
		model.addAttribute("pageMaker", pageMaker);
		
		model.addAttribute("userList", userManService.getUserInfoList(cri));
		return "getUserInfoList";
	}
	
}
