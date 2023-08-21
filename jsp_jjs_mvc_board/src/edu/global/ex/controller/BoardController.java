package edu.global.ex.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.command.BoardCommand;
import edu.global.ex.command.BoardContentCommand;
import edu.global.ex.command.BoardDeleteCommand;
import edu.global.ex.command.BoardListCommand;
import edu.global.ex.command.BoardModifyCommand;
import edu.global.ex.command.BoardReplyCommand;
import edu.global.ex.command.BoardReplyViewCommand;
import edu.global.ex.command.BoardWriteCommand;

//괄호안을 *.do로 설정하는 이유 : .do로 들어오는 모든 것들은 webServlet에서 받아내겠다는 뜻
@WebServlet("*.do")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BoardController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doGet메소드를 탈 시에 console에 기록하기 위해 넣었다.(디버깅위해)
		System.out.println("doGet() ..");
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doPost메소드를 탈 시에 console에 기록하기 위해 넣었다.(디버깅위해)
		System.out.println("doPost() ..");
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("actionDo() ..");

		request.setCharacterEncoding("UTF-8");

		String viewPage = null;
		BoardCommand command = null;

		// 위의 세 줄은 http://localhost:8282/jsp_board/list.do에서 list.do를 꺼내기 위한 코드들
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());

		if (com.equals("/list.do")) {
			// BCommand인터페이스를 구현할 자손이므로 클래스생성必

			// execute메소드는 BListCommand에서 request, response객체를 가져오는 것을 의미
			command = new BoardListCommand();
			command.execute(request, response);

			// 해당 request 객체를 전달할 view 결정
			viewPage = "list.jsp";
		} else if (com.equals("/content_view.do")) {
			// http://localhost:8282/jsp_hjs_mvc_board/content_view.do?bid=8

			command = new BoardContentCommand();
			command.execute(request, response);

			// 해당 request 객체를 전달할 view 결정
			viewPage = "content_view.jsp";
		} else if (com.equals("/write_view.do")) {
			// http://localhost:8282/jsp_hjs_mvc_board/write_view.do

			viewPage = "write_view.jsp";
		} else if (com.equals("/write.do")) {
			// http://localhost:8282/jsp_hjs_mvc_board/write_view.do

			command = new BoardWriteCommand();
			command.execute(request, response);

			viewPage = "list.do";
		} else if (com.equals("/modify.do")) {
			// http://localhost:8282/jsp_hjs_mvc_board/modify.do

			command = new BoardModifyCommand();
			command.execute(request, response);

			viewPage = "list.do";
		} else if (com.equals("/delete.do")) {
			// http://localhost:8282/jsp_hjs_mvc_board/delete.do?bid=9

			command = new BoardDeleteCommand();
			command.execute(request, response);

			viewPage = "list.do";
		} else if (com.equals("/reply_view.do")) {
			// http://localhost:8282/jsp_jjs_mvc_board/reply_view.do?bid=19
			command = new BoardReplyViewCommand();
			command.execute(request, response);

			viewPage = "reply_view.jsp";
		} else if (com.equals("/reply.do")) {
			// http://localhost:8282/jsp_jjs_mvc_board/reply_view.do?bid=19
			command = new BoardReplyCommand();
			command.execute(request, response);

			viewPage = "list.do";
		}

		/*
		 * 클라이언트에게 list.do는 list.jsp로 forwarding을 시키겠다는 의미이다.
		 * 
		 * forwarding은 BListCommand클래스에서 메모리에 올린 request, response 객체 정보를 list.jsp에서
		 * 사용가능하다는 의미다.
		 * 
		 * forwarding될때까지 정보가 살아있기 때문이다. 고로 list.jsp에서 forEach문을 사용하여 데이터를 꺼낼 수 있다.
		 */

		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);

	}

}