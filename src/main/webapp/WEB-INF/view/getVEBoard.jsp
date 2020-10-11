<%@ page import="com.fitness.admin.veboard.dao.VEBoardDAO"%>
<%@ page import="com.fitness.admin.veboard.vo.VEBoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VEBoard</title>
</head>
<body>
	<h1>${veboard.ex_title}</h1>
	<a href="/getVEBoardList.admin">운동 영상 게시판 목록으로</a>
	<a href="/updateVEBoard.admin?ex_id=${veboard.ex_id}">공지사항 수정</a>
	<table border="1">
		<tr>
			<th>번호</th>
			<td>${veboard.ex_id}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${veboard.ex_title}</td>
		</tr>
		<tr>
			<th>작성자ID</th>
			<td>${veboard.user_id}</td>
		</tr>
		<tr>
			<th>등록일</th>
			<td>${veboard.ex_regdate}</td>
		</tr>
		<tr>
			<th>댓글수</th>
			<td>${veboard.ex_commentcnt}</td>
		</tr>
		<tr>
			<th>추천수</th>
			<td>${veboard.ex_rdcnt}</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${veboard.ex_visitcnt}</td>
		</tr>
		<tr>
			<th>신고수</th>
			<td>${veboard.ex_reportcnt}</td>
		</tr>
		<tr>
			<th>글종류</th>
			<td>공지사항</td>
		</tr>
		<tr>
			<th>영상 링크</th>
			<td>${veboard.ex_link}</td>
		</tr>
		<tr>
			<th>글 내용</th>
			<td>${veboard.ex_content}</td>
		</tr>
	</table>
	<br />
</body>
</html>