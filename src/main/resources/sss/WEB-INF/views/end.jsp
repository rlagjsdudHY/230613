<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Document</title>
<link rel="stylesheet" href="/style/style.css">
<style>
</style>
</head>
<body>
	<div id="wrap">
		<h1>종료 페이지입니다.(트랜잭션의 이해)</h1>
		<hr>
		<h3>ID : ${consumerId}</h3>
		<h3>구매수량 : ${amount}</h3>
		<h3>데이터베이스에서 입력값을 확인하세요.</h3>
		<a href="/input">입력페이지</a>

	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.6.4.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>

