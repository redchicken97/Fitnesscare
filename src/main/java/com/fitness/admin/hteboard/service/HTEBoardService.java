package com.fitness.admin.hteboard.service;

import java.util.List;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.hteboard.vo.HTEBoardVO;

public interface HTEBoardService {
	void insertHTEBoard(HTEBoardVO vo);
	void updateHTEBoard(HTEBoardVO vo);
	void deleteHTEBoard(HTEBoardVO vo);
	HTEBoardVO getHTEBoard(HTEBoardVO vo);
	List<HTEBoardVO> getHTEBoardList(Criteria cri);
	int getHTEBoardCount();
}
