<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>choose Query</title>
</head>
<body>
	<form action="/search" method="get">
		<input type="radio" name="select" value="name" checked>이름으로 검색
		<input type="radio" name="select" value="id">아이디로 검색
		입력 : <input type="text" name="keyword" placeholder="검색어 입력">
		<button type="submit">검색</button>
	</form>
</body>
</html>