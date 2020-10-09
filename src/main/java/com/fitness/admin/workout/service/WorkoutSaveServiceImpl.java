package com.fitness.admin.workout.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.admin.workout.dao.WorkoutSaveDAO;
import com.fitness.admin.workout.vo.WorkoutSaveVO;

@Service
public class WorkoutSaveServiceImpl implements WorkoutSaveService {

	@Autowired
	private WorkoutSaveDAO workoutSaveDAO;
	
	@Override
	public void insertWorkoutSave(WorkoutSaveVO vo) {
		System.out.println("WorkoutSaveService.insertWorkoutSave 실행");
		workoutSaveDAO.insertWorkoutSave(vo);
	}

	@Override
	public List<WorkoutSaveVO> getWorkoutSaveList(WorkoutSaveVO vo) {
		System.out.println("WorkoutSaveService.getWorkoutSaveList 실행");
		return workoutSaveDAO.getWorkoutSaveList(vo);
	}
	
}
