package com.koreait.board3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyUtils {
	// 메소드 안 전역, 지역변수들은 선언이 되어야만 한다

	public static int getParamInt(String iboard, HttpServletRequest request){
		
//		String strVal = req.getParameter(key);
//		int intVal = parseStringToInt(strVal);
//		return intVal;
		//return parseStringToInt(req.getParameter(key));
		
		return parseStringToInt(request.getParameter(iboard));
	}
	
	public static int parseStringToInt(String strNum) {
		try {
			return Integer.parseInt(strNum);
		} catch (Exception e) {
			return 0;
		}
	}

	public static void OpenJSP(String jsp, HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		request.getRequestDispatcher(NM).forward(request, response);
		// request, response를 받을 수 있도록 해준다.
		// 멤버필드가 없다면 앞에 static 붙일 것

		request.getRequestDispatcher("WEB-INF/view/" + jsp + ".jsp").forward(request, response);

		String num = "10";
		int val = MyUtils.parseStringToInt(num);
//		RequestDispatcher rd = request.getRequestDispatcher(jsp);
// rd.forward(request,response);
		
		
	}

}
