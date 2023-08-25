
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="dept" class="edu.global.ex.dto.DeptDto" />
<jsp:setProperty name="dept" property="deptno" value="88" />
<jsp:setProperty name="dept" property="dname" value="세일즈" />
<jsp:setProperty name="dept" property="loc" value="대구" />

<hr>
${dept.deptno}<br>
${dept.dname}<br>
${dept.loc}<br>
<hr>
${dept.getDeptno()}<br>
${dept.getDname()}<br>
${dept.getLoc()}<br>
<hr>
<jsp:getProperty name="dept" property="deptno" /><br>
<jsp:getProperty name="dept" property="dname" /><br>
<jsp:getProperty name="dept" property="loc" /><br>


<%-- 
	<h1>${10}</h1><br>
	<h1>${99.99}</h1><br>
	<h1>${"abc"}</h1><br>
	<h1>${true}</h1><br>
	<hr>
	<h1>${1+2}</h1><br>
	<h1>${1-2}</h1><br>
	<h1>${1*2}</h1><br>
	<h1>${1/2}</h1><br>
	<h1>${1<2}</h1><br>
	${(1>2) ? 1:2}<br/>
	${(1>2) || (1<2)}<br/>

	<h1><%=10 %></h1><br>
 --%>
 
</body>
</html>