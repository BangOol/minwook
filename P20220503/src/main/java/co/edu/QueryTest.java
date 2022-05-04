package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/queryTest")
public class QueryTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//jsp 상태유지 정보기술
	//application : P20220503/P20220504/ ... <- tomcat 서버에서 실행. 프로젝트 간 정보 교류 x , 프로젝트 내에서 정보 유지(프로젝트단위)
	//session : user1/user2/... <- P20220503 프로젝트로부터 정보 제공받음.
	//request(페이지당 정보공유?): user1 			<- servlet1의 정보 user1을  servlet2와 정보 공유를 해야함..?
	
	// http 프로토콜
	// 클라이언트 request -> server
	// 클라이언트 response <- server
	
    public QueryTest() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				//요청 정보
				request.setCharacterEncoding("UTF-8");
				//응답 정보
				response.setCharacterEncoding("UTF-8");
				response.setContentType("text/html; charset = UTF-8");
				
				String id = request.getParameter("id");
				String pass = request.getParameter("pwd");
				String name = request.getParameter("name");
				String[] hobbies = request.getParameterValues("hobby");
				String gen = request.getParameter("gender");
				String rel = request.getParameter("religion");
				String intro = request.getParameter("intro");
				
				PrintWriter out = response.getWriter();	
				out.print("<h3>id: " + id + "</h3>");
				out.print("<h3>pass: " + pass + "</h3>");
				out.print("<h3>name: " + name + "</h3>");
				out.print("<ul>");
				for(String hobby : hobbies) {
					out.print("<li>" + hobby + "</li>");
				}
				out.print("</ul>");
				out.print("<h3>성별: " + gen+ "</h3>");
				out.print("<h3>종교: " + rel + "</h3>");
				out.print("<h3>자기소개: " + intro + "</h3>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				//요청 정보
				request.setCharacterEncoding("UTF-8");
				//응답 정보
				response.setCharacterEncoding("UTF-8");
				response.setContentType("text/html; charset = UTF-8");
				
				String id = request.getParameter("id");
				String pass = request.getParameter("pwd");
				String name = request.getParameter("name");
				String[] hobbies = request.getParameterValues("hobby");
				String gen = request.getParameter("gender");
				String rel = request.getParameter("religion");
				String intro = request.getParameter("intro");
				
				PrintWriter out = response.getWriter();	
				out.print("<h3>id: " + id + "</h3>");
				out.print("<h3>pass: " + pass + "</h3>");
				out.print("<h3>name: " + name + "</h3>");
				out.print("<ul>");
				for(String hobby : hobbies) {
					out.print("<li>" + hobby + "</li>");
				}
				out.print("</ul>");
				out.print("<h3>성별: " + gen+ "</h3>");
				out.print("<h3>종교: " + rel + "</h3>");
				out.print("<h3>자기소개: " + intro + "</h3>");
	}

}
