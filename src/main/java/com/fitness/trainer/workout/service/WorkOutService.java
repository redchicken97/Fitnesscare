package com.fitness.trainer.workout.service;

import java.util.List;

import com.fitness.trainer.workout.vo.WorkOutVO;

public interface WorkOutService {

	public void insertWorkOut(WorkOutVO vo);
	
	public WorkOutVO getWorkOut(WorkOutVO vo);
	
	public List<WorkOutVO> getWorkOutList();
	
	public void deleteWorkOut(WorkOutVO vo);
	
	public void updateWorkOut(WorkOutVO vo);
}
