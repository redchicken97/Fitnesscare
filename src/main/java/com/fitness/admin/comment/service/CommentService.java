package com.fitness.admin.comment.service;

import java.util.List;

import com.fitness.admin.comment.vo.CommentVO;

public interface CommentService {
	void insertComment(CommentVO vo);
	void updateComment(CommentVO vo);
	void deleteComment(CommentVO vo);
	CommentVO getComment(CommentVO vo);
	List<CommentVO> getCommentList(CommentVO vo);
}
