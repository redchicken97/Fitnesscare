package com.fitness.trainer.program.vo;

import java.util.Date;

public class ProgramVO {

	private int program_id;
	private String program_name;
	private int User_id;
	private int program_cmt_cnt;
	private int program_rd_cnt;
	private Date program_regdate;
	private String program_link;
	public int getProgram_id() {
		return program_id;
	}
	public void setProgram_id(int program_id) {
		this.program_id = program_id;
	}
	public String getProgram_name() {
		return program_name;
	}
	public void setProgram_name(String program_name) {
		this.program_name = program_name;
	}
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	public int getProgram_cmt_cnt() {
		return program_cmt_cnt;
	}
	public void setProgram_cmt_cnt(int program_cmt_cnt) {
		this.program_cmt_cnt = program_cmt_cnt;
	}
	public int getProgram_rd_cnt() {
		return program_rd_cnt;
	}
	public void setProgram_rd_cnt(int program_rd_cnt) {
		this.program_rd_cnt = program_rd_cnt;
	}
	public Date getProgram_regdate() {
		return program_regdate;
	}
	public void setProgram_regdate(Date program_regdate) {
		this.program_regdate = program_regdate;
	}
	public String getProgram_link() {
		return program_link;
	}
	public void setProgram_link(String program_link) {
		this.program_link = program_link;
	}
	@Override
	public String toString() {
		return "ProgramVO [program_id=" + program_id + ", program_name=" + program_name + ", User_id=" + User_id
				+ ", program_cmt_cnt=" + program_cmt_cnt + ", program_rd_cnt=" + program_rd_cnt + ", program_regdate="
				+ program_regdate + ", program_link=" + program_link + "]";
	}
	
}
