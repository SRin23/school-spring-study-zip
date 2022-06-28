<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>구구단</title>
</head>
<body>
	<h1>구구단의 단을 입력하세요</h1>
	<form action="multipli_result" method=post>
		<input type="text" placeholder="단을 입력하세요" name="data" required="required">
		<input type="submit" value="제출">
	</form>
</body>
</html>