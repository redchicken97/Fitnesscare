<%@page import="com.fitness.common.user.vo.UserVO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    
    	request.setCharacterEncoding("UTF-8");
    	UserVO userInfo = (UserVO) session.getAttribute("userInfo");
    	int userId = Integer.parseInt(request.getParameter("userId"));
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

	<h1> 댓글 달기 </h1>
	<form action = "commentInput.do" method="POST">
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
				<input class="form-control" id="newReplywriter" name="user_id" value="<%=userId %>">
			</div>
			<input type="submit" value="입력">
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
	
	var alreadyLikeClick = false;
	var alreadyHateClick = false;
	
	function getreplies(){
		$.getJSON('commentList.do', function(data){
			
			var str = "";
			console.log(data);
			
			$.each(data, function(index, item){
				var test = JSON.parse(item).cmt_rdcnt;
				console.log(index + " : " + test);
				
				str += "<li data-replyNo= '" + JSON.parse(item).cmt_id + "' class='replyLi'>"
					+  "<p id='replyId'>" + JSON.parse(item).cmt_id + "</p>"
					+  "<p class='replyWriter'> 작성자 아이디 : " + JSON.parse(item).user_id + "</p>"
					+  "<p class='replyDate'> 작성날짜 : " + JSON.parse(item).cmt_regdate + "</p>"
					+  "<p id='replyRecommend'>댓글 추천수 : " + JSON.parse(item).cmt_rdcnt + "</p>"
					+  "<p id='replyReport'>댓글 신고수 : " + JSON.parse(item).cmt_reportcnt + "</p>"
					+  "<p class='replayText'>댓글 내용 : " + JSON.parse(item).cmt_content + "</p>"
					+  "<a href='getComment.do?cmt_id="+ JSON.parse(item).cmt_id +"'>댓글 수정</a>"
					+  "<button type='button'>신고 하기</button>"
					+  "<button type='button' id='likeButton' onclick='getUpRdCnt()' value="+ JSON.parse(item).cmt_id +">추천 하기</button>"
					+ "</li>"
					+ "<hr/>";
		      });
			
			$('#replies').html(str);
			
		});
	
	}

	function getUpRdCnt(){
		
		var lcnt = $('#likeButton').val();	// lcnt = 추천수 의미
		var cmt_id = $('#replyId').text();
		
		console.log("cmt_id : " + cmt_id);
		
		if(!alreadyLikeClick){
			lcnt = parseInt(lcnt) + 1;
			alreadyLikeClick = true;
		}
		
		console.log(typeof lcnt);	//이곳에서 typeof 결과 : number
		
		var submitObj = new Object();
		submitObj.cmt_id = parseInt(cmt_id);
		submitObj.cmt_rdcnt = lcnt;
 		
		console.log("cmt_rdcnt : " + submitObj.cmt_rdcnt)	//cmt_rdcnt 확인용
		console.log("cmt_id : " + submitObj.cmt_id)	//cmt_id 확인용
		
		console.log(typeof submitObj.cmt_rdcnt);
		console.log(typeof submitObj.cmt_id);
		
		$.ajax({
			type: 'post',
			contentType: 'application/json;charset=UTF-8',
			data: JSON.stringify(submitObj) ,
			dataType : 'json', 
			url : 'upRdCnt.do',
			success : function(data){
				console.log(this.data);
				alert('추천 !');
//				document.getElementById('replyRecommend').innerHTML;
			}
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