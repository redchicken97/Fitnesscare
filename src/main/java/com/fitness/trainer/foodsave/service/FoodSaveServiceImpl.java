package com.fitness.trainer.foodsave.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.trainer.foodsave.dao.FoodSaveDAO;
import com.fitness.trainer.foodsave.vo.FoodSaveVO;

@Service("foodSaveService")
public class FoodSaveServiceImpl implements FoodSaveService {

	@Autowired
	private FoodSaveDAO foodSaveDAO;
	
	@Override
	public void insertFoodSave(FoodSaveVO vo) {
		foodSaveDAO.insertFoodSave(vo);
	}

	@Override
	public void deleteFoodSave(FoodSaveVO vo) {
		foodSaveDAO.deleteFoodSave(vo);
	}

}
