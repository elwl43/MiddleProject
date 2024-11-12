<%@page import="kr.or.ddit.board.sailvo.SailBoardVO"%>
<%@page import="kr.or.ddit.file.vo.AtchSmpleVO"%>
<%@page import="java.util.List"%>
<%@ page import="kr.or.ddit.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String joinCd = (String) request.getAttribute("joinCode"); // 회원가입을 진행중인 상태인지 아닌지 join 이면 회원가입을 진행중인 상태 null 이면 회원가입중이 아님
	List<SailBoardVO> sailboardList = (List<SailBoardVO>) request.getAttribute("sailboardList");
	List<AtchSmpleVO> smpleList = (List<AtchSmpleVO>) request.getAttribute("smpleList");
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />

<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="../css/styles.css" rel="stylesheet" />
<!-- 정렬 -->


<style>
/* 베너 스타일  */
.slider {
	width: 100%;
	overflow: hidden;
}

.slide {
	width: 100%;
}

.slide img {
	margin-left: 10%;
	width: 80%;
	display: block;
}

.btn { 
	width:200px;
	height:50px;
	display: inline-block;
}

body {
	background-color: #f8f9fa;
}

#sellButton {
	background-color: #6c757d;
	width:200px;
	height:50px;
}
/* 베너 스타일  끝*/
</style>
</head>
<body>

	<!-- Header-->
	<%@include file="../include/header.jsp"%>

	<!-- Navigation -->
	<%@include file="../include/navigation.jsp"%>
	<%
		if (joinCd == "join") {
	%>
	<%@include file="join.jsp"%>

	<%
		} else {
	%>
	
	<%
		int sailboardSize = sailboardList.size();
	if (sailboardSize > 0) {
	%>

	<!-- 베너 -->
	<div class="slider">
		<div class="slide">
			<img src="../image/banner2.gif">
		</div>
		<div class="slide">
			<img src="../image/banner1.gif">
		</div>
		<div class="slide">
			<img src="../image/banner3.png">
		</div>
	</div>
	<!-- 베너 끝  -->


	<div class="dropdown" style="left: 10%; width: 83%"> 
		<button class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">카테고리 선택</button>
		<ul class="dropdown-menu" id="Categories">
			<li><button class="dropdown-item" type="button" onclick="location.href='/index.do?prod_ctgy_id=1';">문구류</button></li>
			<li><button class="dropdown-item" type="button" onclick="location.href='/index.do?prod_ctgy_id=2';">전자제품</button></li>
			<li><button class="dropdown-item" type="button" onclick="location.href='/index.do?prod_ctgy_id=3';">가전제품</button></li>
			<li><button class="dropdown-item" type="button" onclick="location.href='/index.do?prod_ctgy_id=4';">여성의류</button></li>
			<li><button class="dropdown-item" type="button" onclick="location.href='/index.do?prod_ctgy_id=5';">남성의류</button></li>
			<li><button class="dropdown-item" type="button" onclick="location.href='/index.do?prod_ctgy_id=6';">신발</button></li>
			<li><button class="dropdown-item" type="button" onclick="location.href='/index.do?prod_ctgy_id=7';">가방/지갑</button></li>
			<li><button class="dropdown-item" type="button" onclick="location.href='/index.do?prod_ctgy_id=8';">시계</button></li>
			<li><button class="dropdown-item" type="button" onclick="location.href='/index.do?prod_ctgy_id=9';">쥬얼리</button></li>
			<li><button class="dropdown-item" type="button" onclick="location.href='/index.do?prod_ctgy_id=10';">스포츠/레저</button></li>
		</ul>
	<!-- 판매하기 -->
	<%
		if (loginCd == null) {
	%>
	<input type="button" id="sellButton" title="판매하기" value="판매하기" onclick="LoginStart()">
	<%
		} else {
	%>
	<input type="button" id="sellButton" title="판매하기" value="판매하기" onclick="boardInsert()">

	<%
		}
	%>
	</div>



	<section class="py-5">
		<div class="container px-4 px-lg-5 mt-5">
			<div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
				<%
					for (SailBoardVO sbd : sailboardList) {
				%>
				<div class="col mb-5">
					<div class="card h-100">
						<a class="navbar-brand" href="<%=request.getContextPath()%>/saleDetail.do?sale_no=<%=sbd.getSale_no()%>&mem_no=<%=sbd.getMem_no()%>"> <%
 	for (AtchSmpleVO smpleVo : smpleList) {
 		if (smpleVo.getAtchFileId() == sbd.getAt_file_id()) {
 %> 
 	<img class="card-img-top" src="<%=request.getContextPath()%>/download.do?atchFileId=<%=smpleVo.getAtchFileId()%>&fileSn=1" alt="..." style="width: 100%; height: 200px" /> <%
 	break;
 		}
 	}
 %> 				<!-- Product image--> <!-- Product details-->
							<div class="card-body p-4">
								<div class="text-center">
									<!-- Product name-->
									<h5 class="fw-bolder">
										<%=sbd.getSale_title()%>
									</h5>
									<!-- Product price-->
									<%=sbd.getProd_price()%>원
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
	<div class="text-center text-black">
		<h3>판매중인 상품이 없습니다.</h3>
	</div>
	<%
		}
	}
	%>

	<br>
	<!-- Footer-->
	<%@include file="../include/footer.jsp"%>

	<!-- Bootstrap core JS-->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="../js/scripts.js"></script>
	<script>
	/*  베너  script */
	 let currentSlide = 0;
	 const slides = document.querySelectorAll('.slide');
	 const slideCount = slides.length;
	  
	 function showSlide(n) {
	     slides.forEach(slide => slide.style.display = 'none');
	     slides[n].style.display = 'block';
	 }
	  
	 function nextSlide() {
	     currentSlide = (currentSlide + 1) % slideCount;
	     showSlide(currentSlide);
	 }
	  
	 function prevSlide() {
	     currentSlide = (currentSlide - 1 + slideCount) % slideCount;
	     showSlide(currentSlide);
	 }
	  
	 document.addEventListener('DOMContentLoaded', () => {
	     showSlide(currentSlide);
	     setInterval(nextSlide, 5000); // 5초 자동 슬라이드                
	 });
	 /* 베너 script 끝 */
	</script>
</body>
</html>
