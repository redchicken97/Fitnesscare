<%@page import="com.fitness.common.user.vo.UserVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User List</title>
</head>
<body>
	<h1>회원 목록</h1>
	<table border="1">
		<tr>
			<th>UserId</th>
			<th>UserName</th>
			<th>UserEmail</th>
			<th>UserNick</th>
			<th>UserPw</th>
			<th>TermOne</th>
			<th>TermTwo</th>
			<th>UserCheckDate1</th>
			<th>UserCheckDate2</th>
			<th>TermType1</th>
			<th>TermType2</th>
			<th>UserRegDate</th>
			<th>UserLoginMethod</th>
			<th>UserLevel</th>
			<th>UserState</th>
			<th>UserReportCount</th>
			<th>delete</th>
		</tr>
		
		<c:forEach var="user" items="${userList}">
			<tr>
				<td>${user.user_id }</td>
				<td>${user.user_name }</td>
				<td>${user.user_email }</td>
				<td>${user.user_nick }</td>
				<td>${user.user_pw }</td>
				<td>${user.term_one }</td>
				<td>${user.term_two }</td>
				<td>${user.user_check_date1 }</td>
				<td>${user.user_check_date2 }</td>
				<td>${user.term_type1 }</td>
				<td>${user.term_type2 }</td>
				<td>${user.user_regdate }</td>
				<td>${user.user_loginmethod }</td>
				<td>${user.user_level }</td>
				<td>${user.user_state }</td>
				<td>${user.user_report_count }</td>
				<td><button type="button" onclick="location.href='deleteUser.do?user_id=${user.user_id}'">삭제</button></td>
			</tr>
		</c:forEach>
	</table><br/>
	
	<a href="index.jsp">메인회면으로 가기</a>
</body>
</html>