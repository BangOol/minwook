<%@page import="co.edu.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>response.jsp</title>
</head>
<body>
	<%
	// request.jsp => request1.do => response.jsp =>
	//				 request:id, name
		String id = (String)request.getAttribute("id");// 요청받은 getAttribute 값이 object 타입.
		String name = (String)request.getAttribute("name"); // 왜 값을 못가져오지?
		Student student = (Student) request.getAttribute("result");
	%>
	<h3>id: <%=id %></h3>
	<h3>id: <%=name %></h3>


	
</body>
</html>