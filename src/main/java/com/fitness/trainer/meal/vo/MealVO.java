package com.fitness.trainer.meal.vo;

import java.util.Date;

public class MealVO {

	private int meal_id;
	private String meal_name;
	private int user_id;
	private int meal_cmt_cnt;
	private int meal_rd_cnt;
	private Date meal_regdate;
	private String meal_link;
	public int getMeal_id() {
		return meal_id;
	}
	public void setMeal_id(int meal_id) {
		this.meal_id = meal_id;
	}
	public String getMeal_name() {
		return meal_name;
	}
	public void setMeal_name(String meal_name) {
		this.meal_name = meal_name;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getMeal_cmt_cnt() {
		return meal_cmt_cnt;
	}
	public void setMeal_cmt_cnt(int meal_cmt_cnt) {
		this.meal_cmt_cnt = meal_cmt_cnt;
	}
	public int getMeal_rd_cnt() {
		return meal_rd_cnt;
	}
	public void setMeal_rd_cnt(int meal_rd_cnt) {
		this.meal_rd_cnt = meal_rd_cnt;
	}
	public Date getMeal_regdate() {
		return meal_regdate;
	}
	public void setMeal_regdate(Date meal_regdate) {
		this.meal_regdate = meal_regdate;
	}
	public String getMeal_link() {
		return meal_link;
	}
	public void setMeal_link(String meal_link) {
		this.meal_link = meal_link;
	}
	@Override
	public String toString() {
		return "MealVO [meal_id=" + meal_id + ", meal_name=" + meal_name + ", user_id=" + user_id + ", meal_cmt_cnt="
				+ meal_cmt_cnt + ", meal_rd_cnt=" + meal_rd_cnt + ", meal_regdate=" + meal_regdate + ", meal_link="
				+ meal_link + "]";
	}
}
