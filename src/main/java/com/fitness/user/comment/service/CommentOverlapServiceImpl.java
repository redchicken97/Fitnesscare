package com.fitness.user.comment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.user.comment.dao.CommentOverlapDAO;
import com.fitness.user.comment.vo.CommentOverlapVO;

@Service("commentOverlapService")
public class CommentOverlapServiceImpl implements CommentOverlapService {

	@Autowired
	private CommentOverlapDAO commentOverlapDAO;
	
	@Override
	public void insertOverlap(CommentOverlapVO vo) {
		commentOverlapDAO.insertOverlap(vo);
	}

	@Override
	public int checkOverlap(CommentOverlapVO vo) {
		int pass = 0;
		pass = commentOverlapDAO.checkOverlap(vo);
		return pass;
	}

}
