package com.fitness.admin.food.service;

import java.util.List;

import com.fitness.admin.food.vo.FoodSaveVO;

public interface FoodSaveService {
	void insertFoodSave(FoodSaveVO vo);
	List<FoodSaveVO>getFoodSaveList(FoodSaveVO vo);
}
