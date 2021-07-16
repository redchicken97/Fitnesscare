package com.fitness.admin.term.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.admin.term.vo.TermVO;

@Repository
public class TermDAOImpl implements TermDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public void insertTerm(TermVO vo) {
		sqlSessionTemplate.insert("TermDAO.insertTerm");
	}

	@Override
	public void updateTerm(TermVO vo) {
		sqlSessionTemplate.update("TermDAO.updateTerm");
	}

	@Override
	public void deleteTerm(TermVO vo) {
		sqlSessionTemplate.delete("TermDAO.deleteTerm");
	}

	@Override
	public TermVO getTerm(TermVO vo) {
		return sqlSessionTemplate.selectOne("TermDAO.getTerm");
	}

	@Override
	public List<TermVO> getTermList() {
		return sqlSessionTemplate.selectList("TermDAO.getTermList");
	}

}
