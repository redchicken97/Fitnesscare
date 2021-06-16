<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login page</title>
</head>
<body>
	<h1>로그인 화면</h1>
	<form action="login.do" method="post">
		<table border="1">
			<tr>
				<th>아이디</th>
				<td><input type="text" name="user_email"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="user_pw"></td>
			</tr>
			<tr>
				<td><input type="submit" value="로그인"></td>
				<td>
					<a href="https://kauth.kakao.com/oauth/authorize
						?client_id=317680d5a011b0c1d9c69e3363dec15d
						&redirect_uri=http://localhost:8181/Fitnesscare/kakaoredirect.do
						&response_type=code">
						<img src="/Fitnesscare/resources/img/kakao_login_small.png">
					</a>
					
				</td>
			</tr>
		</table>
	</form>
	<br>
	<a href = "insertUser.jsp">회원가입</a>
</body>
</html>