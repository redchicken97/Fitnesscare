package com.fitness.trainer.foodsave.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.trainer.foodsave.vo.FoodSaveVO;


@Repository
public class FoodSaveDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void insertFoodSave(FoodSaveVO vo) {
		sqlSessionTemplate.insert("FoodSaveDAO.insertFoodSave", vo);
	}
	
	public void deleteFoodSave(FoodSaveVO vo) {
		sqlSessionTemplate.delete("FoodSaveDAO.deleteFoodSave", vo);
	}
	
	
}
