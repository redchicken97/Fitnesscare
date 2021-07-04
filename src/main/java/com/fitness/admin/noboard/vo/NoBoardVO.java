package com.fitness.admin.noboard.vo;

import java.util.Date;

public class NoBoardVO {

	private int n_id;
	private String n_title;
	private int user_id;
	private Date n_regdate;
	private int n_commentcnt;
	private int n_rdcnt;
	private int n_visitcnt;
	private int n_reportcnt;
	private String n_content;
	public int getN_id() {
		return n_id;
	}
	public void setN_id(int n_id) {
		this.n_id = n_id;
	}
	public String getN_title() {
		return n_title;
	}
	public void setN_title(String n_title) {
		this.n_title = n_title;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Date getN_regdate() {
		return n_regdate;
	}
	public void setN_regdate(Date n_regdate) {
		this.n_regdate = n_regdate;
	}
	public int getN_commentcnt() {
		return n_commentcnt;
	}
	public void setN_commentcnt(int n_commentcnt) {
		this.n_commentcnt = n_commentcnt;
	}
	public int getN_rdcnt() {
		return n_rdcnt;
	}
	public void setN_rdcnt(int n_rdcnt) {
		this.n_rdcnt = n_rdcnt;
	}
	public int getN_visitcnt() {
		return n_visitcnt;
	}
	public void setN_visitcnt(int n_visitcnt) {
		this.n_visitcnt = n_visitcnt;
	}
	public int getN_reportcnt() {
		return n_reportcnt;
	}
	public void setN_reportcnt(int n_reportcnt) {
		this.n_reportcnt = n_reportcnt;
	}
	public String getN_content() {
		return n_content;
	}
	public void setN_content(String n_content) {
		this.n_content = n_content;
	}
	@Override
	public String toString() {
		return "NoBoardVO [n_id=" + n_id + ", n_title=" + n_title + ", user_id=" + user_id + ", n_regdate=" + n_regdate
				+ ", n_commentcnt=" + n_commentcnt + ", n_rdcnt=" + n_rdcnt + ", n_visitcnt=" + n_visitcnt
				+ ", n_reportcnt=" + n_reportcnt + ", n_content=" + n_content + "]";
	}
	
}
