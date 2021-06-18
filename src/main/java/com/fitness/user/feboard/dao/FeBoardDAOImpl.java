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
	public void insertFeBoard(FeBoardVO vo) {
		System.out.println("mybatis 자유게시판  입력 작동");
		sqlSessionTemplate.insert("FEBoardDAO.insertFEBoard", vo);
	}

	@Override
	public void updateFeBoard(FeBoardVO vo) {
		System.out.println("mybatis 자유게시판 수정 작동");
		sqlSessionTemplate.update("FEBoardDAO.updateFEBoard", vo);

	}

	@Override
	public void deleteFeBoard(FeBoardVO vo) {
		System.out.println("mybatis 자유게시판 삭제 작동");
		sqlSessionTemplate.delete("FEBoardDAO.deleteFEBoard", vo);
	}

	@Override
	public FeBoardVO getFeBoard(FeBoardVO vo) {
		System.out.println("mybatis 자유 게시판 게시글 하나 가져오기 작동");
		
		return sqlSessionTemplate.selectOne("FEBoardDAO.getFEBoard", vo);
	}

	@Override
	public List<FeBoardVO> getFeBoardList(FeBoardVO vo) {
		System.out.println("mybatis 자유 게시판 게시글 가져오기 작동 ");
		return sqlSessionTemplate.selectList("FEBoardDAO.getFEBoardList", vo);
	}

}
