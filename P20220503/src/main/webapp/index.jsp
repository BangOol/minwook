<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    													<!-- 첫 화면 -->
    											<!-- JSP는 주로 화면에 보여주는 용도 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>첫 페이지입니다.</h3>
	<a href= "memberView/memberInsert.jsp">회원정보생성</a><br>
	<a href = "memberView/memberSearch.jsp">회원정보검색</a><br>
	<a href = "memberView/memberUpdate.jsp">회원정보수정</a><br>
	<a href = "memberView/memberDelete.jsp">회원정보삭제</a><br>
	<a href = "memberList.do">모든회원정보</a><br>
	<a href = "ajax.html">Ajax호출</a>
	
</body>
</html>