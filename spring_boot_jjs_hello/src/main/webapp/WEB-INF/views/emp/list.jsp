<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <table width="500" border="1">
      <tr>
         <td>사원번호</td>
         <td>이름</td>
         <td>입사날짜</td>
         <td>월</td>
         <td>매니져</td>
      </tr>
   
      <c:forEach var="emp" items="${emps}">
         <tr>
            <td>${emp.empno}</td>
            <td>${emp.ename}</td>
            <td>${emp.hiredate}</td>
            <td>${emp.sal}</td>
            <td>${emp.mgr}</td>            
         </tr>
      </c:forEach>
   </table>
</body>
</html>