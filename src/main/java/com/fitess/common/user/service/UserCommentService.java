package com.fitess.common.user.service;

import java.util.List;

import com.fitess.common.user.vo.CommentInfoVO;

public interface UserCommentService {
	
	public void insertComment(CommentInfoVO vo);
	
	public List<CommentInfoVO> getCommentList(CommentInfoVO vo);
}
