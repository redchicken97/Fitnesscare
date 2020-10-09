<%@ page import="com.fitness.admin.admin.dao.AdminDAO"%>
<%@ page import="com.fitness.admin.admin.vo.AdminVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 등록</title>
<script src="/resources/js/jquery-3.5.1.min.js"></script>
<script charset="utf-8" src="resources/smarteditor2/js/HuskyEZCreator.js" type="text/javascript"></script>
<script src="resources/js/smarteditor2.js"></script>
<script src="resources/js/jquery.serialize-object.js"></script>
</head>
<body>
	<h1>관리자 등록</h1>
	<form action="insertAdmin.admin" method="POST">
		<table border="1">
			<tr>
				<th>이메일</th>
				<td><input type="text" name="adm_email" /></td>
			</tr>
			<tr>
				<th>사용할 닉네임</th>
				<td><input type="text" name="adm_nickname" /></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="adm_password" /></td>
			</tr>
		</table>
	<input type="submit" value="관리자 등록" />
	</form>
	<br />
	<a href="/getAdminList.admin">목록으로</a>
</body>
</html>