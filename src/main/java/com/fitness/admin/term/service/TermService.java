package com.fitness.admin.term.service;

import java.util.List;

import com.fitness.admin.term.vo.TermVO;

public interface TermService {
	
	public void insertTerm(TermVO vo);
	
	public void updateTerm(TermVO vo);
	
	public void deleteTerm(TermVO vo);
	
	public TermVO getTerm(TermVO vo);
	
	public List<TermVO> getTermList();
}
