package com.fitness.trainer.workout.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.trainer.workout.vo.WorkOutVO;

@Repository
public class WorkOutDAO{
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public void insertWorkOut(WorkOutVO vo) {
		sqlSessionTemplate.insert("WorkOutDAO.insertWorkOut", vo);
	}

	public WorkOutVO getWorkOut(WorkOutVO vo) {
		return sqlSessionTemplate.selectOne("WorkOutDAO.getWorkOut", vo);
	}

	public List<WorkOutVO> getWorkOutList() {
		return sqlSessionTemplate.selectList("WorkOutDAO.getWorkOutList");
	}

	public void deleteWorkOut(WorkOutVO vo) {
		sqlSessionTemplate.delete("WorkOutDAO.deleteWorkOut", vo);
	}

	public void updateWorkOut(WorkOutVO vo) {
		sqlSessionTemplate.update("WorkOutDAO.updateWorkOut", vo);
	}

}
