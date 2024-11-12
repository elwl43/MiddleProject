<%@page import="kr.or.ddit.board.sailvo.SailBoardVO"%>
<%@page import="kr.or.ddit.file.vo.AtchSmpleVO"%>
<%@page import="java.util.List"%>
<%@ page import="kr.or.ddit.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String joinCd = (String) request.getAttribute("joinCode"); // 회원가입을 진행중인 상태인지 아닌지 join 이면 회원가입을 진행중인 상태 null 이면 회원가입중이 아님
List<SailBoardVO> recentPage = (List<SailBoardVO>) request.getAttribute("recentPage");
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

<!-- 폰트  -->
<link href="/css/font.css" rel="stylesheet" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Cute+Font&display=swap" rel="stylesheet">

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
/* 베너 스타일  끝*/
</style>
</head>
<body>
	<!-- Navigation-->
	<%@include file="./include/navigation.jsp"%>
	<br />
<span class="cute-font-regular">
	<div class="text-center text-black">
		<h1 class="display-6 fw-bolder" style="font-size: 45px" >최근 본 상품</h1>
	</div>

	<%
		int recentPageSize = recentPage.size();
	if (recentPageSize > 0) {
	%>
	<section class="py-5">
		<div class="container px-4 px-lg-5 mt-5">
			<div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
				<%
					for (SailBoardVO sbd : recentPage) {
				%>
				<div class="col mb-5">
					<div class="card h-100">
						<a class="navbar-brand" href="<%=request.getContextPath()%>/saleDetail.do?sale_no=<%=sbd.getSale_no()%>&mem_no=<%=loginCd.getMem_no()%>"> <%
 	for (AtchSmpleVO smpleVo : smpleList) {
 	if (smpleVo.getAtchFileId() == sbd.getAt_file_id()) {
 %> <img class="card-img-top" src="<%=request.getContextPath()%>/download.do?atchFileId=<%=smpleVo.getAtchFileId()%>&fileSn=1" alt="..." style="width: 100%; height: 200px" /> <%
 	break;
 }
 }
 %> <!-- Product image--> <!-- Product details-->
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
		<h3>최근 본 상품이 없습니다.</h3>
	</div>
	<%
		}
	%>
</span>
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
