<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>성적처리</title>
<link href="./resources/css/main.css" type="text/css" rel="stylesheet" >
</head>
<body>
<h1>성적을 입력하세요</h1>
	<form action="score_result" method="post">
		<label>이름</label>&nbsp;&nbsp;<input type="text" placeholder="이름" name="name"><br>
		<label>국어</label>&nbsp;&nbsp;<input type="text" placeholder="국어 점수" name="korean"><br>
		<label>영어</label>&nbsp;&nbsp;<input type="text" placeholder="영어 점수" name="english"><br>
		<label>수학</label>&nbsp;&nbsp;<input type="text" placeholder="수학 점수" name="math"><br>
		<label>Spring</label>&nbsp;&nbsp;<input type="text" placeholder="Spring 점수" name="spring"><br><br>
		<input type="submit" value="확인">
	</form>
</body>
</html>