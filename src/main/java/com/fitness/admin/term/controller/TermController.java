package com.fitness.admin.term.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.admin.term.service.TermService;
import com.fitness.admin.term.vo.TermVO;

@Controller
public class TermController {
	
	@Autowired
	private TermService termService;
	
	@RequestMapping("/insertTerm.do")
	public String insertTerm(TermVO vo) {
		termService.insertTerm(vo);
		return "redirect:/getTermList.do";
	}
	@RequestMapping("/getTermList.do")
	public String getTermList(TermVO vo, Model model) {
		model.addAttribute("TermList", termService.getTermList());
		return "term/getTermList";
	}
	@RequestMapping("/getTerm.do")
	public String getTerm(TermVO vo, Model model) {
		model.addAttribute("Term", termService.getTerm(vo));
		return "term/getTerm";
	}
	@RequestMapping("/deleteTerm.do")
	public String deleteTerm(TermVO vo) {
		termService.deleteTerm(vo);
		return "redirect:/getTermList.do";
	}

}
