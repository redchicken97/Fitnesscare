package com.fitness.trainer.foodsave.vo;

public class FoodSaveVO {
	
	private int foodsave_id;
	private int meal_id;
	private int foodout_id;
	private int foodsave_order;
	public int getFoodsave_id() {
		return foodsave_id;
	}
	public void setFoodsave_id(int foodsave_id) {
		this.foodsave_id = foodsave_id;
	}
	public int getMeal_id() {
		return meal_id;
	}
	public void setMeal_id(int meal_id) {
		this.meal_id = meal_id;
	}
	public int getFoodout_id() {
		return foodout_id;
	}
	public void setFoodout_id(int foodout_id) {
		this.foodout_id = foodout_id;
	}
	public int getFoodsave_order() {
		return foodsave_order;
	}
	public void setFoodsave_order(int foodsave_order) {
		this.foodsave_order = foodsave_order;
	}
	@Override
	public String toString() {
		return "FoodSaveVO [foodsave_id=" + foodsave_id + ", meal_id=" + meal_id + ", foodout_id=" + foodout_id
				+ ", foodsave_order=" + foodsave_order + "]";
	}
	
	
}
