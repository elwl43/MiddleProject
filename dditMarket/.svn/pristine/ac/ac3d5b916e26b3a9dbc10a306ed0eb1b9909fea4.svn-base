<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
<link href="/css/styles.css" rel="stylesheet" />
<link href="/css/notice/noticeinsert.css" rel="stylesheet" />
<title>공지사항 등록</title>
</head>
<body>
<!-- Navigation-->
	<%@include file="/include/navigation.jsp"%>
	
	<div class="col-sm-8 text-left">
		<table class="table table-hover">
	
	<form action="/noticeinsert.do" method="post" enctype="multipart/form-data">
		<table>
			<tr><td><h2><b>공지사항 등록</b></h2></td></tr>
			<tr><td class="header"><h5>Title<h5></h2></td></tr>
			<tr><td><input type="text" placeholder="제목을 입력하세요" name="notTitle" value=""></td></tr>
			<tr><td class="header"><h5>Comment</h5></td></tr>
			<tr><td><textarea placeholder="내용을 입력하세요." name="notContent"></textarea></td></tr>
			
		</table>
		<br>
			<div class="find-btn">
			<tr><td><input type="submit" value="등록" onclick="alert('작성 완료!')"></td></tr>
			
			<tr><td><button class="btn btn-secondary" onclick="listNotice()">뒤로가기</button></td></tr>
			</div>
		<br>
<!-- 		<table> -->
<!-- 			<tr> -->
<!-- 				<td>공지사항 제목</td> -->
<!-- 				<td><input type="text" name="notTitle" value=""></td> -->
<!-- 			</tr>  -->
<!-- 			<tr> -->
<!-- 				<td>공지사항 내용</td> -->
<!-- 				<td><textarea name="notContent"> </textarea></td> -->
<!-- 			</tr>	 -->
<!-- 		</table> -->
<!-- 		<input type="submit" value="공지사항 등록"> -->
		
	</form>
	</table>
	</div>
	<!-- Footer-->
	<%@include file="/include/footer.jsp"%>
</body>
</html>