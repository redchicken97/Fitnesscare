package com.fitness.user.comment.service;

import java.util.List;

import com.fitness.user.comment.vo.CommentInfoVO;

public interface UserCommentService {
	
	public void insertComment(CommentInfoVO vo);
	
	public void reInsertComment(CommentInfoVO vo);
	
	public List<String> getCommentList(CommentInfoVO vo);
}
