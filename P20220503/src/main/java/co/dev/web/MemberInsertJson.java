package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberInsertJson implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset = UTF-8");
		MemberVO vo = null;
		
		
		
	
		boolean isMulti = ServletFileUpload.isMultipartContent(request);
		
		if(isMulti) { //멀티파트 요
			
			String saveDir = "upload"; 
			
			saveDir = request.getServletContext().getRealPath(saveDir);
			System.out.println(saveDir);
			int maxSize = 1024* 1024* 5;// 최대 사이즈 : 5MB
			String encoding = "UTF-8";
			
			String id = request.getParameter("id");
			String ps = request.getParameter("passwd");
			String nm = request.getParameter("name");
			String em = request.getParameter("email");
			
			MultipartRequest multi = new MultipartRequest(request, saveDir, maxSize, encoding, new DefaultFileRenamePolicy());

			
			vo = new MemberVO();
			
			vo.setId(id);
			vo.setName(nm);
			vo.setPasswd(ps);
			vo.setEmail(em);
	
			
			MemberService service = new MemberService();
			service.memberInsert(vo);
			
			
			} else { // key = value & key1=value...
			String id = request.getParameter("id");
			String ps = request.getParameter("passwd");
			String nm = request.getParameter("name");
			String em = request.getParameter("email");
			
			vo = new MemberVO();
			
			vo.setId(id);
			vo.setName(nm);
			vo.setPasswd(ps);
			vo.setEmail(em);
			
			MemberService service = new MemberService();
			service.memberInsert(vo);
			
		}

		// Json 형태의 결과 반환.
		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(vo));

		
		
	}

}
