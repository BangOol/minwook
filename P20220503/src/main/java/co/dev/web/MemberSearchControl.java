package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberSearchControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("정보조회하는 컨트롤입니다.");
		
		String id = request.getParameter("id"); // 조회용도, 수정용도, 삭제용도 모두 사용
		String job = request.getParameter("job"); // 이 3가지 용도를 구별하기 위한 job
		
		String path = ""; // 왜 경로 얻는 메소드를 사용하지 않을까?
		if(job.equals("search")) {
			path = "memberView/memberSearch.jsp";
		} else if(job.equals("update")) {
			path = "memberView/memberUpdate.jsp";
		} else if(job.equals("delete")) {
			path = "memberView/memberDelete.jsp";
		}
		
		if(id.isEmpty()) {
			request.setAttribute("error", "아이디를 입력하세요");
			request.getRequestDispatcher(path).forward(request, response);
			return;
		}
		
		// 조회 기능
		MemberService service = new MemberService();
		MemberVO member = service.memberSearch(id);
		
		if(member == null) {
			request.setAttribute("result", "조회된 경로가 없습니다.");
		}
		request.setAttribute("member", member); // Attribute : member 읽어오면 
		
		if(job.equals("search")) {
			path = "memberResult/memberSearchOutput.jsp";
		}
		request.getRequestDispatcher(path).forward(request, response);
	}

}
