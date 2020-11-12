package com.fitness.admin.hteboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.hteboard.dao.HTEBoardDAO;
import com.fitness.admin.hteboard.vo.HTEBoardVO;

@Service
public class HTEBoardServiceImpl implements HTEBoardService {

	@Autowired
	private HTEBoardDAO hTEBoardDAO;
	
	@Override
	public void insertHTEBoard(HTEBoardVO vo) {
		System.out.println("HTEBoardService.insertHTEBoard 실행");
		hTEBoardDAO.insertHTEBoard(vo);
	}

	@Override
	public void updateHTEBoard(HTEBoardVO vo) {
		System.out.println("HTEBoardService.updateHTEBoard 실행");
		hTEBoardDAO.updateHTEBoard(vo);
	}
	
	@Override
	public void deleteHTEBoard(HTEBoardVO vo) {
		System.out.println("HTEBoardService.deleteHTEBoard 실행");
		hTEBoardDAO.deleteHTEBoard(vo);
	}
	
	@Override
	public HTEBoardVO getHTEBoard(HTEBoardVO vo) {
		System.out.println("HTEBoardService.getHTEBoard 실행");
		return hTEBoardDAO.getHTEBoard(vo);
	}

	@Override
	public List<HTEBoardVO> getHTEBoardList(Criteria cri) {
		System.out.println("HTEBoardService.getHTEBoardList 실행");
		return hTEBoardDAO.getHTEBoardList(cri);
	}

	@Override
	public int getHTEBoardCount() {
		System.out.println("HTEBoardService.getHTEBoardCount 실행");
		return hTEBoardDAO.getHTEBoardCount();
	}

}
