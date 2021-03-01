package com.fitness.user.comment.dao;

import com.fitness.user.comment.vo.CommentOverlapVO;

public interface CommentOverlapDAO {
	
	public void insertOverlap(CommentOverlapVO vo);
	
	public int checkOverlap(CommentOverlapVO vo);
	
}
