package com.fitness.admin.noboard.service;

import java.util.List;

import com.fitness.admin.noboard.vo.NoBoardVO;

public interface NoBoardService {
	
	public void insertNoBoard(NoBoardVO vo);
	
	public void updateNoBoard(NoBoardVO vo);
	
	public void deleteNoBoard(NoBoardVO vo);
	
	public NoBoardVO getNoBoard(NoBoardVO vo);
	
	public List<NoBoardVO> getNoBoardList();
	
}
