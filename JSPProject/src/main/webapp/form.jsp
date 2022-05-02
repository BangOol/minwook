<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Q 그렇다면 왜 jsp를 사용하는가? -->
	<form name="frm" action="StudentGetServlet" method="get">
		<input type="hidden" name="cmd" value="search"> <!-- search라는 cmd 값을 미리 줌 -->
		ID  : <input type="number" name="user_id" value="101"><br>
		Name: <input type="text" name="user_name" value="홍길동"><br>
		Eng : <input type="number" name="eng_score" value=80><br>
		Kor : <input type="number" name="kor_score" value=80><br>
		
			  <input type="submit" value="조회"> 
			  <input id="addBtn" type="button"value="입력"> 
			  <input id="modBtn" type="button" value="수정">
			  <input id="delBtn" type="button" value="삭제"><br>
		<!-- index.jsp에서 request 작업 시작 -->
		
		<a href = "./studentList.jsp">전체 조회</a>
	</form>


	<script>
		// 수정 버튼
		let modBtn = document.getElementById('modBtn');
		modBtn.addEventListener('click', function(){
			let frm = document.forms.frm;
			frm.method = "post";
			frm.cmd.value = "mod";
			
			frm.submit();
		})
	
		// 삭제 버튼.
		let delbtn = document.getElementById('delBtn');
		delbtn.addEventListener('click', function(){
			let frm = document.forms.frm;
			frm.method = "post";
			frm.cmd.value = "del";
			
			frm.submit();
		})
	
		// 입력(추가) 버튼.
		let btn = document.getElementById('addBtn');
		btn.addEventListener('click', function() {

			let frm = document.forms.frm; // form의 name = frm을 의미
			frm.action = "StudentGetServlet";
			frm.method = "post";
			frm.cmd.value = "add";

			frm.submit(); // form의 submit.

		});
	</script>
</body>
</html>