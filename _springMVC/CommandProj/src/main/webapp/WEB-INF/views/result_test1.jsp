<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Test1 Result</title>
</head>
<body>
	<h1>Test1�� ���</h1>
	<ul>
		<!-- request������ �̸��� �������� ������ �ձ��ڰ� �ҹ�����ä�� Ŭ������ ����ȴ�. -->
		<li>data1 : ${requestScope.testBean.data1}</li> 
		<li>data2 : ${requestScope.testBean.data2}</li>
	</ul>

</body>
</html>