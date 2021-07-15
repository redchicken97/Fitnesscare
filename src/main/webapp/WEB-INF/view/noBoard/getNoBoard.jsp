<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지 게시판 공지글 하나 가져오기</title>
</head>
<body>
	
	<c:choose>
		<c:when test="${fn:contains(userInfo.user_level, 'A')}">
			<a href="noModifyPage.do?n_id=${NoBoard.n_id }">수정</a>
			<a href="deleteNoBoard.do?n_id=${NoBoard.n_id }">삭제</a>
		</c:when>
	</c:choose>
	
	<h2><strong>${NoBoard.n_title }</strong></h2>
	<h3>글쓴이 : ${UserName}</h3>
	<h4><fmt:formatDate value="${NoBoard.n_regdate }" pattern="yyyy-MM-dd"/></h4>
	<h4>${NoBoard.n_visitcnt }</h4>
	<p>
		${NoBoard.n_content }
	</p>
	
	<h4>좋아요 : ${NoBoard.n_rdcnt }</h4> <h4>댓글 수 : ${NoBoard.n_commentcnt }</h4>
	<hr>
</body>
</html>