<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>성적표</h1>

<hr>
국어 : ${gradeVO.kor}<br>
영어 : ${gradeVO.eng}<br>
수학 : ${gradeVO.math}<br>

<hr>
총점 : ${gradeVO.getTotal()}<br>
평균 : ${gradeVO.getAvg()}<br>
성적 : ${gradeVO.getGrade()}<br>

<%-- ${gradeVO.total}<br>
${gradeVO.avg}<br>
${gradeVO.grade}<br> --%>
<hr>

</body>
</html>