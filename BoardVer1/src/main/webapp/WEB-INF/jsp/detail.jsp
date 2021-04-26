<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.koreait.board.BoardVO" %>
    <%
    String no=request.getParameter("no"); 
    BoardVO vo=(BoardVO) request.getAttribute("data"); //object니까 ㅎ~~, getAttribute 했음 setAttribute 필수
    %> 
<!DOCTYPE html>
<html> 
<head>
<meta charset="UTF-8">
<title>Detail</title>
</head>
<body>


<div>오늘 최고 온도 22도<%= no %></div>
<div><%=request.getParameter("no") %></div>

<div>
	<form action="/delete" method="post">
	<input type="hidden" name="no" value="<%=no%>">
	<input type="submit" value="삭제">
	</form>
	
<a href="/del?no=<%=no %>"><button>삭제</button></a>
</div>

<div>

</div>

<div>제목:<%=vo.getTitle() %></div>
<div>내용:<%=vo.getCtnt() %></div>
  <!--${param.cnt}어쩌고:EL식(Expression Language)-->
</body>
</html>