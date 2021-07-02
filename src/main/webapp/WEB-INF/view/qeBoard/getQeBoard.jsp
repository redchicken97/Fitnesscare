<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>질문 게시판 게시물 가져오기</title>
</head>
<body>
	<c:set var="name" value="${userInfo.user_id }"/>
	<c:set var="writer" value="${QeBoard.user_id }"/>
</body>
</html>