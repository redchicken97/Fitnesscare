<%@ page import="com.fitness.admin.qeboard.dao.QEBoardDAO"%>
<%@ page import="com.fitness.admin.qeboard.vo.QEBoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>QEBoard</title>
</head>
<body>
	<h1>${qeboard.q_title}</h1>
	<a href="/getQEBoardList.admin">질문 게시판 공지사항 목록으로</a>
	<a href="/updateQEBoard.admin?q_id=${qeboard.q_id}">공지사항 수정</a>
	<table border="1">
		<tr>
			<th>번호</th>
			<td>${qeboard.q_id}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${qeboard.q_title}</td>
		</tr>
		<tr>
			<th>작성자ID</th>
			<td>${qeboard.user_id}</td><%-- 나중에 fk를 user_email 등으로 바꾸는게 나을것같다...(email에 unique 추가해서) --%>
		</tr>
		<tr>
			<th>등록일</th>
			<td>${qeboard.q_regdate}</td>
		</tr>
		<tr>
			<th>추천수</th>
			<td>${qeboard.q_rdcnt}</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${qeboard.q_visitcnt}</td>
		</tr>
		<tr>
			<th>신고수</th>
			<td>${qeboard.q_reportcnt}</td>
		</tr>
		<tr>
			<th>글종류</th>
			<td>공지사항</td><%-- 2가지 데이터는 이미 정형화되어서 qeboardList에 반환됨 --%>
		</tr>
		<tr>
			<th>잠금여부</th>
			<td>잠금없음</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${qeboard.q_content}</td>
		</tr>
	</table>
	<br />
</body>
</html>