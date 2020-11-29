package com.fitess.common.user.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
//		model.addAttribute("commentList", userCommentService.getCommentList(vo));
//		System.out.println("controller에서 확인 : " + userCommentService.getCommentList(vo));
		return userCommentService.getCommentList(vo);
	}
}
