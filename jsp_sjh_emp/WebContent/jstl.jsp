
<%@page import="edu.global.ex.dto.DeptDto"%>
<%@page import="edu.global.ex.dao.DeptCpDao"%>
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

<!-- //c:으로 시작하는 jstl태그 -->


<!--1. 변수저장(키-값 형태로) =String name ="홍길동" -->
	<c:set var="name" value = "홍길동"/> 
<!-- pageContext.setAttribute("name","홍길동")이렇게 페이지메모리에 저장된다,
						이파일에서만쓸수있는변수,스코프를 지정하면 다른 곳에 저장됨 -->	

	<%--2. 변수써먹기 = <%=name %> /JSTL에서 메모리에 올린 값 빼낼 때는 EL문법 써야함--%>
	이름:<c:out value="${name}"/>
	이름:<c:out value="${'홍길동'}"/>
	이름:<c:out value="홍길동"/>
	${pageScope.name}
	
	<%--3. 변수제거 =pageContext.removeAttribute("name")--%>
	<c:remove var="name"/>
	이름삭제:<c:out value="${name}"/>
	
	<hr/>
	<%--4. 트라이캐치 var error--%>
	<c:catch var ="error"> <!--  메모리에올림 -->
		<%=2/0 %>
	</c:catch>
	<br/>
	<c:out value="${error }"/>  <!-- 올린거 꺼냄 -->
	<hr/>
	
	<%--5. if문 : true false--%>
	<!--false -->
	<c:if test="${10>20}" var="result1">
		10은 20보다 크다
	</c:if>
	result1:${result1}<br>
	
     <!--true -->
	<c:if test="${10<20}" var="result2">
		10은 20보다 크다
	</c:if>
	result1:${result2}<br>
	<hr>
	
	<%--6.switch문 --%>
	<c:set var="userid" value="hello123" />
	<c:choose>
		<c:when test="${userid == 'admin'}">
			관리자 페이지
		</c:when>
		
		<c:otherwise>
			${userid}님 반갑습니다.
		</c:otherwise>
	</c:choose>
	
	
	<%--7.for-each문 --%>
<%
	//숫자배열 
	pageContext.setAttribute("numList",new String[]{"1,2,3"});
	
	//과일배열
	List<String>fruits = new ArrayList<>();
	fruits.add("apple");
	fruits.add("kiwi");
	fruits.add("melon");	
	pageContext.setAttribute("fruitsList", fruits);//꼭 메모리 영역에 올려줄 것!
	
	//Dept배열
	DeptCpDao dao = new DeptCpDao();
	List<DeptDto> dtos = dao.getDepts();
	
	pageContext.setAttribute("depts", dtos);
	
%>

<hr>	
	<c:forEach var ="num" items="${numList}">
		<h1>${num}</h1>	
	</c:forEach>
<hr>

	<c:forEach var="fruit" items="${fruitsList}">
		<h1>${fruit}</h1>	
	</c:forEach>
<hr>

	<table border="1">
		<tr> <!-- 행생성 -->
			<td>부서번호</td>	
			<td>부서이름</td>	
			<td>부서위치</td>		
		</tr>
		
		<c:forEach var="dept" items="${depts}">
		<tr> <!-- 열생성(포이치돌려서 전부뽑아내) -->
			<td>${dept.deptno}</td>	
			<td>${dept.dname}</td>	
			<td>${dept.loc}</td>		
		</tr>	
		</c:forEach>	
	</table>
<hr>
	<ul> <!-- 초기값 종료갑 정한 후 뽑기 -->
		<c:forEach var="num" begin="1" end="10">
			<li>forEach 예제 ${num}</li>	
		</c:forEach>
	</ul>

<hr> 
	<!-- URL태그:URL만들때사용 -->
	<c:url var="calcUrl" value="http://localhost:8080/calc">
       	<c:param name="v1" value="10" />
       	<c:param name="v2" value="20" />
       	<c:param name="op" value="+" />
   </c:url>
   ${calcUrl} <br>
 
 <hr>  
  
   	<%--8. formating(일정한 형식주기 : 숫자3개마다 콤마찍기 등..) --%>
 
 	<c:set var="num1" value="123456789123" />
		<c:out value="${num1}" /> <br> <!-- num1 출력 -->
		<fmt:formatNumber value="${num1}" /> <!-- (숫자)포맷팅 출력 --><br>
		<fmt:formatNumber  value="${num1}" type ="currency" /> <!-- (통화)포맷팅 출력 --><br>
		
		<fmt:setLocale value="en_us"/>
		<fmt:formatNumber  value="${num1}" type ="currency" /> <!-- 달러 통화로 --><br>
<hr>

 	<%--9. 날짜 --%>
 	
 	<c:set var="today" value="<%=new java.util.Date() %>"/>
 	<h1><fmt:formatDate value="${today}" /></h1><br>
 	<h1><fmt:formatDate value="${today}" type ="time" /></h1><br>
     	<fmt:formatDate value="${today }" pattern="yyyy년 MM월 DD일 hh시 mm분 ss초"/><br />
        <fmt:formatDate value="${today }" pattern="yyyy년 MM월 DD일 EE요일 hh시 mm분 ss초"/><br />

</body>
</html>