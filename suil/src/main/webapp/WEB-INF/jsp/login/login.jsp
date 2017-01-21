<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>suil</title>
<!-- 여기부터 head 까지 항상 가지고 가야되는 부분 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 				prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" 				prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" 		prefix="fn" %>
<!-- jquery 최신버전  -->
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
<form method="post" name="form" id="form">
<div class="container">
	<h3>로그인 하세요</h3>
	<div class="jumbotron">
		
		<div class="form-group">
			<input type="text" class="form-control" name="user_id" id="user_id" placeholder="아이디를 입력하세요">
			<input type="password" class="form-control" name="user_pw" id="user_pw" placeholder="비밀번호를 입력하세요"/>
			<button id="login_btn" class="btn btn-default">로그인</button>
		</div>
		
	</div>
</div>
</form>


<script type="text/javascript">
$(window).load(function(){
	$('#login_btn').live('click', function(){
		fnLoginCheck();
	});
});

function fnLoginCheck(){
	console.log('=== function fnLoginCheck loaded');
	// 기존 방식
	//var id = $('#loginId').val();
	//var pw = $('#loginPw').val();
	
	$.ajax({
		url 	: '/login/loginCheck.do',
		type 	: 'post',
		data 	: $('#form').serialize(),
		dataType:'json',
		async 	: true,
		success : function(data){
			var url = '';
			$(location).attr('href', url);
		},
		error : function(request, status, error){
			alert('로그인 실패!');
		}
	});
	
}

</script>
</body>
</html>