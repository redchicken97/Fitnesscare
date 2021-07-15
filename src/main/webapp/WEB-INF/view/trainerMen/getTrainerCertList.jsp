<%@ page import="java.util.List"%>
<%@ page import="com.fitness.admin.trainercert.dao.TrainerCertDAO"%>
<%@ page import="com.fitness.admin.trainercert.vo.TrainerCertVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전문가 인증 요청 목록</title>
</head>
<body>
<h1>전문가 인증 요청 목록</h1>
<table border="1">
	<tr>
		<th>번호</th>
		<th>사용자</th>
		<th>자격증 이름</th>
		<th>승인여부</th>
		<th>거절하기</th>
	</tr>
	<c:forEach var="trainerCert" items="${trainerCertList}" varStatus="status">
	<tr>
		<td><a href="getTrainerCert.admin?t_id=${trainerCert.t_id}">${trainerCert.t_id}</a></td>
		<td>${userList[status.index]}</td>
		<td>${trainerCert.t_cname}</td>
		<c:choose>
			<c:when test="${trainerCert.t_checkdate eq null}">
				<td><a href="/acceptTrainerCert.admin?t_id=${trainerCert.t_id}">승인하기</a></td>
				<td><a href="/declineTrainerCert.admin?t_id=${trainerCert.t_id}">거절하기</a></td>
			</c:when>
			<c:otherwise>
				<td>승인됨</td>
				<td></td>
			</c:otherwise>
		</c:choose>
	</tr>
	</c:forEach>
</table>
<br />
<%-- 페이징 처리 부분 --%>
<ul> 
	<c:if test="${pageMaker.prev}">
		<li><a href="/getTrainerCertList.admin${pageMaker.makeQuery(pageMaker.startPage - 1)}"><</a></li>
	</c:if>
	<c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
		<li><a href="/getTrainerCertList.admin${pageMaker.makeQuery(idx)}">${idx}</a></li>
	</c:forEach>
	<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
		<li><a href="/getTrainerCertList.admin${pageMaker.makeQuery(pageMaker.endPage + 1)}">></a></li>
	</c:if>
</ul>
</body>
</html>