package com.fitness.user.feboard.dao;

import java.util.List;

import com.fitness.user.feboard.vo.FeBoardVO;

public interface FeBoardDAO {
	
	public void insertFeBoard(FeBoardVO vo);
	
	public void updateFeBoard(FeBoardVO vo);
	
	public void deleteFeBoard(FeBoardVO vo);
	
	public FeBoardVO getFeBoard(FeBoardVO vo); 
	
	public List<FeBoardVO> getFeBoardList(FeBoardVO vo);
}
