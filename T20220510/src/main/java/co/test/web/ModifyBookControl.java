package co.test.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.test.service.BookService;
import co.test.vo.BookVO;

public class ModifyBookControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BookService service = new BookService();
		BookVO vo = new BookVO();
		
		String bookCode = request.getParameter("bookCode");
		String bookTitle = request.getParameter("bookTitle");
		String bookAuthor = request.getParameter("bookAuthor");
		String bookPress = request.getParameter("bookPress");
		String bookPrice = request.getParameter("bookPrice");

		vo.setBookCode(bookCode);
		vo.setBookTitle(bookTitle);
		vo.setBookAuthor(bookAuthor);
		vo.setBookPress(bookPress);
		vo.setBookPrice(Integer.parseInt(bookPrice));
		
		service.modifyBook(vo);
		
		
		request.getRequestDispatcher("result/modifyOutput.jsp").forward(request, response);
	}

}
