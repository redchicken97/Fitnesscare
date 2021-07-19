package com.fitness.admin.trainercert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fitness.admin.trainercert.service.TrainerCertService;
import com.fitness.admin.trainercert.vo.TrainerCertVO;

@Controller
public class TrainercertController {
	
	@Autowired
	private TrainerCertService trainerCertService;
	
	//신청 메소드
	@RequestMapping("/applyTr.do")
	public void applyTr(TrainerCertVO vo) {
		trainerCertService.applyTr(vo);
		return ;
	}
	//허가 메소드
	@RequestMapping("/decisoinTr.admin")
	public String decisoinTr(TrainerCertVO vo) {
		trainerCertService.decisoinTr(vo);
		return "trainer/applyTrList";
	}
	//신청자 리스트
	@RequestMapping("/applyTrList.admin")
	public @ResponseBody List<String> applyTrList() {
		return trainerCertService.applyTrList();
	}
}
