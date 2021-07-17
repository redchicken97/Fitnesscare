package com.fitness.admin.trainercert.vo;

import java.util.Date;

public class TrainerCertVO {
	
	private int t_id;				// 시퀀스 pk 1씩 증가
	private int user_id;			// 유저 아이디 fk
	private String t_picture_link;	// 트레이너 사진 (필요한지 모르겟음 나중에 삭제 할수도 있음)
	private String t_cname;			// 자격증 이름
	private String t_company;		// 자격증 발급 기관
	private Date t_createDate;		// 자격증 발급일자
	private String t_clink;			// 자격증 사본 (필요한지 모르겠음 나중에 삭제 가능성 있음)
	private Date t_applyDate;		// 신청 날짜
	private Date t_checkDate;		// 관리자가 허락한 날짜
	
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getT_picture_link() {
		return t_picture_link;
	}
	public void setT_picture_link(String t_picture_link) {
		this.t_picture_link = t_picture_link;
	}
	public String getT_cname() {
		return t_cname;
	}
	public void setT_cname(String t_cname) {
		this.t_cname = t_cname;
	}
	public String getT_company() {
		return t_company;
	}
	public void setT_company(String t_company) {
		this.t_company = t_company;
	}
	public Date getT_createDate() {
		return t_createDate;
	}
	public void setT_createDate(Date t_createDate) {
		this.t_createDate = t_createDate;
	}
	public String getT_clink() {
		return t_clink;
	}
	public void setT_clink(String t_clink) {
		this.t_clink = t_clink;
	}
	public Date getT_applyDate() {
		return t_applyDate;
	}
	public void setT_applyDate(Date t_applyDate) {
		this.t_applyDate = t_applyDate;
	}
	public Date getT_checkDate() {
		return t_checkDate;
	}
	public void setT_checkDate(Date t_checkDate) {
		this.t_checkDate = t_checkDate;
	}
	@Override
	public String toString() {
		return "TrainerCertVO [t_id=" + t_id + ", user_id=" + user_id + ", t_picture_link=" + t_picture_link
				+ ", t_cname=" + t_cname + ", t_company=" + t_company + ", t_createDate=" + t_createDate + ", t_clink="
				+ t_clink + ", t_applyDate=" + t_applyDate + ", t_checkDate=" + t_checkDate + "]";
	}

}
