<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>foreach query</title>
</head>
<body>
	<form action="/search3" method="get" accept-charset="utf-8">
		<input type="checkbox" name="addr" value="서울시"> 서울시
		<input type="checkbox" name="addr" value="경기도"> 경기도
		<input type="checkbox" name="addr" value="전라도"> 전라도
		<input type="checkbox" name="addr" value="강원도"> 강원도
		<button type="submit">검색</button>
	</form>
</body>
</html>