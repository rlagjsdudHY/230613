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
		<h1>카드 결제(트랜잭션의 이해)</h1>
		<hr>
		<form action="tranProc">
			<span>아이디</span> <input type="text" name="consumerId"> <br>
			<span>구매수량</span> <input type="text" name="amount"> <br>
			<span>아이디</span> 에러 발생 여부 <input type="text" name="error" value="0">
			<h3>1을 입력하면 에러가 발생합니다.</h3>
			<button>구매하기</button>
		</form>

	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.6.4.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>

