package com.fitness.trainer.workout.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.trainer.workout.vo.WorkOutVO;

@Repository
public class WorkOutDAOImpl implements WorkOutDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public void insertWorkOut(WorkOutVO vo) {
		sqlSessionTemplate.insert("WorkOutDAO.insertWorkOut");
	}

	@Override
	public WorkOutVO getWorkOut(WorkOutVO vo) {
		return sqlSessionTemplate.selectOne("WorkOutDAO.getWorkOut");
	}

	@Override
	public List<WorkOutVO> getWorkOutList() {
		return sqlSessionTemplate.selectList("WorkOutDAO.getWorkOutList");
	}

	@Override
	public void deleteWorkOut(WorkOutVO vo) {
		sqlSessionTemplate.delete("WorkOutDAO.deleteWorkOut");
	}

	@Override
	public void updateWorkOut(WorkOutVO vo) {
		sqlSessionTemplate.update("WorkOutDAO.updateWorkOut");
	}

}
