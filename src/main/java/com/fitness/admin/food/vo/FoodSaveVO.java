package com.fitness.admin.food.vo;

public class FoodSaveVO {
	private int food_id;
	private String food_img;
	
	@Override
	public String toString() {
		return "FoodSaveVO [food_id=" + food_id + ", food_img=" + food_img + "]";
	}
	public int getFood_id() {
		return food_id;
	}
	public void setFood_id(int food_id) {
		this.food_id = food_id;
	}
	public String getFood_img() {
		return food_img;
	}
	public void setFood_img(String food_img) {
		this.food_img = food_img;
	}
}
