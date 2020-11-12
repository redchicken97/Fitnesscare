package com.fitness.admin.term.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.common.paging.PageMaker;
import com.fitness.admin.term.service.TermService;
import com.fitness.admin.term.vo.TermVO;

@Controller
public class TermController {

	@Autowired
	private TermService termService;
	
	@RequestMapping(value="/insertTerm.admin", method=RequestMethod.GET)
	public String insertTermForm(TermVO vo) {
		System.out.println("TermController.insertTermForm 실행");
		return "insertTerm";
	}
	
	@RequestMapping(value="/insertTerm.admin", method=RequestMethod.POST)
	public String insertTerm(TermVO vo) {
		System.out.println("TermController.insertTerm 실행");
		termService.insertTerm(vo);
		return "redirect:/getTermList.admin";
	}
	
	@RequestMapping(value="/updateTerm.admin", method=RequestMethod.GET)
	public String updateTermForm(TermVO vo, Model model) {
		System.out.println("TermController.updateTermForm 실행");
		model.addAttribute("term", termService.getTerm(vo));
		return "updateTerm";
	}
	
	@RequestMapping(value="/updateTerm.admin", method=RequestMethod.POST)
	public String updateTerm(TermVO vo) {
		System.out.println("TermController.updateTerm 실행");
		termService.updateTerm(vo);
		return "redirect:/getTerm.admin?term_id=" + vo.getTerm_id();
	}
	
	@RequestMapping("/getTerm.admin")
	public String getTerm(TermVO vo, Model model) {
		System.out.println("TermController.getTerm 실행");
		model.addAttribute("term", termService.getTerm(vo));
		return "getTerm";
	}
	
	@RequestMapping("/getTermList.admin")
	public String getTermList(Model model, Criteria cri) {
		System.out.println("TermController.getTermList 실행");
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(termService.getTermCount());
		cri = pageMaker.getCri();
		model.addAttribute("pageMaker", pageMaker);
		
		model.addAttribute("termList", termService.getTermList(cri));
		return "getTermList";
	}
	
}
