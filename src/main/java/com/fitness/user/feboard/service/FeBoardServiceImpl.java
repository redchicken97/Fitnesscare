package com.fitness.user.feboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.user.PageMake.paging.Criteria;
import com.fitness.user.feboard.dao.FeBoardDAO;
import com.fitness.user.feboard.vo.FeBoardVO;

@Service
public class FeBoardServiceImpl implements FeBoardService {

	@Autowired
	private FeBoardDAO feBoardDAO;
	
	@Override
	public void insertFEBoard(FeBoardVO vo) {
		System.out.println("service 자유게시판 insert 실행");
		feBoardDAO.insertFEBoard(vo);
	}

	@Override
	public void updateFEBoard(FeBoardVO vo) {
		System.out.println("service 자유게시판 update 실행");
		feBoardDAO.updateFEBoard(vo);
	}

	@Override
	public void deleteFEBoard(FeBoardVO vo) {
		System.out.println("service 자유게시판 delete 실행");
		feBoardDAO.deleteFEBoard(vo);
	}

	@Override
	public FeBoardVO getFEBoard(FeBoardVO vo) {
		System.out.println("service 자유게시판 get 실행");
		return feBoardDAO.getFEBoard(vo);
	}

	@Override
	public List<FeBoardVO> getFEBoardList(Criteria cri) {
		System.out.println("service 자유게시판 List 가져오기");
		return feBoardDAO.getFEBoardList(cri);
	}

	@Override
	public int getFEBoardCount() {
		System.out.println("service 자유게시판 뭔지 모름");	//진짜 뭔지 모르겠음
		return feBoardDAO.getFEBoardCount();
	}

}
