<%@ page import="java.util.List"%>
<%@ page import="com.fitness.admin.food.dao.FoodSaveDAO"%>
<%@ page import="com.fitness.admin.food.vo.FoodSaveVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FoodSaveList</title>
</head>
<body>
	<h1>음식 아이콘 목록</h1>
	<a href="/insertFoodSave.admin">음식 아이콘 삽입</a>
	<table border="1">
		<tr>
			<th>음식 일련번호</th>
			<th>음식 이미지 링크</th>
		</tr>
		<c:forEach var="foodSave" items="${foodSaveList}">
		<tr>
			<td>${foodSave.food_id}</td>
			<td><img src='<c:url value="${foodSave.food_img}" />' /></td>
		</tr>
		</c:forEach>
	</table>
	<br />
</body>
</html>