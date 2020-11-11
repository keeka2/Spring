<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	div#box{
		width: 300px;
		height: 150px;
		border: 1px solid black;
	}
</style>
</head>
<body>
	<h1>Flask호출 연습</h1>
	<input type="button" value="플라스크 호출" id="req_bt"/>
	<input type="button" value="api 호출" id="req_bt2"/>
	<div id="box"></div><%--플라스크에서 전달해 오는 값을 출력하는 곳 --%>
	
	<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
	<script>
		$(function(){
			// 버튼에 이벤트 걸기
			$("#req_bt").bind("click", function(){
				//req_bt라는 아이디를 가진 버튼을 클릭했을 때마다 수행하는 곳!
				
				$.ajax({
					url: 'http://localhost:5000',
					type: 'get'
				}).done(function(data){
					//요청이 성공했을 때
					$("#box").html(data.code);
				});
			});
		});
		
		$(function(){
			// 버튼에 이벤트 걸기
			$("#req_bt2").bind("click", function(){
				//req_bt라는 아이디를 가진 버튼을 클릭했을 때마다 수행하는 곳!
				
				$.ajax({
					url: 'http://localhost:5000/evCar',
					type: 'get'
				}).done(function(data){
					//요청이 성공했을 때
					$("#box").html(data);
				});
			});
		});
		
		
	</script>
	
</body>
</html>









