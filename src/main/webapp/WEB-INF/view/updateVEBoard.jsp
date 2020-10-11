<%@ page import="com.fitness.admin.veboard.dao.VEBoardDAO"%>
<%@ page import="com.fitness.admin.veboard.vo.VEBoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>운동 영상 게시판 공지사항 수정</title>
<script src="/resources/js/jquery-3.5.1.min.js"></script>
<script charset="utf-8" src="resources/smarteditor2/js/HuskyEZCreator.js" type="text/javascript"></script>
<script src="resources/js/smarteditor2.js"></script>
<script src="resources/js/jquery.serialize-object.js"></script>
</head>
<body>
	<h1>운동 영상 게시판 공지사항 수정</h1>
	<form action="updateVEBoard.admin" method="POST"
		encType="multipart/form-data" >
		<input type="hidden" name="ex_id" value="${veboard.ex_id}" />
		<input type="hidden" name="user_id" value="${veboard.user_id}" />
		<table border="1">
			<tr>
				<th>번호</th>
				<td>${veboard.ex_id}</td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="ex_title" value="${veboard.ex_title}" /></td>
			</tr>
			<tr>
				<th>사용자ID</th>
				<td>${veboard.user_id}</td>
			</tr>
			<tr>
				<th>영상 링크</th>
				<td><input type="text" name="ex_link" value="${veboard.ex_link}" /></td>
			</tr>
			<tr>
				<th>내용</th>
				<td width="1024"><%-- 네이버 스마트 에디터 입력란 --%>
					<textarea name="ex_content" id="contents" 
					rows="10" cols="100" 
					style="width:100%; height:412px; display:none;">${veboard.ex_content}</textarea>
				</td>
			</tr>
		</table>
	<input type="submit" id="EditorSaveBtn" value="게시글 수정" />
	</form>
	<br />
	<a href="/getVEBoardList.admin">목록으로</a>
</body>
</html>