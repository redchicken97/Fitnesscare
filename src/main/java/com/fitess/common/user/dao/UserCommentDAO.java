package com.fitess.common.user.dao;

import java.util.List;

import com.fitess.common.user.vo.CommentInfoVO;

public interface UserCommentDAO {
	
	public void insertComment(CommentInfoVO vo);
	
	public List<CommentInfoVO> getCommentList(CommentInfoVO vo);
	
}
