<%@page import="edu.global.ex.dto.DeptDto"%>
<%@page import="edu.global.ex.dao.DeptCPDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


			
<%
	DeptCPDao dao = new DeptCPDao();
	List<DeptDto> dtos = dao.getDepts();
	
	pageContext.setAttribute("depts", dtos);
%>
	<table border="1">
		<tr>
			<td>부서번호</td>
			<td>부서이름</td>
			<td>부서위치</td>
		</tr>
		<c:forEach var="dept" items="${depts}">
			<tr>
				<td>${dept.deptno}</td>
				<td>${dept.dname}</td>
				<td>${dept.loc}</td>				
			</tr>
		</c:forEach>	
	</table>
<hr>
	<table border="1">
		<tr>
			<c:forEach var="dan" begin="2" end="9">
				<th>${dan} 단</th>
			</c:forEach>			
		</tr>
			<c:forEach var="num" begin="1" end="9">
				<tr>
					<c:forEach var="dan" begin="2" end="9">
						<td>${dan} x ${num} = ${num * dan} </td>
					</c:forEach>
				</tr>
			</c:forEach>
	</table>

<hr>
			
			
	

	
</body>
</html>