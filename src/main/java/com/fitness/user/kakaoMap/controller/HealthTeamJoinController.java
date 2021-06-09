package com.fitness.user.kakaoMap.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.user.kakaoMap.service.HealthTeamJoinService;
import com.fitness.user.kakaoMap.vo.HealthTeamJoinVO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

@Controller
public class HealthTeamJoinController {

	@Autowired
	private HealthTeamJoinService healthTeamJoinService;
	
	//참가인원 추가 및 인원리스트 조회
	@RequestMapping("/insertJoin.do")
	
	public String insertGetListJoinTeam (@RequestBody Map<String, Object> param) {
		System.out.println("controller에서 insertJoin 작동");
		HealthTeamJoinVO vo1 = new HealthTeamJoinVO();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonObject List1 = new JsonObject();
		int ht_id = (int) param.get("ht_id");
		int user_id = (int) param.get("user_id");
		vo1.setHt_id(ht_id);
		vo1.setUser_id(user_id);
		for (HealthTeamJoinVO vo2 : healthTeamJoinService.insertGetListJoinTeam(vo1)) {
			List1.addProperty("ht_id", vo2.getHt_id());
			List1.addProperty("user_id", vo2.getUser_id());
		}
		
		return null;

	}
	
	@RequestMapping("/deleteJoin.do")
	public String deleteGetListHealthTeamJoin (HealthTeamJoinVO vo) {
		System.out.println("controller에서 deleteJoin 작동");
		return null;
	}
	
}
