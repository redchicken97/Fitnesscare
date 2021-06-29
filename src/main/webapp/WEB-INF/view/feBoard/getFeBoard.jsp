<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시판 게시물 가져오기</title>
</head>
<body>
	<a href="modifyPage.do">수정</a><a href="">삭제</a>
	<h2><strong>${FeBaord.free_title}</strong></h2>
	<h3>글쓴이 ${userInfo.user_nick }</h3>
	<h4>${FeBoard.free_regdate }</h4> <h4>${FeBoard.free_visitcnt }</h4>
	<p>
		${FeBoard.free_content }
	</p>
	
	<h4>좋아요 : ${FeBoard.free_rdcnt }</h4> <h4> 댓글 수 : ${FeBoard.free_commentcnt } </h4>
	<hr>
</body>
</html>