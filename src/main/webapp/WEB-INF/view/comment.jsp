<%@page import="com.fitess.common.user.vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    
    	request.setCharacterEncoding("UTF-8");
    	UserVO userInfo = (UserVO) session.getAttribute("userInfo");
//    	int userId = Integer.parseInt(request.getParameter("userId"));
    	int boardId = 0;
    	int refId = 2;
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>댓글 시험 페이지</title>
</head>
<body>

	<script src="/Fitnesscare/resources/js/jquery-3.5.1.min.js"></script>
	<!-- 
	
	<h1> 댓글 달기 </h1>
	<form>
		<input type="hidden" name="cmt_type" value="free">
		<input type="hidden" name="target_id" value="<%=boardId%>">
		<input type="hidden" name="cmt_ref" value="<%=refId%>">
		<table border="1">
			<tr>
				<th>작성자 아이디</th>
				<td><input type="text" name="user_id" value="${userInfo.user_id }"></td>
			 </tr>
			 <tr>
			 	<th>댓글</th>
			 	<td><input type="text" name="cmt_content"></td>
			 </tr>
			 <tr>
			 	<td><input type="button" id="commentInput" value="등록"></td>
			 </tr>
		</table>
	</form>

	
	 -->

	
	<script>
		$('#commentInput').click(function(){
			$.ajax({
				url:'commentInput.do',
				type:'post',
				data:$('form').serialize(),
				success:function(data){
					alert("댓글 입력이 완료되었습니다");
				} 
			});
		});
		
	</script>
	
	<script>
		var result = null;
		$.getJSON('commentList.do', function(data){
		    $.each(data, function(index, item){
		        $.each(JSON.parse(item), function(i, list){
		            console.log(list);
		        });
//		        console.log(data);
		      });
		});
	</script>

</body>
</html>