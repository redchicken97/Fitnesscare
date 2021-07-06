<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유 게시판 글 수정</title>
</head>
<body>
	
	<form action="updateFeBoard.do" method="post">
		<a href="getFeBoard.do?free_id=${FeBoard.free_id }">취소</a>&nbsp;&nbsp;&nbsp;
		<input type="submit" value="작성"> <br>
		<input type="hidden" name="free_id" value="${FeBoard.free_id }">
		<input type="text" name="free_title" value="${FeBoard.free_title }"><br>
		<h3>글쓴인 : ${UserName }</h3>
		<br>
		<textarea name="free_content" rows="8" cols="85">${FeBoard.free_content}</textarea>		
	</form>
</body>
</html>