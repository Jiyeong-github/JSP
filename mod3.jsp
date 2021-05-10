<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정</title>
</head>
<body>
<div><a href="list3">리스트</a></div>
	<form action="/mod3" method="post">
	<!-- write랑 다른 점 : 굳이 안 보여줘도 되니까 hidden 줌 -->
	<input type="hidden" name="iboard" value="${param.iboard }">
	<div>
	제목:<input type="text" name="title" value="${data.title }">
	</div>
	<div>
	내용:<textarea name="content">${data.ctnt }</textarea>
	</div>
	<div><input type="submit" value="등록">
	<input type="submit" value="초기화"></div>
	</form>
</body>
</html>