<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join page</title>
</head>
<body>
	<div class="title">
		<h2>회원가입 페이지</h2>
	</div>
	<p>
		<textarea name="term1">회원가입 약관 1</textarea>
		<br> <input type="radio" name="term1" value="1">동의 <input
			type="radio" name="term1" value="0">비동의<br>
	</p>
	<p>
		<textarea name="term2">회원가입 약관 2</textarea>
		<br> <input type="radio" name="term2" value="1">동의 <input
			type="radio" name="term2" value="0">비동의<br>
	</p>

	<form action="join_ok.html" method="post">
		<table border="1">
			<tr>
				<th>아이디</th>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="pw"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="회원가입"></td>
			</tr>
		</table>
	</form>
	<a href="getUserList.do">회원 목록</a>
</body>
</html>