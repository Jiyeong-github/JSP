<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>
<h1>글 쓸 공간</h1>
<form action="/write" method="post">
	<div>
	제목: <input type="text" name="title">
	</div>
	<div>
	내용: <textarea name="ctnt" rows="10" cols="10"></textarea> 
	</div>
	<div>
	<input type="submit" value="글쓰기"> <!-- submit하면 form이 동작함 -->
	</div>
</form>
<div>즈스프하면 즙짜나요..,,,?</div>
<div>33명 다 인마이백 점.,,</div>
</body>
</html>