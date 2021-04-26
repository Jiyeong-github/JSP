package com.koreait.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//책 95쪽 - web-inf는 접속이 안 된다
@WebServlet("/list") //이 부분이 주소 값
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
//request에 어떤 브라우저로 정보를 보내는 지 다 저장되어 있음
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		response.setCharacterEncoding("UTF-8");
		response.getWriter() //response.주소값 
		.append("<html>")
		.append("<body>")
		.append("<head>")
		.append("hi")
		.append("</head>")
		.append("</body>")
		.append("</html>");
		
		PrintWriter out = response.getWriter();
		out.print("ㅎㅅㅎ");
		
//		.append("Served at: ")
//		.append(request.getContextPath())
//		.append("heheh");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doPost");
		doGet(request, response);
	}

}
