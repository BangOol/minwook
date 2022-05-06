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
		list.put("/memberSearch.do", new MemberSearchControl());
		list.put("/memberDelete.do", new MemberDeleteControl());
		
		
		// JSON 관련등록
		list.put("/memberListJson.do", new MemberListJson());
		list.put("/memberInsertJson.do", new MemberInsertJson());
		
		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding(charset);
		
		String url = req.getRequestURI(); // 사용자 URL -> /P20220503/memberInsert.do
//		System.out.println(req.getRequestURI());// /P20220503
		String context = req.getContextPath(); // /memberInser.do만 남기려고 사용하는 듯
	
		String path = url.substring(context.length()); //memberInsert.do를 의미
		
		Control exeCon = list.get(path); //키 입력 시 해당 값 반환
		exeCon.execute(req, resp);
	}
	
}
