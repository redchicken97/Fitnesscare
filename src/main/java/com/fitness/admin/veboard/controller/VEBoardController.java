package com.fitness.admin.veboard.controller;

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
import com.fitness.admin.user.service.UserService;
import com.fitness.admin.user.vo.UserVO;
import com.fitness.admin.veboard.service.VEBoardService;
import com.fitness.admin.veboard.vo.VEBoardVO;

@Controller
public class VEBoardController {

	@Autowired
	private VEBoardService vEBoardService;
	@Autowired
	private MailService mailService;
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="insertVEBoard.admin", method=RequestMethod.GET)
	public String insertVEBoardForm(VEBoardVO vo) {
		System.out.println("VEBoardController.insertVEBoardForm 실행");
		return "insertVEBoard";
	}
	
	@RequestMapping(value="insertVEBoard.admin", method=RequestMethod.POST)
	public String insertVEBoard(VEBoardVO vo) {
		System.out.println("VEBoardController.insertVEBoard 실행");
		vEBoardService.insertVEBoard(vo);
		return "redirect:/getVEBoardList.admin";
	}
	
	@RequestMapping(value="updateVEBoard.admin", method=RequestMethod.GET)
	public String updateVEBoardForm(VEBoardVO vo, Model model) {
		System.out.println("VEBoardController.updateVEBoardForm 실행");
		model.addAttribute("veboard", vEBoardService.getVEBoard(vo));
		model.addAttribute("userName", getUserFromId(vo).getUser_name());
		return "updateVEBoard";
	}
	
	@RequestMapping(value="updateVEBoard.admin", method=RequestMethod.POST)
	public String updateVEBoard(VEBoardVO vo) {
		System.out.println("VEBoardController.updateVEBoard 실행");
		vEBoardService.updateVEBoard(vo);
		return "redirect:/getVEBoard.admin?ex_id=" + vo.getEx_id();
	}
	
	@RequestMapping("deleteVEBoard.admin")
	public String deleteVEBoard(VEBoardVO vo) {
		System.out.println("VEBoardController.deleteVEBoard 실행");
		
		// 게시글을 삭제하기 전, vo객체의 id값을 이용하여 사용자의 이름 및 이메일을 알아낸다.
		vo = vEBoardService.getVEBoard(vo);
		UserVO uvo = new UserVO();
		uvo.setUser_id(vo.getUser_id());
		uvo = userService.getUser(uvo);
		String userName = uvo.getUser_name();
		String userEmail = uvo.getUser_email();
		
		vEBoardService.deleteVEBoard(vo);
		
		// 사용자에게 게시글 삭제에 대한 사실을 메일로 보냄
		StringBuffer sb = new StringBuffer();
		sb.append(userName + "님이 작성한 게시글이 관리자에 의해 삭제 처리되었습니다.<br />");
		sb.append("자세한 사항은 관리자(ghp0405@gmail.com)에게 문의하여주십시오.<br />");
		String str = sb.toString();
		mailService.sendMail(userEmail, userName + "님의 게시글이 삭제되었습니다.", str);
		
		return "redirect:/getVEBoardList.admin";
	}
	
	@RequestMapping("getVEBoard.admin")
	public String getVEBoard(VEBoardVO vo, Model model) {
		System.out.println("VEBoardController.getVEBoard 실행");
		model.addAttribute("veboard", vEBoardService.getVEBoard(vo));
		model.addAttribute("userName", getUserFromId(vo).getUser_name());
		return "getVEBoard";
	}
	
	@RequestMapping("getVEBoardList.admin")
	public String getVEBoardList(Model model, Criteria cri) {
		System.out.println("VEBoardController.getVEBoardList 실행");
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(vEBoardService.getVEBoardCount());
		cri = pageMaker.getCri();
		model.addAttribute("pageMaker", pageMaker);
		
		List<VEBoardVO> veList = new ArrayList<>();
		List<String> userList = new ArrayList<>();
		veList = vEBoardService.getVEBoardList(cri);
		for(int i = 0; i < veList.size(); i++) {
			userList.add(i, getUserFromId(veList.get(i)).getUser_name());
		}
		
		model.addAttribute("veboardList", vEBoardService.getVEBoardList(cri));
		model.addAttribute("userList", userList);
		return "getVEBoardList";
	}
	
	public UserVO getUserFromId(VEBoardVO vo) {
		vo = vEBoardService.getVEBoard(vo);
		UserVO uvo = new UserVO();
		uvo.setUser_id(vo.getUser_id());
		return userService.getUser(uvo);
	}
	
}
