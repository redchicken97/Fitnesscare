package com.fitness.trainer.foodout.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.trainer.foodout.dao.FoodOutDAO;
import com.fitness.trainer.foodout.vo.FoodOutVO;

@Service("foodOutService")
public class FoodOutServiceImpl implements FoodOutService {

	@Autowired
	private FoodOutDAO foodOutDAO;
	
	@Override
	public void insertFoodOut(FoodOutVO vo) {
		foodOutDAO.insertFoodOut(vo);
	}

	@Override
	public FoodOutVO getFoodOut(FoodOutVO vo) {
		return foodOutDAO.getFoodOut(vo);
	}

	@Override
	public List<FoodOutVO> getFoodOutList() {
		return foodOutDAO.getFoodOutList();
	}

	@Override
	public void deleteFoodOut(FoodOutVO vo) {
		foodOutDAO.deleteFoodOut(vo);
	}

	@Override
	public void updateFoodOut(FoodOutVO vo) {
		foodOutDAO.updateFoodOut(vo);
	}

}
