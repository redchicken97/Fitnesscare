package com.fitess.common.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitess.common.user.dao.UserCommentDAO;
import com.fitess.common.user.vo.CommentInfoVO;

@Service("userCommentService")
public class UserCommentServiceImpl implements UserCommentService {

	@Autowired
	private UserCommentDAO userCommentDAO;
	
	@Override
	public void insertComment(CommentInfoVO vo) {
		System.out.println("service insertComment 작동");
		userCommentDAO.insertComment(vo);
	}

	@Override
	public List<CommentInfoVO> getCommentList(CommentInfoVO vo) {
		System.out.println("service getCommentList 작동");
		return userCommentDAO.getCommentList(vo);
	}

}
