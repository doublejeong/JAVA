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

	String id = (String)session.getAttribute("id");
	int num = (Integer)session.getAttribute("tel");

	//session.setAttribute("id", "abcde");
	//session.setAttribute("tel", 12345);
	
%>

	<%= id %></br>
	<%= num %></br>

	<a href="sessionGet.jsp">세션 확인</a>

</body>
</html>