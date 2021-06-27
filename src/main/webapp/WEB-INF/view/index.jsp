<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main page</title>
</head>
<body>
	<h1>메인 페이지</h1>
	
	<h3>${userInfo.user_nick }님이 로그인하셧습니다</h3>
	
	<c:choose>
		<c:when test="${userInfo.user_loginMethod eq 'K' }">
			<a>카카오 로그아웃하기</a>
		</c:when>
		
		<c:when test="${userInfo.user_loginMethod eq 'L' }">
			<a>로그아웃하기</a>
		</c:when>
	</c:choose>

	<hr>
		<a href="login.jsp">로그인</a><br>
		<!-- 	<a href="insertUser.jsp">회원가입</a></br></br> -->
		<!--  	<a href="getUserList.do">회원정보</a><br><br> 	-->	
		<!-- <a href="getQEBoardList.admin">질문 게시판</a> -->	
		<a href="getMapList.do">헬스팀</a>
		<a href="getFeBoardList.do">자유 게시판</a>
		<a href="getQeBoardList.do">질문 게시판</a>
	<hr/>
</body>
</html>