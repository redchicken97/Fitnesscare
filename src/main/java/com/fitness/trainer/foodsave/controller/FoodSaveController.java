package com.fitness.trainer.foodsave.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.trainer.foodsave.service.FoodSaveService;
import com.fitness.trainer.foodsave.vo.FoodSaveVO;

public class FoodSaveController {

	@Autowired
	private FoodSaveService foodSaveService;
	
	// 추후 필요한 메소드 추가할 예정
	@RequestMapping("/insertFoodSave.mdo")
	public String insertFoodSvae(FoodSaveVO vo) {
		foodSaveService.insertFoodSave(vo);
		return "";
		
	}
}
