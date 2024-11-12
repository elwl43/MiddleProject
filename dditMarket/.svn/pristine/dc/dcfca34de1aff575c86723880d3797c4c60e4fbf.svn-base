<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.notice.vo.NoticeVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
<link href="/css/styles.css" rel="stylesheet" />


<title>공지사항 상세보기</title>
<style>
 div {
	margin-left: auto;
	margin-right: auto;
} 
html, body {
     min-height: 300%;
}
*font size:9pt;
table thead tr td {background-color:gray;}


</style>

</head>
<body>
	<!-- Navigation-->
	<%@include file="/include/navigation.jsp"%>
	<%--  그림 헤더! --%>
	<div class="hero page-inner overlay" style="background-image: url(../image/dong.jpg"); height:60vh;">
								<div class="row justify-content-center align-items-center">
									<div class="col-lg-9 text-center mt-5">
										<h1 class="heading_signup" data-aos="fade-up"></h1>
									</div>
								</div>
						</div>

<%
	NoticeVO nv = (NoticeVO) request.getAttribute("nv");
%>
<hr/>
<div class="row" style="margin-bottom:20px; margin-left:1px;">
<div class="col-lg-12">
<h1 class="page-header">상세 페이지</h1>
<hr/>
</div>
</div>

<div class="panel" style="margin-left:1px;">
<div id="contAreaBox">
<div class="panel">
<div class="panel-body">
<form role="form" action="/board/create_action" method="post">
<div class="table-responsive" style="text-align:center;">
<table id="datatable-scroller"
	class="table table-bordered tbl_Form">
	<caption></caption>
	<colgroup>
		<col width="250px" />
		<col />
	</colgroup>
	<tbody>
		<tr>
			<th class="active" style="background:rgb(218, 231, 255)" >작성자</th>
			<td><%=nv.getAdminId() %></td>
		</tr>
		<tr>
			<th class="active" style="background:rgb(218, 231, 255)">제목</th>
			<td><%=nv.getNotTitle() %></td>
		</tr>
		<tr>
			<th class="active" style="background:rgb(218, 231, 255)">내용</th>
			<td><%=nv.getNotContent() %></td>
		</tr>
		<tr>
			<th class="active" style="background:rgb(218, 231, 255)">작성일</th>
			<td><%=nv.getNotDy() %></td>
		</tr>
	</tbody>
</table>
</div>
	</form>
</div>
</div>
</div>
</div>

	<!-- <!-- 목록(list)버튼  -->
<!--  	<input type="button" id="sellButton" title="공지사항 목록" value="목록" onclick="listNotice()">  -->
<!-- 	수정하기(update)버튼 -->
<!-- 	<input type="button" id="sellButton" title="공지사항 수정" value="수정" onclick="updateNotice()"> -->
<!-- 	삭제하기(dele)버튼 -->
<!-- 	<input type="button" id="sellButton" title="공지사항 삭제" value="삭제" onclick="deleteNotice()"> --> 
	
	<div>
	<%	//관리자X 비회원O
		if(loginCd == null && adv == null) {
	%>
		<button class="btn btn-secondary" onclick="listNotice()">목록</button>
	<%
		}else if (loginCd != null) {
	%>
		<button class="btn btn-secondary" onclick="listNotice()">목록</button>
	<%
		}else if (adv != null) {
	%>
		<button class="btn btn-secondary" onclick="listNotice()">목록</button>
		<a href ="<%=request.getContextPath() %>noticeupdate.do?notNo=<%=nv.getNotNo()%>" class="btn btn-warning">수정</a>
		<a href ="<%=request.getContextPath() %>noticedelete.do?notNo=<%=nv.getNotNo()%>" class="btn btn-danger" onclick="alert('삭제 완료!')">삭제</a>
 	<%
		}else
 	%>


	</div>
	<hr/>
	<%--  그림  footer --%>
	<div class="hero page-inner overlay" style="background-image: url(../image/dong.jpg"); height:50vh;">
								<div class="row justify-content-center align-items-center">
									<div class="col-lg-9 text-center mt-5">
										<h1 class="heading_signup" data-aos="fade-up"></h1>
									</div>
								</div>
						</div>
		
<!-- 		<button id="btn-delete" class="btn btn-danger">삭제</button> -->
		
		
	
	<!-- Footer-->
	<%@include file="/include/footer.jsp"%>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script src="/js/scripts.js"></script>
</body>
</html>