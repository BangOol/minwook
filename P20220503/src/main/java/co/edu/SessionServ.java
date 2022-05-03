package co.edu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServ
 */
@WebServlet("/session.do")
public class SessionServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SessionServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pass");
		
		HttpSession session = null;
		
		session = request.getSession();
		session.setAttribute("id", id);
		session.setAttribute("pass", pw);
		
		response.sendRedirect("session2.jsp");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
