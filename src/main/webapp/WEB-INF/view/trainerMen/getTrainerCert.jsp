<%@ page import="com.fitness.admin.trainercert.dao.TrainerCertDAO"%>
<%@ page import="com.fitness.admin.trainercert.vo.TrainerCertVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전문가 인증 세부내용</title>
</head>
<body>
	<h1>전문가 인증 세부내용</h1>
	<a href="/getTrainerCertList.admin">전문가 인증 신청 목록으로</a>
	<table border="1">
		<tr>
			<th>번호</th>
			<td>${trainerCert.t_id}</td>
		</tr>
		<tr>
			<th>신청자</th>
			<td>${userName}</td>
		</tr>
		<tr>
			<th>사진</th>
			<td><img src='<c:url value="${trainerCert.t_picture_link}" />' /></td>
		</tr>
		<tr>
			<th>자격증 이름</th>
			<td>${trainerCert.t_cname}</td>
		</tr>
		<tr>
			<th>자격증 발급기관</th>
			<td>${trainerCert.t_company}</td>
		</tr>
		<tr>
			<th>발급일시</th>
			<td><fmt:formatDate value="${trainerCert.t_createdate}" dateStyle="default" /></td>
		</tr>
		<tr>
			<th>자격증 사본</th>
			<td><img src='<c:url value="${trainerCert.t_clink}" />' /></td>
		</tr>
		<tr>
			<th>인증이 채택된 날짜</th>
			<td>
				<c:choose>
					<c:when test="${trainerCert.t_checkdate eq null}">승인되지않음</c:when>
					<c:otherwise>
						<fmt:formatDate value="${trainerCert.t_checkdate}" dateStyle="default" />
					</c:otherwise>
				</c:choose>
			</td>
		</tr>
	</table>
<a href="/acceptTrainerCert.admin?t_id=${trainerCert.t_id}">승인하기</a>
<a href="/declineTrainerCert.admin?t_id=${trainerCert.t_id}">거절하기</a>
</body>
</html>