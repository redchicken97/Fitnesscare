package com.fitness.user.kakaoMap.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.user.kakaoMap.service.HealthTeamJoinService;
import com.fitness.user.kakaoMap.vo.HealthTeamJoinVO;

@Controller
public class HealthTeamJoinController {

	@Autowired
	private HealthTeamJoinService healthTeamJoinService;
	
	//참가인원 추가 및 인원리스트 조회
	@RequestMapping("/insertJoin.do")
	
	public String insertGetListJoinTeam (@RequestBody Map<String, Object> param) {
		System.out.println("controller에서 insertJoin 작동");
		HealthTeamJoinVO vo1 = new HealthTeamJoinVO();
		int ht_id = 0;
		int user_id = 0;
		healthTeamJoinService.insertGetListJoinTeam(vo1);
		return null;
	}
	
	@RequestMapping("/deleteJoin.do")
	public String deleteGetListHealthTeamJoin (HealthTeamJoinVO vo) {
		System.out.println("controller에서 deleteJoin 작동");
		return null;
	}
	
}
