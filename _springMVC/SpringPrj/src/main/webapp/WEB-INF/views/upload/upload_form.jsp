<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Upload</title>
</head>
<body>
	<h1>Upload Form</h1>
	<form action="upload" method="post" enctype="multipart/form-data">
		���� ���ε� <input type="file" name="file"/><br>
		<input type="submit" value="����"/>
	</form>
</body>
</html>