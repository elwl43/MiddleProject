<%@page import="java.text.DecimalFormat"%>
<%@page import="kr.or.ddit.file.vo.AtchFileVO"%>
<%@page import="kr.or.ddit.rank.vo.RankVO"%>
<%@page import="kr.or.ddit.board.sailvo.SailBoardVO"%>
<%@page import="kr.or.ddit.board.vo.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String joinCd = (String) request.getAttribute("joinCode");
	List<SailBoardVO> sailboardList = (List<SailBoardVO>) request.getAttribute("sailboardList");
	AtchFileVO atchFileVO = (AtchFileVO) request.getAttribute("atchFileVO");
	int scount = (Integer) request.getAttribute("scount");
	int totalPrice = (Integer) request.getAttribute("totalPrice");
	DecimalFormat formatter = new DecimalFormat("###,###");
%>
<!DOCTYPE html>
<html lang="en">
<meta charset="utf-8" />
<!-- <meta name="viewport" content="width=device-width, initial-scale=1"> -->
<head>
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"> -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="../css/styles.css" rel="stylesheet" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
<!-- 정렬 -->

<!-- 폰트  -->
<link href="/css/font.css" rel="stylesheet" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Cute+Font&display=swap" rel="stylesheet">



<style>
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
}
/* footer{
  position: absolute; //block요소가 inline레벨로 변경되어 보임 주의
} */
/* 푸터 스타일  끝*/
.my-page {
	width: 43vw;
	min-width: 900px;
	margin: 50px auto;
	margin-bottom: 0;
	background-color: #f5f5f5;
	padding: 30px;
	border-radius: 20px;
	box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
}

.my-page__title {
	font-weight: 700;
	font-size: 38px;
	margin-bottom: 83px;
	text-align: center;
	color: #333;
	font-weight: bold;
}

.my-page__profile {
	display: flex;
	justify-content: space-between;
	align-items: flex-start;
	margin-left: 100px;
}

.my-page-profile__image {
	width: 150px;
	height: 150px;
	border-radius: 50%;
	margin-bottom: 20px;
	border: 3px solid #4751FD;
}

.my-page-profile__nickname {
	display: block;
	font-weight: 700;
	font-size: 25px;
	color: #000000;
	margin-top: 10px;
	margin-bottom: 15px;
	text-align: center;
}

.my-transaction-info {
	margin-top: 24px;
	margin-right: 12px;
	width: 23vw;
	background-color: #fff;
	padding: 20px;
	border-radius: 10px;
	box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
}

.my-transaction-info__list {
	display: flex;
	justify-content: space-between;
	align-items: center;
	text-align: center;
	min-width: 260px;
}

.my-transaction-info__title {
	font-weight: 400;
	font-size: 22px;
	display: block;
	margin-bottom: 24px;
	color: #000000;
}

.my-transaction-info__content {
	font-weight: 700;
	font-size: 26px;
	color: #000000;
}

.my-page__introduction {
	margin-top: 19px;
	margin-bottom: 24px;
	font-weight: 400;
	font-size: 22px;
	min-height: 72px;
	max-height: 170px;
	overflow-y: scroll;
	color: #666;
}

.my-page__edit-buttons {
	margin-bottom: 85px;
	display: flex;
	justify-content: space-between;
	align-items: center;
}

.my-profile-edit, .my-info-edit {
	font-weight: 700;
	font-size: 19px;
	height: 57px;
	border-radius: 5px;
	cursor: pointer;
}

.my-profile-edit:active, .my-info-edit:active {
	opacity: 0.7;
}

.my-profile-edit {
	width: 27vw;
	border: 2px solid #4751FD;
	background-color: #4751FD;
	color: #fff;
	min-width: 310px;
}

.my-info-edit {
	width: 13.9vw;
	margin-right: auto;
	border: none;
	background-color: #EFEFEF;
	color: #444444;
	min-width: 220px;
}

/* 정보변경, 회원탈퇴 */
.transaction-history {
	width: 100%;
	display: flex;
	border-radius: 5px;
}

/* 구매 버튼*/
.transaction-history__purchase {
	font-weight: bold;
	width: 500%;
	font-weight: 700px;
	font-size: 22px;
	height: 80px;
	display: flex;
	justify-content: center;
	border-radius: 10px;
	align-items: center;
	cursor: pointer;
	background-color: #4751FD;
	color: #fff;
	margin-left: 10px;
	/*테두리 지우기  */
	border-right: none;
	border-left: none;
	border-top: none;
	border-bottom: none;
}
/* 판매버튼 */
.transaction-history__sale {
	font-weight: bold;
	width: 500%;
	font-weight: 700px;
	font-size: 22px;
	height: 80px;
	display: flex;
	justify-content: center;
	border-radius: 10px;
	align-items: center;
	cursor: pointer;
	background-color: #dc3545;
	color: #fff;
	margin-left: 10px;
	/*테두리 지우기  */
	border-right: none;
	border-left: none;
	border-top: none;
	border-bottom: none;
}

