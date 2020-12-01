package com.fitness.user.comment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fitness.user.comment.service.UserCommentService;
import com.fitness.user.comment.vo.CommentInfoVO;

@Controller
public class UserCommentController {
	
	@Autowired
	private UserCommentService userCommentService;
	
	@RequestMapping("/commentInput.do")
	public String insertComment(CommentInfoVO vo) {
		System.out.println("controller에서 insertComment 작동");
		userCommentService.insertComment(vo);
		return "comment";
	}
	
	@RequestMapping("/reCommentInput.do")
	public String reInsertComment(CommentInfoVO vo) {
		System.out.println("controller에서 reInsertComment 작동");
		userCommentService.reInsertComment(vo);
		return null;
	}
	
	@RequestMapping("/commentList.do")
	@ResponseBody
	public List<String> getCommentList(CommentInfoVO vo) {	
		System.out.println("controller에서 getCommentList 작동");
		return userCommentService.getCommentList(vo);
	}
}
