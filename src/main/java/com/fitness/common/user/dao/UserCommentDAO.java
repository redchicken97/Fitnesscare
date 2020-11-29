package com.fitness.common.user.dao;

import java.util.List;

import com.fitness.common.user.vo.CommentInfoVO;

public interface UserCommentDAO {
	
	public void insertComment(CommentInfoVO vo);
	
	public void reInsertComment(CommentInfoVO vo);
	
	public List<CommentInfoVO> getCommentList(CommentInfoVO vo);
	
}
