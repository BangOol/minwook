<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberSearch.jsp</title>
</head>
<body>
	${error}

	<h3>회원정보 검색</h3>
	<form action = "${pageContext.servletContext.contextPath}/memberSearch.do" method = "get"><!-- home.jsp 참고 가능 -->
		조회 아이디 : <input type = "text" name = "id"><br>
		<input type = "hidden" name = "job" value ="search">
		<input type = "submit" value = "Search">
	</form>
</body>
</html>