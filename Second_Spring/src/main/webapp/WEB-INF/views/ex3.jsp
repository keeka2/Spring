<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>★인자 전달식★</h1>
	<form action="ex3_1" method="post">
		<label for="s_id">ID:</label>
		<input type="text" id="s_id" name="id"/><br/>
		<label for="s_pw">PW:</label>
		<input type="password" id="s_pw" name="pw"/><br/>
		<input type="button" value="login" onclick="login()"/>
	</form>
	
	<script type="text/javascript">
		function login(){
			document.forms[0].submit();
		}
	</script>
</body>
</html>