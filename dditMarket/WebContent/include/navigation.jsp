<%@page import="kr.or.ddit.admin.vo.AdminVO"%>
<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	MemberVO loginCd = (MemberVO) session.getAttribute("loginCode");
	AdminVO adv = (AdminVO) session.getAttribute("adminCode");
%>

<!DOCTYPE html>
<!-- 폰트  -->
<link href="/css/font.css?after" rel="stylesheet" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Cute+Font&display=swap" rel="stylesheet">


<form class=cute-font-regular>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<div class="container px-3 px-lg-4">
		
		<%
			if (loginCd == null) {
		%>
		<a class="navbar-brand" href="<%=request.getContextPath()%>/index.do" style="display: flex; align-items: center;">
    		<img alt="logo" src="../image/dditmarket.png" width="100px" height="120px" style="margin-right: 10px;">
   			 <h2 class="stylish-regular" style="font-weight: bold; font-size: 50px; margin-right: 20px;">대덕 마켓</h2>
		</a>
		<%
			} else {
		%>
<%-- 		<a class="navbar-brand" href="<%=request.getContextPath()%>/index.do"><%=loginCd.getMem_nm()%> 님 반갑습니다.</a> --%>
		<a class="navbar-brand" href="<%=request.getContextPath()%>/index.do" style="display: flex; align-items: center;">
    		<img alt="logo" src="../image/dditmarket.png" width="100px" height="120px" style="margin-right: 10px;">
   			 <h4 style="font-weight: bold; font-size: 50px">대덕 마켓</h4>
		</a>
		<%
			}
		%>

		<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<!-- search -->
			<form class="d-flex" role="search" style="margin: auto;" action="index.do" method="get" >
				<input class="form-control" type="search" placeholder="물품, 지역 검색하기" aria-label="Search" size="50%" name="search" value="" style="font-size: 20px; margin-right: 5px">
				<button class="btn btn-outline-success me-2" type="submit" style="font-size: 20px; height: auto;">검&nbsp;색</button>
			</form>
		</div>
		<div>
			<ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
				<%
					// 로그인을 안한 상태
				if (loginCd == null && adv == null) {
				%>
				<li class="nav-item"><a class="nav-link active" aria-current="page" href="/loginForm.jsp" style="font-size: 25px">문의게시판</a></li>
				<li class="nav-item"><a class="nav-link active" aria-current="page" href="<%=request.getContextPath()%>/loginForm.jsp"style="font-size: 25px">고객센터</a></li>
				<li class="nav-item"><a class="nav-link active" aria-current="page" href="<%=request.getContextPath()%>/loginForm.jsp"style="font-size: 25px">로그인</a></li>
				<%
					// 회원으로 로그인한 상태
				} else if (loginCd != null) {
				%>
   				 <li class="nav-item"><a class="nav-link active" aria-current="page" href="/Main" style="width: 130px; font-size: 25px";>문의게시판</a></li>
    			 <li class="nav-item"><a class="nav-link active" aria-current="page" href="<%=request.getContextPath()%>/noticelist.do" style="width: 110px; font-size: 25px;">고객센터</a></li>
   				 <li class="nav-item"><a class="nav-link active" aria-current="page" href="<%=request.getContextPath()%>/mprank.do" style="width: 130px; font-size: 25px;">마이페이지</a></li>
    			 <li class="nav-item" style=""><a class="nav-link active" aria-current="page" href="<%=request.getContextPath()%>/logout.do" style="width: 110px; font-size: 25px;">로그아웃</a></li>
				<%
					// 관리자로 로그인한 상태
				} else if (adv != null) {
				%>
				<li class="nav-item"><a class="nav-link active" aria-current="page" href="/Main" style="width: 130px; font-size: 25px;">문의게시판</a></li>
				<li class="nav-item"><a class="nav-link active" aria-current="page" href="<%=request.getContextPath()%>/noticelist.do" style="width: 110px; font-size: 25px;">고객센터</a></li>
				<li class="nav-item"><a class="nav-link active" aria-current="page" href="<%=request.getContextPath()%>/reportBoard.do" style="width: 120px; font-size: 25px;">신고 현황</a></li>
				<li class="nav-item"><a class="nav-link active" aria-current="page" href="<%=request.getContextPath()%>/logout.do" style="width: 110px; font-size: 25px;">로그아웃</a></li>
				<%
					} else
				%>
			</ul>
		</div>
	</div>
</nav>
</form>