package com.fitness.trainer.foodout.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.trainer.foodout.vo.FoodOutVO;

@Repository
public class FoodOutDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void insertFoodOut(FoodOutVO vo) {
		sqlSessionTemplate.insert("FoodOutDAO.insertFoodOut", vo);
	}
	
	public FoodOutVO getFoodOut(FoodOutVO vo) {
		return sqlSessionTemplate.selectOne("FoodOutDAO.getFoodOut", vo);
	}
	
	public List<FoodOutVO> getFoodOutList(){
		return sqlSessionTemplate.selectList("FoodOutDAO.getFoodOutList");
	}
	
	public void deleteFoodOut(FoodOutVO vo) {
		sqlSessionTemplate.delete("FoodOutDAO.deleteFoodOut", vo);
	}
	
	public void updateFoodOut(FoodOutVO vo) {
		sqlSessionTemplate.update("FoodOutDAO.updateFoodOut", vo);
	}
}
