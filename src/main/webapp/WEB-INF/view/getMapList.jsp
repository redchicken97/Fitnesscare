<%@page import="com.fitness.user.common.vo.UserVO"%>
<%@ page import="com.fitness.user.kakaoMap.vo.HealthTeamVO"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%
	UserVO userInfo = (UserVO) session.getAttribute("userInfo");
%>
    	

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헬스팀 리스트</title>
</head>
<body>
	<h1>게시판 목록</h1>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일자</th>
			<th>댓글 수</th>
		</tr>
		
		<c:forEach var="map" items="${mapList}">
			<tr>
				<fmt:formatDate var="formatRegDate" value="${map.ht_regdate }" pattern="yyyy.MM.dd"/>
				<td>${map.ht_id }</td>
				<td><a href="getMap.do?ht_id=${map.ht_id }">${map.ht_title }</a></td>
				<td>${map.user_id }</td> <!-- 나중에 user_id를 이용해서 닉네임을 가져옴 -->
				<td>${formatRegDate }</td>
				<td>${map.ht_commentCnt }</td>
			</tr>
		</c:forEach>
	</table>
	<a href="kakaoMakeMap.jsp?id=${userInfo.user_id}">새 장소 공유하기</a>
</body>
</html>