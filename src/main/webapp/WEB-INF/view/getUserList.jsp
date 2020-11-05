<%@ page import="java.util.List"%>
<%@ page import="com.fitness.admin.user.dao.UserDAO"%>
<%@ page import="com.fitness.admin.user.vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserList</title>
</head>
<body>
<h1>사용자 목록</h1>
<table border="1">
	<tr>
		<th>번호</th>
		<th>이름</th>
		<th>이메일</th>
		<th>닉네임</th>
		<th>등록날짜</th>
		<th>사용자등급</th>
		<th>사용자계정상태</th>
		<th>신고당한횟수</th>
		<th>계정정지</th>
	</tr>
	<c:forEach var="user" items="${userList}">
	<tr>
		<td><a href="/getUser.admin?user_id=${user.user_id}">${user.user_id}</a></td>
		<td>${user.user_name}</td>
		<td>${user.user_email}</td>
		<td>${user.user_nick}</td>
		<td><fmt:formatDate value="${user.user_regdate}" dateStyle="default" /></td>
		<td>
		<c:choose>
			<c:when test="${user.user_level eq 'U'.charAt(0)}">일반사용자</c:when>
			<c:when test="${user.user_level eq 'T'.charAt(0)}">트레이너</c:when>
			<c:otherwise>오류</c:otherwise>
		</c:choose>
		</td>
		<td>
		<c:choose>
			<c:when test="${user.user_state eq 'E'.charAt(0)}">정상</c:when>
			<c:when test="${user.user_state eq 'D'.charAt(0)}">정지</c:when>
			<c:when test="${user.user_state eq 'O'.charAt(0)}">탈퇴</c:when>
			<c:otherwise>오류</c:otherwise>
		</c:choose>
		</td>
		<td>${user.user_report_count}</td>
		<td>
		<c:choose>
			<c:when test="${user.user_state eq 'E'.charAt(0)}">
				<a href="/suspendUser.admin?user_id=${user.user_id}&user_email=${user.user_email}">정지</a>
			</c:when>
			<c:when test="${user.user_state eq 'D'.charAt(0)}">
				<a href="/unsuspendUser.admin?user_id=${user.user_id}&user_email=${user.user_email}">복구</a>
			</c:when>
			<c:otherwise>오류</c:otherwise>
		</c:choose>
		</td>
	</tr>
	</c:forEach>
</table>
<%-- 페이징 처리 부분 --%>
<ul> 
	<c:if test="${pageMaker.prev}">
		<li><a href="/getUserList.admin${pageMaker.makeQuery(pageMaker.startPage - 1)}"><</a></li>
	</c:if>
	<c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
		<li><a href="/getUserList.admin${pageMaker.makeQuery(idx)}">${idx}</a></li>
	</c:forEach>
	<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
		<li><a href="/getUserList.admin${pageMaker.makeQuery(pageMaker.endPage + 1)}">></a></li>
	</c:if>
</ul>
<br />
</body>
</html>