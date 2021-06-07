package com.fitness.user.kakaoMap.vo;

public class HealthTeamJoinVO {
	private int health_no;
	private int ht_id;
	private int user_id;
	
	public int getHealth_no() {
		return health_no;
	}
	public void setHealth_no(int health_no) {
		this.health_no = health_no;
	}
	public int getHt_id() {
		return ht_id;
	}
	public void setHt_id(int ht_id) {
		this.ht_id = ht_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	@Override
	public String toString() {
		return "HealthTeamJoinVO [health_no=" + health_no + ", ht_id=" + ht_id + ", user_id=" + user_id + "]";
	}
	
	
	
}
