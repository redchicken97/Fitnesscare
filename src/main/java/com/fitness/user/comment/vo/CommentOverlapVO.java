package com.fitness.user.comment.vo;

public class CommentOverlapVO {
	
	private int overlap_id;		// 댓글 추천 인덱스
	private int cmt_id;			// 댓글 인덱스
	private int user_id;		// 회원 아이디
	private String cnt_sep;		// 추천 구분
	
	public int getOverlap_id() {
		return overlap_id;
	}
	public void setOverlap_id(int overlap_id) {
		this.overlap_id = overlap_id;
	}
	public int getCmt_id() {
		return cmt_id;
	}
	public void setCmt_id(int cmt_id) {
		this.cmt_id = cmt_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getCnt_sep() {
		return cnt_sep;
	}
	public void setCnt_sep(String cnt_sep) {
		this.cnt_sep = cnt_sep;
	}
	@Override
	public String toString() {
		return "CommentOverlapVO [overlap_id=" + overlap_id + ", cmt_id=" + cmt_id + ", user_id=" + user_id
				+ ", cnt_sep=" + cnt_sep + "]";
	}
	
}
