package com.fitness.admin.noboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.admin.noboard.service.NoBoardService;
import com.fitness.admin.noboard.vo.NoBoardVO;

@Controller
public class NoBoardController {

	
	@Autowired
	private NoBoardService noBoardService;
	
	@RequestMapping("/insertNoBoard.do")
	public String insertNoBoard(NoBoardVO vo) {
		System.out.println("공지 게시판 입력 controller");
		noBoardService.insertNoBoard(vo);
		return "redirect:/getNoBoardList.do";
	}
	@RequestMapping("/getNoBoardList.do")
	public String getNoBoardList(NoBoardVO vo, Model model) {
		System.out.println("공지 게시판 글 전체 controller");
		model.addAttribute("NoList", noBoardService.getNoBoardList());
		return "noBoard/getNoBoardList";
	}
	@RequestMapping("/getNoBoard.do")
	public String getNoBoard(NoBoardVO vo, Model model) {
		System.out.println("공지 게시판 하나 controller");
		model.addAttribute("NoBoard", noBoardService.getNoBoard(vo));
		return "noBoard/getNoBoard";
	}
	@RequestMapping("/deleteNoBoard.do")
	public String deleteNoBoard(NoBoardVO vo) {
		System.out.println("공지 게시판 삭제 controller");
		noBoardService.deleteNoBoard(vo);
		return "redirect:/getNoBoardList.do";
	}
	
	
}
