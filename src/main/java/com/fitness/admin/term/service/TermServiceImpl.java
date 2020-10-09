package com.fitness.admin.term.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.term.dao.TermDAO;
import com.fitness.admin.term.vo.TermVO;

@Service
public class TermServiceImpl implements TermService {

	@Autowired
	private TermDAO termDAO;

	@Override
	public void insertTerm(TermVO vo) {
		System.out.println("TermService.insertTerm 角青");
		termDAO.insertTerm(vo);
	}

	@Override
	public void updateTerm(TermVO vo) {
		System.out.println("TermService.updateTerm 角青");
		termDAO.updateTerm(vo);
	}

	@Override
	public TermVO getTerm(TermVO vo) {
		System.out.println("TermService.getTerm 角青");
		return termDAO.getTerm(vo);
	}

	@Override
	public List<TermVO> getTermList(Criteria cri) {
		System.out.println("TermService.getTermList 角青");
		return termDAO.getTermList(cri);
	}
	
	@Override
	public int getTermCount() {
		System.out.println("TermService.getTermCount 角青");
		return termDAO.getTermCount();
	}
	
}
