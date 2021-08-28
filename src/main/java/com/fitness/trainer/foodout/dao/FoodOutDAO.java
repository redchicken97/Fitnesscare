package com.fitness.trainer.foodout.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.trainer.foodout.vo.FoodOutVO;

@Repository
public class FoodOutDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void insertFoodOut(FoodOutVO vo) {
		sqlSessionTemplate.insert("FoodOutDAO.insertFoodOut");
	}
	
	public FoodOutVO getFoodOut(FoodOutVO vo) {
		return sqlSessionTemplate.selectOne("FoodOutDAO.getFoodOut");
	}
	
}
