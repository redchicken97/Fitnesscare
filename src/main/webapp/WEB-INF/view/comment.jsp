<%@page import="com.fitness.common.user.vo.UserVO"%>
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
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

	<h1> 댓글 달기 </h1>
	<form>
		<input type="hidden" name="cmt_type" value="free">
		<input type="hidden" name="target_id" value="<%=boardId%>">
		
		<div class ="box-header with-border">
			<h3 class="box-title">댓글 작성</h3>
		</div>
		
		<div class="box-body">
			<div class="form-group">
				<label for="newReplyText">댓글 내용</label>
				<input class="form-control" id="newReplyText" name="cmt_content" placeholder="댓글 내용을 입력해 주세요">
			</div>
			<div class="form-group">
				<label for="newReplywriter">작성자 이름</label>
				<input class="form-control" id="newReplywriter" name="user_id" value="${userInfo.user_id }">
			</div>
		</div>
		
		<div class="comment-box">
			<ul id="replies">
			
			</ul>
		</div>
		
	</form>


	<script>
		$('#commentInput').click(function(){
			$.ajax({
				url:'commentInput.do',
				type:'post',
				data:$('form').serialize(),
				success:function(data){
					alert("댓글 입력이 완료되었습니다");
					getreplies();
				} 
			});
		});
		
	</script>

	<script>
	
	getreplies();
	
	
	function getreplies(){
		$.getJSON('commentList.do', function(data){
			
			var str = "";
			
			$.each(data, function(index, item){
				str += "<li data-replyNo= '" + JSON.parse(item).cmt_id + "' class='replyLi'>"
					+  "<p class='replyWriter'>" + JSON.parse(item).user_id + "</p>"
					+  "<p class='replyDate'>" + JSON.parse(item).cmt_regdate + "</p>"
					+  "<p class='replyRecommend'>" + JSON.parse(item).cmt_rdcnt + "</p>"
					+  "<p class='replyReport'>" + JSON.parse(item).cmt_reportcnt + "</p>"
					+  "<p class='replayText'>" + JSON.parse(item).cmt_content + "</p>"
					+  "<button type='button'>댓글 수정</button>"
					+  "<button type='button'>답글 쓰기</button>"
					+  "<button type='button'>신고 하기</button>"
					+  "<button type='button'>추천 하기</button>"
					+ "</li>"
					+ "<hr/>";
		      });
			
			$('#replies').html(str);
			
		});
	}
	
		function blank_check(){
			if($.trim($('#cmt_content').val()) == ""){
				alert('댓글을 입력해주세요');
				$('#cmt_content').val('').focus();
				
				return false;
			}
		}
		
	</script>

</body>
</html>