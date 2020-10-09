package com.fitness.admin.workout.vo;

public class WorkoutSaveVO {
	private int workout_id;
	private String workout_img;
	
	@Override
	public String toString() {
		return "WorkoutSaveVO [workout_id=" + workout_id + ", workout_img=" + workout_img + "]";
	}
	public int getWorkout_id() {
		return workout_id;
	}
	public void setWorkout_id(int workout_id) {
		this.workout_id = workout_id;
	}
	public String getWorkout_img() {
		return workout_img;
	}
	public void setWorkout_img(String workout_img) {
		this.workout_img = workout_img;
	}
}
