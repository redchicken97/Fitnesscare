package com.fitess.common.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserCommentController {
	
	@RequestMapping("/comment.do")
	public String inputComment() {
		return "comment";
	}
}
