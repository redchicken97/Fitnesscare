package com.fitness.admin.hteboard.controller;

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
import com.fitness.admin.hteboard.service.HTEBoardService;
import com.fitness.admin.hteboard.vo.HTEBoardVO;
import com.fitness.admin.user.service.UserService;
import com.fitness.admin.user.vo.UserVO;

@Controller
public class HTEBoardController {

	@Autowired
	private HTEBoardService hTEBoardService;
	@Autowired
	private MailService mailService;
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="insertHTEBoard", method=RequestMethod.GET)
	public String insertHTEBoardForm(HTEBoardVO vo) {
		System.out.println("HTEBoardController.insertHTEBoardForm 실행");
		return "insertHTEBoard";
	}
	
	@RequestMapping(value="insertHTEBoard", method=RequestMethod.POST)
	public String insertHTEBoard(HTEBoardVO vo) {
		System.out.println("HTEBoardController.insertHTEBoard 실행");
		hTEBoardService.insertHTEBoard(vo);
		return "redirect:/getHTEBoardList.admin";
	}
	
	@RequestMapping(value="updateHTEBoard", method=RequestMethod.GET)
	public String updateHTEBoardForm(HTEBoardVO vo, Model model) {
		System.out.println("HTEBoardController.updateHTEBoardForm 실행");
		model.addAttribute("hteboard", hTEBoardService.getHTEBoard(vo));
		model.addAttribute("userName", getUserFromId(vo).getUser_name());
		return "updateHTEBoard";
	}
	
	@RequestMapping(value="updateHTEBoard", method=RequestMethod.POST)
	public String updateHTEBoard(HTEBoardVO vo) {
		System.out.println("HTEBoardController.updateHTEBoard 실행");
		hTEBoardService.updateHTEBoard(vo);
		return "redirect:/getHTEBoard.admin?ht_id=" + vo.getHt_id();
	}
	
	@RequestMapping("deleteHTEBoard")
	public String deleteHTEBoard(HTEBoardVO vo) {
		System.out.println("HTEBoardController.deleteHTEBoard 실행");
		
		// 게시글 삭제 전에 vo객체를 이용, 사용자의 이름과 이메일을 가져온다.
		UserVO uvo = getUserFromId(vo);
		String userName = uvo.getUser_name();
		String userEmail = uvo.getUser_email();
		
		// 게시글 삭제
		hTEBoardService.deleteHTEBoard(vo);
		
		// 게시글 삭제에 대해 사용자에게 해당 사실을 메일로 전송한다.
		StringBuffer sb = new StringBuffer();
		sb.append(userName + "님이 작성한 게시글이 관리자에 의해 삭제 처리되었습니다.<br />");
		sb.append("자세한 사항은 관리자(ghp0405@gmail.com)에게 문의하여주십시오.<br />");
		String str = sb.toString();
		mailService.sendMail(userEmail, userName + "님의 게시글이 삭제되었습니다.", str);
		
		return "redirect:/getHTEBoardList.admin";
	}
	
	@RequestMapping("getHTEBoard.admin")
	public String getHTEBoard(HTEBoardVO vo, Model model) {
		System.out.println("HTEBoardController.getHTEBoard 실행");
		model.addAttribute("hteboard", hTEBoardService.getHTEBoard(vo));
		model.addAttribute("userName", getUserFromId(vo).getUser_name());
		return "getHTEBoard";
	}
	
	@RequestMapping("getHTEBoardList.admin")
	public String getHTEBoardList(Criteria cri, Model model) {
		System.out.println("HTEBoardController.getHTEBoardList 실행");
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(hTEBoardService.getHTEBoardCount());
		cri = pageMaker.getCri();
		model.addAttribute("pageMaker", pageMaker);
		
		List<HTEBoardVO> hteList = new ArrayList<>();
		List<String> userList = new ArrayList<>();
		hteList = hTEBoardService.getHTEBoardList(cri);
		for(int i = 0; i < hteList.size(); i++) {
			userList.add(i, getUserFromId(hteList.get(i)).getUser_name());
		}
		
		model.addAttribute("hteboardList", hteList);
		model.addAttribute("userList", userList);
		return "getHTEBoardList";
	}
	
	public UserVO getUserFromId(HTEBoardVO vo) {
		vo = hTEBoardService.getHTEBoard(vo);
		UserVO uvo = new UserVO();
		uvo.setUser_id(vo.getUser_id());
		return userService.getUser(uvo);
	}
	
}
