package co.edu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet({ "/SampleServlet", "/sampleServlet" })// 이렇게 여러 개의 URL를 가질 수 있다.
// .java -> .class & .class 읽어들임.
// C:\Dev\workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\JSPProject\WEB-INF\classes\co\edu
// SampleServlet.class 파일 생성(있어야 파일을 불러올 수 있음).
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SampleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

// service 메소드와 doGet,doPost간의 관계가 어떻게 되는걸까?
// service 메소드가 있을 시, doGet, doPost를 사용 x
