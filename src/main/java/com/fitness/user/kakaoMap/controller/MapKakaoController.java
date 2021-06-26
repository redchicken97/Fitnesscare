package com.fitness.user.kakaoMap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fitness.user.kakaoMap.service.MapKakaoService;
import com.fitness.user.kakaoMap.vo.HealthTeamVO;

@Controller
public class MapKakaoController {
	@Autowired
	private MapKakaoService mapkakaoservice;
	
	@RequestMapping("/insertMap.do")
	public String insertMap(HealthTeamVO vo, @RequestParam(value="ht_y") float ht_y,
	@RequestParam(value="ht_x") float ht_x) {
//		vo.setHt_x(ht_x);
		System.out.println("controller에서 map 등록");
		mapkakaoservice.insertMap(vo);
		return "redirect:/getMapList.do";
	}
	@RequestMapping("/getMapList.do")
	public String getMapList(HealthTeamVO vo, Model model) {
		System.out.println("controller에서 게시판 목록 보기");
		model.addAttribute("mapList", mapkakaoservice.getMapList(vo));
		return "kakaoMap/getMapList";
	}
	@RequestMapping("/getMap.do")
	public String getMap(HealthTeamVO vo, Model model) {
		System.out.println("controller에서 글 하나 가셔오기");
		model.addAttribute("mapOne", mapkakaoservice.getMap(vo.getHt_id()));
		return "kakaoMap/getMap";
	}
}
