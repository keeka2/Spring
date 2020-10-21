<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{
		width: 350px;
		border-collapse: collapse;
	}
	table th, table td{
		border: 1px solid black;
	}
</style>
</head>
<body>
	<h1>MyBatis-Spring과 비동기식 통신 연습</h1>
	
	<table id="t1">
		<colgroup>
			<col width="15%"/>
			<col width="20%"/>
			<col width="*"/>
		</colgroup>
		<thead>
			<tr>
				<td colspan="3">
					<input type="button" value="전체" id="total_btn"/>
				</td>
			</tr>
			<tr>
				<th>번호</th>
				<th>아이디</th>
				<th>이름</th>
			</tr>
		</thead>
		<tbody></tbody>
	</table>
	
	<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
	<script type="text/javascript">
		$(function(){
			//jQuery 시작 부분
			//아이디가 btn인 요소에서 클릭했을 대를 인식하는 이벤트
			
			$("#total_btn").bind("click", function(){
				//Controller 호출
				//data: 파라미터
				$.ajax({
					url: "total",
					type: "post",
				    dataType: "json"
				}).done(function(data){
					//서버에서 보내오는 자원이 data라는 인자다.
					console.log(data);
					var str="";
					for(var i=0;i<data.list.length;i++){
						str+="<tr><td>"+(i+1)+"</td><td>"+data.list[i].m_id+"</td><td>"+data.list[i].m_name+"</td></tr>";
					}
					$("#t1 tbody").html(str);
				});
			});
		});
	</script>
</body>
</html>