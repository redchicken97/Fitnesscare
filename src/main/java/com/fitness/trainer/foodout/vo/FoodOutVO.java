package com.fitness.trainer.foodout.vo;

import java.util.Date;

public class FoodOutVO {
	
	private int foodout_id;
	private String foodout_img;
	private String foodout_title;
	private String foodout_link;
	private String foodout_content;
	private Date foodout_regdate;
	public int getFoodout_id() {
		return foodout_id;
	}
	public void setFoodout_id(int foodout_id) {
		this.foodout_id = foodout_id;
	}
	public String getFoodout_img() {
		return foodout_img;
	}
	public void setFoodout_img(String foodout_img) {
		this.foodout_img = foodout_img;
	}
	public String getFoodout_title() {
		return foodout_title;
	}
	public void setFoodout_title(String foodout_title) {
		this.foodout_title = foodout_title;
	}
	public String getFoodout_link() {
		return foodout_link;
	}
	public void setFoodout_link(String foodout_link) {
		this.foodout_link = foodout_link;
	}
	public String getFoodout_content() {
		return foodout_content;
	}
	public void setFoodout_content(String foodout_content) {
		this.foodout_content = foodout_content;
	}
	public Date getFoodout_regdate() {
		return foodout_regdate;
	}
	public void setFoodout_regdate(Date foodout_regdate) {
		this.foodout_regdate = foodout_regdate;
	}
	@Override
	public String toString() {
		return "FoodOutVO [foodout_id=" + foodout_id + ", foodout_img=" + foodout_img + ", foodout_title="
				+ foodout_title + ", foodout_link=" + foodout_link + ", foodout_content=" + foodout_content
				+ ", foodout_regdate=" + foodout_regdate + "]";
	}
	
}
