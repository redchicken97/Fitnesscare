package com.fitess.common.user.vo;

import java.util.Date;

public class healthTeamVO {
	private int ht_id;			//게시판 일련 번호 1증가 시퀀스 
	private String ht_title;	//게시글 제목
	private int user_id;		//회원 시리얼 넘버
	private Date ht_regdate;	//글 등록 날짜
	private int ht_commentCnt; 	//댓글 수
	private int ht_limitCnt;;	//참여자 제한수
	private String ht_placename;//약속 장소 이름
	private String ht_placeaddress;//약속 장소 주소
	private int ht_y;		//약속장소 위도
	private int ht_x;		//약속장소 경도
	private String ht_content;	//글 내용

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

	public int getHt_commentCnt() {
		return ht_commentCnt;
	}

	public void setHt_commentCnt(int ht_commentCnt) {
		this.ht_commentCnt = ht_commentCnt;
	}

	public int getHt_limitCnt() {
		return ht_limitCnt;
	}

	public void setHt_limitCnt(int ht_limitCnt) {
		this.ht_limitCnt = ht_limitCnt;
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

	public int getHt_y() {
		return ht_y;
	}

	public void setHt_y(int ht_y) {
		this.ht_y = ht_y;
	}

	public int getHt_x() {
		return ht_x;
	}

	public void setHt_x(int ht_x) {
		this.ht_x = ht_x;
	}
	
	public String getHt_content() {
		return ht_content;
	}

	public void setHt_content(String ht_content) {
		this.ht_content = ht_content;
	}

	@Override
	public String toString() {
		return "healthTeamVO [ht_id=" + ht_id + ", ht_title=" + ht_title + ", user_id=" + user_id + ", ht_regdate="
				+ ht_regdate + ", ht_commentCnt=" + ht_commentCnt + ", ht_limitCnt=" + ht_limitCnt + ", ht_placename="
				+ ht_placename + ", ht_placeaddress=" + ht_placeaddress + ", ht_y=" + ht_y + ", ht_x=" + ht_x
				+ ", ht_content=" + ht_content + "]";
	}

	
	
	
}
