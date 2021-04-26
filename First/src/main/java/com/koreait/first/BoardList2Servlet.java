package com.koreait.first;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/list2")
public class BoardList2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
//jsp 파일 절대 이름을 바꾸지 말기
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jsp="/WEB-INF/list2.jsp";	//jsp 파일은 무조건 web-inf 파일 밑에 붙일 것
		RequestDispatcher rd=request.getRequestDispatcher(jsp);
			rd.forward(request, response);
	}
//책 235쪽
}
