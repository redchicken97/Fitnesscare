package com.fitness.user.comment.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.user.comment.dao.UserCommentDAO;
import com.fitness.user.comment.vo.CommentInfoVO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

@Service("userCommentService")
public class UserCommentServiceImpl implements UserCommentService {

	@Autowired
	private UserCommentDAO userCommentDAO;
	
	// 댓글 달기
	@Override
	public void insertComment(CommentInfoVO vo) {
		System.out.println("service insertComment 실행");
		userCommentDAO.insertComment(vo);
	}

	//setpUp 값 1증가 도 추가한 대댓글 달기
	@Override
	public void seReInsertComment(CommentInfoVO vo) {
		System.out.println("step 값이 1 일때의 reInsertComment 실행");
		userCommentDAO.seReInsertComment(vo);
	}
	
	//대댓글 달기
	@Override
	public void reInsertComment(CommentInfoVO vo) {
		System.out.println("service reInsertComment 실행");
		userCommentDAO.reInsertComment(vo);
	}
	
	@Override
	public List<String> getCommentList(CommentInfoVO vo) {
		System.out.println("service getCommentList 실행");
		JsonObject List1 = new JsonObject();
		List<String> List2 = new ArrayList<String>();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		DateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");

		for(CommentInfoVO vo1 : userCommentDAO.getCommentList(vo)) {
			 
			if (vo1.getCmt_content() == null) {
				vo1.setCmt_content(" ");
			}
			
			String today = sdFormat.format(vo1.getCmt_regdate());
			
			List1.addProperty("cmt_id", vo1.getCmt_id());
			List1.addProperty("target_id", vo1.getTarget_id());
			List1.addProperty("cmt_type", vo1.getCmt_type());
			List1.addProperty("user_id", vo1.getUser_id());
			List1.addProperty("cmt_regdate", today);
			List1.addProperty("cmt_rdcnt", vo1.getCmt_rdCnt());
			List1.addProperty("cmt_reportcnt", vo1.getCmt_reportCnt());
			List1.addProperty("cmt_ref", vo1.getCmt_ref());
			List1.addProperty("cmt_step", vo1.getCmt_step());
			List1.addProperty("cmt_depth", vo1.getCmt_depth());
			List1.addProperty("cmt_content", vo1.getCmt_content());
			List1.addProperty("reply_check", vo1.getReply_check());

			String json = gson.toJson(List1);		
			
			List2.add(json);			

		}
		return List2;
	}

	@Override
	public CommentInfoVO getComment(CommentInfoVO vo) {
		System.out.println("service getComment 실행");
		return userCommentDAO.getComment(vo);
	}

	@Override
	public void updateComment(CommentInfoVO vo) {
		System.out.println("service updateComment 실행");
		userCommentDAO.updateComment(vo);
	}

	@Override
	public void upRdCnt(CommentInfoVO vo) {
		System.out.println("service 추천수 증가");
		userCommentDAO.upRdCnt(vo);
	}

	@Override
	public void upReportCnt(CommentInfoVO vo) {
		System.out.println("service 신고수 증가");
		userCommentDAO.upReportCnt(vo);
	}

	@Override
	public void checkUpdateComment(CommentInfoVO vo) {
		System.out.println("service check comment 실행");
		userCommentDAO.checkUpdateComment(vo);
	}

}
