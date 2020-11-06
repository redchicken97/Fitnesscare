package com.fitness.admin.feboard.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fitness.admin.common.mail.MailService;
import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.common.paging.PageMaker;
import com.fitness.admin.feboard.service.FEBoardService;
import com.fitness.admin.feboard.vo.FEBoardVO;
import com.fitness.admin.user.service.UserService;
import com.fitness.admin.user.vo.UserVO;

@Controller
public class FEBoardController {

	@Autowired
	private FEBoardService fEBoardService;
	@Autowired
	private MailService mailService;
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="insertFEBoard", method=RequestMethod.GET)
	public String insertFEBoardFrom(FEBoardVO vo) {
		System.out.println("FEBoardController.insertFEBoardFrom 실행");
		return "insertFEBoard";
	}
	
	@RequestMapping(value="insertFEBoard", method=RequestMethod.POST)
	public String insertFEBoard(FEBoardVO vo) {
		System.out.println("FEBoardController.insertFEBoard 실행");
		fEBoardService.insertFEBoard(vo);
		return "redirect:/getFEBoardList.admin";
	}
	
	@RequestMapping(value="updateFEBoard", method=RequestMethod.GET)
	public String updateFEBoardFrom(FEBoardVO vo, Model model) {
		System.out.println("FEBoardController.updateFEBoardFrom 실행");
		model.addAttribute("feboard", fEBoardService.getFEBoard(vo));
		model.addAttribute("userName", getUserFromId(vo).getUser_name());
		return "updateFEBoard";
	}
	
	@RequestMapping(value="updateFEBoard", method=RequestMethod.POST)
	public String updateFEBoard(FEBoardVO vo) {
		System.out.println("FEBoardController.updateFEBoard 실행");
		fEBoardService.updateFEBoard(vo);
		return "redirect:/getFEBoard.admin?free_id=" + vo.getFree_id();
	}
	
	@RequestMapping("deleteFEBoard")
	public String deleteFEBoard(FEBoardVO vo) {
		System.out.println("FEBoardController.deleteFEBoard 실행");
		
		// delete 작업 전, free_id를 이용하여 사용자의 이름 및 이메일 정보를 가져온다.
		UserVO uvo = getUserFromId(vo);
		String userName = uvo.getUser_name();
		String userEmail = uvo.getUser_email();
		
		// 게시글 삭제
		fEBoardService.deleteFEBoard(vo);
		
		// 게시글 삭제에 대한 사실을 사용자에게 메일로 전송
		StringBuffer sb = new StringBuffer();
		sb.append(userName + "님이 작성한 게시글이 관리자에 의해 삭제 처리되었습니다. <br />");
		sb.append("자세한 사항은 관리자(ghp0405@gmail.com)에게 문의하여주십시오.<br />");
		String str = sb.toString();
		mailService.sendMail(userEmail, userName + "님의 게시글이 삭제되었습니다.", str);
		
		return "redirect:/getFEBoardList.admin";
	}
	
	@RequestMapping("getFEBoard")
	public String getFEBoard(FEBoardVO vo, Model model) {
		System.out.println("FEBoardController.getFEBoard 실행");
		model.addAttribute("feboard", fEBoardService.getFEBoard(vo));
		model.addAttribute("userName", getUserFromId(vo).getUser_name());
		return "getFEBoard";
	}
	
	@RequestMapping("getFEBoardList")
	public String getFEBoardList(Criteria cri, Model model) {
		System.out.println("FEBoardController.getFEBoardList 실행");
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(fEBoardService.getFEBoardCount());
		cri = pageMaker.getCri();
		model.addAttribute("pageMaker", pageMaker);
		
		// 작성자란에 user_id 대신 실제 사용자 이름이 나올 수 있도록
		// 사용자 이름들을 담은 list를 만든다.
		List<FEBoardVO> feList = new ArrayList<>();
		List<String> userList = new ArrayList<>();
		feList = fEBoardService.getFEBoardList(cri);
		for(int i = 0; i < feList.size(); i++) {
			userList.add(i, getUserFromId(feList.get(i)).getUser_name());
		}
		
		model.addAttribute("feboardList", feList);
		model.addAttribute("userList", userList);
		return "getFEBoardList";
	}
	
	// vo객체의 id값을 바탕으로 사용자의 정보를 가져오는 메서드
	public UserVO getUserFromId(FEBoardVO vo) {
		vo = fEBoardService.getFEBoard(vo);
		UserVO uvo = new UserVO();
		uvo.setUser_id(vo.getUser_id());
		return userService.getUser(uvo);
	}
	
}
