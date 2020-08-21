<%@page import="com.fitess.common.user.vo.UserVO"%>
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
		</tr>
		<tr>
			<td></td>
		</tr>
	</table>
	<a href="index.jsp">메인회면으로 가기</a>
</body>
</html>