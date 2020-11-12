package com.fitness.admin.feboard.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.feboard.vo.FEBoardVO;

@Repository
public class FEBoardDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void insertFEBoard(FEBoardVO vo) {
		System.out.println("FEBoardDAO.insertFEBoard 실행");
		sqlSessionTemplate.insert("FEBoardDAO.insertFEBoard", vo);
	}
	
	public void updateFEBoard(FEBoardVO vo) {
		System.out.println("FEBoardDAO.updateFEBoard 실행");
		sqlSessionTemplate.update("FEBoardDAO.updateFEBoard", vo);
	}
	
	public void deleteFEBoard(FEBoardVO vo) {
		System.out.println("FEBoardDAO.deleteFEBoard 실행");
		sqlSessionTemplate.delete("FEBoardDAO.deleteFEBoard", vo);
	}
	
	public FEBoardVO getFEBoard(FEBoardVO vo) {
		System.out.println("FEBoardDAO.getFEBoard 실행");
		return (FEBoardVO)sqlSessionTemplate.selectOne("FEBoardDAO.getFEBoard", vo);
	}
	
	public List<FEBoardVO> getFEBoardList(Criteria cri) {
		System.out.println("FEBoardDAO.getFEBoardList 실행");
		return sqlSessionTemplate.selectList("FEBoardDAO.getFEBoardList", cri);
	}
	
	public int getFEBoardCount() {
		System.out.println("FEBoardDAO.getFEBoardCount 실행");
		return (int)sqlSessionTemplate.selectOne("FEBoardDAO.getFEBoardCount");
	}
	
}
