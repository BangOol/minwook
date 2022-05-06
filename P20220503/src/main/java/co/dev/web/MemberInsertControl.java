package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberInsertControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/json; charset = utf-8");
		
		
		String saveDir = "upload"; // 
		
		saveDir = request.getServletContext().getRealPath(saveDir);
		System.out.println(saveDir);
		int maxSize = 1024* 1024* 5;// 최대 사이즈 : 5MB
		String encoding = "UTF-8";
		//multipart 요청
		// request, 저장위치, 최대사이즈, encoding, 리네임정책: 서버 내 같은 파일 구분 -> 이름 변경(file.jpg, file1.jpg)
		// file.
		MultipartRequest multi = new MultipartRequest(request, saveDir, maxSize, encoding, new DefaultFileRenamePolicy());
		
		
		
		
		System.out.println("입력처리하는 컨트롤입니다.");
		String id = multi.getParameter("id");
		String ps = multi.getParameter("passwd");
		String nm = multi.getParameter("name");
		String em = multi.getParameter("email");
		String pf = multi.getFilesystemName("profile");
		
		MemberVO vo = new MemberVO();
		
		vo.setId(id);
		vo.setName(nm);
		vo.setPasswd(ps);
		vo.setEmail(em);
		vo.setProfile(pf);
		
		MemberService service = new MemberService();
		service.memberInsert(vo);
		
		//request.setAttribute("id", id);
		request.setAttribute("name", nm);
		//request.setAttribute("passwd", ps);
		//request.setAttribute("email", em);
		
		
		
			//Dispatcher 객체 forword.
			request.getRequestDispatcher("memberResult/memberInsertOutput.jsp").forward(request,response);
		
		
		
	}

}
