<%@page import="com.fitness.common.user.vo.UserVO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    
    	request.setCharacterEncoding("UTF-8");
    	UserVO userInfo = (UserVO) session.getAttribute("userInfo");
 //   	int userId = Integer.parseInt(request.getParameter("userId").trim());
    	int boardId = 0;
//    	int refId = 2;
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>댓글 시험 페이지</title>
<link href="/Fitnesscare/resources/css/reply.css" rel="stylesheet" type="text/css">
</head>
<body>

	<script src="/Fitnesscare/resources/js/jquery-3.5.1.min.js"></script>

	<h1> 댓글 달기 </h1>
	<form action = "commentInput.do" method="POST" class="reClass">
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
			<button type="button" class='commentInput1'>댓글 입력</button>
		</div>
		
	</form>
		<div class="comment-box">
			<ul id="replies">
			
			</ul>
		</div>	
</body>
	<script>
	
	var arr = new Array();		// cmt_id, cmt_ref, re_check 순으로 값이 들어감
	var arr1 = new Array();		// 1차 필터 
	var arr2 = new Array();		// 2차 필터
	var arr3 = new Array();		// 3차 필터
	arr.push([0,0,0]);
	
		$('.commentInput1').click(function(){		
			$.ajax({
				url:'commentInput.do',
				type:'post',
				data:$('.reClass').serialize(),
				success:function(data){
					alert("댓글 입력이 완료되었습니다");
					getreplies();
					$('#newReplyText').val('').focus();

				} 
			});
			
		});
		
	</script>

	<script>
	
	getreplies();

//	var alreadyLikeClick = false;
//	var alreadyHateClick = false;

