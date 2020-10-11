package com.fitness.admin.hteboard.vo;

import java.util.Date;

public class HTEBoardVO {
	private int ht_id;
	private String ht_title;
	private int user_id;
	private Date ht_regdate;
	private int ht_commentcnt;
	private int ht_limitcnt;
	private String ht_placename;
	private String ht_placeaddress;
	private double ht_y;
	private double ht_x;
	private String ht_content;
	
	@Override
	public String toString() {
		return "HTEBoardVO [ht_id=" + ht_id + ", ht_title=" + ht_title + ", user_id=" + user_id + ", ht_regdate="
				+ ht_regdate + ", ht_commentcnt=" + ht_commentcnt + ", ht_limitcnt=" + ht_limitcnt + ", ht_placename="
				+ ht_placename + ", ht_placeaddress=" + ht_placeaddress + ", ht_y=" + ht_y + ", ht_x=" + ht_x
				+ ", ht_content=" + ht_content + "]";
	}
	public int getHt_id() {
		return ht_id;
	}
	public void setHt_id(int ht_id) {
		this.ht_id = ht_id;
	}
	public String getHt_title() {
		return ht_title;
	}
	public void setHt_title(String ht_title) {
		this.ht_title = ht_title;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Date getHt_regdate() {
		return ht_regdate;
	}
	public void setHt_regdate(Date ht_regdate) {
		this.ht_regdate = ht_regdate;
	}
	public int getHt_commentcnt() {
		return ht_commentcnt;
	}
	public void setHt_commentcnt(int ht_commentcnt) {
		this.ht_commentcnt = ht_commentcnt;
	}
	public int getHt_limitcnt() {
		return ht_limitcnt;
	}
	public void setHt_limitcnt(int ht_limitcnt) {
		this.ht_limitcnt = ht_limitcnt;
	}
	public String getHt_placename() {
		return ht_placename;
	}
	public void setHt_placename(String ht_placename) {
		this.ht_placename = ht_placename;
	}
	public String getHt_placeaddress() {
		return ht_placeaddress;
	}
	public void setHt_placeaddress(String ht_placeaddress) {
		this.ht_placeaddress = ht_placeaddress;
	}
	public double getHt_y() {
		return ht_y;
	}
	public void setHt_y(double ht_y) {
		this.ht_y = ht_y;
	}
	public double getHt_x() {
		return ht_x;
	}
	public void setHt_x(double ht_x) {
		this.ht_x = ht_x;
	}
	public String getHt_content() {
		return ht_content;
	}
	public void setHt_content(String ht_content) {
		this.ht_content = ht_content;
	}
}
