package com.fitness.user.qeboard.vo;

import java.util.Date;

public class QeBoardVO {
	
	private int q_id;		//	글번호
	private String q_title;	//	글 제목
	private int user_id;	// 유저 아이디
	private Date q_regdate;	// 글 등록 날짜
	private int q_commentcnt;	// 댓글 수
	private int q_rdcnt;	// 글 추천수
	private int q_visitcnt; // 글 조회수
	private int q_reportcnt;// 글 신고수
	private String q_content;	// 글 내용
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
	public int getQ_commentcnt() {
		return q_commentcnt;
	}
	public void setQ_commentcnt(int q_commentcnt) {
		this.q_commentcnt = q_commentcnt;
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
	public String getQ_content() {
		return q_content;
	}
	public void setQ_content(String q_content) {
		this.q_content = q_content;
	}
	@Override
	public String toString() {
		return "QeBoardVO [q_id=" + q_id + ", q_title=" + q_title + ", user_id=" + user_id + ", q_regdate=" + q_regdate
				+ ", q_commentcnt=" + q_commentcnt + ", q_rdcnt=" + q_rdcnt + ", q_visitcnt=" + q_visitcnt
				+ ", q_reportcnt=" + q_reportcnt + ", q_content=" + q_content + "]";
	}
	
}
