package co.dev.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet{
	//모든 .do 주소 호출 -> FrontController servlet 호출 및 실행 -> web.xml 수정
	HashMap<String,Control> list = null; // value, key 값 모두 String type
	
	String charset = null;
	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		//최초 1회 실행.
		charset = config.getInitParameter("charset");
	
		list = new HashMap<String, Control>();
		list.put("/memberInsert.do",new MemberInsertControl());
		list.put("/memberUpdate.do",new MemberUpdateControl());
		list.put("/memberList.do", new MemberListControl());
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding(charset);
		String url = req.getRequestURI(); // 사용자 URL -> /P20220503/memberInsert.do
		String context = req.getContextPath();
		String path = url.substring(context.length()); //memberInsert.do를 의미
		
		Control exeCon = list.get(path); //키 입력 시 해당 값 반환
		exeCon.execute(req, resp);
	}
	
}
