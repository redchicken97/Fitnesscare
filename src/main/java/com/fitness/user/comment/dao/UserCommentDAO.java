package com.fitness.user.comment.dao;

import java.util.List;

import com.fitness.user.comment.vo.CommentInfoVO;

public interface UserCommentDAO {
	
	public void insertComment(CommentInfoVO vo);
	
	public void reInsertComment(CommentInfoVO vo);
	
	public List<CommentInfoVO> getCommentList(CommentInfoVO vo);
	
	public CommentInfoVO getComment(CommentInfoVO vo);
	
}
