<%@ page import="com.fitness.admin.qeboard.dao.QEBoardDAO"%>
<%@ page import="com.fitness.admin.qeboard.vo.QEBoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>QEBoard</title>
<script src="/resources/js/jquery-3.5.1.min.js"></script>
</head>
<body>
	<h1>${qeboard.q_title}</h1>
	<a href="/getQEBoardList.admin">질문 게시판 목록으로</a>
	<c:choose>
		<c:when test="${hteboard.ht_type eq 0}">
			<a href="/deleteQEBoard.admin?q_id=${qeboard.q_id}">일반게시글 삭제</a>
		</c:when>
		<c:when test="${qeboard.q_type eq 1}">
			<a href="/updateQEBoard.admin?q_id=${qeboard.q_id}">공지사항 수정</a>
			<a href="/deleteQEBoard.admin?q_id=${qeboard.q_id}">공지사항 삭제</a>
		</c:when>
	</c:choose>
	<table border="1">
		<tr>
			<th>번호</th>
			<td>${qeboard.q_id}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${qeboard.q_title}</td>
		</tr>
		<tr>
			<th>작성자ID</th>
			<td>${qeboard.user_id}</td>
		</tr>
		<tr>
			<th>등록일</th>
			<td><fmt:formatDate value="${qeboard.q_regdate}" dateStyle="default" /></td>
		</tr>
		<tr>
			<th>추천수</th>
			<td>${qeboard.q_rdcnt}</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${qeboard.q_visitcnt}</td>
		</tr>
		<tr>
			<th>신고수</th>
			<td>${qeboard.q_reportcnt}</td>
		</tr>
		<tr>
			<th>글종류</th>
			<c:choose>
				<c:when test="${qeboard.q_type eq 0}">
					<td>일반 게시글</td>
				</c:when>
				<c:when test="${qeboard.q_type eq 1}">
					<td>공지사항</td>
				</c:when>
				<c:otherwise><td>오류</td></c:otherwise>
			</c:choose>
		</tr>
		<tr>
			<th>잠금여부</th>
			<c:choose>
				<c:when test="${qeboard.q_lock eq '0'.charAt(0)}">
					<td>잠금</td>
				</c:when>
				<c:when test="${qeboard.q_lock eq '1'.charAt(0)}">
					<td>잠금없음</td>
				</c:when>
				<c:otherwise><td>오류</td></c:otherwise>
			</c:choose>
		</tr>
		<tr>
			<th>내용</th>
			<td>${qeboard.q_content}</td>
		</tr>
	</table>
	<br />
	<form action="insertComment.admin" method="post">
		<input type="hidden" name="cmt_id" value="${comment.cmt_id}" />
		<input type="hidden" name="target_id" value="${qeboard.q_id}" />
		<input type="hidden" name="cmt_type" value="question" />
		<input type="hidden" name="user_id" value="${qeboard.user_id}" />
		<%-- 여기에 추가할 것들이 많음 --%>
		<input type="hidden" name="cmt_ref" value="1" />
		<input type="hidden" name="cmt_step" value="0" />
		<input type="hidden" name="cmt_depth" value="0" />
		<input type="text" name="cmt_content" placeholder="댓글 내용을 입력하세요."/>
		<input type="submit" value="댓글 등록" />
	</form>
	<%-- 댓글란 --%>
	<table class="comment-list-table">
		<tr>
			<th>번호</th>
			<th>사용자</th>
			<th>등록일</th>
			<th>추천수</th>
			<th>신고수</th>
			<th>ref</th>
			<th>step</th>
			<th>depth</th>
		</tr>
		<c:forEach var="comment" items="${commentList}">
			<tr>
				<td>${comment.cmt_id}</td>
				<td>${comment.user_id}</td>
				<td><fmt:formatDate value="${comment.cmt_regdate}" dateStyle="default" /></td>
				<td>${comment.cmt_rdcnt}</td>
				<td>${comment.cmt_ref}</td>
				<td>${comment.cmt_step}</td>
				<td>${comment.cmt_depth}</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>${comment.cmt_content}</td>
			</tr>
			<tr>
				<td class="write-comment-pos"><button id="writeCommentBtn">댓글 쓰기</button></td>
			</tr>
		</c:forEach>
	</table>
<script>
$(document).ready(function(){
	
	$(document).on('click', '#writeCommentBtn', function(){
		console.log("댓글 쓰기 버튼 클릭");
		$('.write-comment-form').detach();
		$('.write-comment-pos').find('#writeCommentBtn').show();
		// 바로 아래줄에서 ref, step, depth값을 증가시킨다. 처음 값은 1, 0, 0이다.
		$(this).parent().append('<div class="write-comment-form"><form action="insertComment.admin" method="post"><input type="hidden" name="cmt_id" value="${comment.cmt_id}" /><input type="hidden" name="target_id" value="${qeboard.q_id}" /><input type="hidden" name="cmt_type" value="question" /><input type="hidden" name="user_id" value="${qeboard.user_id}" /><input type="hidden" name="cmt_ref" value="${comment.cmt_id}" /><input type="hidden" name="cmt_step" value="0" /><input type="hidden" name="cmt_depth" value="0" /><input type="text" name="cmt_content" placeholder="댓글 내용을 입력하세요."/><input type="submit" value="댓글 등록" /></form><button id="cancelCommentBtn">댓글 쓰기 취소</button></div>');
		$(this).hide();
	});
	
	$(document).on('click', '#cancelCommentBtn', function(){
		console.log("댓글 취소 버튼 클릭");
		$(this).parent().parent().find('#writeCommentBtn').show();
		$(this).parent().detach();
	});
	
});
</script>
</body>
</html>