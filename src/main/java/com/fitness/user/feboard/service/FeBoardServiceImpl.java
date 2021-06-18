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
	public void insertFeBoard(FeBoardVO vo) {
		System.out.println("service 자유게시판 insert 실행");
		feBoardDAO.insertFeBoard(vo);
	}

	@Override
	public void updateFeBoard(FeBoardVO vo) {
		System.out.println("service 자유게시판 update 실행");
		feBoardDAO.updateFeBoard(vo);
	}

	@Override
	public void deleteFeBoard(FeBoardVO vo) {
		System.out.println("service 자유게시판 delete 실행");
		feBoardDAO.deleteFeBoard(vo);
	}

	@Override
	public FeBoardVO getFeBoard(FeBoardVO vo) {
		System.out.println("service 자유게시판 get 실행");
		return feBoardDAO.getFeBoard(vo);
	}

	@Override
	public List<FeBoardVO> getFeBoardList(FeBoardVO vo) {
		System.out.println("service 자유게시판 List 가져오기");
		return feBoardDAO.getFeBoardList(vo);
	}


}
