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
<title>질문 게시판 작성</title>
</head>
<body>

</body>
</html>