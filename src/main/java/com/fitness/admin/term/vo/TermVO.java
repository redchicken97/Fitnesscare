package com.fitness.admin.term.vo;

public class TermVO {
	private int term_id;
	private String term_name;
	private String term_type;
	private String term_content;
	private String term_createdate;
	private String term_manager;
	
	@Override
	public String toString() {
		return "TermVO [term_id=" + term_id + ", term_name=" + term_name + ", term_type=" + term_type
				+ ", term_content=" + term_content + ", term_createdate=" + term_createdate + ", term_manager="
				+ term_manager + "]";
	}
	public int getTerm_id() {
		return term_id;
	}
	public void setTerm_id(int term_id) {
		this.term_id = term_id;
	}
	public String getTerm_name() {
		return term_name;
	}
	public void setTerm_name(String term_name) {
		this.term_name = term_name;
	}
	public String getTerm_type() {
		return term_type;
	}
	public void setTerm_type(String term_type) {
		this.term_type = term_type;
	}
	public String getTerm_content() {
		return term_content;
	}
	public void setTerm_content(String term_content) {
		this.term_content = term_content;
	}
	public String getTerm_createdate() {
		return term_createdate;
	}
	public void setTerm_createdate(String term_createdate) {
		this.term_createdate = term_createdate;
	}
	public String getTerm_manager() {
		return term_manager;
	}
	public void setTerm_manager(String term_manager) {
		this.term_manager = term_manager;
	}
}
