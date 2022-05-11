<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>

<body>

	<!-- Sidebar-->
    <div class="border-end bg-white" id="sidebar-wrapper">
      <div class="sidebar-heading border-bottom bg-light">Start Bootstrap</div>
      <div class="list-group list-group-flush">
          <a class="list-group-item list-group-item-action list-group-item-light p-3" href="${pageContext.request.contextPath}/view/add.tiles">도서등록</a>
          <a class="list-group-item list-group-item-action list-group-item-light p-3" href="${pageContext.request.contextPath}/view/search.tiles">도서검색</a>
          <a class="list-group-item list-group-item-action list-group-item-light p-3" href="${pageContext.request.contextPath}/view/modify.tiles">도서수정검색</a>
          <a class="list-group-item list-group-item-action list-group-item-light p-3" href="${pageContext.request.contextPath}/view/remove.tiles">도서삭제검색</a></a>
          <a class="list-group-item list-group-item-action list-group-item-light p-3" href="listBook.do">도서목록</a>
          <!-- <a class="list-group-item list-group-item-action list-group-item-light p-3" href="#!">Status</a> -->
          </div>
      </div>
	</body>

</html>