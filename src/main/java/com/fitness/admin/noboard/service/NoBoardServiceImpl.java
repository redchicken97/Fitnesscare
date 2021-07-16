package com.fitness.admin.noboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.admin.noboard.dao.NoBoardDAO;
import com.fitness.admin.noboard.vo.NoBoardVO;

@Service("noBoardService")
public class NoBoardServiceImpl implements NoBoardService {

	@Autowired
	private NoBoardDAO noBoardDAO;
	
	@Override
	public void insertNoBoard(NoBoardVO vo) {
		System.out.println("service 공지 게시판 insert");
		noBoardDAO.insertNoBoard(vo);
	}

	@Override
	public void updateNoBoard(NoBoardVO vo) {
		System.out.println("service 공지 게시판 update");
		noBoardDAO.updateNoBoard(vo);
	}

	@Override
	public void deleteNoBoard(NoBoardVO vo) {
		System.out.println("service 공지 게시판 delete");
		noBoardDAO.deleteNoBoard(vo);
	}

	@Override
	public NoBoardVO getNoBoard(NoBoardVO vo) {
		System.out.println("service 공지 게시판 get");
		return noBoardDAO.getNoBoard(vo);
	}

	@Override
	public List<NoBoardVO> getNoBoardList() {
		System.out.println("service 공지 게시판 getList");
		return noBoardDAO.getNoBoardList();
	}
	
}
