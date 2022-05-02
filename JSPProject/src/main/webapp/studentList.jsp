<%@page import="co.edu.Student"%>
<%@page import="java.util.List"%>
<%@page import="co.edu.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border = "1">
		<caption> 학생 목록</caption>
		<thead>
			<tr>
				<th>학생번호</th>
				<th>학생이름</th>
				<th>영어점수</th>
				<th>국어점수</th>
			</tr>
		</thead>
	<%
		StudentDAO dao = new StudentDAO(); // ctrl + space 로 import 가능
		List<Student> list = dao.studentList();
		for(Student student : list){
		out.print("<tr><td><a href = 'StudentGetServlet?cmd=search&user_id="+student.getStudentNo()+"'>"+student.getStudentNo()+"</a></td><td>"+student.getStudentName()+"</td><td>"+student.getEngScore()+"</td><td>"+student.getKorScore()+"</td></tr>");
		}
	%>
	</table>
	<a href ="/JSPProject/form.jsp">폼화면</a>
</body>
</html>