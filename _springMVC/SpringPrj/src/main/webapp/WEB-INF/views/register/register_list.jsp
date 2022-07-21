<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ�����</title>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>EMAIL</th>
			<th>HP</th>
			<th>ETC</th>	
		</tr>
		<c:forEach var="value" items="${list}">
			<tr>
				<td>${value.userId}</td>
				<td>${value.userName}</td>
				<td>${value.userEmail}</td>
				<td>${value.userTel}</td>
				<td><a href="update?userId=${value.userId}">����</a> / <a href="delete?userId=${value.userId}">����</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>