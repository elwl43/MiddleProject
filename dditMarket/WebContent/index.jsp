<%@page import="kr.or.ddit.board.sailvo.SailBoardVO"%>
<%@page import="kr.or.ddit.file.vo.AtchSmpleVO"%>
<%@page import="java.util.List"%>
<%@ page import="kr.or.ddit.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String joinCd = (String) request.getAttribute("joinCode"); // 회원가입을 진행중인 상태인지 아닌지 join 이면 회원가입을 진행중인 상태 null 이면 회원가입중이 아님
List<SailBoardVO> sailList = (List<SailBoardVO>) request.getAttribute("sailList");
List<AtchSmpleVO> smpleList = (List<AtchSmpleVO>) request.getAttribute("smpleList");
String loginSuccess = (String) request.getAttribute("loginSuccess") == null ? "log" : (String) request.getAttribute("loginSuccess");
String inserting = (String) request.getAttribute("inserting") == null ? "log" : (String) request.getAttribute("inserting");
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" /> -->
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"> -->
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

.btn {
	width: 200px;
	height: 50px;
	display: inline-block;
}

body {
	background-color: #f8f9fa;
	/* 	min-height: 100%; */
}

#sellButton {
	background-color: #6c757d;
	width: 200px;
	height: 50px;
	font-size: 1rem;
}
/* 베너 스타일  끝*/

/* 푸터 스타일 */
.footer {
	background-color: #343a40;
	color: white;
	/* padding: 10px 0; */
	/* position:absolute; */
}

.footer a {
	color: #d1d1d1;
	text-decoration: none;
}

.footer a:hover {
	color: #ffffff;
	text-decoration: underline;
}

.footer .social-icons a {
	margin: 0 10px;
	color: #d1d1d1;
}

.footer .social-icons a:hover {
	color: #ffffff;
}

.footer .footer-links {
	margin-bottom: 30px;
}

.footer .footer-links ul {
	list-style: none;
	padding: 0;
}

.footer .footer-links ul li {
	margin-bottom: 10px;
}

.footer .footer-links ul li a {
	color: #d1d1d1;
	text-decoration: none;
}

.footer .footer-links ul li a:hover {
	color: #ffffff;
	text-decoration: underline;
}

.footer .contact-info {
	margin-bottom: 30px;
}

.footer .contact-info p {
	margin: 0;
	margin-bottom: 10px;
}

.footer .contact-info p i {
	margin-right: 10px;
}/* 전체 섹션 스타일 */
.py-5 {
  padding-top: 3rem !important;
  padding-bottom: 3rem !important;
}

/* 카드 스타일 */
.card {
  border: none;
  box-shadow: 0 0.5rem 1rem rgba(0, 0, 0, 0.15);
  transition: transform 0.3s ease-in-out;
}

.card:hover {
  transform: translateY(-0.25rem);
}

.card-img-top {
  object-fit: cover;
  height: 200px;
}

.card-body {
  padding: 1.5rem;
}

.card-title {
  font-size: 1.25rem;
  font-weight: 600;
}

.card-text {
  font-size: 0.9rem;
  color: #6c757d;
}

/* 가격 스타일 */
.price {
  font-size: 1.1rem;
  font-weight: 600;
  color: #343a40;
}
/* footer{
  position: absolute; //block요소가 inline레벨로 변경되어 보임 주의
} */
/* 푸터 스타일  끝*/
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
		int sailSize = sailList.size();
	if (sailSize > 0) {
	%>
<span class=cute-font-regular>
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
<span class=cute-font-regular> <!-- 폰트  -->

	<div class="dropdown" style="display: flex; margin-left: 10%; margin-right: 1%; margin-top: 10px;">
		<button class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false" style="font-size: 30px" >카테고리 선택</button>
		<ul class="dropdown-menu" id="Categories" style="font-size: 20px">
			<li><button class="dropdown-item" type="button" onclick="location.href='/index.do?prod_ctgy_id=1';">문구류</button></li>
			<li><button class="dropdown-item" type="button" onclick="location.href='/index.do?prod_ctgy_id=2';">전자제품</button></li>
			<li><button class="dropdown-item" type="button" onclick="location.href='/index.do?prod_ctgy_id=3';">가전제품</button></li>
			<li><button class="dropdown-item" type="button" onclick="location.href='/index.do?prod_ctgy_id=4';">의류</button></li>
			<li><button class="dropdown-item" type="button" onclick="location.href='/index.do?prod_ctgy_id=5';">신발</button></li>
			<li><button class="dropdown-item" type="button" onclick="location.href='/index.do?prod_ctgy_id=6';">가방/지갑</button></li>
			<li><button class="dropdown-item" type="button" onclick="location.href='/index.do?prod_ctgy_id=7';">시계</button></li>
			<li><button class="dropdown-item" type="button" onclick="location.href='/index.do?prod_ctgy_id=8';">쥬얼리</button></li>
			<li><button class="dropdown-item" type="button" onclick="location.href='/index.do?prod_ctgy_id=9';">스포츠/레저</button></li>
		</ul>
		<!-- 판매하기 -->
		<%
			if (loginCd == null) {
		%>
		<input type="button" id="sellButton" title="판매하기" value="판매하기" onclick="LoginStart()"  style="font-size: 30px">
		<%
			} else {
		%>
		<input type="button" id="sellButton" title="판매하기" value="판매하기" onclick="boardInsert()" style="font-size: 30px">

		<%
			}
		%>
	</div>



	<section class="py-5">
		<div class="container px-4 px-lg-5 mt-5">
			<div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
				<%
					for (SailBoardVO sbd : sailList) {
				%>
				<div class="col mb-5">
					<div class="card h-100">
						<a class="navbar-brand" href="<%=request.getContextPath()%>/saleDetail.do?sale_no=<%=sbd.getSale_no()%>&mem_no=<%=sbd.getMem_no()%>"> <%
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
									<br>
									<%=sbd.getLoc() %>
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
	<span class=cute-font-regular>
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
<span class=cute-font-regular> <!-- 폰트  -->
	<div class="text-center text-black">
	<div class="dropdown" style="display: flex; margin-left: 10%; margin-right: 1%; margin-top: 10px;">
		<button class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false" style="font-size: 30px" >카테고리 선택</button>
		<ul class="dropdown-menu" id="Categories" style="font-size: 20px">
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
		<input type="button" id="sellButton" title="판매하기" value="판매하기" onclick="LoginStart()"  style="font-size: 30px">
		<%
			} else {
		%>
		<input type="button" id="sellButton" title="판매하기" value="판매하기" onclick="boardInsert()" style="font-size: 30px">

		<%
			}
		%>
	</div>
		<h3>판매중인 상품이 없습니다.</h3>
	</div>
	<%
		}
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
	
	<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
	<script>
	 if('<%=inserting%>' == 'fail'){
			Swal.fire({
				  icon: "error",
				  title: "글 등록 실패",
				  text: "빈칸을 모두 채워주세요.",
			});
	 };
		 
		 if('<%=inserting%>' == 'success'){
				Swal.fire({
					  icon: "success",
					  title: "글 등록 성공",
				});
			 };
	
	
	 if('<%=loginSuccess%>' == 'loginSuccess'){
		Swal.fire({
			  icon: "success",
			  title: "로그인 성공",
		});
	 };
	
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
