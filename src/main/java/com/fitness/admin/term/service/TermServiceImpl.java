package com.fitness.admin.term.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.admin.term.dao.TermDAO;
import com.fitness.admin.term.vo.TermVO;

@Service("termService")
public class TermServiceImpl implements TermService {
	
	@Autowired
	private TermDAO termDAO;

	@Override
	public void insertTerm(TermVO vo) {
		termDAO.insertTerm(vo);
	}

	@Override
	public void updateTerm(TermVO vo) {
		termDAO.updateTerm(vo);
	}

	@Override
	public void deleteTerm(TermVO vo) {
		termDAO.deleteTerm(vo);
	}

	@Override
	public TermVO getTerm(TermVO vo) {
		return termDAO.getTerm(vo);
	}

	@Override
	public List<TermVO> getTermList() {
		return termDAO.getTermList();
	}

}
