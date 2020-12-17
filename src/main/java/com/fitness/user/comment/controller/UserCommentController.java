package com.fitness.user.comment.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fitness.user.comment.service.UserCommentService;
import com.fitness.user.comment.vo.CommentInfoVO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

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
	
	@RequestMapping("/comment.do")
	public String comment(CommentInfoVO vo) {
		System.out.println("controller 에서 comment 메핑");
		return "comment";
	}
	
	@RequestMapping("/getComment.do")
	public String getComment(CommentInfoVO vo, Model model) {
		System.out.println("controller에서 getComment 실행");
		model.addAttribute("commentOne", userCommentService.getComment(vo));
		return "getComment";
	}
	
	@RequestMapping("/commentList.do")
	public @ResponseBody List<String> getCommentList(CommentInfoVO vo) {	
		System.out.println("controller에서 getCommentList 작동");
		return userCommentService.getCommentList(vo);
	}
	
	@RequestMapping("/upRdCnt.do")
	@ResponseBody String upRdCnt(@RequestBody Map<String, Object> param) {
		System.out.println("controller 에서 upRdCnt 실행");
		CommentInfoVO vo1 = new CommentInfoVO();
		CommentInfoVO vo2 = new CommentInfoVO();
		
		JsonObject Rd = new JsonObject();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		int cmt_id = (int) param.get("cmt_id");
		int cmt_rdcnt = (int) param.get("cmt_rdcnt");
		vo1.setCmt_id(cmt_id);
		vo1.setCmt_rdCnt(cmt_rdcnt);
		
		userCommentService.upRdCnt(vo1);	
		
		Rd.addProperty("cmt_id", userCommentService.getComment(vo2).getCmt_id());
		Rd.addProperty("cmt_rdcnt", userCommentService.getComment(vo2).getCmt_rdCnt());
		
		String json = gson.toJson(Rd);
		
		return json;
	}
//	@RequestMapping("/upReportCnt.do")
	
	@RequestMapping("/updateComment.do")
	public String updateComment(CommentInfoVO vo) {
		System.out.println("controller에서 updateComment 실행");
		userCommentService.updateComment(vo);
		return "redirect:/comment.do";
	}
} 
