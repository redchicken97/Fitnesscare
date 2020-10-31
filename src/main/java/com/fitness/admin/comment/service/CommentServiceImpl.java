package com.fitness.admin.comment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.admin.comment.dao.CommentDAO;
import com.fitness.admin.comment.vo.CommentVO;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentDAO commentDAO;
	
	@Override
	public void insertComment(CommentVO vo) {
		System.out.println("CommentService.insertComment 角青");
		commentDAO.insertComment(vo);
	}

	@Override
	public void updateComment(CommentVO vo) {
		System.out.println("CommentService.updateComment 角青");
		commentDAO.updateComment(vo);
	}

	@Override
	public void deleteComment(CommentVO vo) {
		System.out.println("CommentService.deleteComment 角青");
		commentDAO.deleteComment(vo);
	}

	@Override
	public CommentVO getComment(CommentVO vo) {
		System.out.println("CommentService.getComment 角青");
		return commentDAO.getComment(vo);
	}

	@Override
	public List<CommentVO> getCommentList(CommentVO vo) {
		System.out.println("CommentService.getCommentList 角青");
		return commentDAO.getCommentList(vo);
	}

}
