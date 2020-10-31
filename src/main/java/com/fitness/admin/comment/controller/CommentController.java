package com.fitness.admin.comment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fitness.admin.comment.service.CommentService;
import com.fitness.admin.comment.vo.CommentVO;

@Controller
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	// 아래 DML 기능들은 form action 또는 url을 통해 구현되므로 controller에 남김
	@RequestMapping("insertComment.admin")
	public String insertComment(CommentVO vo) {
		System.out.println("CommentController.insertComment 실행");
		// 삽입 전에, 원글의 cmt_id를 가져와서 cmt_ref에 넣어줘야함
		commentService.insertComment(vo);
		// 대상 게시판의 cmt_type값에 따라 return url값이 달라져야함
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
