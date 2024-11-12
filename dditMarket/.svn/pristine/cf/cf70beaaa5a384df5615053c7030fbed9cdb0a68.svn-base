<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
<link href="/css/styles.css" rel="stylesheet" />
<link href="/css/notice/noticeinsert.css" rel="stylesheet" />
<title><b>자주하는질문 등록</title>
</head>
<body>
<!-- Navigation-->
	<%@include file="/include/navigation.jsp"%>
	
	<div class="col-sm-8 text-left">
		<table class="table table-hover">
	
	<form action="/qbinsert.do" method="post" enctype="multipart/form-data">
			<table>
			<tr><td><h2><b>Q & A 등록</b></h2></td></tr>
			<tr><td class="header"><h5>Q&A Title<h5></h2></td></tr>	<!-- name="qnaTitle" key값 잘확인하기 value값에 값을 넣어서 키값에 대입해주는거 -->
			<tr><td><input type="text" placeholder="제목을 입력하세요" name="qnaTitle" value=""></td></tr> 
			<tr><td class="header"><h5>Q&A Comment.</h5></td></tr>		<!-- name="qnaTitle" key값 잘확인하기 value값에 값을 넣어서 키값에 대입해주는거 -->
			<tr><td><textarea placeholder="내용을 입력하세요." name="qnaContent"></textarea></td></tr>
			
		</table>
		<br>
			<div class="find-btn">
			<tr><td><input type="submit" value="등록" onclick="alert('작성 완료!')"></td></tr>
			
			<tr><td><button class="btn btn-secondary" onclick="qnaList()">뒤로가기</button></td></tr>
			</div>
		<br>
	
	

		
	</form>
	</table>
	</div>
	<script src="/js/scripts.js"></script>
</body>
	<!-- Footer-->
	<%@include file="/include/footer.jsp"%>
</html>