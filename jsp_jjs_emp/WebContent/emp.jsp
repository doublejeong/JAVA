<%@page import="edu.global.ex.dto.EmpDto"%>
<%@page import="edu.global.ex.dao.EmpDao"%>
<%@page import="edu.global.ex.dto.DeptDto"%>
<%@page import="java.util.List"%>
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
	List<EmpDto> etos = dao.getemps();
	/* 
	DeptDto dept = new DeptDto(55, "JAVA", "Seoul");
	dao.insertEmp(dept.getDeptno(), dept.getDname(), dept.getLoc());

	dept = new DeptDto(66, "자바", "대구");
	dao.insertDept(dept.getDeptno(), dept.getDname(), dept.getLoc());

	int deptno = 66;
	dao.deleteDept(dept.getDeptno());
 */
	
	
	for(EmpDto eto : etos) {
		out.print("부서번호 : " + eto.getEmpno() + "<br>" +
				" 직종이름 : " + eto.getEname() + "<br>" +
				" 지역 : " + eto.getJob() + "<br>");
	}
	
%>


</body>
</html>