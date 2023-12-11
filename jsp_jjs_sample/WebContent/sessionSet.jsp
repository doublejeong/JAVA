<%@page import="edu.global.ex.Circle"%>
<%@ page import="java.util.Enumeration"%>
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

	session.setAttribute("id", "abcde");	// session 은 내장객체
	session.setAttribute("tel", 12345);

	
	session.setAttribute("circle", new Circle(10));
	
	/* 
	
	   String sName;
	   String sValue;
	   Enumeration enumeration = session.getAttributeNames();
	   
	   while(enumeration.hasMoreElements()){
	      sName = enumeration.nextElement().toString();
	      sValue = session.getAttribute(sName).toString();
	      out.println("sName : " + sName + "<br />");
	      out.println("sValue : " + sValue + "<br />");
	   }
	   
	   out.println("************************ <br />");
	   
	   String sessionID = session.getId();
	   out.println("sessionID : " + sessionID + "<br />");
	   int sessionInter =  session.getMaxInactiveInterval();
	   out.println("sessionInter : " + sessionInter + "<br />");
	   
	   out.println("************************ <br />");
	   
	   session.removeAttribute("mySessionName");
	   Enumeration enumeration1 = session.getAttributeNames();
	   
	   while(enumeration1.hasMoreElements()){
	      sName = enumeration1.nextElement().toString();
	      sValue = session.getAttribute(sName).toString();
	      out.println("sName : " + sName + "<br />");
	      out.println("sValue : " + sValue + "<br />");
	   }
	   
	   out.println("************************ <br />");
	   
	   session.invalidate();
	   if(request.isRequestedSessionIdValid()) {
	      out.println("session valid");
	   } else {
	      out.println("session invalid");
	   } */
	   
	
%>
	<a href="sessionGet.jsp">섹션 확인</a>

</body>
</html>