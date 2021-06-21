package com.fitness.user.feboard.vo;

import java.util.Date;

public class FeBoardVO {
	
	private int free_id;		//글 번호
	private String free_title;	// 제목
	private int user_id;		// 등록자 id
	private Date free_regdate;	//등록일
	private int free_commentcnt;//댓글 수
	private int free_rdcnt;		//추천 수
	private int free_visitcnt;	//조회 수 
	private int free_reportcnt;	//신고 수
	private String free_content;//글 내용
	
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
	public String getFree_content() {
		return free_content;
	}
	public void setFree_content(String free_content) {
		this.free_content = free_content;
	}
	@Override
	public String toString() {
		return "FeBoardVO [free_id=" + free_id + ", free_title=" + free_title + ", user_id=" + user_id
				+ ", free_regdate=" + free_regdate + ", free_commentcnt=" + free_commentcnt + ", free_rdcnt="
				+ free_rdcnt + ", free_visitcnt=" + free_visitcnt + ", free_reportcnt=" + free_reportcnt
				+ ", free_content=" + free_content + "]";
	}
	
}
