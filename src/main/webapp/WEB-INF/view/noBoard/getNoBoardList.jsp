<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지 게시판</title>
</head>
<body>

	<h3>공지 게시판</h3>
	
	<c:choose>
		<c:when test="${fn:contains(userInfo.user_level, 'A')}">
			<a href="insertNoBoard.jsp">공지 등록하기</a>
		</c:when>
	</c:choose>
	
	<table border="1">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>댓글 수</th>
			<th>작성자</th>
			<th>날짜</th>
			<th>조회수</th>
			<th>좋아요</th>
		</tr>
		
		<c:forEach var="list" items="${NoList }" varStatus="status">
			<tr>
				<td>${list.n_id }</td>
				<td>${list.n_title }</td>
				<td>${list.n_commentcnt }</td>
				<td>${NoNameList[status.index] }</td>
				<td>${list.n_regdate }</td>
				<td>${list.n_visitcnt }</td>
				<td>${list.n_rdcnt }</td>
			</tr>
		</c:forEach>
		
	</table>
	
</body>
</html>