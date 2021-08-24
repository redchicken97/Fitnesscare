package com.fitness.admin.term.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.admin.term.vo.TermVO;

@Repository
public class TermDAO{
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public void insertTerm(TermVO vo) {
		sqlSessionTemplate.insert("TermDAO.insertTerm");
	}

	public void updateTerm(TermVO vo) {
		sqlSessionTemplate.update("TermDAO.updateTerm");
	}

	public void deleteTerm(TermVO vo) {
		sqlSessionTemplate.delete("TermDAO.deleteTerm");
	}

	public TermVO getTerm(TermVO vo) {
		return sqlSessionTemplate.selectOne("TermDAO.getTerm");
	}

	public List<TermVO> getTermList() {
		return sqlSessionTemplate.selectList("TermDAO.getTermList");
	}

}
