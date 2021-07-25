package com.fitness.trainer.workout.vo;

import java.util.Date;

public class WorkOutVO {
	
	private int workout_id;
	private String workout_img;
	private String workout_title;
	private String workout_link;
	private String workout_content;
	private Date workout_regdate;
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
	public String getWorkout_title() {
		return workout_title;
	}
	public void setWorkout_title(String workout_title) {
		this.workout_title = workout_title;
	}
	public String getWorkout_link() {
		return workout_link;
	}
	public void setWorkout_link(String workout_link) {
		this.workout_link = workout_link;
	}
	public String getWorkout_content() {
		return workout_content;
	}
	public void setWorkout_content(String workout_content) {
		this.workout_content = workout_content;
	}
	public Date getWorkout_regdate() {
		return workout_regdate;
	}
	public void setWorkout_regdate(Date workout_regdate) {
		this.workout_regdate = workout_regdate;
	}
	@Override
	public String toString() {
		return "WorkOutVO [workout_id=" + workout_id + ", workout_img=" + workout_img + ", workout_title="
				+ workout_title + ", workout_link=" + workout_link + ", workout_content=" + workout_content
				+ ", workout_regdate=" + workout_regdate + "]";
	}

}
