<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원상세페이지</h1>
<form action="" method="post">
<table border="1">
	<tr>
		<td>아이디</td>
		<td>${detail.id}<input type="hidden" name="id" value="${detail.id}"></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type="password" name="pw" value="${detail.pw}"></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><input type="text" name="name" value="${detail.name}"></td>
	</tr>
	<tr>
		<td colspan="2">
		<input type="submit" formaction="modify" value="회원정보수정">
		<input type="submit" formaction="remove" value="회원삭제">
		</td>
		
	</tr>
</table>
</form>
</body>
</html>