<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>����</title>
</head>
<body>
	<h1>�������ϱ�</h1>
	<ul>
		<li>�̸� : ${requestScope.name}</li>
		<li>���� : ${requestScope.korean}</li>
		<li>���� : ${requestScope.english}</li>
		<li>���� : ${requestScope.math}</li>
		<li>Spring : ${requestScope.spring}</li>
		<li>���� : ${requestScope.total}</li>
		<li>��� : ${requestScope.avg}</li>
	</ul>
</body>
</html>