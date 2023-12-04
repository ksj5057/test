 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
<h1>게시판 목록 리스트</h1>
<table border = "1">
	<tr>
		<td>게시물 번호</td>
		<td>작성자</td>
		<td>제목</td>
		<td>작성일</td>
		<td>조회수</td>
	</tr>
	<c:forEach var="boardlist" items = "${list}">
	<tr>
		<td>${boardlist.bno}</td>
		<td>${boardlist.bname}</td>
		<td><a href = "/detailboard?bno=${boardlist.bno}">${boardlist.title}</a></td>
		<td>${boardlist.bdate}</td>
		<td>${boardlist.count}</td>
	</tr>
	</c:forEach>
</table>
<br>
<c:if test = "${sessionScope.login.id != null}">
<a href = "insertform"><button>글작성</button></a>
</c:if><br><br>

<!-- prev(이전)이 true이면 이전버튼 활성화 -->
<c:if test="${paging.prev}">
	<a href="/board/boardlist?type=${paging.cri.type}&keyword=${paging.cri.keyword}&pagenum=${paging.startpage-1}&amount=${paging.cri.amount}">이전</a>
</c:if>

<!-- begin(1)이 end(10)될 동안 반복(1일 10일 될 동안 반복) -->
<c:forEach begin="${paging.startpage}" end="${paging.endpage}" var="num">
 	<a href="/board/boardlist?type=${paging.cri.type}&keyword=${paging.cri.keyword}&pagenum=${num}&amount=${paging.cri.amount}">${num}</a>
</c:forEach>

<!-- next(다음)이 true이면 다음버튼 활성화 -->
<c:if test="${paging.next}">
	<a href="/board/boardlist?type=${paging.cri.type}&keyword=${paging.cri.keyword}&pagenum=${paging.endpage+1}&amount=${paging.cri.amount}">다음</a>
</c:if>
<br>
<a href = "/"><button>홈 화면</button></a>
</body>
</html>