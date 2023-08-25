<%@page import="edu.global.ex.dao.DeptCPDao"%>
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
/* 	DeptDao dao = new DeptDao(); */
	DeptCPDao dao = new DeptCPDao();
	
	List<DeptDto> dtos = dao.getDepts();
	
/* 	DeptDto dept = new DeptDto(55, "JAVA", "Seoul");
	dao.insertDept(dept.getDeptno(), dept.getDname(), dept.getLoc());

	dept = new DeptDto(66, "자바", "대구");
	dao.insertDept(dept.getDeptno(), dept.getDname(), dept.getLoc()); */

/* 	int deptno = 66;
	dao.deleteDept(dept.getDeptno());
 */
	
	
	for(DeptDto dto : dtos) {
		out.print("부서번호 : " + dto.getDeptno() +
				" 직종이름 : " + dto.getDname() +
				" 지역 : " + dto.getLoc() + "<br>");
	}
	
%>

</body>
</html>