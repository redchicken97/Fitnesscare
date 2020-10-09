<%@ page import="java.util.List"%>
<%@ page import="com.fitness.admin.admin.dao.AdminDAO"%>
<%@ page import="com.fitness.admin.admin.vo.AdminVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AdminList</title>
</head>
<body>
<h1>관리자 목록</h1>
<a href="/insertAdmin.admin">관리자 등록</a>
<table border="1">
	<tr>
		<th>번호</th>
		<th>이메일</th>
		<th>닉네임</th>
		<th>계정정보수정</th>
		<th>계정삭제</th>
	</tr>
	<c:forEach var="admin" items="${adminList}">
	<tr>
		<td>${admin.adm_id}</td>
		<td>${admin.adm_email}</td>
		<td>${admin.adm_nickname}</td>
		<td><a href="/updateAdmin.admin?adm_id=${admin.adm_id}">정보수정하기</a></td>
		<td><a href="/deleteAdmin.admin?adm_id=${admin.adm_id}">삭제하기</a></td>
	</tr>
	</c:forEach>
</table>
<br />
</body>
</html>