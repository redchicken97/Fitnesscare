<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카카오 회원가입 페이지</title>
</head>
<body>
	<script src='https://code.jquery.com/jquery-3.1.1.min.js'></script>
	<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
	
	<form action ="insertKakaoUser.do" method="post">
	<input type="hidden" name="user_email" value="${userId }">
	<input type="hidden" name="user_nick" value="${userNick }">
		<p>
			<textarea name="term_type1">회원약관</textarea>
			<br>
			<input type="radio" name="term_one" value="1">동의
			<input type="radio" name="term_one" value="0">비동의<br>
		</p>
		<p>
			<textarea name="term_type2">회원약관</textarea>
			<br>
			<input type="radio" name="term_two" value="1">동의
			<input type="radio" name="term_two" value="0">비동의<br>
		</p>
	<table border="1">
	
		<tr>
			<th>이름</th>
			<td><input type="text" name="user_name"></td>
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
	
	<c:if test="${userId eq null }">
		<h3>로그인이 되지 않았습니다.</h3>
	</c:if>
	<c:if test="${userId ne null }">
		<h3>kakao 로 로그인 성공입니다.</h3>
		<h3>${userId }</h3>
		<h3>${userNick }</h3>
	</c:if>

<!-- 

<script>
		Kakao.init('de65e137185c3c1a57b774574870f503');

		console.log(Kakao.isInitialized());

		Kakao.Auth.login({
			scope : 'account_email',
			success : function(authObj) {
				
				Kakao.API.request({
					url : '/v2/user/me',
					success : function(res) {
						console.log(res);

						var id = res.id; //데이터베이스의 primary Key값 속성 즉 기본키의 식별성
						var email = res.kakao_account.email;
						var name = res.properties.nickname;
						var html = '<BR>' + email + '<BR>' + name;

						var check = res.kakao_account.email_needs_agreement
						console.log(check)
						$('body').append(html);

					}
				})
				console.log(authObj);
				var token = authObj.access_token;

			},
			fail : function(err) {
				alert(JSON.stringify(err));
			}

		});
	</script>
 -->
	

</body>
</html>