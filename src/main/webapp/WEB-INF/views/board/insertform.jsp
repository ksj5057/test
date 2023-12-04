<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>게시글 작성</h1>
<form action = "/insertboard" method="post">
	제목 : <input type="text" name="title" size = "50"> <br><br>
	<input type = "hidden" name = "bname" value = "${sessionScope.login.id}">
	내용 : <textarea name = "content" cols = "52" rows = "10"></textarea> <br>
	 <c:set var="date" value="<%=new Date() %>"></c:set>
	<input type="hidden" name="bdate" value ="<fmt:formatDate value="${date}" type="both" dateStyle="short" timeStyle="short"/>">
	<input type="submit" value="작성하기">
</form>
</body>
</html>