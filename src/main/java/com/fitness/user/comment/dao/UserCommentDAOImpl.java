package com.fitness.user.comment.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.user.comment.vo.CommentInfoVO;

@Repository
public class UserCommentDAOImpl implements UserCommentDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insertComment(CommentInfoVO vo) {
		System.out.println("mybatis insertComment 작동");
		sqlSessionTemplate.insert("commentDAO.insertComment", vo);
	}
	
	@Override
	public void reInsertComment(CommentInfoVO vo) {
		System.out.println("mybatis reInsertComment 작동");
		sqlSessionTemplate.insert("commentDAO.reInsertComment", vo);
	}

	@Override
	public List<CommentInfoVO> getCommentList(CommentInfoVO vo) {
		System.out.println("mybatis getCommentList 작동");
		return sqlSessionTemplate.selectList("commentDAO.getCommentList");
	}

}
