package com.fitness.user.qeboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.user.common.service.UserService;
import com.fitness.user.common.vo.UserVO;
import com.fitness.user.qeboard.service.QeBoardService;
import com.fitness.user.qeboard.vo.QeBoardVO;

@Controller
public class QeBoardController {
	
	@Autowired
	private QeBoardService qeBoardService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/insertQeBoard.do")
	public String insertQeBoard(QeBoardVO vo) {
		System.out.println("질문 게시판 글 작성 controller");
		qeBoardService.insertQeBoard(vo);
		return "redirect:/getQeBoardList.do";
	}
	@RequestMapping("/getQeBoardList.do")
	public String getQeBoardList(QeBoardVO vo, Model model) {
		System.out.println("질문 게시판 글 가져오기 controller");
		model.addAttribute("QeList", qeBoardService.getQeBoardList(vo));
		return "qeBoard/getQeBoardList";
	}
	@RequestMapping("/getQeBoard.do")
	public String getQeBoard(QeBoardVO vo, Model model) {
		System.out.println("controller에서 질문 게시물하나 가져오기");
		model.addAttribute("QeBoard", qeBoardService.getQeBoard(vo));
		//feBoardService.getFeBoard에서 가져온 user_id를 이용해서 유저 이름을 가져오는 메서드
		model.addAttribute("UserName", getUserName(vo).getUser_name());
		return "qeBoard/getQeBoard";
	}
	@RequestMapping("/deleteQeBoard.do")
	public String deleteQeBoard(QeBoardVO vo){
		System.out.println("controller에서 질문 게시물 삭제");
		qeBoardService.deleteQeBoard(vo);
		return "redirect:/getQeBoardList.do";
	}
	//수정게시판으로 이동용 컨트롤러 메소드
	@RequestMapping("/qeModifyPage.do")
	public String qeModifyPage(QeBoardVO vo, Model model) {
		System.out.println("controller에서 modifyPage 실행");
		model.addAttribute("getQBoard", qeBoardService.getQeBoard(vo));
		//feBoardService.getFeBoard에서 가져온 user_id를 이용해서 유저 이름을 가져오는 메서드
		model.addAttribute("UserName", getUserName(vo).getUser_name());
		return "qeBoard/updateQeBoard";
	}
	//qeModifyPage로 이동한뒤 데이터를 실제로 업데이트하는 메소드
	@RequestMapping("/updateQeBoard.do")
	public String updateQeBoard(QeBoardVO vo) {
		System.out.println("질문 게시판 수정");
		qeBoardService.updateBoard(vo);
		return "redirect:/getQeBoard.do?q_id" + vo.getQ_id();
	}
	
	//유저 아이디를 이용해서 사용자 정보를 가져오는 메서드
	public UserVO getUserName(QeBoardVO vo) {
		vo = qeBoardService.getQeBoard(vo);
		UserVO wvo = new UserVO();
		return userService.getUser(wvo);
	}
	
}
