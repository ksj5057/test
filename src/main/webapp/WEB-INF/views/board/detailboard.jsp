<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="/resources/js/reply.js"></script>
<!-- <script type="text/javascript" src="/resources/js/attach.js"></script> -->
</head>
<body>
	<form method="post">
		<table border="1">
			<tr>
				<td>제목</td> 
				<td><input type="text" value="${detailboard.title}" name="title">
					<input type="hidden" value="${detailboard.bno}" name="bno">
				</td>
			</tr>
			
			<tr>
				<td>내용</td> <td><textarea name="content">${detailboard.content}</textarea></td>
			</tr>
			<c:if test="${sessionScope.login.id == detailboard.bname}">
			<tr>
				<td><input type="submit" value="수정" formaction="updateboard"></td>
				<td><input type="submit" value="삭제" formaction="deleteboard"></td>
			</tr>
			</c:if>
		</table>
	</form>
	<br>
	<a href = "/board/boardlist"><button>게시글 목록</button></a><br>
<!-- 댓글칸 -->
	<div><label>댓글</label></div>
	<div>
		<textarea rows="5" cols="50" id="reply"></textarea>
	</div>
	<div>	
		<input type="button" value="댓글쓰기" id="add">
	</div>
	<div id="chat">
		<ul id="replyUL">
		</ul>
	</div>
	<div id="replyPage"></div>
</body>
</html>