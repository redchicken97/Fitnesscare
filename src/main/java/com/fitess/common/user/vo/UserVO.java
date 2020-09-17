package com.fitess.common.user.vo;

import java.util.Date;

public class UserVO {
	private int user_id;	//유저 번호 1증가 시퀀스
	private String user_name;	//유저 이름
	private String user_email;	//유저 이메일 로그인 아이디로 사용
	private String user_nick;	//유저 닉네임 홈페이지에서 사용
	private String user_pw;		//유저 비밀번호
	private int term_one;	//약관동의 했으면 1 안했으면 0
	private int term_two;	//약관동의 했으면 1 안했으면 0
	private Date user_check_date1;	//약관동의를 한 날짜
	private Date user_check_date2;	//약관동의를 한 날짜
	private String term_type1;	//동의를 한 약관 내용
	private String term_type2;	//동의를 한 약관 내용
	private Date user_regdate;	//회원가입 날짜
	private char user_loginMethod;	//로그인한 방법 (카카오 : K, 일반 로그인 : L)
	private char user_level;	//유저 등급(일반 : U, 트레이너 : T, 관리자 : A)
	private char user_state;	//유저 상태(정상 : E, 정지 : D, 탈퇴 : O)
	private char user_report_count;	//신고 당한 횟수
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_nick() {
		return user_nick;
	}
	public void setUser_nick(String user_nick) {
		this.user_nick = user_nick;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public int getTerm_one() {
		return term_one;
	}
	public void setTerm_one(int term_one) {
		this.term_one = term_one;
	}
	public int getTerm_two() {
		return term_two;
	}
	public void setTerm_two(int term_two) {
		this.term_two = term_two;
	}
	public Date getUser_check_date1() {
		return user_check_date1;
	}
	public void setUser_check_date1(Date user_check_date1) {
		this.user_check_date1 = user_check_date1;
	}
	public Date getUser_check_date2() {
		return user_check_date2;
	}
	public void setUser_check_date2(Date user_check_date2) {
		this.user_check_date2 = user_check_date2;
	}
	public String getTerm_type1() {
		return term_type1;
	}
	public void setTerm_type1(String term_type1) {
		this.term_type1 = term_type1;
	}
	public String getTerm_type2() {
		return term_type2;
	}
	public void setTerm_type2(String term_type2) {
		this.term_type2 = term_type2;
	}
	public Date getUser_regdate() {
		return user_regdate;
	}
	public void setUser_regdate(Date user_regdate) {
		this.user_regdate = user_regdate;
	}
	public char getUser_loginMethod() {
		return user_loginMethod;
	}
	public void setUser_loginMethod(char user_loginMethod) {
		this.user_loginMethod = user_loginMethod;
	}
	public char getUser_level() {
		return user_level;
	}
	public void setUser_level(char user_level) {
		this.user_level = user_level;
	}
	
	public char getUser_state() {
		return user_state;
	}
	public void setUser_state(char user_state) {
		this.user_state = user_state;
	}
	
	public char getUser_report_count() {
		return user_report_count;
	}
	public void setUser_report_count(char user_report_count) {
		this.user_report_count = user_report_count;
	}
	
	
	@Override
	public String toString() {
		return "UserVO [user_id=" + user_id + ", user_name=" + user_name + ", user_email=" + user_email + ", user_nick="
				+ user_nick + ", user_pw=" + user_pw + ", term_one=" + term_one + ", term_two=" + term_two
				+ ", user_check_date1=" + user_check_date1 + ", user_check_date2=" + user_check_date2 + ", term_type1="
				+ term_type1 + ", term_type2=" + term_type2 + ", user_regdate=" + user_regdate + ", user_loginMethod="
				+ user_loginMethod + ", user_level=" + user_level + ", user_state=" + user_state
				+ ", user_report_count=" + user_report_count + "]";
	}
	

	
}
