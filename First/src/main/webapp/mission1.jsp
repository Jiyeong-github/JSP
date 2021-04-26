<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%!
    int a=10;
    int sum(int num1, int num2){
    return num1+num2;
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오전 10시</title>
</head>
<body>
	<div>스크립트릿 이해도 평가 미션1</div>
	<div>for문을 이용하여 1~10 세로 방향으로 출력</div>
	<div>각 숫자들은 div로 감싸주기</div>
<%
	for(int i=1; i<=10; i++){
		out.print("<div>");
		out.print(i);
		out.print("</div>");
	} 
%>
<hr> <!-- 아래 껄로 외우길 권장 -->
<%for(int i=1; i<=10;i++) {%>
<div><%=i %></div>
<%} %>

</body>
</html>