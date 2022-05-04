<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = (String) session.getAttribute("id");
	
		if(id == null){
			out.print("<button onclick='location.href=\"session.jsp\"'>로그인</button>");
	%>
	
		<!-- <button onclick = 'location.href= "session.jsp"'>로그인</button> -->
	<%
		} else {
			out.print("<h3>로그인한 아이디는 " + id + "</h3><button onclick='location.href=\"logout.do\"'>로그아웃</button>"); // logout.do라는 함수라고 이해해서 실행이 안됬었음.
		}
	%>
			<!-- <h3>로그인한 아이디는 <%=id %></h3>-->
		<!-- <button onclick = 'location.href ="logout.do"'>로그아웃</button>  -->

</body>
</html>