package com.fitness.admin.admin.vo;

public class AdminVO {
	private int adm_id;
	private String adm_email;
	private String adm_nickname;
	private String adm_password;
	
	@Override
	public String toString() {
		return "AdminVO [adm_id=" + adm_id + ", adm_email=" + adm_email + ", adm_nickname=" + adm_nickname
				+ ", adm_password=" + adm_password + "]";
	}
	public int getAdm_id() {
		return adm_id;
	}
	public void setAdm_id(int adm_id) {
		this.adm_id = adm_id;
	}
	public String getAdm_email() {
		return adm_email;
	}
	public void setAdm_email(String adm_email) {
		this.adm_email = adm_email;
	}
	public String getAdm_nickname() {
		return adm_nickname;
	}
	public void setAdm_nickname(String adm_nickname) {
		this.adm_nickname = adm_nickname;
	}
	public String getAdm_password() {
		return adm_password;
	}
	public void setAdm_password(String adm_password) {
		this.adm_password = adm_password;
	}
}
