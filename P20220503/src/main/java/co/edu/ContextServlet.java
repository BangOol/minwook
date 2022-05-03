package co.edu;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextServlet
 */
@WebServlet("/ContextServlet")
public class ContextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ServletContext sc = null;   
	@Override
		public void init(ServletConfig config) throws ServletException { // init() : 최초 1번만 실행되는 메서드
			// 서블릿 호출
			//ServletConfig :application에 대한 전체 정보 소유
			// HttpServerRequest, HttpServletResponse
			// init(sc);
			// service(req, resp);
			// destroy();
		sc = config.getServletContext();
		sc.setAttribute("name", "Hong"); // sc -> (servlet -> application(jsp))
		}	
    public ContextServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("name: " + sc.getAttribute("name"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
