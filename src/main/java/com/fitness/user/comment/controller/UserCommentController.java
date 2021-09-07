package com.fitness.user.comment.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fitness.admin.domain.paging.Criteria;
import com.fitness.user.comment.service.CommentOverlapService;
import com.fitness.user.comment.service.UserCommentService;
import com.fitness.user.comment.vo.CommentInfoVO;
import com.fitness.user.comment.vo.CommentOverlapVO;
import com.fitness.user.common.vo.UserVO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

@Controller
public class UserCommentController {
	
	@Autowired
	private UserCommentService userCommentService;
	
	@Autowired
	private CommentOverlapService commentOverlapService;
	
	@RequestMapping("/commentInput.do")
	public String insertComment(CommentInfoVO vo) { 
		System.out.println("controller에서 insertComment 작동");
		userCommentService.insertComment(vo);
		return "comment";
	}
	
	@RequestMapping("/reCommentInput.do")
	public String reInsertComment(CommentInfoVO vo, @RequestParam(value="stepUp") String step) {
		System.out.println("controller에서 reInsertComment 작동");
		System.out.println(step);
		int s = Integer.parseInt(step);
		if (s == 0) {
			userCommentService.reInsertComment(vo);
		}else if(s == 1) {
			userCommentService.seReInsertComment(vo);
		}
		
		return "comment";
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
	public @ResponseBody List<String> getCommentList(Criteria cri) {	
		System.out.println("controller에서 getCommentList 작동");
		return userCommentService.getCommentListPaging(cri);
	}
	
	@RequestMapping("/upRdCnt.do")
	@ResponseBody String upRdCnt(@RequestBody Map<String, Object> param, HttpSession session) {
		System.out.println("controller 에서 upRdCnt 실행");
		CommentInfoVO vo1 = new CommentInfoVO();
		CommentInfoVO vo2 = new CommentInfoVO();
		CommentOverlapVO Cvo = new CommentOverlapVO();
		
		UserVO userInfo = (UserVO) session.getAttribute("userInfo");
		
		System.out.println("userInfo : " + userInfo);
		
		JsonObject Rd = new JsonObject();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		int user_id = 0;
		String json = null;

		try {
			int cmt_id = (int) param.get("cmt_id");
			int cmt_rdcnt = (int) param.get("cmt_rdcnt");
			System.out.println("cmt_id : " + param.get("cmt_id"));
			System.out.println("cmt_rdcnt : " + param.get("cmt_rdcnt"));
			user_id = (int) param.get("user_id");
			
			vo1.setCmt_id(cmt_id);
			vo1.setCmt_rdCnt(cmt_rdcnt);
			
			vo2 = userCommentService.getComment(vo1);
			
			Rd.addProperty("cmt_id", vo2.getCmt_id());
			Rd.addProperty("cmt_rdcnt", vo2.getCmt_rdCnt());
			
			json = gson.toJson(Rd);	

			int cnt = 0;
			if(user_id != 0) {
				Cvo.setCmt_id(cmt_id); Cvo.setUser_id(user_id); 
				cnt = commentOverlapService.checkOverlap(Cvo);
				System.out.println("cnt : " + cnt);
			}
			if(cnt == 0) {
				Cvo.setCmt_id(cmt_id); Cvo.setUser_id(user_id); Cvo.setCnt_sep("Y");
				commentOverlapService.insertOverlap(Cvo);
				userCommentService.upRdCnt(vo1);
				return json;
			}
			if(cnt > 0) {
				return null;
			}
				
			
		}catch (Exception e) {
			e.printStackTrace();
		}
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
