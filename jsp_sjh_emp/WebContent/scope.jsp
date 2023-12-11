<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
   <form action="ok.jsp" method="get">
      아이디: <input type="text" name="id"><br />
      패스워드 : <input type="password" name="pw">
      <input type="submit" value="login">
   </form> -->
   
<% // 4개의 메모리영역에(저장하는성질이달라) 키값형태로 객체가 들어감
	application.setAttribute("application_name", "application_value"); //어플리케션이끝날때까지 유지(톰캣스탑까지)
	session.setAttribute("session_name", "session_value"); //톰캣이지정하는그시간까지(30분)
	pageContext.setAttribute("page_name", "page_value"); //자기거만 써먹을 수 있다
	request.setAttribute("request_name", "request_value");//포워딩까지	
%>

	<jsp:forward page="ok.jsp"/> <!-- 리퀘스트 객체는 포워딩까지 -->
	
<!-- el로 저장한 객체 호출 -->
   applicationScope : ${ applicationScope.application_name }<br />
   sessionScope : ${ sessionScope.session_name }<br />
   pageScope : ${ pageScope.page_name }<br />
   requestScope : ${ requestScope.request_name }

</body>
</html>