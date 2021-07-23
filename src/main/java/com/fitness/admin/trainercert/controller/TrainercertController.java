package com.fitness.admin.trainercert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
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
	public void applyTr(@RequestBody TrainerCertVO vo) {
		trainerCertService.applyTr(vo);
		return ;
	}
	//허가 메소드와 신청자 리스트 메소드를 실행시킬 페이지로 이동
	@RequestMapping("moveApplyList.admin")
	public String moveApplyList() {
		return "trainer/applyTrList";
	}
	//허가 메소드
	@RequestMapping("/decisoinTr.admin")
	public void decisoinTr(@RequestBody TrainerCertVO vo) {
		trainerCertService.decisoinTr(vo);
		return ;
	}
	//신청자 리스트
	@RequestMapping("/applyTrList.admin")
	public @ResponseBody List<String> applyTrList() {
		return trainerCertService.applyTrList();
	}
	//허가된 사람 리스트
	public String decisoinTrList(Model model) {
		model.addAttribute("apList", trainerCertService.decisoinTrList()); 
		return "trainer/decisoinTrList";
	}
	//강등 및 삭제
	@RequestMapping("/deleteTr.admin")
	public String deleteTr(TrainerCertVO vo) {
		trainerCertService.deleteTr(vo);
		return "redirect:/moveApplyList.admin";
	}
	//트레이너 정보 가져오기
	@RequestMapping("/getTrainer")
	public String getTrainer(TrainerCertVO vo) {
		trainerCertService.getTrainer(vo);
		return "trainer/getTrainer";
	}
}
