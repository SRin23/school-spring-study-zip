<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>더하기</title>
</head>
<body>
	<h1>1~10까지의 수를 더한 합 출력</h1>
	<%
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum+=i;
		}
	%>
	
	<h2>[정답 : <%= sum %>]</h2>
</body>
</html>