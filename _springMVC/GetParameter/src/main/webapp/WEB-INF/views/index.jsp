<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Welcome</title>
	</head>
	<body>
		<a href="test1?data1=100&data2=200">test1</a>
		<!-- �迭�������� data3�� ���� �� -->
		<a href="test2?data1=100&data2=200&data3=300&data3=400">test2</a>
		<a href="test3?data1=10&data2=20&data3=30">test3 WebRequest</a>
		
		<!-- PathVariable ���� test4/100/200/300�ش� URL�� ���� ���丮�� �ƴ�, �����ͷ� �ν��� -->
		<a href="test4/100/200/300">test4 PathVariable</a><hr>
		
		<!-- RequestParam�� ���� ����Ѵ�. -->
		<a href="test5?data1=100&data2=200&data3=300&data3=400&data3=500&data4=600">test5 RequestParam</a>
	</body>
</html>