<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax.jsp</title>
</head>
<body>
	<script>
		// Asynchronous Javascript And Xml.
		let url = 'StudentGetServlet';
		
		fetch(url)
			.then(result => {
				console.log(result);
				//HTML 콘솔을 통해 상태 확인 가능.
				//https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Promise 에서 설명.
				return result.json(); //{"id" : 23, "name" : "hong"}
			})
			.then(result => {
				console.log(result); // return 이 없어서 여기서 끝이 나게 됨.
			})
			.catch(error => {
				console.log(error);
			})

		
	</script>

</body>
</html>