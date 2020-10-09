<%@ page import="com.fitness.admin.term.dao.TermDAO"%>
<%@ page import="com.fitness.admin.term.vo.TermVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>약관 등록</title>
<script src="/resources/js/jquery-3.5.1.min.js"></script>
<script charset="utf-8" src="resources/smarteditor2/js/HuskyEZCreator.js" type="text/javascript"></script>
<script src="resources/js/smarteditor2.js"></script>
<script src="resources/js/jquery.serialize-object.js"></script>
</head>
<body>
	<h1>약관 등록</h1>
	<form action="insertTerm.admin" method="POST"
		encType="multipart/form-data" >
		<table border="1">
			<tr>
				<th>약관 이름</th>
				<td><input type="text" name="term_name" /></td>
			</tr>
			<tr>
				<th>약관 종류</th>
				<td><input type="text" name="term_type" /></td>
			</tr>
			<tr>
				<th>약관 내용</th>
				<td width="1024"><%-- 네이버 스마트 에디터 입력란 --%>
					<textarea name="term_content" id="contents" rows="10" cols="100" 
					style="width:100%; height:412px; display:none;"></textarea>
				</td>
			</tr>
			<tr>
				<th>약관 관리자</th>
				<td><input type="text" name="term_manager" /></td>
			</tr>
		</table>
	<input type="submit" id="EditorSaveBtn" value="약관 등록" />
	</form>
	<br />
	<a href="/getTermList.admin">목록으로</a>
</body>
</html>