<%@ page import="java.util.List"%>
<%@ page import="com.fitness.admin.veboard.dao.VEBoardDAO"%>
<%@ page import="com.fitness.admin.veboard.vo.VEBoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VEBoardList</title>
</head>
<body>
	<h1>운동 영상 게시판 공지사항 목록</h1>
	<a href="/insertVEBoard.admin">공지사항 등록</a>
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
		<c:forEach var="veboard" items="${veboardList}">
		<tr>
			<td>${veboard.ex_id}</td>
			<td><a href="/getVEBoard.admin?ex_id=${veboard.ex_id}">${veboard.ex_title}</a></td>
			<td>${veboard.user_id}</td>
			<td>${veboard.ex_regdate}</td>
			<td>${veboard.ex_commentcnt}</td>
			<td>${veboard.ex_rdcnt}</td>
			<td>${veboard.ex_visitcnt}</td>
			<td>${veboard.ex_reportcnt}</td>
			<td>공지사항</td>
		</tr>
		</c:forEach>
	</table>
	<br />
<%-- 페이징 처리 부분 --%>
<ul> 
	<c:if test="${pageMaker.prev}">
		<li><a href="/getVEBoardList.admin${pageMaker.makeQuery(pageMaker.startPage - 1)}"><</a></li>
	</c:if>
	<c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
		<li><a href="/getVEBoardList.admin${pageMaker.makeQuery(idx)}">${idx}</a></li>
	</c:forEach>
	<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
		<li><a href="/getVEBoardList.admin${pageMaker.makeQuery(pageMaker.endPage + 1)}">></a></li>
	</c:if>
</ul>
</body>
</html>