package com.fitness.trainer.worksave.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.trainer.worksave.dao.WorkSaveDAO;
import com.fitness.trainer.worksave.vo.WorkSaveVO;

@Service("workSaveService")
public class WorkSaveServiceImpl implements WorkSaveService {

	@Autowired
	private WorkSaveDAO workSaveDAO;
	
	@Override
	public void insertWorkSave(WorkSaveVO vo) {
		workSaveDAO.insertWorkSave(vo);
	}

	@Override
	public void deleteWorkSave(WorkSaveVO vo) {
		workSaveDAO.deleteWorkSave(vo);
	}

}
