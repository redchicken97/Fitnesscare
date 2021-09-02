package com.fitness.trainer.meal.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.trainer.meal.vo.MealVO;

@Repository
public class MealDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void insertMeal(MealVO vo) {
		sqlSessionTemplate.insert("mealDAO.insertMeal", vo);
	}
	
	public void updateMeal(MealVO vo) {
		sqlSessionTemplate.update("mealDAO.updateMeal", vo);
	}
	
	public void deleteMeal(MealVO vo) {
		sqlSessionTemplate.delete("mealDAO.deleteMeal", vo);
	}
	
	public MealVO getMeal(MealVO vo) {
		return sqlSessionTemplate.selectOne("mealDAO.getMeal", vo);
	}
	
	public List<MealVO> getMealList(){
		return sqlSessionTemplate.selectList("mealDAO.getMealList");
	}
	
}
 