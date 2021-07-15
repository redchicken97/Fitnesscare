<%@ page import="java.util.List"%>
<%@ page import="com.fitness.admin.term.dao.TermDAO"%>
<%@ page import="com.fitness.admin.term.vo.TermVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TermList</title>
</head>
<body>
	<h1>약관 목록</h1>
	<a href="/insertTerm.admin">약관 등록</a>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>약관명</th>
			<th>종류</th>
			<th>생성일</th>
			<th>관리자명</th>
		</tr>
		<c:forEach var="term" items="${termList}">
		<tr>
			<td><a href="/getTerm.admin?term_id=${term.term_id}">${term.term_id}</a></td>
			<td>${term.term_name}</td>
			<td>${term.term_type}</td>
			<td>${term.term_createdate}</td>
			<td>${term.term_manager}</td>
		</tr>
		</c:forEach>
	</table>
	<br />
<%-- 페이징 처리 부분 --%>
<ul> 
	<c:if test="${pageMaker.prev}">
		<li><a href="/getTermList.admin${pageMaker.makeQuery(pageMaker.startPage - 1)}"><</a></li>
	</c:if>
	<c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
		<li><a href="/getTermList.admin${pageMaker.makeQuery(idx)}">${idx}</a></li>
	</c:forEach>
	<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
		<li><a href="/getTermList.admin${pageMaker.makeQuery(pageMaker.endPage + 1)}">></a></li>
	</c:if>
</ul>
</body>
</html>