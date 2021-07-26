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
		// TODO Auto-generated method stub
		
	}

	@Override
	public WorkOutVO getWorkOut(WorkOutVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WorkOutVO> getWorkOutList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteWorkOut(WorkOutVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateWorkOut(WorkOutVO vo) {
		// TODO Auto-generated method stub
		
	}

}
