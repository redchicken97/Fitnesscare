<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유 게시판</title>
</head>
<body>
	<a href="insertFeBoard.jsp">자유 게시판 글 작성</a>
	<h3>자유 게시판 목록</h3>
	
	<table border="1">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>댓글수</th>
			<th>작성자</th>
			<th>날짜</th>
			<th>조회수</th>
			<th>좋아요</th>
		</tr>
		
		<c:forEach var="lists" items="${FeList}">
			<tr>
				<td>${lists.free_id }</td>				
				<td><a href="getFeBoard.do?free_id=${lists.free_id }">${lists.free_title }</a></td>
				<td>${lists.free_commentcnt }</td>
				<td>${lists.user_id }</td>
				<td><fmt:formatDate value="${lists.free_regdate }" pattern="yyyy-MM-dd"/></td>
				<td>${lists.free_visitcnt }</td>
				<td>${lists.free_rdcnt }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>