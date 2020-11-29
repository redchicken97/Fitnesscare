<%@page import="com.fitess.common.user.vo.HealthTeamVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%

	List<HealthTeamVO> mapList = (List<HealthTeamVO>) session.getAttribute("mapList");

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
				<td>${map.ht_id }</td>
				<td><a href="getMap.do?ht_id=${map.ht_id }">${map.ht_title }</a></td>
				<td>${map.user_id }</td> <!-- 나중에 user_id를 이용해서 닉네임을 가져옴 -->
				<td>${map.ht_regdate }</td>
				<td>${map.ht_commentCnt }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>