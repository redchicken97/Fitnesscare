package com.fitness.trainer.program.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.trainer.program.service.ProgramService;
import com.fitness.trainer.program.vo.ProgramVO;

@Controller
public class ProgramController {

	@Autowired
	private ProgramService programService;
	
	@RequestMapping("/insertProgram.mdo")
	public String insertProgram(ProgramVO vo) {
		programService.insertProgram(vo);
		return "redirect:/getProgramList.mdo";
	}
	@RequestMapping("/getProgramList.mdo")
	public String getProgramList(Model model) {
		model.addAttribute("programList", programService.getProgramList());
		return "program/getProgramList";
	}
	@RequestMapping("/getProgram.mdo")
	public String getProgram(ProgramVO vo, Model model) {
		model.addAttribute("program", programService.getProgram(vo));
		return "program/getProgram";
	}
	@RequestMapping("/deleteProgram.mdo")
	public String deleteProgram(ProgramVO vo) {
		programService.deleteProgram(vo);
		return "redirect:/getProgramList.mdo";
	}
	@RequestMapping("proModifyPage.mdo")
	public String proModifyPage(ProgramVO vo, Model model) {
		model.addAttribute("program", programService.getProgram(vo));
		return "program/updateProgram";
	}
	@RequestMapping("updateProgram")
	public String updateProgram(ProgramVO vo) {
		programService.updateProgram(vo);
		return "redirect:/getProgram.mdo?program_id" + vo.getProgram_id();
	}
	
}
