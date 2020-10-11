package com.fitness.admin.feboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.common.paging.PageMaker;
import com.fitness.admin.feboard.service.FEBoardService;
import com.fitness.admin.feboard.vo.FEBoardVO;

@Controller
public class FEBoardController {

	@Autowired
	private FEBoardService fEBoardService;
	
	@RequestMapping(value="insertFEBoard", method=RequestMethod.GET)
	public String insertFEBoardFrom(FEBoardVO vo) {
		System.out.println("FEBoardController.insertFEBoardFrom 角青");
		return "insertFEBoard";
	}
	
	@RequestMapping(value="insertFEBoard", method=RequestMethod.POST)
	public String insertFEBoard(FEBoardVO vo) {
		System.out.println("FEBoardController.insertFEBoard 角青");
		fEBoardService.insertFEBoard(vo);
		return "redirect:/getFEBoardList.admin";
	}
	
	@RequestMapping(value="updateFEBoard", method=RequestMethod.GET)
	public String updateFEBoardFrom(FEBoardVO vo, Model model) {
		System.out.println("FEBoardController.updateFEBoardFrom 角青");
		model.addAttribute("feboard", fEBoardService.getFEBoard(vo));
		return "updateFEBoard";
	}
	
	@RequestMapping(value="updateFEBoard", method=RequestMethod.POST)
	public String updateFEBoard(FEBoardVO vo) {
		System.out.println("FEBoardController.updateFEBoard 角青");
		fEBoardService.updateFEBoard(vo);
		return "redirect:/getFEBoard.admin?free_id=" + vo.getFree_id();
	}
	/*
	@RequestMapping("deleteFEBoard")
	public String deleteFEBoard(FreeVO vo) {
		System.out.println("FEBoardController.deleteFEBoard 角青");
		fEBoardService.deleteFEBoard(vo);
		return "redirect:/getFEBoardList.admin";
	}
	*/
	@RequestMapping("getFEBoard")
	public String getFEBoard(FEBoardVO vo, Model model) {
		System.out.println("FEBoardController.getFEBoard 角青");
		model.addAttribute("feboard", fEBoardService.getFEBoard(vo));
		return "getFEBoard";
	}
	
	@RequestMapping("getFEBoardList")
	public String getFEBoardList(Criteria cri, Model model) {
		System.out.println("FEBoardController.getFEBoardList 角青");
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(fEBoardService.getFEBoardCount());
		cri = pageMaker.getCri();
		model.addAttribute("pageMaker", pageMaker);
		
		model.addAttribute("feboardList", fEBoardService.getFEBoardList(cri));
		return "getFEBoardList";
	}
	
}
