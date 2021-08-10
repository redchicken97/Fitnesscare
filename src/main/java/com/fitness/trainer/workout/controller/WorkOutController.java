package com.fitness.trainer.workout.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.trainer.workout.service.WorkOutService;
import com.fitness.trainer.workout.vo.WorkOutVO;

@Controller
public class WorkOutController {
	
	@Autowired
	private WorkOutService workOutService;
	
	@RequestMapping("/insertWorkOut.mdo")
	public String insertWorkOut(WorkOutVO vo) {
		workOutService.insertWorkOut(vo);
		return "redirect:/getWorkOutList.do";
	}
	@RequestMapping("/getWorkOutList.mdo")
	public String getWorkOutList(Model model) {
		model.addAttribute("workList", workOutService.getWorkOutList());
		return "work/getWorkOutList";
	}
	@RequestMapping("/getWorkOut.mdo")
	public String getWorkOut(WorkOutVO vo, Model model) {
		model.addAttribute("workOut", workOutService.getWorkOut(vo));
		return "work/getWorkOut";
	}
	@RequestMapping("/deleteWorkOut.mdo")
	public String deleteWorkOut(WorkOutVO vo) {
		workOutService.deleteWorkOut(vo);
		return "redirect:/getWorkOutList.do";
	}
	//수정 게시판으로 이동용 컨트롤러 메소드
	@RequestMapping("/workModifyPage.mdo")
	public String workModifyPage(WorkOutVO vo, Model model) {
		model.addAttribute("workOut", workOutService.getWorkOut(vo));
		return "work/updateWorkOut";	
	}
	//실제로 데이터가 수정되는 컨트롤서
	@RequestMapping("/updateWorkOut.mdo")
	public String workOutUpdate(WorkOutVO vo) {
		workOutService.updateWorkOut(vo);
		return "redirect:/getWorkOut.do?workout_id" + vo.getWorkout_id();
	}
}
