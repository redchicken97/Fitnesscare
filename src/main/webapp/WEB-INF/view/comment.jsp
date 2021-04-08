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
					
					+ "<div class='replybox'>" 
						+ "<ui>댓글 번호 : </ui>"
						+ "<ui class='replyId'>"+ JSON.parse(item).cmt_id  +"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</ui>"
						+ "<ui>작성자 번호 : </ui>"
						+ "<ui class='replyWriter'>"+ JSON.parse(item).user_id +"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</ui>"
						+ "<ui>작성 날짜 : </ui>"
						+ "<ui class='replyDate'>"+ JSON.parse(item).cmt_regdate +"</ui><br /><br />"
						+ "<ui>댓글 내용 : </ui>"
						+ "<ui class='replyContent'>"+ JSON.parse(item).cmt_content +"</ui><br /><br />"
						+ "<ui>추천 수 :</ui>"
						+ "<ui class='replyRecommend'>"+ JSON.parse(item).cmt_rdcnt +"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</ui>"
						+ "<ui>신고 수 : </ui>"
						+ "<ui class='replyReport'>"+ JSON.parse(item).cmt_reportcnt + "</ui><br /><br />"
						+ "<button type='button' class='likeButton' onclick='getUpRdCnt("+index+")'>추천 하기</button>"
						+ "<button type='button'>신고 하기</button>"
						+ "<button type='button' class='replyButton' onclick='makeReplyBox("+index+")'>대댓글 달기</button>"
					+ "</div>"
					
					+ "</li>"
					+ "<hr/>";
		      });

			$('#replies').html(str);
			
		});
	
	}
	// 개발 방향 선회 -> 대댓글 하나만 열리기
	
	var ch = true; // 대댓글 창이 열렸는지 안 열렸는지 확인용 변수

	function makeReplyBox(cnt){
		
		if(!ch){
			var UsBox = document.getElementById('Ubox');	// 대댓글 div를 찾기위한 유저 아이디 입력칸 객체
			var ReplyBox = UsBox.parentNode;	// 대댓글 입력 칸이 모드 모여있는 div
			var commentBox = ReplyBox.parentNode;	// 댓글 창 div
			
			commentBox.removeChild(ReplyBox);
		}
		
		var RBox = document.getElementsByClassName('replybox')[cnt];
		
		var blank1 = document.createTextNode("\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0");
		var blank2 = document.createTextNode("\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0");
		var blank3 = document.createTextNode("\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0");
		var blank4 = document.createTextNode("\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0");
		
		var Div = document.createElement('div');
		Div.setAttribute('id', 'ListBox');
		
		var userBox = document.createElement('input');
		userBox.setAttribute('id', 'Ubox');
		userBox.setAttribute('placeholder', '유저 입력');
		
		var insert = document.createElement('button');
		insert.setAttribute('id', 'iB');	//*.do를 작동시키기 위한 버튼
		var ButtonText = document.createTextNode('댓글 등록');
		insert.appendChild(ButtonText);
		
		var del = document.createElement('button');
		del.setAttribute('onclick', 'delReply()');
		var delText = document.createTextNode('닫기');
		del.appendChild(delText);
		
		var br0 = document.createElement('br');
		var br1 = document.createElement('br');
		var br2 = document.createElement('br');
		var br3 = document.createElement('br');
		
		var contentBox = document.createElement('input');
		contentBox.setAttribute('id', 'conBox');
		contentBox.setAttribute('placeholder', '내용입력');
		
		var refBox = document.createElement('input');
		refBox.setAttribute('id', 'rBox');
		refBox.setAttribute('placeholder', '그룹');
		
		var stepBox = document.createElement('input');
		stepBox.setAttribute('id', 'sBox');
		stepBox.setAttribute('placeholder', 'step');
		
		var depthBox = document.createElement('input');
		depthBox.setAttribute('id', 'dBox');
		depthBox.setAttribute('placeholder', '들여쓰기');
		
		Div.appendChild(br0);
		
		Div.appendChild(userBox);
		
		Div.appendChild(br1);
		
		Div.appendChild(contentBox);
		Div.appendChild(blank1);
		Div.appendChild(insert);	//등록 버튼
		
		Div.appendChild(blank4);
		
		Div.appendChild(del);		//닫기 버튼
		
		Div.appendChild(br2);
		
		Div.appendChild(refBox);
		Div.appendChild(blank2);
		Div.appendChild(stepBox);
		Div.appendChild(blank3);
		Div.appendChild(depthBox);
		
		RBox.appendChild(Div);
		
		ch = false;
		
	}
	
	function delReply(){
		var rb = document.getElementById('rBox');
		var RD = rb.parentNode;
		var RDIV = RD.parentNode;
		
		RDIV.removeChild(RD);
		
		ch = true;
	}

	function getUpRdCnt(cnt){
		
		var check = cnt;
		
		var lcnt = $('.replyRecommend').eq(check).text();	// lcnt = 추천수 의미
		var cmt_id = $('.replyId').eq(check).text();
		var user_id = $('.replyWriter').eq(check).text();
		
		console.log("lcnt : " + lcnt);
		console.log("cmt_id : " + cmt_id);
		console.log("user_id : " + user_id);
		
		if(!alreadyLikeClick){
			lcnt = parseInt(lcnt) + 1;
			alreadyLikeClick = true;
		}
		
		console.log(typeof lcnt);	//이곳에서 typeof 결과 : number
		
		var submitObj = new Object();
		submitObj.cmt_id = parseInt(cmt_id);
		submitObj.cmt_rdcnt = lcnt;
		submitObj.user_id = parseInt(user_id);	
		
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
		})
		.fail(function(){
			alert("한개의 글에 한번만 클릭이 가능힙니다 !");
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