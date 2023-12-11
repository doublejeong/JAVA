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
	<h2 align="center">구구단</h2>
	<table align="center" border="1">
		<%
      for(int i = 1; i < 10; i++) {
   %>
		<tr>
			<%
         for(int j = 2; j < 10; j++) {
   %>
			<td><%= Integer.toString(j) 
                   + " X " + Integer.toString(i) 
                   + " = " + Integer.toString(j * i) 
               %></td>
			<%
         }
   %>
		</tr>
		<%
      }
   %>
	</table>
	
	<hr>
	<h1>원넓이</h1>
	<%
		Circle circle = new Circle(10);
	
		out.print("원의 넓이는" + circle.getArea());
	%>
	<%= circle.getArea() %>
	

</body>
</html>



<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h2 align="center">구구단</h2>
   <table align="center" border="1">
   <%
      for(int i = 1; i < 10; i++) {
   %>
         <tr>
   <%
         for(int j = 2; j < 10; j++) {
   %>
            <td>
               <%= Integer.toString(j) 
                   + " X " + Integer.toString(i) 
                   + " = " + Integer.toString(j * i) 
               %>
            </td>
   <%
         }
   %>
         </tr>
   <%
      }
   %>
   </table>
   </br>
   <table align="center" border="1">
   <%
      for(int i = 1; i < 10; i++) {
   
      out.println("<tr>");
   
         for(int j = 2; j < 10; j++) {   
            out.println("<td>");
            out.println( j + " X " + i + " = " + (j * i));                
            out.println("</td>");   
         }
   
      out.println("</tr>");

      }
   %>
   </table>
</body>
</html> --%>