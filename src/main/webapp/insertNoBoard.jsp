<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

	<%
	
		if(session.getAttribute("userInfo") == null){
			response.sendRedirect("login.jsp");
		}
	
	%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지 게시판 작성</title>
</head>
<body>
	
	<c:set var="level" value="${userInfo.level }"/>
	<c:if test="${level ne 'A'}">
		<% response.sendRedirect("index.jsp"); %>
		<script>
			alert("관리자가 아닙니다.");
		</script>
	</c:if>
	
	<h3>공지 작성 화면</h3>
	<form action="insertNoBoard.do" method="post">
		제목:
		<input type="text" name="n_title">
		<input type="submit" value="작성">
		
		<br><br>
		
		<input type="hidden" name="user_id" value="${userInfo.user_id }">
		
		내용 : <br>
		<textarea rows="8" cols="50" name="n_content"></textarea>
	</form>
</body>
</html>