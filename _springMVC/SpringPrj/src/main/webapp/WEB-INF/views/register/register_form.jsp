<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원가입</title>
</head>
<body>
	<form action="register_post" method="post">
		ID <input type="text" name="userId"/> <br>
		PW <input type="password" name="userPass"/> <br>
		NAME <input type="text" name="userName"/> <br>
		EMAIL <input type="email" name="userEmail"/> <br>
		TEL <input type="tel" name="userTel"/> <br>
		<input type="submit" value="제출"/>
	</form>
</body>
</html>