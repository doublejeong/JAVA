<%@page import="edu.global.ex.Circle"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="request_send.jsp" method="get">
	
		<h1>당신의 나이 : </h1>
		<input type="text" name="age">
		<input type ="submit" value="send">
		<input type ="reset" value="초기화">
	</form>
</body>
</html>