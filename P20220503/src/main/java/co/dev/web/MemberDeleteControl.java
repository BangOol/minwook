package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberDeleteControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("삭제처리하는 컨트롤입니다.");
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		MemberService service = new MemberService();
		MemberVO member = new MemberVO();
		
		member.setId(id);
		member.setPasswd(passwd);
		

		
			service.deleteMember(member);
	
	
		
		
		
		
		request.setAttribute("id", id);
		request.getRequestDispatcher("memberResult/memberDeleteOutput.jsp").forward(request,response);
		// 이 페이지의 결과값을 가지고 /memberDeleteOutput.jsp로 이동
		

	}

}
