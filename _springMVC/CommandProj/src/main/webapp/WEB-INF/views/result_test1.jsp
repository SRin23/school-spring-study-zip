<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Test1 Result</title>
</head>
<body>
	<h1>Test1의 결과</h1>
	<ul>
		<!-- request영역에 이름을 지정하지 않으면 앞글자가 소문자인채로 클래스가 저장된다. -->
		<li>data1 : ${requestScope.testBean.data1}</li> 
		<li>data2 : ${requestScope.testBean.data2}</li>
	</ul>

</body>
</html>