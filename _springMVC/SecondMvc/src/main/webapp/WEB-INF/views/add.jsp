<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���ϱ�</title>
</head>
<body>
	<h1>1~10������ ���� ���� �� ���</h1>
	<%
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum+=i;
		}
	%>
	
	<h2>[���� : <%= sum %>]</h2>
</body>
</html>