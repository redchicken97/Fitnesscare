<%@ page import="com.fitness.admin.feboard.dao.FEBoardDAO"%>
<%@ page import="com.fitness.admin.feboard.vo.FEBoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FEBoard</title>
</head>
<body>
	<h1>${feboard.free_title}</h1>
	<a href="/getFEBoardList.admin">자유 게시판 목록으로</a>
	<a href="/updateFEBoard.admin?free_id=${feboard.free_id}">공지사항 수정</a>
	<table border="1">
		<tr>
			<th>번호</th>
			<td>${feboard.free_id}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${feboard.free_title}</td>
		</tr>
		<tr>
			<th>작성자ID</th>
			<td>${feboard.user_id}</td>
		</tr>
		<tr>
			<th>등록일</th>
			<td>${feboard.free_regdate}</td>
		</tr>
		<tr>
			<th>댓글수</th>
			<td>${feboard.free_commentcnt}</td>
		</tr>
		<tr>
			<th>추천수</th>
			<td>${feboard.free_rdcnt}</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${feboard.free_visitcnt}</td>
		</tr>
		<tr>
			<th>신고수</th>
			<td>${feboard.free_reportcnt}</td>
		</tr>
		<tr>
			<th>글종류</th>
			<td>공지사항</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${feboard.free_content}</td>
		</tr>
	</table>
	<br />
</body>
</html>