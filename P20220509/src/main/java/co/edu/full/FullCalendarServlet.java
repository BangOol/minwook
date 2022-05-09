package co.edu.full;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


@WebServlet("/FullCalendarServlet")
public class FullCalendarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FullCalendarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 전체조회.
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/json; charset = utf-8");
		
		FullDAO dao = new FullDAO();
		List<FullVO> list = dao.getList();
		
		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(list));
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//입력, 삭제
		request.setCharacterEncoding("UTF-8");
		String job = request.getParameter("job"); // 모름
		FullDAO dao = new FullDAO();
		if(job.equals("insert")) {
			String title = request.getParameter("title");
			String start = request.getParameter("start");
			String end = request.getParameter("end");

			FullVO vo = new FullVO(title, start, end);
			dao.insertSchedule(vo);
			
		} else if (job.equals("delete")) {
			String title = request.getParameter("title");
			dao.deleteSchedule(title);
			
		}
	}

}