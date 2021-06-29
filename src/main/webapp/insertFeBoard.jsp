<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	
    	if(session.getAttribute("userInfo") == null){
    		response.sendRedirect("login.jsp");
    	}
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 입력</title>
</head>
<body>
	<h2>입력 화면</h2>
	<form action="insertFeBoard.do" method="post">
		제목 : 
		<input type="text" name="free_title">
		
		<input type="submit" value="작성">
		
		<br><br>
		
		<input type="hidden" name="user_id" value="${userInfo.user_id }">
		
		내용 : <br>
		<textarea rows="50" cols="50" name="free_content" ></textarea>
		
	</form>
</body>
</html>