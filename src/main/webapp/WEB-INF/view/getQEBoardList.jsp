<%@ page import="java.util.List"%>
<%@ page import="com.fitness.admin.qeboard.dao.QEBoardDAO"%>
<%@ page import="com.fitness.admin.qeboard.vo.QEBoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>QEBoardList</title>
</head>
<body>
	<h1>질문 게시판 공지사항 목록</h1>
	<a href="/insertQEBoard.admin">공지사항 등록</a>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>등록일</th>
			<th>추천수</th>
			<th>조회수</th>
			<th>신고수</th>
			<th>글종류</th>
			<th>잠금여부</th>
		</tr>
		<c:forEach var="qeboard" items="${qeboardList}">
		<tr>
			<td>${qeboard.q_id}</td>
			<td><a href="/getQEBoard.admin?q_id=${qeboard.q_id}">${qeboard.q_title}</a></td>
			<td>${qeboard.user_id}</td><%-- 나중에 fk를 user_email 등으로 바꾸는게 나을것같다...(email에 unique 추가해서) --%>
			<td>${qeboard.q_regdate}</td>
			<td>${qeboard.q_rdcnt}</td>
			<td>${qeboard.q_visitcnt}</td>
			<td>${qeboard.q_reportcnt}</td>
			<td>공지사항</td><%-- 2가지 데이터는 이미 정형화되어서 qeboardList에 반환됨 --%>
			<td>잠금없음</td>
		</tr>
		</c:forEach>
	</table>
	<br />
<%-- 페이징 처리 부분 --%>
<ul> 
	<c:if test="${pageMaker.prev}">
		<li><a href="/getQEBoardList.admin${pageMaker.makeQuery(pageMaker.startPage - 1)}"><</a></li>
	</c:if>
	<c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
		<li><a href="/getQEBoardList.admin${pageMaker.makeQuery(idx)}">${idx}</a></li>
	</c:forEach>
	<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
		<li><a href="/getQEBoardList.admin${pageMaker.makeQuery(pageMaker.endPage + 1)}">></a></li>
	</c:if>
</ul>
</body>
</html>