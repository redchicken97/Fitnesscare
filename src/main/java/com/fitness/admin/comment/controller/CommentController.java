package com.fitness.admin.comment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.admin.comment.service.CommentService;
import com.fitness.admin.comment.vo.CommentVO;

@Controller
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	@RequestMapping("insertComment.admin")
	public String insertComment(CommentVO vo) {
		System.out.println("CommentController.insertComment 실행");
		commentService.insertComment(vo);
		return "redirect:/getQEBoard.admin?q_id=" + vo.getTarget_id();
	}
	
	@RequestMapping("updateComment.admin")
	public void updateComment(CommentVO vo) {
		System.out.println("CommentController.updateComment 실행");
		commentService.updateComment(vo);
	}
	
	@RequestMapping("deleteComment.admin")
	public void deleteComment(CommentVO vo) {
		System.out.println("CommentController.deleteComment 실행");
		commentService.deleteComment(vo);
	}
	
}
