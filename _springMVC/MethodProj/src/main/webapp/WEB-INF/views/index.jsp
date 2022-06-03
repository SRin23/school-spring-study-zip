<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Hi Spring MVC~</h1>
	<img src="img/1.svg" width="150" height="50" />
	<br>
	<hr>
	<a href="test1">test1 get</a>
	<br>
	<hr>
	<br>
	<form method="post" action="test2">
		<label>아이디</label> &nbsp; &nbsp; &nbsp; <input type="text"
			name="userid" /><br> <label>비밀번호</label> &nbsp; &nbsp; &nbsp; <input
			type="password" name="userPassword" /><br>
		<button type="submit">Login</button>
	</form>
	<br>
	<hr>
	<a href="test3">test3 get_post</a>
	<br>
	<hr>
	<a href="test4">test4 get</a>
	<br>
	<hr>
	<br>
	<form method="post" action="test5">
		<label>아이디</label> &nbsp; &nbsp; &nbsp; <input type="text"
			name="userid" /><br> <label>비밀번호</label> &nbsp; &nbsp; &nbsp; <input
			type="password" name="userPassword" /><br>
		<button type="submit">Login</button>
	</form>
	<br>
	<hr>
	<a href="./login.html">LOGIN</a>
	<br>
</body>
</html>