package com.fitness.admin.term.dao;

import java.util.List;

import com.fitness.admin.term.vo.TermVO;

public interface TermDAO {

	public void insertTerm(TermVO vo);
	
	public void updateTerm(TermVO vo);
	
	public void deleteTerm(TermVO vo);
	
	public TermVO getTerm(TermVO vo);
	
	public List<TermVO> getTermList();
}
