package com.fitess.common.user.vo;

import java.util.Date;

public class CommentInfoVO {
	
	private int cmt_id;
	private int target_id;
	private String cmt_type;
	private int user_id;
	private Date cmt_regdate;
	private int cmt_reportCnt;
	private int cmt_ref;
	private int cmt_step;
	private int cmt_depth;
	private String cmt_content;
	public int getCmt_id() {
		return cmt_id;
	}
	public void setCmt_id(int cmt_id) {
		this.cmt_id = cmt_id;
	}
	public int getTarget_id() {
		return target_id;
	}
	public void setTarget_id(int target_id) {
		this.target_id = target_id;
	}
	public String getCmt_type() {
		return cmt_type;
	}
	public void setCmt_type(String cmt_type) {
		this.cmt_type = cmt_type;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Date getCmt_regdate() {
		return cmt_regdate;
	}
	public void setCmt_regdate(Date cmt_regdate) {
		this.cmt_regdate = cmt_regdate;
	}
	public int getCmt_reportCnt() {
		return cmt_reportCnt;
	}
	public void setCmt_reportCnt(int cmt_reportCnt) {
		this.cmt_reportCnt = cmt_reportCnt;
	}
	public int getCmt_ref() {
		return cmt_ref;
	}
	public void setCmt_ref(int cmt_ref) {
		this.cmt_ref = cmt_ref;
	}
	public int getCmt_step() {
		return cmt_step;
	}
	public void setCmt_step(int cmt_step) {
		this.cmt_step = cmt_step;
	}
	
	public int getCmt_depth() {
		return cmt_depth;
	}
	public void setCmt_depth(int cmt_depth) {
		this.cmt_depth = cmt_depth;
	}
	public String getCmt_content() {
		return cmt_content;
	}
	public void setCmt_content(String cmt_content) {
		this.cmt_content = cmt_content;
	}
	@Override
	public String toString() {
		return "CommentInfoVO [cmt_id=" + cmt_id + ", target_id=" + target_id + ", cmt_type=" + cmt_type + ", user_id="
				+ user_id + ", cmt_regdate=" + cmt_regdate + ", cmt_reportCnt=" + cmt_reportCnt + ", cmt_ref=" + cmt_ref
				+ ", cmt_step=" + cmt_step + ", cmt_depth=" + cmt_depth + ", cmt_content=" + cmt_content + "]";
	}

	
	
	
}
