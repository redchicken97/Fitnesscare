<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main page</title>
</head>
<body>
	<h1>메인 페이지</h1>
	
	<%if(session.getAttribute("userInfo") == null){%>
		
		<a href="login.jsp">로그인</a><br>
		<a href="insertUser.jsp">회원가입</a><br>
	
	<% } %>
	<%if(session.getAttribute("userInfo") != null){ %>
	
		<h3>${userInfo.user_nick }님이 로그인하셧습니다</h3>
		<a href="#">개인 정보 보기</a>
		
	<% }%>
	
	<c:choose>
		<c:when test="${fn:contains(userInfo.user_level, 'A')}">
			<h3>관리자님께서 로그인 하셧습니다.</h3>
			<a href="adminMainPage.jsp">관리자 페이지로 넘어가기</a>
		</c:when>
	
		<c:when test="${fn:contains(userInfo.user_loginMethod,'K')}">
			<a href="logoutKakao.do">카카오 로그아웃하기</a>
		</c:when>
		
		<c:when test="${fn:contains(userInfo.user_loginMethod, 'L')}">
			<a href="logout.do">로그아웃하기</a>
		</c:when>
	</c:choose>
	
	<hr>
		<!-- 	<a href="insertUser.jsp">회원가입</a></br></br> -->
		<!--  	<a href="getUserList.do">회원정보</a><br><br> 	-->	
		<!-- <a href="getQEBoardList.admin">질문 게시판</a> -->
		<a href="comment.do?userId=${userInfo.user_id }">댓글 달기</a>
		<a href="getNoBoardList.do">공지사항 게시판</a>	
		<a href="getMapList.do">헬스팀</a>
		<a href="getFeBoardList.do">자유 게시판</a>
		<a href="getQeBoardList.do">질문 게시판</a>
		
	<hr/>
</body>
</html>