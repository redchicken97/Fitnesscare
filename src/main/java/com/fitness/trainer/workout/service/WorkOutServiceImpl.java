package com.fitness.trainer.workout.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.trainer.workout.dao.WorkOutDAO;
import com.fitness.trainer.workout.vo.WorkOutVO;

@Service("workOutService")
public class WorkOutServiceImpl implements WorkOutService {

	@Autowired
	private WorkOutDAO workOutDAO;
	
	@Override
	public void insertWorkOut(WorkOutVO vo) {
		workOutDAO.insertWorkOut(vo);
	}

	@Override
	public WorkOutVO getWorkOut(WorkOutVO vo) {
		return workOutDAO.getWorkOut(vo);
	}

	@Override
	public List<WorkOutVO> getWorkOutList() {
		return workOutDAO.getWorkOutList();
	}

	@Override
	public void deleteWorkOut(WorkOutVO vo) {
		workOutDAO.deleteWorkOut(vo);
	}

	@Override
	public void updateWorkOut(WorkOutVO vo) {
		workOutDAO.updateWorkOut(vo);
	}

}
