package co.edu;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Servlet implementation class StudentGetServlet
 */
@WebServlet("/StudentGetServlet")
public class StudentGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public StudentGetServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// GET: cmd = search, cmd = null -> JSON 반환.
		
		response.setCharacterEncoding("UTF-8");
		String cmd = request.getParameter("cmd");
		
		if(cmd != null && cmd.equals("search")){
			String id = request.getParameter("user_id");
			StudentDAO dao = new StudentDAO();
			Student student = dao.searchStudent(id);
			response.setContentType("text/html; charset = utf-8");
		
			if(student != null) {
				response.getWriter().println("<form action = 'StudentGetServlet' method = 'post'>"); // 자기 위치에서 돌려도 꼭 action에 위치값 넣어야 한다.
				response.getWriter().println("<input type = 'hidden' name = 'cmd' value = 'mod'>");
				response.getWriter().println("<h3>아이디: "+ student.getStudentNo() + "</h3>");
				response.getWriter().println("<h3>이름: " + student.getStudentName() + "</h3>");
				response.getWriter().println("<h3>영어점수: <input type = 'number' name = 'eng_score' value ="+ student.getEngScore() +"></input></h3>");
				response.getWriter().println("<h3>국어점수: <input type = 'number' name = 'kor_score' value ="+ student.getKorScore() +"></input></h3>");
				
				response.getWriter().println("<input type = 'hidden' name = 'user_id' value ="+student.getStudentNo()+">");
				response.getWriter().println("<input type = 'hidden' name = 'user_name' value ="+student.getStudentName()+">");
				response.getWriter().println("<input type = 'submit' value = '수정'>");

				response.getWriter().println("</form>");
				
			} else {
				response.getWriter().println("<h3>조회하신 데이터가 없습니다.</h3>");
			}
			response.getWriter().println("<a href = 'studentList.jsp'>목록으로 이동</a>");
		} else if (cmd != null && cmd.equals("list")){
			StudentDAO dao = new StudentDAO();
			Student stud = new Student();
			String id =request.getParameter("user_id");
			String name = request.getParameter("user_name");
			
			stud.setStudentNo(Integer.parseInt(id));
			stud.setStudentName(name);
			
			dao.addStudent(stud);
			response.getWriter().print("입력성공");
			// dao.addStudent(null) 을 삭제했을 때...
			Student student = dao.searchStudent(id);
			response.setContentType("text/html; charset = utf-8");
			if(student != null) {
				response.getWriter().println("<h3>아이디: "+ student.getStudentNo() + "</h3>");
				response.getWriter().println("<h3>이름: " + student.getStudentName() + "</h3>");
				response.getWriter().println("<h3>영어점수: " + student.getEngScore() + "</h3>");
				response.getWriter().println("<h3>국어점수: " + student.getKorScore() + "</h3>");
			} else {
				response.getWriter().print("<h3>전송 실패</h3>");
			}
			response.getWriter().println("<a href = 'studentList.jsp'>목록으로 이동</a>");
			
		} else {
			response.setContentType("text/plane; charset=UTF-8");
			StudentDAO dao = new StudentDAO();
			List<Student> list = dao.studentList();
			//[{},{},{}]
			Gson gson = new GsonBuilder().create();
			response.getWriter().print(gson.toJson(list));
		}
		
		// GsonBuilder, create 메소드는 뭘까?
		// Gson : 자바 라이브러리로, 자바 객체 -> JSON , JSON문자열 -> 자바 객체 변환 ㅇ + 임의의 자바 객체 사용 o
		// Q. 이 메소드 호출의 의미는 무엇일까?
		// toJson = 직렬화 : 객체 -> JSON
		// JSON 타입으로 변환된 list 값을 응답으로 내보낼 출력 스트림을 얻은 후 print로 텍스트 기록?
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("html/text; charset = UTF-8");
		
		String cmd = request.getParameter("cmd");
		if(cmd != null && cmd.equals("add")) { // 추가(입력)
			StudentDAO dao = new StudentDAO();
			Student stud = new Student();
			System.out.println();
			String id =request.getParameter("user_id");
			String name = request.getParameter("user_name");
			String end = request.getParameter("eng_score");
			String kor = request.getParameter("kor_score");
			
			stud.setStudentNo(Integer.parseInt(id));
			stud.setStudentName(name);
			stud.setEngScore(Integer.parseInt(end));
			stud.setKorScore(Integer.parseInt(kor));
			
			dao.addStudent(stud);

		} else if (cmd != null && cmd.equals("del")) {
			StudentDAO dao = new StudentDAO();
			Student stud = new Student();
			String id =request.getParameter("user_id");
			
			dao.removeStudent(id);
			

			if(dao.removeStudent(id)) {
				response.getWriter().print("<script>alert('삭제성공')</script>");
			} else {
				response.getWriter().print("<script>alert('삭제실패')</script>");
			}
		} else if (cmd != null && cmd.equals("mod")) {
			// 사용자 입력 파라메터
			String id =request.getParameter("user_id");
			String name = request.getParameter("user_name");
			String end = request.getParameter("eng_score");
			String kor = request.getParameter("kor_score");
			
			Student stud = new Student();
			StudentDAO dao = new StudentDAO();
			stud.setStudentNo(Integer.parseInt(id));
			stud.setStudentName(name);
			stud.setEngScore(Integer.parseInt(end));
			stud.setKorScore(Integer.parseInt(kor));
			
			dao.modifyStudent(stud);
		}
		response.sendRedirect("studentList.jsp");
	} // end of doPost()

}
