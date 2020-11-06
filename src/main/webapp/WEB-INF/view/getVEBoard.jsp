<%@ page import="com.fitness.admin.veboard.dao.VEBoardDAO"%>
<%@ page import="com.fitness.admin.veboard.vo.VEBoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VEBoard</title>
</head>
<body>
	<h1>${veboard.ex_title}</h1>
	<a href="/getVEBoardList.admin">운동 영상 게시판 목록으로</a>
	<c:choose>
		<c:when test="${veboard.ex_type eq 0}">
			<a href="/deleteVEBoard.admin?ex_id=${veboard.ex_id}">일반게시글 삭제</a>
		</c:when>
		<c:when test="${veboard.ex_type eq 1}">
			<a href="/updateVEBoard.admin?ex_id=${veboard.ex_id}">공지사항 수정</a>
			<a href="/deleteVEBoard.admin?ex_id=${veboard.ex_id}">공지사항 삭제</a>
		</c:when>
	</c:choose>
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
			<th>작성자</th>
			<td>${userName}</td>
		</tr>
		<tr>
			<th>등록일</th>
			<td><fmt:formatDate value="${veboard.ex_regdate}" dateStyle="default" /></td>
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