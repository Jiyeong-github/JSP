package com.koreait.board3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mod3")
public class ModServelet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String iboard=request.getParameter("iboard");
		BoardVO3 data = BoardDAO.selBoard(Integer.parseInt(iboard));
		request.setAttribute("data", data);

		request.getRequestDispatcher("WEB-INF/view/mod3.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String iboard = request.getParameter("iboard");
		
		System.out.println(title + "" + content);

		BoardVO3 vo = new BoardVO3();
		vo.setTitle(title);
		vo.setCtnt(content);
		vo.setIboard(Integer.parseInt(iboard));
		
		BoardDAO.updateBoard(vo);		
		response.sendRedirect("/Detail3?iboard="+iboard); //String으로 더하기하면 됨
	}
}
