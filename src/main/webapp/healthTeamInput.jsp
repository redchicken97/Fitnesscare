<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	
    	request.setCharacterEncoding("UTF-8");
    	String id = request.getParameter("id");
    	int userId = Integer.parseInt(id);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>health Team</h1>
	<form action="#" method="post">
	<input type="hidden" name="userId" value="<%=userId %>">
	
		<table border="1">
		</table>
	</form>

</body>
</html>