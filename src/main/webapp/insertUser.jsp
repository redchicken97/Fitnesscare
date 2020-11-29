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


	<form action="insertUser.do" method="post">
		<p>
			<textarea name="term_type1">회원 약관</textarea>
			<br> 
			<input type="radio" name="term_one" value="1">동의 
			<input type="radio" name="term_one" value="0">비동의<br>
		</p>
		<p>
			<textarea name="term_type2">회원 약관 2</textarea>
			<br> 
			<input type="radio" name="term_two" value="1">동의 
			<input type="radio" name="term_two" value="0">비동의<br>
		</p>

		<table border="1">
			<tr>
				<!-- 아이디 = 이메일  -->
				<th>아이디</th>
				<td><input type="text" name="user_email"></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="user_name"></td>
			</tr>
			<tr>
				<th>닉네임</th>
				<td><input type="text" name="user_nick"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="user_pw"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="회원가입"></td>
			</tr>
		</table>
	</form>
	<a href="getUserList.do">회원 목록</a>
	<a href="index.jsp">메인 페이지</a>
</body>
</html>