package com.fitness.trainer.foodout.service;

import java.util.List;

import com.fitness.trainer.foodout.vo.FoodOutVO;

public interface FoodOutService {
	
	public void insertFoodOut(FoodOutVO vo);
	
	public FoodOutVO getFoodOut(FoodOutVO vo);
	
	public List<FoodOutVO> getFoodOutList();
	
	public void deleteFoodOut(FoodOutVO vo);
	
	public void updateFoodOut(FoodOutVO vo);
	
}