// 대댓글 한칸 늘리는 css
	function sibal(tab){
		console.log(tab);
		for (var ccc = 0; ccc < tab.length; ccc++){
			$(".replyLi").eq(tab[ccc][0]).css({"margin-left" : tab[ccc][1] * 50});
		}
		console.log($(".replyLi").eq(1));
	}
	function getreplies(){
		arr = [];
		arr.push([0,0,0,0]);
		var replyList = [];
		var dataList=[];
		var cnt = 0;
		var cm = 0;
		var c = 0;
		var k = 0;
		
		$.getJSON('commentList.do', function(data){
			
			for (var c = 0; c < data.length; c++){
				dataList.push([data[c]]);
			}

			while (true){
				replyList.push([dataList[0]]);

				dataList.splice(0, 1);
				
				if (JSON.parse(replyList[replyList.length - 1]).reply_check == 1){
					for(var i = 0; i < dataList.length; i++){
						if(JSON.parse(replyList[replyList.length - 1]).cmt_ref == JSON.parse(dataList[i]).cmt_ref){
							replyList.push([dataList[i]]);
							cm++;
							if(cm == 1){
								c = i;
							}
						}
					}
				}
				dataList.splice(c, cm);
				c = 0;
				cm = 0;
				if (replyList.length == data.length) break;
			}
			console.log(replyList);
			var tab = [];
			var str = "";
			$.each(replyList, function(index, item){
				var test = JSON.parse(item).cmt_rdcnt;
				
				str += "<li data-replyNo= '" + JSON.parse(item).cmt_id + "' class='replyLi'>"
					
					+ "<div class='replybox'>" 
						+ "<ui>댓글 번호 : </ui>"
						+ "<ui class='replyId'>"+ JSON.parse(item).cmt_id +"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</ui>"
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
						+ "<input type='hidden' class='cmt_ref' value=" + JSON.parse(item).cmt_ref + ">"
						+ "<input type='hidden' class='cmt_step' value=" + JSON.parse(item).cmt_step + ">"
						+ "<input type='hidden' class='cmt_depth' value=" + JSON.parse(item).cmt_depth + ">"
						+ "<input type='hidden' class='reply_check' value=" + JSON.parse(item).reply_check + ">"
					+ "</div>"
					
					+ "</li>"
					+ "<hr/>";
					arr.push([JSON.parse(item).cmt_id, JSON.parse(item).cmt_ref, JSON.parse(item).cmt_step, JSON.parse(item).cmt_depth])
					
					//console.log(JSON.parse(item).cmt_depth);
					if (JSON.parse(item).cmt_depth >= 1){
						tab.push([index, JSON.parse(item).cmt_depth]);
					}
			});
			
			$('#replies').html(str);
			sibal(tab);
		});

		
	}

	var ch = true; // 대댓글 창이 열렸는지 안 열렸는지 확인용 변수
	var pass = false;
	var big = 0;
	var stepUp = false;
	
	function makeReplyBox(cnt){
		
		pass = false;
		
		big = 0;
		
		if(!ch){
			$("form").remove("#rereForm");
			
			arr1 = [];
			arr2 = [];
			arr3 = [];
			
		}
		
		var CM_id = $('.replyId').eq(cnt).text();
		
		var cmId = parseInt(CM_id);
		
		var CM_re = $('.cmt_ref').eq(cnt).val();
		var CM_st = $('.cmt_step').eq(cnt).val();
		var CM_de = $('.cmt_depth').eq(cnt).val();
		var RE_ch = $('.reply_check').eq(cnt).val();
		
		console.log("arr.length : ", arr.length);	// 댓글 총 갯수 + 1이 나온다면 선공 
		console.log("cmt_id : ", CM_id);
		
		//step 수 계산 
		//대댓글이 없는경우
		if(RE_ch == 0){
			
			var cm_re = parseInt(CM_re);
			var cm_st = parseInt(CM_st) + 1;
			var cm_de = parseInt(CM_de) + 1;
			
			console.log("re_check 값이 0 입니다.");
			
		//대댓글이 있는경우
		}else if(RE_ch == 1){
			
			var cm_re = parseInt(CM_re);
			var cm_de = parseInt(CM_de) + 1;
			
			for (var i = 1; i < arr.length; i++){
				if(arr[i][1] == CM_re) {
					arr1.push([arr[i][0], arr[i][1], arr[i][2], arr[i][3]]); 
				}
			}
			
			console.log(arr1);
			for (var k = 0; k < arr1.length; k++){
				if(arr1[k][3] == cm_de){
					arr2.push([arr1[k][0], arr1[k][1], arr1[k][2], arr1[k][3]]);
				}
			}
			
			console.log(arr2);
			
			if (arr2.length == 1){
				big = arr2[0][2] + 1;
				pass = true;
			}
			
			if (!pass){
				for (var t = 0; t < arr2.length - 1; t++){
					if(arr2[k][2] + 1 != arr2[k + 1][2]){
						arr3.push([arr2[k][0], arr2[k][1], arr2[k][2], arr[k][3]]);
					}
				}	
			}
			
			if (arr3.length == 0){
				for (var tk = 0; tk < arr2.length - 1; tk++){
					if(arr2[tk][2] < arr2[tk + 1][2]){
						big = arr[tk + 1][2];
						stepUp = true;
					}
				}
				console.log("big : ", big);
				pass = true;
			}
			
			console.log(arr3);
			
			if (!pass){
				for (var v = 0; v < arr3.length - 1; v++){
					if(arr3[v][2] < arr3[v + 1][2]){
						big = arr3[v + 1][2];
						stepUp = true;
					}
				}
			}

			var cm_st = big; 
			
			console.log("re_chek 값이 1 입니다.");
		}
		var $obj = $("<div class='ListBox'></div>");
		
		var userBox = "<input id='Ubox' paceholder='유저입력' name='user_id' value='${userInfo.user_id }'><br>";
		var contentBox = "<input id='conBox' placeholder='내용입력' name='cmt_content'>";
		var insert = "<button id='iB'>바로 밑 댓글 등록</button>";
		
		var refBox = "<input id='rBox' placeholder='그룹' name='cmt_ref' value="+ cm_re +">";
		var stepBox = "<input id='sBox' placeholder='step' name='cmt_step' value="+ cm_st +">";
		var depthBox = "<input id='dBox' placeholder='들여쓰기' name='cmt_depth' value="+ cm_de +">";
		var del = "<button id='deBu' onclick='delReply("+ cnt +")'>닫기</button><br>";
		
		var cm_idBox = "<input type='hidden' name='cmt_id' value="+ cmId +"><br>"; 
		var Ctype = "<input type='hidden' name='cmt_type' value='free'>";
		var Btype = "<input type='hidden' name='target_id' value='<%=boardId%>'>"
		
		var $form = $("<form id='rereForm'></form>");
		
		$('.replybox').eq(cnt).append($form);
		$('#rereForm').append($obj);
		
		$('.ListBox').append(Ctype);
		$('.ListBox').append(Btype);
		$('.ListBox').append(cm_idBox);
		$('.ListBox').append(userBox);
		$('.ListBox').append(contentBox);
		$('.ListBox').append(insert);
		$('.ListBox').append(del);
		$('.ListBox').append(refBox);
		$('.ListBox').append(stepBox);
		$('.ListBox').append(depthBox);
		
		$('#iB').click(function(){
			console.log('대댓글 달기가 클릭 되었습니다');
			$.ajax({
				url:'reCommentInput.do',
				type:'post',
				data:$('.rereForm').serialize(),
				success:function(data){
					alert('대댓글 입력이 완료되었습니다.');
				}
			});

		});

		ch = false;
	}
	
	function delReply(cnt){
		
		$("form").remove("#rereForm");
		
		arr1 = [];
		arr2 = [];
		arr3 = [];
		
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
		
		lcnt = parseInt(lcnt) + 1;
		alreadyLikeClick = true;
		
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
				getreplies();
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
//	sibal();
	</script>

</html>