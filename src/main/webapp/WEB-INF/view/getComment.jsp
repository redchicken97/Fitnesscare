<%@ page import="com.fitness.user.comment.vo.CommentInfoVO"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    	CommentInfoVO commentOne = (CommentInfoVO) session.getAttribute("commentOne");
    	// commentOne 과 뒤쪽 commentOne의 이름이 같아야 작동함
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>댓글 수정 페이지</title>
</head>
<body>

	<h1>댓글 수정</h1>
	<form action="updateComment.do" method="POST">
		<input type="hidden" name="cmt_id" value="${commentOne.cmt_id }">
		<table border="1">
		<tr>
			<th>글번호</th>
			<th>댓글 내용</th>
			<th>작성자</th>
			<th>작성 날짜</th>
			<th>	</th>
		</tr>
		<tr>
			<td>${commentOne.cmt_id}</td>
			<td><input type="text" name="cmt_content" value="${commentOne.cmt_content }"></td>
			<td>${commentOne.user_id }</td>
			<td><fmt:formatDate value = "${commentOne.cmt_regdate }" pattern = "yyyy.MM.dd HH:mm"/></td>
			<td><input type="submit" value="수정"></td>
		</tr>
	</table>
	</form>

</body>
</html>