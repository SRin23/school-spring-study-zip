<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>����ó��</title>
<link href="./resources/css/main.css" type="text/css" rel="stylesheet" >
</head>
<body>
<h1>������ �Է��ϼ���</h1>
	<form action="score_result" method="post">
		<label>�̸�</label>&nbsp;&nbsp;<input type="text" placeholder="�̸�" name="name"><br>
		<label>����</label>&nbsp;&nbsp;<input type="text" placeholder="���� ����" name="korean"><br>
		<label>����</label>&nbsp;&nbsp;<input type="text" placeholder="���� ����" name="english"><br>
		<label>����</label>&nbsp;&nbsp;<input type="text" placeholder="���� ����" name="math"><br>
		<label>Spring</label>&nbsp;&nbsp;<input type="text" placeholder="Spring ����" name="spring"><br><br>
		<input type="submit" value="Ȯ��">
	</form>
</body>
</html>