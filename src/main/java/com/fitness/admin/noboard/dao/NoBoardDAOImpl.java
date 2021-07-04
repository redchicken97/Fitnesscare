package com.fitness.admin.noboard.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.admin.noboard.vo.NoBoardVO;

@Repository
public class NoBoardDAOImpl implements NoBoardDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insertNoBoard(NoBoardVO vo) {
		System.out.println("mybatis 공지 게시판 입력");
		sqlSessionTemplate.insert("NOBoardDAO.insertNOBoard", vo);
	}

	@Override
	public void updateNoBoard(NoBoardVO vo) {
		System.out.println("mybatis 공지 게시판 수정");
		sqlSessionTemplate.update("NOBoardDAO.updateNOBoard");
	}

	@Override
	public void deleteNoBoard(NoBoardVO vo) {
		System.out.println("mybatis 공지 게시판 삭제");
		sqlSessionTemplate.delete("NOBoardDAO.deleteNOBoard");
	}

	@Override
	public NoBoardVO getNoBoard(NoBoardVO vo) {
		System.out.println("mybatis 공지 게시판 게시글 하나 가져오기");
		return sqlSessionTemplate.selectOne("NOBoardDAO.getNOBoard");
	}

	@Override
	public List<NoBoardVO> getNoBoardList() {
		System.out.println("mybatis 공지 게시판 전체 가져오기");
		return sqlSessionTemplate.selectList("NOBoardDAO.getNOBoardList");
	}

}
