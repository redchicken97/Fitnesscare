package com.fitness.admin.qeboard.service;

import java.util.List;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.qeboard.vo.QEBoardVO;

public interface QEBoardService {
	void insertQEBoard(QEBoardVO vo);
	void updateQEBoard(QEBoardVO vo);
	// void deleteQEBoard(QEBoardVO vo);
	QEBoardVO getQEBoard(QEBoardVO vo);
	List<QEBoardVO> getQEBoardList(Criteria cri);
	int getQEBoardCount();
}
