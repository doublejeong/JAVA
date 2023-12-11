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
	
%>

	<h1>나이 : <%= age %> 성인입니다. 주류판매 가능</h1>


</body>
</html>