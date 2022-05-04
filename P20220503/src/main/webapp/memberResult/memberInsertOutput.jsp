<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberResult/memberInsertOutput.jsp</title>
</head>
<body>
	 <!-- empty : <h3>${empty name}</h3> 예약어... 이렇게 쓰는게 더 간단함. -->
	<h3>${name}님의 가입이 완료되었습니다.</h3>
	<jsp:include page="home.jsp"></jsp:include> <!- 자바 구문 대신 이렇게 쓸 수 있음. -->
</body>
</html>