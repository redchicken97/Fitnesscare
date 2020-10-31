package com.fitness.admin.veboard.service;

import java.util.List;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.veboard.vo.VEBoardVO;

public interface VEBoardService {
	void insertVEBoard(VEBoardVO vo);
	void updateVEBoard(VEBoardVO vo);
	void deleteVEBoard(VEBoardVO vo);
	VEBoardVO getVEBoard(VEBoardVO vo);
	List<VEBoardVO> getVEBoardList(Criteria cri);
	int getVEBoardCount();
}
