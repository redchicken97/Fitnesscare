<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지 수정 게시판</title>
</head>
<body>
	
	<form action="updateNoBoard.do" method="post">
		<a href="getNoBoard.do?n_id=${NoBoard.n_id }">취소</a>&nbsp;&nbsp;&nbsp;
		<input type="submit" value="작성"> <br>
		<input type="hidden" name="n_id" value="${NoBoard.n_id }">
		<input type="text" name="n_title" value="${NoBoard.n_title }">
		<h3>글쓴이 : ${UserName }</h3>
		<br>
		<textarea name="n_content" rows="8" cols="85">${NoBoard.n_content }</textarea>
	</form>
	
</body>
</html>