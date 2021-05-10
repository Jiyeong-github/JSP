package com.koreait.board3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Detail3")
public class BoardDetailServelet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String iboard = request.getParameter("iboard");
		BoardVO3 data = BoardDAO.selBoard(MyUtils.getParamInt("iboard", request));
		request.setAttribute("data", data);

		// 한줄만 가져옴 <->selBoardList 여러줄

		MyUtils.OpenJSP("Detail3", request, response);

	}

}
