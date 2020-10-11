<%@ page import="java.util.List"%>
<%@ page import="com.fitness.admin.feboard.dao.FEBoardDAO"%>
<%@ page import="com.fitness.admin.feboard.vo.FEBoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FEBoardList</title>
</head>
<body>
	<h1>자유 게시판 공지사항 목록</h1>
	<a href="/insertFEBoard.admin">공지사항 등록</a>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>등록일</th>
			<th>댓글수</th>
			<th>추천수</th>
			<th>조회수</th>
			<th>신고수</th>
			<th>글종류</th>
		</tr>
		<c:forEach var="feboard" items="${feboardList}">
		<tr>
			<td>${feboard.free_id}</td>
			<td><a href="/getFEBoard.admin?free_id=${feboard.free_id}">${feboard.free_title}</a></td>
			<td>${feboard.user_id}</td>
			<td>${feboard.free_regdate}</td>
			<td>${feboard.free_commentcnt}</td>
			<td>${feboard.free_rdcnt}</td>
			<td>${feboard.free_visitcnt}</td>
			<td>${feboard.free_reportcnt}</td>
			<td>공지사항</td>
		</tr>
		</c:forEach>
	</table>
	<br />
<%-- 페이징 처리 부분 --%>
<ul> 
	<c:if test="${pageMaker.prev}">
		<li><a href="/getFEBoardList.admin${pageMaker.makeQuery(pageMaker.startPage - 1)}"><</a></li>
	</c:if>
	<c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
		<li><a href="/getFEBoardList.admin${pageMaker.makeQuery(idx)}">${idx}</a></li>
	</c:forEach>
	<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
		<li><a href="/getFEBoardList.admin${pageMaker.makeQuery(pageMaker.endPage + 1)}">></a></li>
	</c:if>
</ul>
</body>
</html>