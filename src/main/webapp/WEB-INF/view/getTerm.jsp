<%@ page import="com.fitness.admin.term.dao.TermDAO"%>
<%@ page import="com.fitness.admin.term.vo.TermVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Term</title>
</head>
<body>
	<h1>약관</h1>
	<a href="/getTermList.admin">약관 목록으로</a>
	<a href="/updateTerm.admin?term_id=${term.term_id}">약관 수정</a>
	<table border="1">
		<tr>
			<th>번호</th>
			<td>${term.term_id}</td>
		</tr>
		<tr>
			<th>약관명</th>
			<td>${term.term_name}</td>
		</tr>
		<tr>
			<th>종류</th>
			<td>${term.term_type}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${term.term_content}</td>
		</tr>
		<tr>
			<th>생성일</th>
			<td>${term.term_createdate}</td>
		</tr>
		<tr>
			<th>관리자명</th>
			<td>${term.term_manager}</td>
		</tr>
	</table>
	<br />
</body>
</html>