package com.fitness.admin.feboard.vo;

import java.util.Date;

public class FEBoardVO {
	private int free_id;
	private String free_title;
	private int user_id;
	private Date free_regdate;
	private int free_commentcnt;
	private int free_rdcnt;
	private int free_visitcnt;
	private int free_reportcnt;
	private int free_type;
	private String free_content;
	
	@Override
	public String toString() {
		return "FreeVO [free_id=" + free_id + ", free_title=" + free_title + ", user_id=" + user_id + ", free_regdate="
				+ free_regdate + ", free_commentcnt=" + free_commentcnt + ", free_rdcnt=" + free_rdcnt
				+ ", free_visitcnt=" + free_visitcnt + ", free_reportcnt=" + free_reportcnt + ", free_type=" + free_type
				+ ", free_content=" + free_content + "]";
	}
	public int getFree_id() {
		return free_id;
	}
	public void setFree_id(int free_id) {
		this.free_id = free_id;
	}
	public String getFree_title() {
		return free_title;
	}
	public void setFree_title(String free_title) {
		this.free_title = free_title;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Date getFree_regdate() {
		return free_regdate;
	}
	public void setFree_regdate(Date free_regdate) {
		this.free_regdate = free_regdate;
	}
	public int getFree_commentcnt() {
		return free_commentcnt;
	}
	public void setFree_commentcnt(int free_commentcnt) {
		this.free_commentcnt = free_commentcnt;
	}
	public int getFree_rdcnt() {
		return free_rdcnt;
	}
	public void setFree_rdcnt(int free_rdcnt) {
		this.free_rdcnt = free_rdcnt;
	}
	public int getFree_visitcnt() {
		return free_visitcnt;
	}
	public void setFree_visitcnt(int free_visitcnt) {
		this.free_visitcnt = free_visitcnt;
	}
	public int getFree_reportcnt() {
		return free_reportcnt;
	}
	public void setFree_reportcnt(int free_reportcnt) {
		this.free_reportcnt = free_reportcnt;
	}
	public int getFree_type() {
		return free_type;
	}
	public void setFree_type(int free_type) {
		this.free_type = free_type;
	}
	public String getFree_content() {
		return free_content;
	}
	public void setFree_content(String free_content) {
		this.free_content = free_content;
	}
}
