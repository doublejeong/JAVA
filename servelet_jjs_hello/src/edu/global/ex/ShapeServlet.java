package edu.global.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.shape.Circle;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/circleArea")
public class ShapeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShapeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		System.out.println("Hello World!!!");

		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>Main~~~</h1>");
		writer.println("</body>");
		writer.println("</html>");

		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);

		System.out.println("포스트 방식입니다!!!");
		
		String radius = request.getParameter("circle");
		
		Circle circle = new Circle(Double.valueOf(radius));
		
//		double area = Double.valueOf(radius) * Double.valueOf(radius) * Math.PI;
		
		System.out.println("반지름 : " + radius);
		
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1> 넓이는 : " + circle.getArea() + "</h1>");
		writer.println("</body>");
		writer.println("</html>");

		writer.close();
	
	
	}

}
