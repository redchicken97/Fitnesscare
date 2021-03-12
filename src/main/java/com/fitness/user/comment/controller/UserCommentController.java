package com.fitness.user.comment.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fitness.common.user.vo.UserVO;
import com.fitness.user.comment.service.CommentOverlapService;
import com.fitness.user.comment.service.UserCommentService;
import com.fitness.user.comment.vo.CommentInfoVO;
import com.fitness.user.comment.vo.CommentOverlapVO;
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
	@ResponseBody String upRdCnt(@RequestBody Map<String, Object> param, HttpSession session) {
		System.out.println("controller 에서 upRdCnt 실행");
		CommentInfoVO vo1 = new CommentInfoVO();
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
			System.out.println("cmt_rdcnt : " + param.get("rdcnt"));
			user_id = (int) param.get("user_id");
			
			boolean pass = checkUserId(userInfo.getUser_id(), user_id);
			
			vo1.setCmt_id(cmt_id);
			vo1.setCmt_rdCnt(cmt_rdcnt);	
			
			Rd.addProperty("cmt_id", userCommentService.getComment(vo1).getCmt_id());
			Rd.addProperty("cmt_rdcnt", userCommentService.getComment(vo1).getCmt_rdCnt());
			
			json = gson.toJson(Rd);
			
			if (pass) {
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
					pass = false;
					return null;
				}
				
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
	
	public boolean checkUserId(int userInfoId, int userId) { 
		//userInfoId = 세션에서 가져온 유저 고유 아이디
		//userId = jsp 에서 직접 가져오는 유저 고유 아이디
		int meUser = userInfoId;
		int myUser = userId;
		
		boolean pass = false;
		
		if (meUser == myUser) {
			pass = true;
		}
		
		return pass;
	}
} 
