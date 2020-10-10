<%@ page import="com.fitness.admin.user.dao.UserDAO"%>
<%@ page import="com.fitness.admin.user.vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User</title>
</head>
<body>
	<h1>사용자 보기</h1>
	<a href="/getUserList.admin">사용자 목록으로</a>
	<table border="1">
		<tr>
			<th>번호</th>
			<td>${user.user_id}</td>
		</tr>
		<tr>
			<th>이름</th>
			<td>${user.user_name}</td>
		</tr>
		<tr>
			<th>이메일</th>
			<td>${user.user_email}</td>
		</tr>
		<tr>
			<th>닉네임</th>
			<td>${user.user_nick}</td>
		</tr>
		<tr>
			<th>약관동의1</th>
			<td>
				<c:choose>
					<c:when test="${user.term_one eq 0}">비동의</c:when>
					<c:when test="${user.term_one eq 1}">동의</c:when>
					<c:otherwise>오류</c:otherwise>
				</c:choose>
			</td>
		</tr>
		<tr>
			<th>약관동의2</th>
			<td>
				<c:choose>
					<c:when test="${user.term_two eq 0}">비동의</c:when>
					<c:when test="${user.term_two eq 1}">동의</c:when>
					<c:otherwise>오류</c:otherwise>
				</c:choose>
			</td>
		</tr>
		<tr>
			<th>약관동의날짜1</th>
			<td>${user.user_check_date1}</td>
		</tr>
		<tr>
			<th>약관동의날짜2</th>
			<td>${user.user_check_date2}</td>
		</tr>
		<tr>
			<th>약관종류1</th>
			<td>${user.term_type1}</td>
		</tr>
		<tr>
			<th>약관종류2</th>
			<td>${user.term_type2}</td>
		</tr>
		<tr>
			<th>등록날짜</th>
			<td>${user.user_regdate}</td>
		</tr>
		<tr>
			<th>로그인방식</th>
			<td>
				<c:choose>
					<c:when test="${user.user_loginmethod eq 'L'.charAt(0)}">일반</c:when>
					<c:when test="${user.user_loginmethod eq 'K'.charAt(0)}">카카오</c:when>
					<c:otherwise>오류</c:otherwise>
				</c:choose>
			</td>
		</tr>
		<tr>
			<th>사용자등급</th>
			<td>
				<c:choose>
					<c:when test="${user.user_level eq 'U'.charAt(0)}">일반사용자</c:when>
					<c:when test="${user.user_level eq 'T'.charAt(0)}">트레이너</c:when>
					<c:otherwise>오류</c:otherwise>
				</c:choose>
			</td>
		</tr>
		<tr>
			<th>사용자계정상태</th>
			<td>
				<c:choose>
					<c:when test="${user.user_state eq 'E'.charAt(0)}">정상</c:when>
					<c:when test="${user.user_state eq 'D'.charAt(0)}">정지</c:when>
					<c:when test="${user.user_state eq 'O'.charAt(0)}">탈퇴</c:when>
					<c:otherwise>오류</c:otherwise>
				</c:choose>
			</td>
		</tr>
		<tr>
			<th>신고당한횟수</th>
			<td>${user.user_report_count}</td>
		</tr>
	</table>
	<%-- 사용자 계정 정지/복구 --%>
	<c:choose>
		<c:when test="${user.user_state eq 'E'.charAt(0)}">
			<a href="/suspendUser.admin?user_id=${user.user_id}">정지</a>
		</c:when>
		<c:when test="${user.user_state eq 'D'.charAt(0)}">
			<a href="/unsuspendUser.admin?user_id=${user.user_id}">복구</a>
		</c:when>
		<c:when test="${user.user_state eq 'O'.charAt(0)}">
			이미 탈퇴한 회원입니다.
		</c:when>
		<c:otherwise>
			오류
		</c:otherwise>
	</c:choose>
</body>
</html>