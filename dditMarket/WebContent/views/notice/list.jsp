<%@page import="com.sun.java_cup.internal.runtime.virtual_parse_stack"%>
<%@page import="kr.or.ddit.notice.vo.NoticeVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/css/styles.css" rel="stylesheet" />
<link href="/css/notice/noticelist.css" rel="stylesheet" />
<title>공지사항 전체리스트</title>
<style>
.btn-group {
	display: flex;
	align-items: center;
	border-radius: 20px;
	background-color: transparent;
	border: 2px solid black;
	margin-top: 10px;
	margin-bottom: 30px;
}

.btn-check {
	display: none;
}

.btn-group label {
	border: none;
	background-color: transparent;
	color: black;
	font-weight: bold;
	padding: 10px 20px;
	border-radius: 20px;
	text-align: center;
}

.btn-group .divider {
	width: 1px;
	background-color: black;
	height: 100%;
}

/* 버튼  */
.btn-two {
	color: #FFF;
	padding: 8px 12px;
	border: 0 none;
	font-weight: 700;
	letter-spacing: 1px;
	text-transform: uppercase;
}

.btn-two.green {
	background: #25a25a;
}

.btn-two.mini {
	font-size: 14px;
	padding: 10px 20px;
}
</style>
</head>
<body>
	<!-- Navigation-->
	<%@include file="/include/navigation.jsp"%>


	<%--  메인! --%>
	<div class="section section-properties">
		<div class="container">
			<div class="two_third first" style="height: auto">
				<%--  그림 헤더! --%>
				<div class="hero page-inner overlay" style="background-image: url(../image/dong.jpg"); height:50vh;">

					<div class="container">
						<div class="row justify-content-center align-items-center">
							<div class="col-lg-9 text-center mt-5">
								<h1 class="heading_signup" data-aos="fade-up"></h1>
							</div>
						</div>
					</div>
				</div>
				<!-- notice list area -->
				<table class="table table-hover" style="text-align: center">


					<!-- 라디오버튼 (공지사항,QnA)  -->
					<div class="btn-group" role="group">
						<input type="radio" class="btn-check" name="btnradio" id="btnradio1" autocomplete="off" onclick="location.href='<%=request.getContextPath()%>/noticelist.do'"> <label class="btn btn-secondary" for="btnradio1">공지사항</label>

						<div class="divider"></div>

						<input type="radio" class="btn-check" name="btnradio" id="btnradio2" autocomplete="off" onclick="location.href='<%=request.getContextPath()%>/qblist.do'"> <label class="btn btn-secondary" for="btnradio2">QnA</label>
					</div>
					<tr>
						<td colspan="5"><h2>
								<b>공지사항</b>
							</h2></td>
					</tr>

					<tr class="header" style="font-weight: bold";>
						<td class="num">No.</td>
						<td>작성자</td>
						<td class="title">제목</td>
						<td>작성일</td>
					</tr>
					<%
						List<NoticeVO> noticelist = (List<NoticeVO>) request.getAttribute("noticelist"); // controller 값 꺼내기
					if (noticelist != null) {
						for (int i = 0; i < noticelist.size(); i++) {
					%>
					<tr onclick="detail(<%=noticelist.get(i).getNotNo()%>)">
						<td><%=i + 1%></td>
						<td><%=noticelist.get(i).getAdminId()%></td>
						<td><%=noticelist.get(i).getNotTitle()%></td>
						<td><%=noticelist.get(i).getNotDy()%></td>
					</tr>
					<!-- 하이퍼링크  -->
					<!-- 		<tr> -->
					<%-- 			<td	style="text-align: center;" ><%=i + 1 %></td> --%>
					<%-- 			<td style="text-align: center;"><%=noticelist.get(i).getAdminId()%></td> --%>
					<%-- 			<td style="text-align: center;"><a href="<%=request.getContextPath() %>noticedetail.do?notNo=<%=noticelist.get(i).getNotNo()%>"><%=noticelist.get(i).getNotTitle()%></a></td> --%>
					<%-- 			<td style="text-align: center;"><%=noticelist.get(i).getNotDy() %></td> --%>
					<!-- 		</tr> -->
					<%
						}
					} else {
					%>
					<tr>
						<td colspan="4" style="text-align: center;">공지사항 없음</td>
					</tr>
					<%
						}
					%>
					<div class='wrap'>
						<!-- 	<h2>공지사항</h2> -->

						<%
							//관리자X 비회원O
						if (loginCd == null && adv == null) {
						%>
						<!-- 검색 -->
						<table>
							<tr>
								<form action="/noticelist.do" method="post">
									<br> <input type="text" name="searchnotice" value="" style="background-color: white; border-top-left-radius: 10px; border-bottom-left-radius: 10px; border-left-color: #E6E6E6; border-top-color: #E6E6E6; border-right-color: #929292; border-bottom-color: #929292;">
									<!-- name-> key값 키에 해당하는 값이searchnotice > vaule 값을 불려온다 getParmeter 그래서 name 중요하다. -->
									<input type="submit" value="검색" style="background-color: white border-top-right-radius: 20px; border-bottom-right-radius: 10px; border-top-right-radius: 10px; border-left-color: #929292; border-top-color: #929292; border-right-color: #E6E6E6; border-bottom-color: #E6E6E6; margin-bottom: 20px;">
								</form>
							</tr>
						</table>
						<%
							//회원O
						} else if (loginCd != null) {
						%>
						<table>
							<tr>
								<form action="/noticelist.do" method="post">
									<br> <input type="text" name="searchnotice" value="" style="background-color: white; border-top-left-radius: 10px; border-bottom-left-radius: 10px; border-left-color: #E6E6E6; border-top-color: #E6E6E6; border-right-color: #929292; border-bottom-color: #929292;  margin-left: 80%">
									<!-- name-> key값 키에 해당하는 값이searchnotice > vaule 값을 불려온다 getParmeter 그래서 name 중요하다. -->
									<input type="submit" value="검색" style="background-color: white border-top-right-radius: 20px; border-bottom-right-radius: 10px; border-top-right-radius: 10px; border-left-color: #929292; border-top-color: #929292; border-right-color: #E6E6E6; border-bottom-color: #E6E6E6; margin-bottom: 20px;">
								</form>
							<tr>
						</table>
						<%
							//관리자O
						} else if (adv != null) {
						%>
						<table>
							<tr>
								<form action="/noticelist.do" method="post">
									<br><input type="text" name="searchnotice" value="" style="background-color: white; border-top-left-radius: 10px; border-bottom-left-radius: 10px; border-left-color: #E6E6E6; border-top-color: #E6E6E6; border-right-color: #929292; border-bottom-color: #929292; margin-left: 80%">
									<!-- name-> key값 키에 해당하는 값이searchnotice > vaule 값을 불려온다 getParmeter 그래서 name 중요하다. -->
									<input type="submit" value="검색" style="background-color: white border-top-right-radius: 20px; border-bottom-right-radius: 10px; border-top-right-radius: 10px; border-left-color: #929292; border-top-color: #929292; border-right-color: #E6E6E6; border-bottom-color: #E6E6E6; margin-bottom: 20px;">
							</tr>
							</form>
						</table>
					</div>
					<!-- 등록하기(insert)버튼 -->

					<!-- <input class="dong" type="button" id="sellButton" title="공지사항 등록" value="등록하기" onclick="noticeinsert()"> -->

					<table>
						<tr>
							<td><button onclick="noticeinsert()" class="btn-two green mini">공지사항 등록</button></td>
						</tr>
					</table>
					<hr />
					<%
						} else
					%>
					<div class="hero page-inner overlay" style="background-image: url(../image/dong.jpg"); height:50vh;">

						<div class="container">
							<div class="row justify-content-center align-items-center">
								<div class="col-lg-9 text-center mt-5">
									<h1 class="heading_signup" data-aos="fade-up"></h1>
								</div>
							</div>
						</div>
					</div>
				</table>

			</div>
		</div>
	</div>
</body>
<!-- footer.jsp -->
<%@include file="/include/footer.jsp"%>
<script src="/js/scripts.js"></script>
<script>
	/*  onclick > detail */
	function detail(num) {
		location.replace("/noticedetail.do?notNo="+num);			
	}
	</script>
</html>