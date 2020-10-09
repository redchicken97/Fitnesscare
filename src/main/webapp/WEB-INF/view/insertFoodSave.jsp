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
<title>음식 등록</title>
</head>
<body>
	<h1>음식 아이콘 등록</h1>
	<form action="insertFoodSave.admin" method="POST"
		encType="multipart/form-data" >
		<table border="1">
			<tr>
				<th>음식 이미지</th>
				<td><input type="file" name="imgFile" /></td>
			</tr>
		</table>
	<input type="submit" value="음식 아이콘 등록" />
	</form>
	<br />
	<a href="/getFoodList.admin">목록으로</a>
</body>
</html>