<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String name=request.getParameter("name");
    String age=request.getParameter("age");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>horemore?</title>
</head>
<body>
	<h1>list2 화면</h1>
	<%=name %><%=age  %>
</body>
</html>