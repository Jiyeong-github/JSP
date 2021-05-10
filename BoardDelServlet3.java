package com.koreait.board3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/del3")
public class BoardDelServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String iboard=request.getParameter("iboard");
//		BoardDAO.deleteBoard(Integer.parseInt("iboard")); - int로 해야 빨간 줄 안 뜬당ㅎ
		
		BoardVO3 param=new BoardVO3();
		param.setIboard(Integer.parseInt(iboard));
		//이렇게 만들면 수정할 때 좋음
		
		BoardDAO.deleteBoard(param);
		
		response.sendRedirect("/List3");
	}//쿼리스트링 get방식 - getParameter

}
