package com.fitness.admin.food.controller;

import java.io.File;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.fitness.admin.food.service.FoodSaveService;
import com.fitness.admin.food.vo.FoodSaveVO;

@Controller
public class FoodSaveController {
	
	@Resource(name = "foodUploadPath")
	private String uploadPath;

	@Autowired
	private FoodSaveService foodSaveService;
	
	@RequestMapping(value="/insertFoodSave.admin", method=RequestMethod.GET)
	public String insertFoodSaveForm(FoodSaveVO vo) {
		System.out.println("FoodSaveController.insertFoodSaveForm 실행");
		return "insertFoodSave";
	}
	
	@RequestMapping(value="/insertFoodSave.admin", method=RequestMethod.POST)
	public String insertFoodSave(FoodSaveVO vo, MultipartFile imgFile) {
		System.out.println("FoodSaveController.insertFoodSave 실행");
		
		// 이미지 업로드
		String savedImgName = null;
		try {
			savedImgName = uploadFile(imgFile.getOriginalFilename(), imgFile.getBytes());
			vo.setFood_img("/resources/food_img/" + savedImgName);
			foodSaveService.insertFoodSave(vo);
			return "redirect:/getFoodSaveList.admin";
		}catch(Exception e) {
			e.printStackTrace();
			return "insertFoodSave";
		}
		
	}
	
	private String uploadFile(String originalName, byte[] fileData) throws Exception {
		UUID uid = UUID.randomUUID(); // 파일 업로드시 파일명 중복 방지를 위한 UUID
		String savedName = uid.toString() + "_" + originalName;
		File target = new File(uploadPath, savedName);
		FileCopyUtils.copy(fileData, target);
		return savedName;
	}
	
	@RequestMapping("/getFoodSaveList.admin")
	public String getFoodSaveList(FoodSaveVO vo, Model model) {
		System.out.println("FoodSaveController.getFoodSaveList 실행");
		model.addAttribute("foodSaveList", foodSaveService.getFoodSaveList(vo));
		return "getFoodSaveList";
	}
	
}
