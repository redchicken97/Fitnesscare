package com.fitness.user.comment.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.user.comment.vo.CommentOverlapVO;

@Repository
public class CommentOverlapDAO{

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void insertOverlap(CommentOverlapVO vo) {
		sqlSessionTemplate.insert("overlapDAO.insertOverlap", vo);
	}

	public int checkOverlap(CommentOverlapVO vo) {	
		int pass = 0; 	// DB에서 count 갯수 가져와서 저장하기위한 변수
		pass = sqlSessionTemplate.selectOne("overlapDAO.checkReply", vo);
		return pass;
	}

}
