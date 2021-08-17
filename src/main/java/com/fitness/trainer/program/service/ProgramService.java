package com.fitness.trainer.program.service;

import java.util.List;

import com.fitness.trainer.program.vo.ProgramVO;

public interface ProgramService {
	
	public void insertProgram(ProgramVO vo);
	
	public void updateProgram(ProgramVO vo);
	
	public void deleteProgram(ProgramVO vo);
	
	public ProgramVO getProgram(ProgramVO vo);
	
	public List<ProgramVO> getProgramList();
}
