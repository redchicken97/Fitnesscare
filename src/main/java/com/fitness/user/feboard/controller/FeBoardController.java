package com.fitness.user.feboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.user.feboard.service.FeBoardService;
import com.fitness.user.feboard.vo.FeBoardVO;

@Controller
public class FeBoardController {
	
	@Autowired
	private FeBoardService feBoardService;
	
	@RequestMapping("/insertFeBoard.do")
	public String insertFeBoard(FeBoardVO vo) {
		System.out.println("자유 게시판 입력 controller");
		feBoardService.insertFeBoard(vo);
		return "redirect:/getFeBoardList.do";
	}
	@RequestMapping("/getFeBoard.do")
	public String getFeBoard(FeBoardVO vo, Model model) {
		System.out.println("자유 게시판 게시문 가져오기 controller");
		model.addAttribute("FeBaord", feBoardService.getFeBoard(vo));
		return "getFeBoard";
	}
	@RequestMapping("/getFeBoardList.do")
	public String getFeBoardList(FeBoardVO vo, Model model) {
		System.out.println("자유 게시판 List controller");
		model.addAttribute("FeList", feBoardService.getFeBoardList(vo));
		return "getFeBoardList";
	}
	@RequestMapping("/deleteFeBoard.do")
	public String deleteFeBoard(FeBoardVO vo) {
		return "redirect:/getFeBoardList.do";
	}
}
