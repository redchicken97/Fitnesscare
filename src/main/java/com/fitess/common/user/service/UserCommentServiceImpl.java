package com.fitess.common.user.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitess.common.user.dao.UserCommentDAO;
import com.fitess.common.user.vo.CommentInfoVO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

@Service("userCommentService")
public class UserCommentServiceImpl implements UserCommentService {

	@Autowired
	private UserCommentDAO userCommentDAO;
	
	@Override
	public void insertComment(CommentInfoVO vo) {
		System.out.println("service insertComment 실행");
		userCommentDAO.insertComment(vo);
	}

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

		for(CommentInfoVO List3 : userCommentDAO.getCommentList(vo)) {
			
			
			String today = sdFormat.format(List3.getCmt_regdate());
			
			List1.addProperty("cmt_id", List3.getCmt_id());
			List1.addProperty("target_id", List3.getTarget_id());
			List1.addProperty("cmt_type", List3.getCmt_type());
			List1.addProperty("user_id", List3.getUser_id());
			List1.addProperty("cmt_regdate", today);
			List1.addProperty("cmt_rdcnt", List3.getCmt_reportCnt());
			List1.addProperty("cmt_reportcnt", List3.getCmt_reportCnt());
			List1.addProperty("cmt_ref", List3.getCmt_ref());
			List1.addProperty("cmt_step", List3.getCmt_step());
			List1.addProperty("cmt_depth", List3.getCmt_depth());
			List1.addProperty("cmt_content", List3.getCmt_content());
			
			String json = gson.toJson(List1);
			
			List2.add(json);
			
		}

		return List2;
	}


}
