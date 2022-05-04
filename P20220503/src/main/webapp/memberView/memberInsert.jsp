<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberInsert.jsp</title>
</head>
<body>
	<h3>회원가입화면</h3>
	<!-- 상위 폴더의 memberInsert.do 호출 -->
	<form action = "../memberInsert.do" mehtod = "post">
	 아이디: <input type = "text" name = "id"><br>
	 비밀번호 : <input type = "password" name = "passwd"><br>
	 이름: <input type = "text" name = "name"><br>
	 이메일 : <input type = "email" name = "email"><br>
	 <input type = "submit" value ="추가">
	
	</form>
</body>
</html>