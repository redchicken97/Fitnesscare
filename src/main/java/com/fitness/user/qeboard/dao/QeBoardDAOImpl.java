package com.fitness.user.qeboard.dao;

import java.util.List;

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
		System.out.println("질문게시판 글 작성");
		sqlSessionTemplate.insert("QEBoardDAO.insertQEBoard", vo);
	}

	@Override
	public QeBoardVO getQeBoard(QeBoardVO vo) {
		System.out.println("질문 게시판 게시글 하나 가져오기");
		return sqlSessionTemplate.selectOne("QEBoardDAO.getQEBoard", vo);
	}

	@Override
	public List<QeBoardVO> getQeBoardList(QeBoardVO vo) {
		System.out.println("질문 게시판 게시글 전체 가져오기");
		return sqlSessionTemplate.selectList("QEBoardDAO.getQEBoardList", vo);
	}

	@Override
	public void deleteQeBoard(QeBoardVO vo) {
		System.out.println("질문 게시판 글 삭제");
		sqlSessionTemplate.delete("QEBoardDAO.deleteQEBoard", vo);
	}

	@Override
	public void updateBoard(QeBoardVO vo) {
		sqlSessionTemplate.update("QEBoardDAO.updateQEBoard", vo);
	}

}
