package com.fitness.admin.noboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.admin.noboard.service.NoBoardService;
import com.fitness.admin.noboard.vo.NoBoardVO;
import com.fitness.user.common.service.UserService;
import com.fitness.user.common.vo.UserVO;

@Controller
public class NoBoardController {

	
	@Autowired
	private NoBoardService noBoardService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/insertNoBoard.do")
	public String insertNoBoard(NoBoardVO vo) {
		System.out.println("공지 게시판 입력 controller");
		noBoardService.insertNoBoard(vo);
		return "redirect:/getNoBoardList.do";
	}
	@RequestMapping("/getNoBoardList.do")
	public String getNoBoardList(NoBoardVO vo, Model model) {
		System.out.println("공지 게시판 글 전체 controller");
		model.addAttribute("NoList", noBoardService.getNoBoardList());
		return "noBoard/getNoBoardList";
	}
	@RequestMapping("/getNoBoard.do")
	public String getNoBoard(NoBoardVO vo, Model model) {
		System.out.println("공지 게시판 하나 controller");
		model.addAttribute("NoBoard", noBoardService.getNoBoard(vo));
		return "noBoard/getNoBoard";
	}
	@RequestMapping("/deleteNoBoard.do")
	public String deleteNoBoard(NoBoardVO vo) {
		System.out.println("공지 게시판 삭제 controller");
		noBoardService.deleteNoBoard(vo);
		return "redirect:/getNoBoardList.do";
	}
	@RequestMapping("/noModifyPage.do")
	public String noModifyPage(NoBoardVO vo, Model model) {
		System.out.println("공지 게시판 수정 페이지로 이동 controller");
		model.addAttribute("NoBoard", noBoardService.getNoBoard(vo));
		//noBoardService.getNoBoard에서 가져옴 user_id를 이용해서 유저 아이디를 가져오는 메서드
		model.addAttribute("UserName", getUserName(vo).getUser_name());
		return "noBoard/updateNoBoard";
	}
	//noModifyPage로 이동한뒤 데이터를 실제로 업테이트 하는 메소드
	@RequestMapping("/updateNoBoard.do")
	public String updateNoBoard(NoBoardVO vo) {
		System.out.println("공지 게시판 수정");
		noBoardService.updateNoBoard(vo);
		return "redirect:/getNoBoard.do?n_id" + vo.getN_id();
	}
	
	//유저 아이디를 이용해서 사용자 정보를 가져오는 메서드
	public UserVO getUserName(NoBoardVO vo) {
		vo = noBoardService.getNoBoard(vo);
		UserVO wvo = new UserVO();
		wvo.setUser_id(vo.getUser_id());
		return userService.getUser(wvo);
	}
	
}
