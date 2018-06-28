<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Document</title>
</head>
<body>
	<form action="/memberList" method="POST" accept-charset="utf-8">
		<input type="checkbox" name="chId">ID
		<input type="checkbox" name="chPw">PW
		<input type="checkbox" name="chName">NAME
		<input type="checkbox" name="chAddr">ADDR
		<input type="submit" value="회원정보">
	</form>

	<%-- <form action="/memberList" method="POST" accept-charset="utf-8">
		<input type="checkbox" name="check" value="id">ID
		<input type="checkbox" name="check" value="pw">PW
		<input type="checkbox" name="check" value="name">NAME
		<input type="checkbox" name="check" value="addr">ADDR
		<input type="submit" value="회원정보">
	</form> --%>
</body>
</html>