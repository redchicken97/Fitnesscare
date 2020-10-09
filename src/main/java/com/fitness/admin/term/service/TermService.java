package com.fitness.admin.term.service;

import java.util.List;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.term.vo.TermVO;

public interface TermService {
	void insertTerm(TermVO vo);
	void updateTerm(TermVO vo);
	TermVO getTerm(TermVO vo);
	List<TermVO> getTermList(Criteria cri);
	int getTermCount();
}
