package com.fitness.admin.veboard.vo;

import java.util.Date;

public class VEBoardVO {
	private int ex_id;
	private String ex_title;
	private int user_id;
	private Date ex_regdate;
	private int ex_commentcnt;
	private int ex_rdcnt;
	private int ex_visitcnt;
	private int ex_reportcnt;
	private int ex_type;
	private String ex_link;
	private String ex_content;
	
	@Override
	public String toString() {
		return "VEBoardVO [ex_id=" + ex_id + ", ex_title=" + ex_title + ", user_id=" + user_id + ", ex_regdate="
				+ ex_regdate + ", ex_commentcnt=" + ex_commentcnt + ", ex_rdcnt=" + ex_rdcnt + ", ex_visitcnt="
				+ ex_visitcnt + ", ex_reportcnt=" + ex_reportcnt + ", ex_type=" + ex_type + ", ex_link=" + ex_link
				+ ", ex_content=" + ex_content + "]";
	}
	public int getEx_id() {
		return ex_id;
	}
	public void setEx_id(int ex_id) {
		this.ex_id = ex_id;
	}
	public String getEx_title() {
		return ex_title;
	}
	public void setEx_title(String ex_title) {
		this.ex_title = ex_title;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Date getEx_regdate() {
		return ex_regdate;
	}
	public void setEx_regdate(Date ex_regdate) {
		this.ex_regdate = ex_regdate;
	}
	public int getEx_commentcnt() {
		return ex_commentcnt;
	}
	public void setEx_commentcnt(int ex_commentcnt) {
		this.ex_commentcnt = ex_commentcnt;
	}
	public int getEx_rdcnt() {
		return ex_rdcnt;
	}
	public void setEx_rdcnt(int ex_rdcnt) {
		this.ex_rdcnt = ex_rdcnt;
	}
	public int getEx_visitcnt() {
		return ex_visitcnt;
	}
	public void setEx_visitcnt(int ex_visitcnt) {
		this.ex_visitcnt = ex_visitcnt;
	}
	public int getEx_reportcnt() {
		return ex_reportcnt;
	}
	public void setEx_reportcnt(int ex_reportcnt) {
		this.ex_reportcnt = ex_reportcnt;
	}
	public int getEx_type() {
		return ex_type;
	}
	public void setEx_type(int ex_type) {
		this.ex_type = ex_type;
	}
	public String getEx_link() {
		return ex_link;
	}
	public void setEx_link(String ex_link) {
		this.ex_link = ex_link;
	}
	public String getEx_content() {
		return ex_content;
	}
	public void setEx_content(String ex_content) {
		this.ex_content = ex_content;
	}
}