.transaction-history__sale:active, .transaction-history__purchase:active {
	opacity: 7;
}

.transaction-history__sale {
	border-right: 2px solid #fff;
}
/* 아이콘 */
.my-info-edit {
	background-color: #4751FD;
	color: #fff;
}
/* 구매,판매 아이콘 */
.transaction-history__purchase__icon, .transaction-history__sale__icon {
	margin-right: 30px;
}
</style>

</head>
<body>
	<!-- Navigation -->
	<%@include file="./include/navigation.jsp"%>
	<div id="wrap"  class=cute-font-regular>
		<div id="container">
			<main class="container__inner">
				<article class="my-page">
					<h2 class="my-page__title" style="font-size: 80px">마이페이지</h2>

					<div class="my-page__profile">
						<div class="my-page-profile">
							<img src="../image/basic-profile-.png" alt="프로필 사진" class="my-page-profile__image" /> <span class="my-page-profile__nickname" style="font-size: 30px"><%=loginCd.getMem_nm()%></span>
						</div>
						<div class="my-transaction-info">
							<ul class="my-transaction-info__list">
								<li class="my-transaction-info__item"><span class="my-transaction-info__title" style="font-size: 25px">거래건수</span> <span class="my-transaction-info__content"><%=scount%></span></li>
								<li class="my-transaction-info__item"><span class="my-transaction-info__title" style="font-size: 25px">이번 달 전체거래</span> <span class="my-transaction-info__content"><%=formatter.format(totalPrice)%></span></li>
								<li class="my-transaction-info-item"><span class="my-transaction-info__title" style="font-size: 25px">회원등급</span> <span class="my-transaction-info__content"><img src="<%=request.getContextPath()%>/download.do?atchFileId=<%=atchFileVO.getAtchFileId()%>&fileSn=1" alt="..." style="width: 50px; height: 50px; border-radius: 4%"></span></li>
							</ul>
						</div>
					</div>

					<br />


					<div class="my-page__edit-buttons">
						<button class="transaction-history__purchase" type="button" data-bs-toggle="dropdown" aria-expanded="false">
							<i class="fas fa-shopping-cart transaction-history__purchase__icon"></i>
							<!-- 아이콘 -->
							<span class="transaction-history__purchase__text" style="font-size: 40px">구매</span>
						</button>
						<ul class="dropdown-menu" id="Categories">
							<li><button class="dropdown-item" type="button" onclick="location.href='/myWant.do';" style="font-size: 20px" >찜 목록</button></li>
							<li><button class="dropdown-item" type="button" onclick="location.href='/myBuy.do';" style="font-size: 20px">구매 내역</button></li>
						</ul>
						<button class="transaction-history__sale" type="button" data-bs-toggle="dropdown" aria-expanded="false">
							<i class="fas fa-dollar-sign transaction-history__sale__icon"></i> <span class="transaction-history__sale__text" style="font-size: 40px">판매</span>
						</button>
						<ul class="dropdown-menu" id="Categories">
							<li><button class="dropdown-item" type="button" onclick="location.href='/mySold.do';" style="font-size: 20px">판매 내역</button></li>
							<li><button class="dropdown-item" type="button" onclick="location.href='/mySailng.do';"style="font-size: 20px">내 상품</button></li>
						</ul>
					</div>
					<div class="transaction-history">
						<div class="dropdown" style="left: 18%; width: 80%">
							<button type="button" class="my-info-edit" onclick="location.href='/myreview.do?mem_no=<%=loginCd.getMem_no()%>'">
								<span class="my-info-edit__text" style="font-size: 30px">나의 리뷰</span>
							</button>
							<button type="button" class="my-info-edit" onclick="location.href='/recentpage.do?mem_no=<%=loginCd.getMem_no()%>'" style="background-color: #dc3545;">
								<span class="my-info-edit__text"style="font-size: 30px">최근 본 상품</span>
							</button>
						</div>
					</div>
					<br />
					<div class="transaction-history">
						<div class="dropdown" style="left: 18%; width: 80%">
							<button type="button" class="my-info-edit" onclick="location.href='memViews/updateMemberInfo.jsp'">
								<i class="fas fa-cog my-info-edit__icon"></i> <span class="my-info-edit__text" style="font-size: 25px">회원 정보 변경</span>
							</button>
							<button type="button" class="my-info-edit" onclick="location.href='memViews/memDel.jsp'" style="background-color: #dc3545;">
								<i class="fas fa-sign-out-alt my-info-edit__icon"></i> <span class="my-info-edit__text" style="font-size: 25px">회원탈퇴</span>
							</button>
						</div>
					</div>
				</article>
			</main>
		</div>
	</div>
	<br />
	<%@include file="./include/footer.jsp"%>
	<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
	<!-- Bootstrap core JS-->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="js/scripts.js"></script>
</body>
</html>