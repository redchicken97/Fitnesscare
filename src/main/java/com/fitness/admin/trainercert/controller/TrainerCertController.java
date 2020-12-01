package com.fitness.admin.trainercert.controller;

import com.fitness.admin.common.mail.MailService;
import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.common.paging.PageMaker;
import com.fitness.admin.trainercert.service.TrainerCertService;
import com.fitness.admin.trainercert.vo.TrainerCertVO;
import com.fitness.admin.user.service.UserManService;
import com.fitness.admin.user.vo.UserManVO;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAsync
public class TrainerCertController {

	@Autowired
	private TrainerCertService trainerCertService;
	@Autowired
	private UserManService userManService;
	@Autowired
	private MailService mailService;
	
	// 승인 버튼으로 끝나는 기능이므로, 별도의 창이 필요없음
	@RequestMapping("acceptTrainerCert")
	public String acceptTrainerCert(TrainerCertVO vo) {
		System.out.println("TrainerCertController.acceptTrainerCert 실행");

		// 이메일을 보낼 때 사용될 사용자 정보를 얻는다.
		UserManVO uvo = getUserFromId(vo);
		String userName = uvo.getUser_name();
		String userEmail = uvo.getUser_email();
		
		// 사용자 등급을 전문가로 승급
		trainerCertService.acceptTrainerCert(vo);
		
		// 결과 메일 보내기
		StringBuffer sb = new StringBuffer();
		sb.append(userName + "님의 전문가 인증 요청이 승인되었습니다. <br />");
		sb.append("기타 궁금하신 사항은 관리자(ghp0405@gmail.com)에게 문의하여 주십시오. <br />");
		String str = sb.toString();
		mailService.sendMail(userEmail, userName + "님의 전문가 인증 요청이 승인되었습니다.", str);
		
		// 인증 요청 목록 창으로 이동
		return "redirect:/getTrainerCertList.admin";
	}
	
	// 거절 기능도 마찬가지로 별도의 창을 필요로 하지 않음
	@RequestMapping("declineTrainerCert")
	public String declineTrainerCert(TrainerCertVO vo) {
		System.out.println("TrainerCertController.declineTrainerCert 실행");

		// 이메일을 보낼 때 사용될 사용자 정보를 얻는다.
		UserManVO uvo = getUserFromId(vo);
		String userName = uvo.getUser_name();
		String userEmail = uvo.getUser_email();
		
		trainerCertService.declineTrainerCert(vo);
		
		// 결과 메일 보내기
		StringBuffer sb = new StringBuffer();
		sb.append(userName + "님의 전문가 인증 요청이 거절되었습니다. <br />");
		sb.append("거절 사유 및 추가 궁금하신 사항은 관리자(ghp0405@gmail.com)에게 문의하여 주십시오. <br />");
		String str = sb.toString();
		mailService.sendMail(userEmail, userName + "님의 전문가 인증 요청이 거절되었습니다.", str);
		
		// 인증 요청 목록 창으로 이동
		return "redirect:/getTrainerCertList.admin";
	}
	
	@RequestMapping("getTrainerCert.admin")
	public String getTrainerCert(TrainerCertVO vo, Model model) {
		System.out.println("TrainerCertController.getTrainerCert 실행");
		model.addAttribute("trainerCert", trainerCertService.getTrainerCert(vo));
		model.addAttribute("userName", getUserFromId(vo).getUser_name());
		return "getTrainerCert";
	}

	@RequestMapping("getTrainerCertList.admin")
	public String getTrainerCertList(Criteria cri, Model model) {
		System.out.println("TrainerCertController.getTrainerCertList 실행");
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(trainerCertService.getTrainerCertCount());
		cri = pageMaker.getCri();
		model.addAttribute("pageMaker", pageMaker);
		
		// 작성자란에 user_id 대신 실제 사용자 이름이 나올 수 있도록
		// 사용자 이름들을 담은 list를 만든다.
		List<TrainerCertVO> tcList = new ArrayList<>();
		List<String> userList = new ArrayList<>();
		tcList = trainerCertService.getTrainerCertList(cri);
		for(int i = 0; i < tcList.size(); i++) {
			userList.add(i, getUserFromId(tcList.get(i)).getUser_name());
		}
		
		model.addAttribute("trainerCertList", trainerCertService.getTrainerCertList(cri));
		model.addAttribute("userList", userList);
		return "getTrainerCertList";
	}
	
	public UserManVO getUserFromId(TrainerCertVO vo) {
		vo = trainerCertService.getTrainerCert(vo);
		UserManVO uvo = new UserManVO();
		uvo.setUser_id(vo.getUser_id());
		return userManService.getUserInfo(uvo);
	}
	
}
