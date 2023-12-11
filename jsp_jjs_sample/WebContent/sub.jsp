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
	
		String id = (String)request.getAttribute("id");

		String paramId = (String)request.getParameter("id");
		String paramPw = (String)request.getParameter("pw");
	%>
	<h1><%= id %>서브 페이지 입니다.</h1>
	<h1><%= paramId %>서브 페이지 입니다.</h1>
	<h1><%= paramPw %>서브 페이지 입니다.</h1>

</body>
</html>