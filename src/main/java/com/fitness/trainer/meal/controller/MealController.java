package com.fitness.trainer.meal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.trainer.meal.service.MealService;
import com.fitness.trainer.meal.vo.MealVO;

@Controller
public class MealController {
	
	@Autowired
	private MealService mealService;
	
	@RequestMapping("/insertMeal.mdo")
	public String insertMeal(MealVO vo) {
		mealService.insertMeal(vo);
		return "redirect:/getMealList.mdo";
	}
	@RequestMapping("/getMealList.mdo")
	public String getMealList(Model model) {
		model.addAttribute("mealList", mealService.getMealList());
		return "meal/getMealList";
	}
	@RequestMapping("/getMeal.mdo")
	public String getMeal(MealVO vo, Model model) {
		model.addAttribute("Meal", mealService.getMeal(vo));
		return "meal/getMeal";
	}
	@RequestMapping("/deleteMeal.mdo")
	public String deleteMeal(MealVO vo) {
		mealService.deleteMeal(vo);
		return "redirect:/getMealList.mdo";
	}
	@RequestMapping("/mealModifyPage.mdo")
	public String mealModifyPage(MealVO vo, Model model) {
		model.addAttribute("meal", mealService.getMeal(vo));
		return "redirect:/getMealList.mdo";
	}
	@RequestMapping("/updateMeal.mdo")
	public String updateMeal(MealVO vo) {
		mealService.updateMeal(vo);
		return "redirect:/getMeal.mdo?meal_id" + vo.getMeal_id();
	}
	
}
