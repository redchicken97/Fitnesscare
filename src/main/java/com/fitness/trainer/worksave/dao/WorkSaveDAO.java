package com.fitness.trainer.worksave.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.trainer.worksave.vo.WorkSaveVO;

@Repository
public class WorkSaveDAO{
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public void insertWorkSave(WorkSaveVO vo) {
		sqlSessionTemplate.insert("WorkSaveDAO.insertWorkSave");
	}

	public void deleteWorkSave(WorkSaveVO vo) {
		sqlSessionTemplate.delete("WorkSaveDAO.deleteWorkSave");
	}

}
