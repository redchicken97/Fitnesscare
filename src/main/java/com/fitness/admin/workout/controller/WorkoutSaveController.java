package com.fitness.admin.workout.controller;

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

import com.fitness.admin.workout.service.WorkoutSaveService;
import com.fitness.admin.workout.vo.WorkoutSaveVO;

@Controller
public class WorkoutSaveController {
	
	@Resource(name = "workoutUploadPath")
	private String uploadPath;

	@Autowired
	private WorkoutSaveService workoutSaveService;
	
	@RequestMapping(value="/insertWorkoutSave.admin", method=RequestMethod.GET)
	public String insertWorkoutSaveForm(WorkoutSaveVO vo) {
		System.out.println("WorkoutSaveController.insertWorkoutSaveForm 실행");
		return "insertWorkoutSave";
	}
	
	@RequestMapping(value="/insertWorkoutSave.admin", method=RequestMethod.POST)
	public String insertWorkoutSave(WorkoutSaveVO vo, MultipartFile imgFile) {
		System.out.println("WorkoutSaveController.insertWorkoutSave 실행");
		
		// 이미지 업로드
		String savedImgName = null;
		try {
			savedImgName = uploadFile(imgFile.getOriginalFilename(), imgFile.getBytes());
			vo.setWorkout_img("/resources/workout_img/" + savedImgName);
			workoutSaveService.insertWorkoutSave(vo);
			return "redirect:/getWorkoutSaveList.admin";
		}catch(Exception e) {
			e.printStackTrace();
			return "insertWorkoutSave";
		}
		
	}
	
	private String uploadFile(String originalName, byte[] fileData) throws Exception {
		UUID uid = UUID.randomUUID(); // 파일 업로드시 파일명 중복 방지를 위한 UUID
		String savedName = uid.toString() + "_" + originalName;
		File target = new File(uploadPath, savedName);
		FileCopyUtils.copy(fileData, target);
		return savedName;
	}
	
	@RequestMapping("/getWorkoutSaveList.admin")
	public String getWorkoutSaveList(WorkoutSaveVO vo, Model model) {
		System.out.println("WorkoutSaveController.getWorkoutSaveList 실행");
		model.addAttribute("workoutSaveList", workoutSaveService.getWorkoutSaveList(vo));
		return "getWorkoutSaveList";
	}
	
}
