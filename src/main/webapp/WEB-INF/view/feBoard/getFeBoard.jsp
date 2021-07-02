<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시판 게시물 가져오기</title>
</head>
<body>
	
	<c:set var="name" value="${userInfo.user_id }"/>
	<c:set var="writer" value="${FeBoard.user_id }"/>
	
	<c:if test="${name eq writer }">
		<a href="modifyPage.do?free_id=${FeBoard.free_id }">수정</a> 
		<a href="deleteFeBoard.do?free_id=${FeBoard.free_id }">삭제</a>
	</c:if>
	
	<h2><strong>${FeBoard.free_title}</strong></h2>
	<h3>글쓴이 ${FeBoard.user_id }</h3>
	<h4>${FeBoard.free_regdate }</h4> <h4>${FeBoard.free_visitcnt }</h4>
	<p>
		${FeBoard.free_content }
	</p>
	
	<h4>좋아요 : ${FeBoard.free_rdcnt }</h4> <h4> 댓글 수 : ${FeBoard.free_commentcnt } </h4>
	<hr>
</body>
</html>