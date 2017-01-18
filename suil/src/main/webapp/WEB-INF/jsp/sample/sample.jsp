<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>sample</title>
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

<div class="container">
	<div class="jumbotron">
		
		<h3>sample table</h3>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>USER_ID</th>
					<th>USER_NM</th>
				</tr>
			</thead>
			<tbody>
			<c:choose>
			<c:when test="${fn:length(list) > 0 }">
				<c:forEach var="row" items="${list}">
				<tr>
					<td>${row.USER_ID }</td>
					<td>${row.USER_NM }</td>
				</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="2">No datas</td>
				</tr>
			</c:otherwise>
			</c:choose>
			</tbody>
		</table>
	</div>
</div>



<script type="text/javascript">
$(window).load(function(){
	console.log('==== window load function');
});


</script>
</body>
</html>