package com.fitness.trainer.meal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.trainer.meal.dao.MealDAO;
import com.fitness.trainer.meal.vo.MealVO;

@Service("mealService")
public class MealServiceImpl implements MealService {

	@Autowired
	private MealDAO mealDAO;
	
	@Override
	public void insertMeal(MealVO vo) {
		mealDAO.insertMeal(vo);
	}

	@Override
	public void updateMeal(MealVO vo) {
		mealDAO.updateMeal(vo);
	}

	@Override
	public void deleteMeal(MealVO vo) {
		mealDAO.deleteMeal(vo);
	}

	@Override
	public MealVO getMeal(MealVO vo) {
		return mealDAO.getMeal(vo);
	}

	@Override
	public List<MealVO> getMealList() {
		return mealDAO.getMealList();
	}

}
