<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>trim Query</title>
</head>
<body>
	<form action="/search2" method="get">
		이름 : <input type="text" name="userName" placeholder="이름입력"><br>
		주소 : <input type="text" name="userAddr" placeholder="주소입력"><br>
		<button type="submit">검색</button>
	</form>
</body>
</html>