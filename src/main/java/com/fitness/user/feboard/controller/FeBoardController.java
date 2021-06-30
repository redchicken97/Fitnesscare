package com.fitness.user.feboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.user.feboard.service.FeBoardService;
import com.fitness.user.feboard.vo.FeBoardVO;

@Controller
public class FeBoardController {
	
	@Autowired
	private FeBoardService feBoardService;
	
	@RequestMapping("/insertFeBoard.do")
	public String insertFeBoard(FeBoardVO vo) {
		System.out.println("자유 게시판 입력 controller");
		feBoardService.insertFeBoard(vo);
		return "redirect:/getFeBoardList.do";
	}
	@RequestMapping("/getFeBoard.do")
	public String getFeBoard(FeBoardVO vo, Model model) {
		System.out.println("자유 게시판 게시문 가져오기 controller");
		model.addAttribute("FeBoard", feBoardService.getFeBoard(vo));
		return "feBoard/getFeBoard";
	}
	@RequestMapping("/getFeBoardList.do")
	public String getFeBoardList(FeBoardVO vo, Model model) {
		System.out.println("자유 게시판 List controller");
		model.addAttribute("FeList", feBoardService.getFeBoardList(vo));
		return "feBoard/getFeBoardList";
	}
	@RequestMapping("/deleteFeBoard.do")
	public String deleteFeBoard(FeBoardVO vo) {
		System.out.println("자유 게시판 게시글 삭제");
		feBoardService.deleteFeBoard(vo);
		return "redirect:/getFeBoardList.do";
	}
	//수정 게시판으로 이동용 컨트롤러 메소드
	@RequestMapping("/modifyPage.do")
	public String modifyPage(FeBoardVO vo, Model model ) {
		System.out.println("controller 에서 modifyPage실행");
		model.addAttribute("getFBoard", feBoardService.getFeBoard(vo));
		return "feBoard/updateFeBoard";
	}
	
	//modifyPage로 이동한뒤 데이터를 실제로 업데이트하는 메소드
	@RequestMapping("/updateFeBoard.do")
	public String updateFeBoard(FeBoardVO vo) {
		System.out.println("자유 게시판 수정");
		feBoardService.updateFeBoard(vo);
		return "redirect:/getFeBoard.do?free_id="+vo.getFree_id();
	}

}
