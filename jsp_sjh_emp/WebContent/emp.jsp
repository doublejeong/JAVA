<%@page import="edu.global.ex.dto.EmpDto"%>
<%@page import="edu.global.ex.dao.EmpDao"%>
<%@page import="java.util.List"%>
<%@page import="edu.global.ex.dto.DeptDto"%>
<%@page import="edu.global.ex.dao.DeptDao"%>
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
		EmpDao dao = new EmpDao();
	
		List<EmpDto> dtos = dao.getEmps();

		for (EmpDto dto : dtos) {
			out.print("부서번호" + dto.getEmpno() + "부서이름:" + dto.getEname() + "직업:" + dto.getJob() + "<br>");

		}
	%>
</body>
</html>