<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	
	<table></table>
	
</body>
</html>