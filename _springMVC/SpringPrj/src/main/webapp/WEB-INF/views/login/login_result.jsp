<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Login Result</title>
</head>
<body>
	<h1>로그인 성공</h1>
	
	<hr>
	ID : ${requestScope.loginBean.id}<br>
	PW : ${requestScope.loginBean.pw }<br>
</body>
</html>