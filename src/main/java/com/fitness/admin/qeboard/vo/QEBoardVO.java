package com.fitness.admin.qeboard.vo;

import java.util.Date;

public class QEBoardVO {
	private int q_id;
	private String q_title;
	private int user_id;
	private Date q_regdate;
	private int q_rdcnt;
	private int q_visitcnt;
	private int q_reportcnt;
	private int q_type;
	private char q_lock;
	private String q_content;
	
	@Override
	public String toString() {
		return "QEBoardVO [q_id=" + q_id + ", q_title=" + q_title + ", user_id=" + user_id + ", q_regdate=" + q_regdate
				+ ", q_rdcnt=" + q_rdcnt + ", q_visitcnt=" + q_visitcnt + ", q_reportcnt=" + q_reportcnt + ", q_type="
				+ q_type + ", q_lock=" + q_lock + ", q_content=" + q_content + "]";
	}
	public int getQ_id() {
		return q_id;
	}
	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}
	public String getQ_title() {
		return q_title;
	}
	public void setQ_title(String q_title) {
		this.q_title = q_title;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Date getQ_regdate() {
		return q_regdate;
	}
	public void setQ_regdate(Date q_regdate) {
		this.q_regdate = q_regdate;
	}
	public int getQ_rdcnt() {
		return q_rdcnt;
	}
	public void setQ_rdcnt(int q_rdcnt) {
		this.q_rdcnt = q_rdcnt;
	}
	public int getQ_visitcnt() {
		return q_visitcnt;
	}
	public void setQ_visitcnt(int q_visitcnt) {
		this.q_visitcnt = q_visitcnt;
	}
	public int getQ_reportcnt() {
		return q_reportcnt;
	}
	public void setQ_reportcnt(int q_reportcnt) {
		this.q_reportcnt = q_reportcnt;
	}
	public int getQ_type() {
		return q_type;
	}
	public void setQ_type(int q_type) {
		this.q_type = q_type;
	}
	public char getQ_lock() {
		return q_lock;
	}
	public void setQ_lock(char q_lock) {
		this.q_lock = q_lock;
	}
	public String getQ_content() {
		return q_content;
	}
	public void setQ_content(String q_content) {
		this.q_content = q_content;
	}
}
