package com.fitness.user.qeboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.user.qeboard.service.QeBoardService;
import com.fitness.user.qeboard.vo.QeBoardVO;

@Controller
public class QeBoardController {
	
	@Autowired
	private QeBoardService qeBoardService;
	
	@RequestMapping("/insertQeBoard.do")
	public String insertQeBoard(QeBoardVO vo) {
		System.out.println("질문 게시판 글 작성 controller");
		qeBoardService.insertQeBoard(vo);
		return "redirect:/getQeBoardList.do";
	}
	@RequestMapping("/getQeBoardList.do")
	public String getQeBoardList(QeBoardVO vo, Model model) {
		System.out.println("질문 게시판 글 가져오기 controller");
		model.addAttribute("QeList", qeBoardService.getQeBoardList(vo));
		return "qeBoard/getQeBoardList";
	}
	@RequestMapping("/getQeBoard.do")
	public String getQeBoard(QeBoardVO vo, Model model) {
		model.addAttribute("QeBoard", qeBoardService.getQeBoard(vo));
		return "qeBoard/getQeBoard";
	}
	@RequestMapping("/deleteQeBoard.do")
	public String deleteQeBoard(QeBoardVO vo) {
		qeBoardService.deleteQeBoard(vo);
		return "redirect:/getQeBoardList.do";
	}
	@RequestMapping("/updateQeBoard.do")
	public String updateQeBoard(QeBoardVO vo) {
		qeBoardService.updateBoard(vo);
		return "redirect:/getQeBoard.do?q_id" + vo.getQ_id();
	}
	
}
