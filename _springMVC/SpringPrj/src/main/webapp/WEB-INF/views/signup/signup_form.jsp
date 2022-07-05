<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원가입</title>
</head>
<body>
	<h1>회원가입</h1>
	<form action="signup_check" method="post">
		이름 : <input type="text" name="name"/><br>
		아이디 : <input type="text" name="id"/><br>
		비밀번호 : <input type="password" name="pw"/><br>
		생년월일 : <input type="text" name="birth"/><br>
		핸드폰 : <input type="text" name="tel"/><br>
		<input type="submit" value="제출"/><br>
	</form>
</body>
</html>