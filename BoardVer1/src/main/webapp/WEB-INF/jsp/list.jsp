<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="com.koreait.board.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
<style>
table,th,td{
border:1px solid black;
border-collapse: collapse;
}
</style>
</head>
<body>
	<h1>list</h1>
	<div>
		<a href="/write">글쓰기</a>
	</div>
	<div>
		<table>
			<tr>
				<th>no</th>
				<th>제목</th>
			</tr>
<%
List<BoardVO> list = (List<BoardVO>)request.getAttribute("data");
%>
		
			<%
			for (int i = 0; i < list.size(); i++) {
				BoardVO vo = list.get(i);
			%>
			
			<tr>
				<td><%=i%></td>
				<td>
				<a href="/detail?no=<%=i%>">
				<%=vo.getTitle()%></a></td>
				<td>
					<%}%>
				</td>
			</tr>
		</table>
	</div>
	<div>글 리스트 적힐 공간</div>
</body>
</html>