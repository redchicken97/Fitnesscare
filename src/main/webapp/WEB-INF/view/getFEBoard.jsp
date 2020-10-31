<%@ page import="com.fitness.admin.feboard.dao.FEBoardDAO"%>
<%@ page import="com.fitness.admin.feboard.vo.FEBoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FEBoard</title>
</head>
<body>
	<h1>${feboard.free_title}</h1>
	<a href="/getFEBoardList.admin">자유 게시판 목록으로</a>
	<c:choose>
		<c:when test="${feboard.free_type eq 0}">
			<a href="/deleteFEBoard.admin?free_id=${feboard.free_id}">일반게시글 삭제</a>
		</c:when>
		<c:when test="${feboard.free_type eq 1}">
			<a href="/updateFEBoard.admin?free_id=${feboard.free_id}">공지사항 수정</a>
			<a href="/deleteFEBoard.admin?free_id=${feboard.free_id}">공지사항 삭제</a>
		</c:when>
	</c:choose>
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
			<td><fmt:formatDate value="${feboard.free_regdate}" dateStyle="default" /></td>
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
			<c:choose>
				<c:when test="${feboard.free_type eq 0}">
					<td>일반 게시글</td>
				</c:when>
				<c:when test="${feboard.free_type eq 1}">
					<td>공지사항</td>
				</c:when>
				<c:otherwise><td>오류</td></c:otherwise>
			</c:choose>
		</tr>
		<tr>
			<th>내용</th>
			<td>${feboard.free_content}</td>
		</tr>
	</table>
	<br />
</body>
</html>