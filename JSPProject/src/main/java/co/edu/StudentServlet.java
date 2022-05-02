package co.edu;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
// javax 라는건 뭘까?
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// HttpServlet 정의
//Provides an abstract class to be subclassed to createan HTTP servlet suitable for a Web site. A subclass of HttpServlet must override at leastone method, usually one of these: 
//• doGet, if the servlet supports HTTP GET requests 
//• doPost, for HTTP POST requests 
//• doPut, for HTTP PUT requests 
//• doDelete, for HTTP DELETE requests 
//• init and destroy,to manage resources that are held for the life of the servlet 
//• getServletInfo, which the servlet uses toprovide information about itself 


// Q   IOC : Introversion of control 
public class StudentServlet extends HttpServlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() 호출");
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter(); // 출력 스트림 생성 + 코드 길어질 것을 대비 : 변수 생성
		// Q 입출력 스트림에 대해 다시 보자.
		out.println("<h3>Student Sample page.</h3>");
		resp.setContentType("text/html; charset = UTF-8");
		String method = req.getMethod();
		
		if(method.equals("GET")) {
			out.print("<h3>Get 방식 호출</h3>");
			doGet(req,resp);
			// 다만 굳이 doPost, dOGet을 나누어 사용하진 않는다?
		} else if (method.equals("POST")) {
			out.print("<h3>Post 방식 호출</h3>");
		}
		
		out.println("<a href = './index.jsp?user_name=kildong&user_id=hong'>index page</a>");
		
		// index page라는 이름의 index.html 링크 생성
		// 이 정보를 response를 통해 어떻게 되는 걸까...?
		// key, value 값으로 전달하기 위해 ?와 key,value를 넣음.
		// Q value 부분에 공백을 넣을 시 어떻게 될까?
	}

	
	@Override
	public void destroy() {
		System.out.println("destroy() 호출.");
	}
}



//1. 서블릿 라이프 사이클란? init(), service(), doGet(), destroy()

