<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>질문 게시판 게시물 가져오기</title>
</head>
<body>
	<c:set var="name" value="${userInfo.user_id }"/>
	<c:set var="writer" value="${QeBoard.user_id }"/>
	
	<c:if test="${name eq writer }">
		<a>수정</a>
		<a href="deleteFeBoard.do?q_id=${QeBoard.q_id }">삭제</a>
	</c:if>
	
	<c:if test="${fn:contains(userInfo.user_level, 'A')}">
		<a href="deleteFeBoard.do?q_id=${QeBoard.q_id }">관리자에 의한 삭제</a>
	</c:if>
	
	<h2><strong>${QeBoard.q_title }</strong></h2>
	<h3>글쓴이  :  ${UserName }</h3>
	<h4><fmt:formatDate value="${QeBoard.q_regdate }" pattern="yyyy-MM-dd"/></h4>
	<h4>${QeBoard.q_visitcnt }</h4>
	<p>
		${QeBoard.q_content }
	</p>
	<h4>좋아요 : ${QeBoard.q_rdcnt }</h4> <h4>댓글 수 ${QeBoard.q_commentcnt }</h4>
	<hr>
</body>
</html>