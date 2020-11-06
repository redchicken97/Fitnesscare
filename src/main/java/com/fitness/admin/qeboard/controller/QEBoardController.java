package com.fitness.admin.qeboard.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fitness.admin.comment.service.CommentService;
import com.fitness.admin.comment.vo.CommentVO;
import com.fitness.admin.common.mail.MailService;
import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.common.paging.PageMaker;
import com.fitness.admin.qeboard.service.QEBoardService;
import com.fitness.admin.qeboard.vo.QEBoardVO;
import com.fitness.admin.user.service.UserService;
import com.fitness.admin.user.vo.UserVO;

@Controller
@EnableAsync
public class QEBoardController {

	@Autowired
	private QEBoardService qEBoardService;
	@Autowired
	private CommentService commentService;
	@Autowired
	private MailService mailService;
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="insertQEBoard.admin", method=RequestMethod.GET)
	public String insertQEBoardForm(QEBoardVO vo) {
		System.out.println("QEBoardController.insertQEBoardForm 실행");
		return "insertQEBoard";
	}
	
	@RequestMapping(value="insertQEBoard.admin", method=RequestMethod.POST)
	public String insertQEBoard(QEBoardVO vo) {
		System.out.println("QEBoardController.insertQEBoard 실행");
		qEBoardService.insertQEBoard(vo);
		return "redirect:/getQEBoardList.admin";
	}
	
	@RequestMapping(value="updateQEBoard.admin", method=RequestMethod.GET)
	public String updateQEBoardForm(QEBoardVO vo, Model model) {
		System.out.println("QEBoardController.updateQEBoardForm 실행");
		model.addAttribute("qeboard", qEBoardService.getQEBoard(vo));
		model.addAttribute("userName", getUserFromId(vo).getUser_name());
		return "updateQEBoard";
	}
	
	@RequestMapping(value="updateQEBoard.admin", method=RequestMethod.POST)
	public String updateQEBoard(QEBoardVO vo) {
		System.out.println("QEBoardController.updateQEBoard 실행");
		qEBoardService.updateQEBoard(vo);
		return "redirect:/getQEBoard.admin?q_id=" + vo.getQ_id();
	}
	
	@RequestMapping("deleteQEBoard.admin")
	public String deleteQEBoard(QEBoardVO vo) {
		System.out.println("QEBoardController.deleteQEBoard 실행");
		
		// vo의 내용을 삭제하기 전에, uvo를 이용하여 사용자의 이름과 이메일 정보를 가져온다.
		// 해당 작업 이전에 deleteQEBoard()를 실행하면, vo객체가 지워지면서 내용을 가져오지 못하게 된다.
		UserVO uvo = getUserFromId(vo);
		String userName = uvo.getUser_name();
		String userEmail = uvo.getUser_email();
		
		qEBoardService.deleteQEBoard(vo);
		
		// 게시글이 강제 삭제된 사실을 작성자에게 메일로 알려준다.
		StringBuffer sb = new StringBuffer();
		sb.append(userName + "님이 작성한 게시글이 관리자에 의해 삭제 처리되었습니다.<br />");
		sb.append("자세한 사항은 관리자(ghp0405@gmail.com)에게 문의하여주십시오.<br />");
		String str = sb.toString();
		mailService.sendMail(userEmail, userName + "님의 게시글이 삭제되었습니다.", str);
		
		return "redirect:/getQEBoardList.admin";
	}
	
	@RequestMapping("getQEBoard.admin")
	public String getQEBoard(QEBoardVO vo, Model model) {
		System.out.println("QEBoardController.getQEBoard 실행");
		model.addAttribute("qeboard", qEBoardService.getQEBoard(vo));
		model.addAttribute("userName", getUserFromId(vo).getUser_name());
		
		// 댓글 세팅
		CommentVO cvo = new CommentVO();
		cvo.setCmt_type("question");
		cvo.setTarget_id(vo.getQ_id());
		model.addAttribute("commentList", commentService.getCommentList(cvo));
		
		return "getQEBoard";
	}
	
	@RequestMapping("getQEBoardList.admin")
	public String getQEBoardList(Model model, Criteria cri) {
		System.out.println("QEBoardController.getQEBoardList 실행");
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(qEBoardService.getQEBoardCount());
		cri = pageMaker.getCri();
		model.addAttribute("pageMaker", pageMaker);
		
		// 작성자란에 user_id 대신 실제 사용자 이름이 나올 수 있도록
		// 사용자 이름들을 담은 list를 만든다.
		List<QEBoardVO> qeList = new ArrayList<>();
		List<String> userList = new ArrayList<>();
		qeList = qEBoardService.getQEBoardList(cri);
		for(int i = 0; i < qeList.size(); i++) {
			userList.add(i, getUserFromId(qeList.get(i)).getUser_name());
		}
		
		model.addAttribute("qeboardList", qEBoardService.getQEBoardList(cri));
		model.addAttribute("userList", userList);
		return "getQEBoardList";
	}
	
	// vo 객체의 id값을 바탕으로 작성자의 정보를 가져오는 메서드
	public UserVO getUserFromId(QEBoardVO vo) {
		vo = qEBoardService.getQEBoard(vo);
		UserVO uvo = new UserVO();
		uvo.setUser_id(vo.getUser_id());
		return userService.getUser(uvo);
	}
	
}
