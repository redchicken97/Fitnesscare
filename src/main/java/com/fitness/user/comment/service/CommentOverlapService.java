package com.fitness.user.comment.service;

import com.fitness.user.comment.vo.CommentOverlapVO;

public interface CommentOverlapService {

	public void insertOverlap(CommentOverlapVO vo);
	
	public int checkOverlap(CommentOverlapVO vo);
}
