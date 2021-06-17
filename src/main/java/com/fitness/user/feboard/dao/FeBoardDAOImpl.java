package com.fitness.user.feboard.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.user.PageMake.paging.Criteria;
import com.fitness.user.feboard.vo.FeBoardVO;

@Repository
public class FeBoardDAOImpl implements FeBoardDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public void insertFEBoard(FeBoardVO vo) {
		System.out.println("mybatis 자유게시판  입력 작동");
		sqlSessionTemplate.insert("FEBoardDAO.insertFEBoard", vo);
	}

	@Override
	public void updateFEBoard(FeBoardVO vo) {
		System.out.println("mybatis 자유게시판 수정 작동");
		sqlSessionTemplate.update("FEBoardDAO.updateFEBoard", vo);

	}

	@Override
	public void deleteFEBoard(FeBoardVO vo) {
		System.out.println("mybatis 자유게시판 삭제 작동");
		sqlSessionTemplate.delete("FEBoardDAO.deleteFEBoard", vo);
	}

	@Override
	public FeBoardVO getFEBoard(FeBoardVO vo) {
		System.out.println("mybatis 자유 게시판 게시글 하나 가져오기 작동");
		
		return sqlSessionTemplate.selectOne("FEBoardDAO.getFEBoard", vo);
	}

	@Override
	public List<FeBoardVO> getFEBoardList(Criteria cri) {
		System.out.println("mybatis 자유 게시판 게시글 가져오기 작동 ");
		
		return sqlSessionTemplate.selectList("FEBoardDAO.getFEBoardList", cri);
	}

	@Override
	public int getFEBoardCount() {
		System.out.println("mybatis 자유 게시판 뭔지 모름 나중에 수정 예정");
		return (int) sqlSessionTemplate.selectOne("FEBoardDAO.getFEBoardCount");
	}

}
