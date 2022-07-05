<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원가입 결과</title>
</head>
<body>
	<h1>회원 정보</h1>
	이름 : ${requestScope.userInfo.name} <br>
	아이디 : ${requestScope.userInfo.id} <br>
	비밀번호 : ${requestScope.userInfo.pw} <br>
	생년월일 : ${requestScope.userInfo.birth} <br>
	핸드폰 : ${requestScope.userInfo.tel} <br>
	
	<a href="/SpringPrj/"><button>HOME</button></a>
</body>
</html>