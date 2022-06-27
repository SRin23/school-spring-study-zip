<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>성적</title>
</head>
<body>
	<h1>성적구하기</h1>
	<ul>
		<li>이름 : ${requestScope.name}</li>
		<li>국어 : ${requestScope.korean}</li>
		<li>영어 : ${requestScope.english}</li>
		<li>수학 : ${requestScope.math}</li>
		<li>Spring : ${requestScope.spring}</li>
		<li>총합 : ${requestScope.total}</li>
		<li>평균 : ${requestScope.avg}</li>
	</ul>
</body>
</html>