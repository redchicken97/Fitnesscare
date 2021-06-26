<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유 게시판 리스트</title>
</head>
<body>
	<a href="insertQeBoard.jsp">글 작성</a>
	<h3>질문 게시판 글 목록</h3>
	
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
		
		<c:forEach var=lists items="${QeList }"> 
			<tr>
				<td>${lists.q_id }</td>
				<td>${lists.q_title }</td>
				<td>${lists.q_commentcnt }</td>
				<td>${lists.user_id }</td>
				<td>${lists.q_regdate }</td>
				<td>${lists.q_visitcnt }</td>
				<td>${lists.q_rdcnt }</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>