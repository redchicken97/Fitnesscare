package com.fitness.trainer.program.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.trainer.program.dao.ProgramDAO;
import com.fitness.trainer.program.vo.ProgramVO;

@Service("programService")
public class ProgramServiceImpl implements ProgramService {

	@Autowired
	private ProgramDAO programDAO;
	
	@Override
	public void insertProgram(ProgramVO vo) {
		programDAO.insertProgram(vo);
	}

	@Override
	public void updateProgram(ProgramVO vo) {
		programDAO.updateProgram(vo);
	}

	@Override
	public void deleteProgram(ProgramVO vo) {
		programDAO.deleteProgram(vo);
	}

	@Override
	public ProgramVO getProgram(ProgramVO vo) {
		return programDAO.getProgram(vo);
	}

	@Override
	public List<ProgramVO> getProgramList() {
		return programDAO.getProgramList();
	}

}
