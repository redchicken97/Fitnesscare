package com.fitness.trainer.program.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.trainer.program.vo.ProgramVO;

@Repository
public class ProgramDAO{

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public void insertProgram(ProgramVO vo) {
		sqlSessionTemplate.insert("programDAO.insertProgram", vo);
	}

	public void updateProgram(ProgramVO vo) {
		sqlSessionTemplate.update("programDAO.updateProgram", vo);
	}

	public void deleteProgram(ProgramVO vo) {
		sqlSessionTemplate.delete("programDAO.deleteProgram", vo);
	}

	public ProgramVO getProgram(ProgramVO vo) {
		return sqlSessionTemplate.selectOne("programDAO.getProgram", vo);
	}

	public List<ProgramVO> getProgramList() {
		return sqlSessionTemplate.selectList("programDAO.getProgramList");
	}

}
