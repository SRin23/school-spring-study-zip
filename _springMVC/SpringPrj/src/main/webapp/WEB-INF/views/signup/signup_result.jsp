<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ������ ���</title>
</head>
<body>
	<h1>ȸ�� ����</h1>
	�̸� : ${requestScope.userInfo.name} <br>
	���̵� : ${requestScope.userInfo.id} <br>
	��й�ȣ : ${requestScope.userInfo.pw} <br>
	������� : ${requestScope.userInfo.birth} <br>
	�ڵ��� : ${requestScope.userInfo.tel} <br>
	
	<a href="/SpringPrj/"><button>HOME</button></a>
</body>
</html>