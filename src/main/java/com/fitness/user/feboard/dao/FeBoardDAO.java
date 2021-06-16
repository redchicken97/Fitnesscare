package com.fitness.user.feboard.dao;

import java.util.List;

import com.fitness.user.PageMake.paging.Criteria;
import com.fitness.user.feboard.vo.FeBoardVO;

public interface FeBoardDAO {
	
	void insertFEBoard(FeBoardVO vo);
	
	public void updateFEBoard(FeBoardVO vo);
	
	public void deleteFEBoard(FeBoardVO vo);
	
	public FeBoardVO getFEBoard(FeBoardVO vo); 
	
	public List<FeBoardVO> getFEBoardList(Criteria cri);
	
	public int getFEBoardCount();
	
}
