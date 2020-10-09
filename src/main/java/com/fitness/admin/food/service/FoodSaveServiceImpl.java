package com.fitness.admin.food.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.admin.food.dao.FoodSaveDAO;
import com.fitness.admin.food.vo.FoodSaveVO;

@Service
public class FoodSaveServiceImpl implements FoodSaveService {

	@Autowired
	private FoodSaveDAO foodSaveDAO;
	
	@Override
	public void insertFoodSave(FoodSaveVO vo) {
		System.out.println("FoodSaveService.insertFoodSave 실행");
		foodSaveDAO.insertFoodSave(vo);
	}

	@Override
	public List<FoodSaveVO> getFoodSaveList(FoodSaveVO vo) {
		System.out.println("FoodSaveService.getFoodSaveList 실행");
		return foodSaveDAO.getFoodSaveList(vo);
	}
	
}
