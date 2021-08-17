package com.fitness.trainer.program.dao;

import java.util.List;

import com.fitness.trainer.program.vo.ProgramVO;

public interface ProgramDAO {
	
	public void insertProgram(ProgramVO vo);
	
	public void updateProgram(ProgramVO vo);
	
	public void deleteProgram(ProgramVO vo);
	
	public ProgramVO getProgram(ProgramVO vo);
	
	public List<ProgramVO> getProgramList();
	
}
