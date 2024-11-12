<%@page import="kr.or.ddit.file.vo.AtchSmpleVO"%>
<%@page import="kr.or.ddit.board.sailvo.SailBoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String joinCd = (String) request.getAttribute("joinCode");
List<SailBoardVO> wantedboardList = (List<SailBoardVO>) request.getAttribute("wantedboardList");
List<AtchSmpleVO> smpleList = (List<AtchSmpleVO>) request.getAttribute("smpleList");
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />

<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="css/styles.css" rel="stylesheet" />
<!-- 정렬 -->

<!-- 폰트  -->
<link href="/css/font.css" rel="stylesheet" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Cute+Font&display=swap" rel="stylesheet">


</head>
<body>
	<!-- Navigation-->
	<%@include file="./include/navigation.jsp"%>
	<%
		if (joinCd == "join") {
	%>
	<%@include file="join.jsp"%>

	<%
		} else {
	%>
	<br />
<span class="cute-font-regular">
	<div class="text-center text-black">
		<h1 class="display-6 fw-bolder" style="font-size:40px">나의 찜 상품</h1>
	</div>

	<%
		int wantedboardSize = wantedboardList.size();
	if (wantedboardSize > 0) {
	%>
	<section class="py-5">
		<div class="container px-4 px-lg-5 mt-5">
			<div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
				<%
					for (SailBoardVO sbd : wantedboardList) {
				%>
				<div class="col mb-5">
					<div class="card h-100">
						<a class="navbar-brand" href="<%=request.getContextPath()%>/saleDetail.do?sale_no=<%=sbd.getSale_no()%>&mem_no=<%=loginCd.getMem_no()%>"> <%
 	for (AtchSmpleVO smpleVo : smpleList) {
 	if (smpleVo.getAtchFileId() == sbd.getAt_file_id()) {
 %> <!-- Product image--> <img class="card-img-top" src="<%=request.getContextPath()%>/download.do?atchFileId=<%=smpleVo.getAtchFileId()%>&fileSn=1" alt="..." style="width: 100%; height: 200px" /> <%
 	break;
 }
 }
 %> <!-- Product details-->
							<div class="card-body p-4">
								<div class="text-center">
									<!-- Product name-->
									<h5 class="fw-bolder">
										<%=sbd.getSale_title()%>
									</h5>
									<!-- Product price-->
									<%=sbd.getProd_price()%>원
								</div>
							</div> <!-- Product actions-->
							<div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
								<div class="text-center">
									<a class="btn btn-outline-dark mt-auto" href="/deletewant.do?sale_no=<%=sbd.getSale_no()%>">찜 삭제</a>
								</div>
							</div>
						</a>
					</div>
				</div>
				<%
					}
				%>
			</div>
		</div>

	</section>

	<%
		} else {
	%>
	<div class="text-center text-black" style="font-size: 40px; height: 300px">
		<h3>찜한 상품이 없습니다.</h3>
	</div>
	<%
		}
	}
	%>
</span>
	<br>
	<%@include file="./include/footer.jsp"%>
	<!-- Bootstrap core JS-->
	<!-- Core theme JS-->
	<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="js/scripts.js"></script>
</body>
</html>