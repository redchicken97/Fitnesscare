package com.fitness.trainer.worksave.vo;

public class WorkSaveVO {
	
	private int worksave_id;
	private int program_id;
	private int workout_id;
	private int worksave_order;
	
	public int getWorksave_id() {
		return worksave_id;
	}
	public void setWorksave_id(int worksave_id) {
		this.worksave_id = worksave_id;
	}
	public int getProgram_id() {
		return program_id;
	}
	public void setProgram_id(int program_id) {
		this.program_id = program_id;
	}
	public int getWorkout_id() {
		return workout_id;
	}
	public void setWorkout_id(int workout_id) {
		this.workout_id = workout_id;
	}
	public int getWorksave_order() {
		return worksave_order;
	}
	public void setWorksave_order(int worksave_order) {
		this.worksave_order = worksave_order;
	}
	@Override
	public String toString() {
		return "WorkSaveVO [worksave_id=" + worksave_id + ", program_id=" + program_id + ", workout_id=" + workout_id
				+ ", worksave_order=" + worksave_order + "]";
	}
}
