package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;



@WebServlet("/fileUploadServlet")
public class FileUploadServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FileUploadServ() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		System.out.println("title : " + title + ", content : " + content);
		String saveDir = "upload"; // 이렇게 해서 upload 파일을 찾는 것은 아님.
		
		saveDir = getServletContext().getRealPath(saveDir);
		System.out.println(saveDir);
		int maxSize = 1024* 1024* 5;// 최대 사이즈 : 5MB
		String encoding = "UTF-8";
		//multipart 요청
		// request, 저장위치, 최대사이즈, encoding, 리네임정책: 서버 내 같은 파일 구분 -> 이름 변경(file.jpg, file1.jpg)
		// file.
		MultipartRequest multi = new MultipartRequest(request, saveDir, maxSize, encoding, new DefaultFileRenamePolicy());
		title = multi.getParameter("title");
		content = multi.getParameter("content");
		String profile = multi.getOriginalFileName("profile"); // 현재 파일 이름? : 원본 이름을 알고 있어야 한다.
		String fileName = multi.getFilesystemName("profile"); // 리네임 정책에 의해 만들어진 이름.
		System.out.println("title : " + title + ", content1 : " + content + ", profile : " + profile + ", file : " + fileName);
		// file 이름을 DB에 업로드해보자.
	}

}
