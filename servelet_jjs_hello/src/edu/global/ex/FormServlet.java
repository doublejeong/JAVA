package edu.global.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.shape.Circle;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/FormEx")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);

		System.out.println("포스트 방식입니다!!!");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		// 체크박스 받아내기
		String[] hobbys = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		String protocol = request.getParameter("protocol");
		
		String paramId = getServletContext().getInitParameter("id");
		String paramPw = getServletContext().getInitParameter("pw");
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1> 아이디 : " + id + "</h1>");
		writer.println("<h1> 패스워드 : " + pw + "</h1>");
		writer.println("<h1> 취미 : " + Arrays.deepToString(hobbys) + "</h1>");
		writer.println("<h1> 전공 : " + major + "</h1>");
		writer.println("<h1> 프로토콜 : " + protocol + "</h1>");

		writer.println("<h1> 파라미터 공유 아이디 : " + paramId + "</h1>");
		writer.println("<h1> 파라미터 공유 패스워드 : " + paramPw + "</h1>");
		writer.println("</body>");
		writer.println("</html>");

		writer.close();
	
	
	}

}
