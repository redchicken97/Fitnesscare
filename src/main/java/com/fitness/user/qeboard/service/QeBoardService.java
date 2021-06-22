package com.fitness.user.qeboard.service;

import java.util.List;

import com.fitness.user.qeboard.vo.QeBoardVO;

public interface QeBoardService {
	
	public void insertQeBoard(QeBoardVO vo);
	
	public QeBoardVO getQeBoard(QeBoardVO vo);
	
	public List<QeBoardVO> getQeBoardList(QeBoardVO vo);
	
	public void deleteQeBoard(QeBoardVO vo);
	
	public void updateBoard(QeBoardVO vo);
}
