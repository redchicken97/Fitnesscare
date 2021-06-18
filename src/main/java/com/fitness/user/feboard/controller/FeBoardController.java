package com.fitness.user.feboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.user.feboard.service.FeBoardService;
import com.fitness.user.feboard.vo.FeBoardVO;

@Controller
public class FeBoardController {
	
	@Autowired
	private FeBoardService feBoardService;
	
	@RequestMapping("/insertFeBoard.do")
	public String insertFeBoard(FeBoardVO vo) {
		feBoardService.insertFEBoard(vo);
		return "redirect:/getFeBoardList.do";
	}
	@RequestMapping("/getFeBoardList.do")
	public String getFeBoardList(FeBoardVO vo) {
		return "getFEBoardList";
	}
}
