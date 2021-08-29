package com.fitness.trainer.worksave.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.trainer.worksave.service.WorkSaveService;
import com.fitness.trainer.worksave.vo.WorkSaveVO;

@Controller
public class WorkOutController {

	@Autowired
	private WorkSaveService workSaveService;
	
	//추후 필요한 controller 추가할 예정
	@RequestMapping("/insertWorkSave.mdo")
	public String insertWorkSave(WorkSaveVO vo) {
		workSaveService.insertWorkSave(vo);
		return "";
	}
}
