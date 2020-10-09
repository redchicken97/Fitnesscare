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
<title>운동 아이콘 등록</title>
</head>
<body>
	<h1>운동 아이콘 등록</h1>
	<form action="insertWorkoutSave.admin" method="POST"
		encType="multipart/form-data" >
		<table border="1">
			<tr>
				<th>운동 이미지</th>
				<td><input type="file" name="imgFile" /></td>
			</tr>
		</table>
	<input type="submit" value="운동 아이콘 등록" />
	</form>
	<br />
	<a href="/getWorkoutList.admin">목록으로</a>
</body>
</html>