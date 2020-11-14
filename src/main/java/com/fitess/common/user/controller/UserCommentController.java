package com.fitess.common.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitess.common.user.service.UserCommentService;
import com.fitess.common.user.vo.CommentInfoVO;

@Controller
public class UserCommentController {
	
	@Autowired
	private UserCommentService userCommentService;
	
	@RequestMapping("/commentInput.do")
	public String insertComment(CommentInfoVO vo) {
		System.out.println("controller에서 insertComment 작동");
		userCommentService.insertComment(vo);
		return null;
	}
	
	@RequestMapping("/reCommentInput.do")
	public String reInsertComment(CommentInfoVO vo) {
		System.out.println("controller에서 reInsertComment 작동");
		userCommentService.reInsertComment(vo);
		return null;
	}
	
	@RequestMapping("/commentList.do")
	public String getCommentList(CommentInfoVO vo, Model model) {
		System.out.println("controller에서 getCommentList 작동");
		model.addAttribute("commentList", userCommentService.getCommentList(vo));
		return "comment";
	}
}
