<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    
    	request.setCharacterEncoding("UTF-8");
    	String nick = request.getParameter("nick");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>댓글 시험 페이지</title>
</head>
<body>
	<script src="/Fitnesscare/resources/js/jquery-3.5.1.min.js"></script>
	<h1> 댓글 달기 </h1>
	<form>
		<table border="1">
			<tr>
				<th>작성자</th>
				<td><input type="text" name="user_nick" value="<%=nick%>"></td>
			 </tr>
			 <tr>
			 	<th>댓글</th>
			 	<td><input type="text" name="user_comment"></td>
			 </tr>
			 <tr>
			 	<td><input type="button" id="commentInput" value="등록"></td>
			 </tr>
		</table>
	</form>
	
	<script>
		$('#commnetInput').click(function(){
			$.ajax{
				url:'/comment.do'
				type:'post'
				data:$('form').serialize(),
				success:function() {
					alert("send success")
				}
			}}
		})
	</script>
</body>
</html>