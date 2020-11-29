<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login form 연습</title>
	<script src='https://code.jquery.com/jquery-3.1.1.min.js'></script>
	<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
</head>
<body>
	<a href="kakaologin1.jsp">
		<img src="/Fitnesscare/resources/kakao_login_medium_narrow.png">
	</a><br>
	<a href="https://developers.kakao.com/logout">카카오 로그아웃</a><br><br>
	*REST API 백엔드 servcer단 Java언어<br>
	<a href="https://kauth.kakao.com/oauth/authorize
		?client_id=e11e0bca2855ad3abc123dc69e2a7bf7
		&redirect_uri=http://localhost:8181/Fitnesscare/kakaoredirect.do
		&response_type=code">
		<img src="/Fitnesscare/resources/kakao_login_medium_narrow.png">
	</a>

   
</body>
</html>