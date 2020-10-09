package com.fitness.admin.food.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.admin.food.vo.FoodSaveVO;

@Repository
public class FoodSaveDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void insertFoodSave(FoodSaveVO vo) {
		System.out.println("FoodSaveDAO.insertFoodSave 실행");
		sqlSessionTemplate.insert("FoodSaveDAO.insertFoodSave", vo);
	}
	
	public List<FoodSaveVO> getFoodSaveList(FoodSaveVO vo) {
		System.out.println("FoodSaveDAO.getFoodSaveList 실행");
		return sqlSessionTemplate.selectList("FoodSaveDAO.getFoodSaveList", vo);
	}
	
}
