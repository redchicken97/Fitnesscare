package com.fitness.user.qeboard.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.user.qeboard.vo.QeBoardVO;

@Repository
public class QeBoardDAOImpl implements QeBoardDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public void insertQeBoard(QeBoardVO vo) {
		System.out.println("질문게시판 작성");
		sqlSessionTemplate.insert("QEBoardDAO.insertQEBoard", vo);
	}

	@Override
	public QeBoardVO getQeBoard(QeBoardVO vo) {
		System.out.println("질문 게시판 하나 가져오기");
		sqlSessionTemplate.selectOne("QEBoardDAO.getQEBoard", vo);
		return null;
	}

	@Override
	public List<QeBoardVO> getQeBoardList(QeBoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteQeBoard(QeBoardVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBoard(QeBoardVO vo) {
		// TODO Auto-generated method stub
		
	}

}
