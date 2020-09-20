package com.fitess.common.user.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fitess.common.user.service.UserKakaoService;
import com.fitess.common.user.vo.UserVO;

@Controller
public class UserKakaoController {
	@Autowired
	private UserKakaoService userkakaoService;

	@RequestMapping("/kakaoredirect.do")
	public String K_loginUser(@RequestParam("code") String code, HttpSession session) {
		// System.out.println("code : " + code);

		String access_Token = userkakaoService.getAccessToken(code);
		HashMap<String, Object> userInfo = userkakaoService.getUserInfo(access_Token);
		System.out.println("login Controller :" + userInfo);

		// 클라이언트의 이메일이 존재할 때 세션에 해당 이메일과 토큰등록
		if (userInfo.get("email") != null) {
			session.setAttribute("userId", userInfo.get("email"));
			session.setAttribute("userNick", userInfo.get("nickname"));
			session.setAttribute("access_Token", access_Token);
		}
		return "redirect:/kakaoredirect.jsp";
	}

	@RequestMapping("/insertKakaoUser.do")
	public String insertKakaoUser(UserVO vo) {
		System.out.println("controller에서 kakao 유저 회원가입");
		userkakaoService.insertKakaoUser(vo);
		return "redirect:/getUserList.do";
	}
}
