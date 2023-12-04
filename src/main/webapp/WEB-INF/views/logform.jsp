<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post">
	<table border="1">
		<tr>
			<td>ID</td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td>PASSWORD</td>
			<td><input type="password" name="pw"></td>
		</tr>
		<tr>
			<td colspan="2">
				<c:choose>
					<c:when test="${sessionScope.login eq null}">		
						<input type="submit" formaction="login" value="로그인">
					</c:when>
					<c:otherwise>
						<input type="submit" formaction="logout" value="로그아웃">
					</c:otherwise>
				</c:choose>
				<a href = "http://localhost:8080/"><input type="button" value="홈 화면"></a>
			</td>
		</tr>
	</table>
</form>

</body>
</html>