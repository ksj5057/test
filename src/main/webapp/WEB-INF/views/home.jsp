<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>






<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

${sessionScope.login.id}님 환영합니다. <br>

<a href = "member">회원가입</a> 
<a href = "logform">로그인화면</a> 
<a href = "board/boardlist">게시판</a> 
</body>
</html>
