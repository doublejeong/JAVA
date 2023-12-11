<%@page import="edu.global.ex.dao.DeptCpDao"%>
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
		DeptCpDao dao = new DeptCpDao();
		List<DeptDto> dtos = dao.getDepts();

		//자바에서 데이터값 넣어서 실행시키기
		DeptDto dept = new DeptDto(55, "JAVA", "Seoul");
		dao.insertDept(dept.getDeptno(), dept.getDname(), dept.getLoc());

		dept = new DeptDto(66, "자바", "대구");
		dao.insertDept(dept.getDeptno(), dept.getDname(), dept.getLoc());

		// 삭제 기능 실행
		dao.deleteDept(55);
		dao.deleteDept(66);

		//데이터 테이블 실행시키기
		for (DeptDto dto : dtos) {
			out.print("부서번호" + dto.getDeptno() 
			+ "직종이름:" + dto.getDname() 
			+ "지역:" + dto.getLoc() + "<br>");

		}
	%>
</body>
</html>