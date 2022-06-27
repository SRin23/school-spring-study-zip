<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>INDEX</title>
</head>
<body>
	<h1>Hi Spring MVC~</h1>
<!-- 	<img alt="Spring logo" src="./resources/img/1.svg"><br> -->
	<a href="test1?data1=100&data2=200">test1 MAP으로 받기</a><br>
	<a href="test2?data1=10&data2=20&data3=30&data3=40">test2 LIST로 받기</a><br>
	<a href="test3?data1=500&data2=600&data3=700">test3 Model객체로 받기</a><br>
	<a href="test4?data1=500&data2=600&data3=700&data3=800">test4 @ModelAttribute 배열 받기</a>
	
</body>
</html>