<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberDelete.jsp</title>
</head>
<!-- 적절하지 못한 값이 부여되거나 값이 없을 때 error 값 반환 -->
<body>
	${error}
	
	<h3>회원정보 삭제</h3>
	<form action = "${pageContext.servletContext.contextPath}/memberDelete.do" method = "get">
		삭제할 아이디 : <input type = "text" name = "id"><br>
		비밀번호 : <input type = "text" name = "passwd"><br>
		<input type = "hidden" name = "job" value ="delete">
		<input type = "submit" value = "삭제">
	</form>
</body>
</html>