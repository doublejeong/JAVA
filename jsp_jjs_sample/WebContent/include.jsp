<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 	<h1>인클루드를 시킵니다.</h1>
	<%@ include file="include01.jsp" %>
	<h1>인클루드가 되었습니다.</h1> --%>

<%

//내장 객체
// out,request,respose,session....exception...
// new 안하고 기본적으로 제공되는 객체
	out.print("서버이름 " + request.getServerName()+ "<br>");
	out.print("포트번호 " + request.getServerPort()+ "<br>");
	out.print("겟방식 포스트 방식 " + request.getMethod()+ "<br>");
	
	out.print("컨택스트 패스 " + request.getContextPath()+ "<br>");
	out.print("URL 패스 " + request.getRequestURL()+ "<br>");
	out.print("URI 패스 " + request.getRequestURI()+ "<br>");
	
	
%>


<h1>인클루드를 합니다.</h1>
<jsp:include page="include01.jsp"/>
<h1>인클루드가 되었습니다.</h1>

</body>
</html>