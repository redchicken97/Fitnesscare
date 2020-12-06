package com.fitness.admin.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fitness.admin.admin.service.AdminService;
import com.fitness.admin.admin.vo.AdminVO;

@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value="mainAdmin.admin")
	public String mainAdmin() {
		System.out.println("AdminController.mainAdmin 실행");
		return "mainAdmin";
	}
	
	@RequestMapping(value="insertAdmin.admin", method=RequestMethod.GET)
	public String insertAdminForm(AdminVO vo) {
		System.out.println("AdminController.insertAdminForm 실행");
		return "insertAdmin";
	}
	
	@RequestMapping(value="frontBoard.admin", method=RequestMethod.GET)
	public String frontBoard() {
		return "frontBoard";
	}
	
	@RequestMapping(value="frontLogin.admin", method=RequestMethod.GET)
	public String frontLogin() {
		return "frontLogin";
	}
	
	@RequestMapping(value="insertAdmin.admin", method=RequestMethod.POST)
	public String insertAdmin(AdminVO vo) {
		System.out.println("AdminController.insertAdmin 실행");
		adminService.insertAdmin(vo);
		return "redirect:/getAdminList.admin";
	}
	
	@RequestMapping(value="updateAdmin.admin", method=RequestMethod.GET)
	public String updateAdminForm(AdminVO vo, Model model) {
		System.out.println("AdminController.updateAdminForm 실행");
		model.addAttribute("admin", adminService.getAdmin(vo));
		return "updateAdmin";
	}
	
	@RequestMapping(value="updateAdmin.admin", method=RequestMethod.POST)
	public String updateAdmin(AdminVO vo) {
		System.out.println("AdminController.updateAdmin 실행");
		adminService.updateAdmin(vo);
		return "redirect:/getAdminList.admin";
	}
	
	@RequestMapping("deleteAdmin.admin")
	public String deleteAdmin(AdminVO vo) {
		System.out.println("AdminController.deleteAdmin 실행");
		adminService.deleteAdmin(vo);
		return "redirect:/getAdminList.admin";
	}
	
	@RequestMapping("getAdminList.admin")
	public String getAdminList(AdminVO vo, Model model) {
		System.out.println("AdminController.getAdminList 실행");
		model.addAttribute("adminList", adminService.getAdminList(vo));
		return "getAdminList";
	}
	
}
