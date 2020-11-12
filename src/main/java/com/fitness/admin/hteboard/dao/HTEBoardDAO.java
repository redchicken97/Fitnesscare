package com.fitness.admin.hteboard.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.hteboard.vo.HTEBoardVO;

@Repository
public class HTEBoardDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void insertHTEBoard(HTEBoardVO vo) {
		System.out.println("HTEBoardDAO.insertHTEBoard 실행");
		sqlSessionTemplate.insert("HTEBoardDAO.insertHTEBoard", vo);
	}
	
	public void updateHTEBoard(HTEBoardVO vo) {
		System.out.println("HTEBoardDAO.updateHTEBoard 실행");
		sqlSessionTemplate.update("HTEBoardDAO.updateHTEBoard", vo);
	}
	
	public void deleteHTEBoard(HTEBoardVO vo) {
		System.out.println("HTEBoardDAO.deleteHTEBoard 실행");
		sqlSessionTemplate.delete("HTEBoardDAO.deleteHTEBoard", vo);
	}
	
	public HTEBoardVO getHTEBoard(HTEBoardVO vo) {
		System.out.println("HTEBoardDAO.getHTEBoard 실행");
		return (HTEBoardVO)sqlSessionTemplate.selectOne("HTEBoardDAO.getHTEBoard", vo);
	}
	
	public List<HTEBoardVO> getHTEBoardList(Criteria cri) {
		System.out.println("HTEBoardDAO.getHTEBoardList 실행");
		return sqlSessionTemplate.selectList("HTEBoardDAO.getHTEBoardList", cri);
	}
	
	public int getHTEBoardCount() {
		System.out.println("HTEBoardDAO.getHTEBoardCount 실행");
		return (int)sqlSessionTemplate.selectOne("HTEBoardDAO.getHTEBoardCount");
	}
	
}
