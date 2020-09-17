<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.fitess.common.user.vo.UserVO"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
   
    
    <%
    	UserVO userInfo = (UserVO) session.getAttribute("userInfo");
    	char cr = 'K';
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인페이지</title>
</head>
<body>
	<h3>your user_no is ${userInfo.user_id } </h3>
	<h3>your eamil(이메일) is ${userInfo.user_email } 입니다</h3>
	<c:set var="method" value="${userInfo.user_loginMethod }"/>
	
	<c:choose>
		<c:when test="${method == cr }">
			<h4>your login kakao</h4>
		</c:when>
		<c:otherwise>
			<h4>your login local</h4>
		</c:otherwise>
	</c:choose>
</body>
</html>