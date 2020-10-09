<%@ page import="java.util.List"%>
<%@ page import="com.fitness.admin.workout.dao.WorkoutSaveDAO"%>
<%@ page import="com.fitness.admin.workout.vo.WorkoutSaveVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WorkoutSaveList</title>
</head>
<body>
	<h1>운동 아이콘 목록</h1>
	<a href="/insertWorkoutSave.admin">운동 아이콘 삽입</a>
	<table border="1">
		<tr>
			<th>운동 일련번호</th>
			<th>운동 이미지 링크</th>
		</tr>
		<c:forEach var="workoutSave" items="${workoutSaveList}">
		<tr>
			<td>${workoutSave.workout_id}</td>
			<td><img src='<c:url value="${workoutSave.workout_img}" />' /></td>
		</tr>
		</c:forEach>
	</table>
	<br />
</body>
</html>