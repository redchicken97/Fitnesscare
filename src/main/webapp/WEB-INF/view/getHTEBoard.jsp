<%@ page import="com.fitness.admin.hteboard.dao.HTEBoardDAO"%>
<%@ page import="com.fitness.admin.hteboard.vo.HTEBoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HTEBoard</title>
</head>
<body>
	<h1>${hteboard.ht_title}</h1>
	<a href="/getHTEBoardList.admin">위치 공유 게시판 목록으로</a>
	<a href="/updateHTEBoard.admin?ht_id=${hteboard.ht_id}">공지사항 수정</a>
	<table border="1">
		<tr>
			<th>번호</th>
			<td>${hteboard.ht_id}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${hteboard.ht_title}</td>
		</tr>
		<tr>
			<th>작성자ID</th>
			<td>${hteboard.user_id}</td>
		</tr>
		<tr>
			<th>등록일</th>
			<td>${hteboard.ht_regdate}</td>
		</tr>
		<tr>
			<th>댓글수</th>
			<td>${hteboard.ht_commentcnt}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${hteboard.ht_content}</td>
		</tr>
		<tr>
			<th>글종류</th>
			<td>공지사항</td>
		</tr>
	</table>
	<br />
</body>
</html>