package com.koreait.board3;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/List3")
public class BoardListServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<BoardVO3> list=BoardDAO.selBoardList(); 
		// =어레이리스트
		//()범위를 지정하는게 아니라 다 들고 오겠다
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/view/List3.jsp").forward(request, response);
		
		//객체화 클래스 단위로만
//		MyUtils mu = new MyUtils();
//		mu.OpenJSP(getServletInfo(), request, response);
		
//		String jsp="WEB-INF/view/MyUtils.jsp";
//		
//		MyUtils.OpenJSP(jsp, request, response);
		
		MyUtils.OpenJSP("detail3", request, response);
		
		
	}
	
}
