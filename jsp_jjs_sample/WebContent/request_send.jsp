<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

	String str = request.getParameter("age");

	int age = Integer.valueOf(str);

	if(age >= 20) {
		// 클라이언트로 하여금 다시 요청한 페이지로 접속 하게끔 하는것
		// 리다이렉트를 쓰게 되면 request객체는 다시 생성되어 쓰지 못함
		// forward  request객체를 그대로 쓸 수 있음.
		
		response.sendRedirect("pass.jsp?age=" + age);
	} else {
		response.sendRedirect("ng.jsp?age=" +age);
	}

%>



</body>
</html>