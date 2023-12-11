package edu.global.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.shape.Circle;
import edu.global.ex.shape.Grade;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/grade")
public class GradeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GradeServlet() {
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
		
/////////////////////////
		
		
		
		double kor = Double.valueOf(request.getParameter("kor"));
		double eng = Double.valueOf(request.getParameter("eng"));
		double math = Double.valueOf(request.getParameter("math"));
		
		double total = kor + eng + math;
		double avg = total / 3.0;
		
		Grade grade = new Grade();
		grade.setGrade(kor, eng, math);
		grade.getAvg();
		
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("성적 : " + grade.getGrade());		
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1> 총점 : " + total + "</h1>");
		writer.println("<h1> 평균 : " + avg + "</h1>");
		writer.println("<h1> 성적 : " + grade.getGrade() + "</h1>");
		writer.println("</body>");
		writer.println("</html>");

		writer.close();
	
	
	}

}
