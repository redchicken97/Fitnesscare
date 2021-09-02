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
	@RequestMapping("getFoodOut.mdo")
	public String getFoodOut(FoodOutVO vo, Model model) {
		model.addAttribute("foodOut", foodOutService.getFoodOut(vo));
		return "food/getFoodOut";
	}
	@RequestMapping("deleteFoodOut.mdo")
	public String deleteFoodOut(FoodOutVO vo) {
		foodOutService.deleteFoodOut(vo);
		return "redirect:/getFoodOutList.mdo";
	}
	//수정 게시판으로 이동용 컨트롤러 메소드
	@RequestMapping("foodModifyPage.mdo")
	public String foodModifyPage(FoodOutVO vo, Model model) {
		model.addAttribute("foodOut", foodOutService.getFoodOut(vo));
		return "food/updateFoodOut";
	}
	//질제로 데이터가 수정되는 메소드
	@RequestMapping("/updateFoodOut.mdo")
	public String foodOutUpdate(FoodOutVO vo) {
		foodOutService.updateFoodOut(vo);
		return "redirect:/getFoodOut.mdo?foodOut_id" + vo.getFoodout_id();
	}
}
