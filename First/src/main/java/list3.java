

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list3")
public class list3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public list3() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		
		System.out.println("name:"+name);
		System.out.println("age:"+age);
				
		String jsp="/WEB-INF/jsp/list3.jsp";
		response.getWriter().append("Served at: ").append(request.getContextPath());
//		rd.forward(request,response);
	}     


}
