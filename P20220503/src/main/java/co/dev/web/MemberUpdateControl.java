package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberUpdateControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("수정처리하는 컨트롤");
		
		MemberService service = new MemberService();
		MemberVO member = new MemberVO();
		
		// 입력되었던 값 각 문자열에 기입 및 Member 객체에 모으기
		String id = request.getParameter("id"); 
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String passwd = request.getParameter("passwd");
		
		member.setId(id);
		member.setName(name);
		member.setEmail(email);
		member.setPasswd(passwd);
		
		if(id.isEmpty() || name.isBlank() || email.isBlank() || passwd.isBlank()) {
			request.setAttribute("error", "모든 항목을 입력하세요");
			request.getRequestDispatcher("memberView/memberUpdate.jsp").forward(request, response);
			return;
		}
		
		// updateMember() 실행
		service.updateMember(member);
		
		request.setAttribute("id", id);
		
		request.getRequestDispatcher("memberResult/memberUpdateOutput.jsp").forward(request, response);
		
		
		
		

	 
		
		

	}
}
	


