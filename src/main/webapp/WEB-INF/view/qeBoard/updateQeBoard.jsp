<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>질문 수정 게시판</title>
</head>
<body>
	
	<form action="updateQeBoard.do" method="post">
		<a href="getQeBoard.do?q_id=${QeBoard.q_id }">취소</a>&nbsp;&nbsp;&nbsp;
		<input type="submit" value="작성"> <br>
		<input type="hidden" name="q_id" value="${QeBoard.q_id }">
		<input type="text" name="q_title" value="${QeBoard.q_title }"><br>
		<h3>글쓴이  :  ${UserName }</h3>
		<br>
		<textarea name="q_content" rows="8" cols="85">${QeBoard.q_content }</textarea>
	</form>
	
</body>
</html>