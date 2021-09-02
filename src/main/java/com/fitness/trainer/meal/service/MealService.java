package com.fitness.trainer.meal.service;

import java.util.List;

import com.fitness.trainer.meal.vo.MealVO;

public interface MealService {

	public void insertMeal(MealVO vo);
	
	public void updateMeal(MealVO vo);
	
	public void deleteMeal(MealVO vo);
	
	public MealVO getMeal(MealVO vo);
	
	public List<MealVO> getMealList();
}
