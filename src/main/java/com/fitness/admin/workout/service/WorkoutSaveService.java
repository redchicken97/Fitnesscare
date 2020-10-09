package com.fitness.admin.workout.service;

import java.util.List;

import com.fitness.admin.workout.vo.WorkoutSaveVO;

public interface WorkoutSaveService {
	void insertWorkoutSave(WorkoutSaveVO vo);
	List<WorkoutSaveVO>getWorkoutSaveList(WorkoutSaveVO vo);
}
