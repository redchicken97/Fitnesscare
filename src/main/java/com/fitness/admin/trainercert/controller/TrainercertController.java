package com.fitness.admin.trainercert.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.admin.trainercert.service.TrainerCertService;
import com.fitness.admin.trainercert.vo.TrainerCertVO;

@Controller
public class TrainercertController {
	
	@Autowired
	private TrainerCertService trainerCertService;
	
	@RequestMapping("/insertTrainerCert.do")
	public void insertTrainerCert(TrainerCertVO vo) {
		return ;
	}
}
