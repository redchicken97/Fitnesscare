package com.fitness.admin.qeboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fitness.admin.comment.service.CommentService;
import com.fitness.admin.comment.vo.CommentVO;
import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.common.paging.PageMaker;
import com.fitness.admin.qeboard.service.QEBoardService;
import com.fitness.admin.qeboard.vo.QEBoardVO;

@Controller
public class QEBoardController {

	@Autowired
	private QEBoardService qEBoardService;
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping(value="insertQEBoard.admin", method=RequestMethod.GET)
	public String insertQEBoardForm(QEBoardVO vo) {
		System.out.println("QEBoardController.insertQEBoardForm 실행");
		return "insertQEBoard";
	}
	
	@RequestMapping(value="insertQEBoard.admin", method=RequestMethod.POST)
	public String insertQEBoard(QEBoardVO vo) {
		System.out.println("QEBoardController.insertQEBoard 실행");
		qEBoardService.insertQEBoard(vo);
		return "redirect:/getQEBoardList.admin";
	}
	
	@RequestMapping(value="updateQEBoard.admin", method=RequestMethod.GET)
	public String updateQEBoardForm(QEBoardVO vo, Model model) {
		System.out.println("QEBoardController.updateQEBoardForm 실행");
		model.addAttribute("qeboard", qEBoardService.getQEBoard(vo));
		return "updateQEBoard";
	}
	
	@RequestMapping(value="updateQEBoard.admin", method=RequestMethod.POST)
	public String updateQEBoard(QEBoardVO vo) {
		System.out.println("QEBoardController.updateQEBoard 실행");
		qEBoardService.updateQEBoard(vo);
		return "redirect:/getQEBoard.admin?q_id=" + vo.getQ_id();
	}
	
	@RequestMapping("deleteQEBoard.admin")
	public String deleteQEBoard(QEBoardVO vo) {
		System.out.println("QEBoardController.deleteQEBoard 실행");
		qEBoardService.deleteQEBoard(vo);
		return "redirect:/getQEBoardList.admin";
	}
	
	@RequestMapping("getQEBoard.admin")
	public String getQEBoard(QEBoardVO vo, Model model) {
		System.out.println("QEBoardController.getQEBoard 실행");
		model.addAttribute("qeboard", qEBoardService.getQEBoard(vo));
		
		// 댓글 세팅
		CommentVO cvo = new CommentVO();
		cvo.setCmt_type("question");
		cvo.setTarget_id(vo.getQ_id());
		model.addAttribute("commentList", commentService.getCommentList(cvo));
		
		return "getQEBoard";
	}
	
	@RequestMapping("getQEBoardList.admin")
	public String getQEBoardList(Model model, Criteria cri) {
		System.out.println("QEBoardController.getQEBoardList 실행");
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(qEBoardService.getQEBoardCount());
		cri = pageMaker.getCri();
		model.addAttribute("pageMaker", pageMaker);
		
		model.addAttribute("qeboardList", qEBoardService.getQEBoardList(cri));
		return "getQEBoardList";
	}
	
}
