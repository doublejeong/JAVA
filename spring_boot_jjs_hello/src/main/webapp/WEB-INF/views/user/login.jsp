<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/user/confirm" method="POST">
		id:<input type="text" name="id"><br>
		password:<input type="text" name="pw"><br>
		<input type="submit" value="send">
	</form>
</body>
</html>