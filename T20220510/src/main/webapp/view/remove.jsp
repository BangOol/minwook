<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>

<body>

	<h3>${error }</h3>

    <h3>도서삭제조회</h3>
    <form action="../searchBook.do" method="get">
        <input type="text" name="bookCode" id=""><br>
        <input type="hidden" name="job" value="remove">
        <input type="submit" value="조회">
    </form>

    <!-- 도서삭제를 위한 화면 작성코드를 입력하세요. -->
	<h3>책 정보 수정</h3>
	<form action="${pageContext.servletContext.contextPath}/removeBook.do" method = post>
		책 제목: <input type = "text" name = "bookTitle" value = ${BookVO.bookTitle} readonly><br>
		책 저자: <input type = "text" name = "bookAuthor" value = ${BookVO.bookAuthor} readonly><br>  
		책 출판: <input type = "text" name = "bookPress" value = ${BookVO.bookPress} readonly><br>
		책 가격: <input type = "number" name = "bookPrice" value = ${BookVO.bookPrice} readonly><br>
		<input type = "submit" value ="삭제">    
		<input type = "hidden" name = "bookCode" value = ${BookVO.bookCode}>
	</form>
    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>

</body>

</html>