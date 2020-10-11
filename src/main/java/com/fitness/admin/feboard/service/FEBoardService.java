package com.fitness.admin.feboard.service;

import java.util.List;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.feboard.vo.FEBoardVO;

public interface FEBoardService {
	void insertFEBoard(FEBoardVO vo);
	void updateFEBoard(FEBoardVO vo);
	// void deleteFEBoard(FEBoardVO vo);
	FEBoardVO getFEBoard(FEBoardVO vo);
	List<FEBoardVO> getFEBoardList(Criteria cri);
	int getFEBoardCount();
}
