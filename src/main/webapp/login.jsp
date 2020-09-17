<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
					<a>
					
					</a>
					<img src="/Fitnesscare/resources/kakao_login_small.png">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>