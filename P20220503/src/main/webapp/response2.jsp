<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="co.edu.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = (String)request.getAttribute("id");// 요청받은 getAttribute 값이 object 타입.
		String name = (String)request.getAttribute("name"); // 왜 값을 못가져오지?
		Student student = (Student) request.getAttribute("result");
	%>
</body>
</html>