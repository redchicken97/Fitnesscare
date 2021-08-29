package com.fitness.trainer.foodout.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.trainer.foodout.service.FoodOutService;
import com.fitness.trainer.foodout.vo.FoodOutVO;

@Controller
public class FoodOutController {

	@Autowired
	private FoodOutService foodOutService;
	
	@RequestMapping("/insertFoodOut.mdo")
	public String insertFoodOut(FoodOutVO vo) {
		foodOutService.insertFoodOut(vo);
		return "redirect:/getFoodOutList.mdo";
	}
	@RequestMapping("getFoodOutList.mdo")
	public String getFoodOutList(Model model) {
		model.addAttribute("foodList", foodOutService.getFoodOutList());
		return "food/getFoodOutList";
	}
	
}
