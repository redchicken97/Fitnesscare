package com.fitness.admin.hteboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.common.paging.PageMaker;
import com.fitness.admin.hteboard.service.HTEBoardService;
import com.fitness.admin.hteboard.vo.HTEBoardVO;

@Controller
public class HTEBoardController {

	@Autowired
	private HTEBoardService hTEBoardService;
	
	@RequestMapping(value="insertHTEBoard", method=RequestMethod.GET)
	public String insertHTEBoardForm(HTEBoardVO vo) {
		System.out.println("HTEBoardController.insertHTEBoardForm 角青");
		return "insertHTEBoard";
	}
	
	@RequestMapping(value="insertHTEBoard", method=RequestMethod.POST)
	public String insertHTEBoard(HTEBoardVO vo) {
		System.out.println("HTEBoardController.insertHTEBoard 角青");
		hTEBoardService.insertHTEBoard(vo);
		return "redirect:/getHTEBoardList.admin";
	}
	
	@RequestMapping(value="updateHTEBoard", method=RequestMethod.GET)
	public String updateHTEBoardForm(HTEBoardVO vo, Model model) {
		System.out.println("HTEBoardController.updateHTEBoardForm 角青");
		model.addAttribute("hteboard", hTEBoardService.getHTEBoard(vo));
		return "updateHTEBoard";
	}
	
	@RequestMapping(value="updateHTEBoard", method=RequestMethod.POST)
	public String updateHTEBoard(HTEBoardVO vo) {
		System.out.println("HTEBoardController.updateHTEBoard 角青");
		hTEBoardService.updateHTEBoard(vo);
		return "redirect:/getHTEBoard.admin?ht_id=" + vo.getHt_id();
	}
	
	@RequestMapping("deleteHTEBoard")
	public String deleteHTEBoard(HTEBoardVO vo) {
		System.out.println("HTEBoardController.deleteHTEBoard 角青");
		hTEBoardService.deleteHTEBoard(vo);
		return "redirect:/getHTEBoardList.admin";
	}
	
	@RequestMapping("getHTEBoard.admin")
	public String getHTEBoard(HTEBoardVO vo, Model model) {
		System.out.println("HTEBoardController.getHTEBoard 角青");
		model.addAttribute("hteboard", hTEBoardService.getHTEBoard(vo));
		return "getHTEBoard";
	}
	
	@RequestMapping("getHTEBoardList.admin")
	public String getHTEBoardList(Criteria cri, Model model) {
		System.out.println("HTEBoardController.getHTEBoardList 角青");
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(hTEBoardService.getHTEBoardCount());
		cri = pageMaker.getCri();
		model.addAttribute("pageMaker", pageMaker);
		
		model.addAttribute("hteboardList", hTEBoardService.getHTEBoardList(cri));
		return "getHTEBoardList";
	}
	
}
