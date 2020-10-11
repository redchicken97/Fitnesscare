package com.fitness.admin.veboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.common.paging.PageMaker;
import com.fitness.admin.veboard.service.VEBoardService;
import com.fitness.admin.veboard.vo.VEBoardVO;

@Controller
public class VEBoardController {

	@Autowired
	private VEBoardService vEBoardService;
	
	@RequestMapping(value="insertVEBoard.admin", method=RequestMethod.GET)
	public String insertVEBoardForm(VEBoardVO vo) {
		System.out.println("VEBoardController.insertVEBoardForm 실행");
		return "insertVEBoard";
	}
	
	@RequestMapping(value="insertVEBoard.admin", method=RequestMethod.POST)
	public String insertVEBoard(VEBoardVO vo) {
		System.out.println("VEBoardController.insertVEBoard 실행");
		vEBoardService.insertVEBoard(vo);
		return "redirect:/getVEBoardList.admin";
	}
	
	@RequestMapping(value="updateVEBoard.admin", method=RequestMethod.GET)
	public String updateVEBoardForm(VEBoardVO vo, Model model) {
		System.out.println("VEBoardController.updateVEBoardForm 실행");
		model.addAttribute("veboard", vEBoardService.getVEBoard(vo));
		return "updateVEBoard";
	}
	
	@RequestMapping(value="updateVEBoard.admin", method=RequestMethod.POST)
	public String updateVEBoard(VEBoardVO vo) {
		System.out.println("VEBoardController.updateVEBoard 실행");
		vEBoardService.updateVEBoard(vo);
		return "redirect:/getVEBoard.admin?ex_id=" + vo.getEx_id();
	}
	/* 추후 구현
	@RequestMapping("deleteVEBoard.admin")
	public String deleteVEBoard(VEBoardVO vo) {
		System.out.println("VEBoardController.deleteVEBoard 실행");
		vEBoardService.deleteVEBoard(vo);
		return "redirect:/getVEBoardList.admin";
	}
	*/
	
	@RequestMapping("getVEBoard.admin")
	public String getVEBoard(VEBoardVO vo, Model model) {
		System.out.println("VEBoardController.getVEBoard 실행");
		model.addAttribute("veboard", vEBoardService.getVEBoard(vo));
		return "getVEBoard";
	}
	
	@RequestMapping("getVEBoardList.admin")
	public String getVEBoardList(Model model, Criteria cri) {
		System.out.println("VEBoardController.getVEBoardList 실행");
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(vEBoardService.getVEBoardCount());
		cri = pageMaker.getCri();
		model.addAttribute("pageMaker", pageMaker);
		
		model.addAttribute("veboardList", vEBoardService.getVEBoardList(cri));
		return "getVEBoardList";
	}
	
}
