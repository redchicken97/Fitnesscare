package com.fitness.common.user.service;

import java.util.List;

import com.fitness.common.user.vo.CommentInfoVO;

public interface UserCommentService {
	
	public void insertComment(CommentInfoVO vo);
	
	public void reInsertComment(CommentInfoVO vo);
	
	public List<String> getCommentList(CommentInfoVO vo);
}
