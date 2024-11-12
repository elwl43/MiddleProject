<%@page import="kr.or.ddit.review.vo.IReviewVO"%>
<%@page import="kr.or.ddit.file.vo.AtchFileVO"%>
<%@page import="kr.or.ddit.board.vo.BoardVO"%>
<%@page import="kr.or.ddit.board.sailvo.SailBoardVO"%>
<%@page import="java.util.List"%>
<%@ page import="kr.or.ddit.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String joinCd = (String) request.getAttribute("joinCode");
SailBoardVO sbd = (SailBoardVO) request.getAttribute("sbd"); // 해당 게시판의 모든 정보
SailBoardVO memNm = (SailBoardVO) request.getAttribute("memNm");
IReviewVO irv = (IReviewVO) request.getAttribute("irv");
SailBoardVO salect = (SailBoardVO) request.getAttribute("salect");
AtchFileVO atchFileVO = (AtchFileVO) request.getAttribute("atchFileVO");
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<style>
#sail {
	margin-left: auto;
	margin-right: auto;
	margin-top: 100px;
}

.wantButton {
	background-color: #007BFF;
	color: white;
	border: none;
	padding: 20px 120px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
	border-radius: 4px;
}

.buyButton {
	background-color: #007BFF;
	color: white;
	border: none;
	padding: 20px 120px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
	border-radius: 4px;
}

#table2 {
	border-collapse: collapse;
	border: 1px solid #000;
	border-radius: 10px;
	border-style: hidden;
	box-shadow: 0 0 0 1px #000;
}

#table2 td {
	width: 200px;
	height: 50px;
	text-align: center;
	border: 1px solid #000;
	vertical-align: top; /* 위 */
	vertical-align: bottom; /* 아래 */
	vertical-align: middle; /* 가운데 */
}

#name {
	font-size: 20px;
}

.space {
	padding: 7px 0;
}

.sidenav {
	height: 100%;
	width: 0;
	position: fixed;
	z-index: 1;
	top: 0;
	right: 0;
	overflow-x: hidden;
	transition: 0.5s;
	padding-top: 60px;
}

.sidenav a {
	padding: 8px 8px 8px 32px;
	text-decoration: none;
	font-size: 25px;
	color: #363636;
	display: block;
	transition: 0.3s;
}

.sidenav a:hover {
	color: #A9CFE2;
}

.sidenav .closebtn {
	position: absolute;
	top: 0;
	right: 25px;
	font-size: 36px;
	margin-left: 50px;
}

#sail {
	margin-left: auto;
	margin-right: auto;
	margin-top: 100px;
}

.wantButton {
	background-color: #007BFF;
	color: white;
	border: none;
	padding: 20px 120px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
	border-radius: 4px;
}

.buyButton {
	background-color: #007BFF;
	color: white;
	border: none;
	padding: 20px 120px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
	border-radius: 4px;
}

.admindelete {
	background-color: red;
	color: white;
	border: none;
	padding: 20px 260px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
	border-radius: 4px;
}

.admindelete2 {
	background-color: #007BFF;
	color: white;
	border: none;
	padding: 10px 57px;
	text-align: center;
	text-decoration: none;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
	border-radius: 4px;
}

.buyButton2 {
	background-color: #007BFF;
	color: white;
	border: none;
	padding: 10px 57px;
	text-align: center;
	text-decoration: none;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
	border-radius: 4px;
}

#table2 {
	border-collapse: collapse;
	border: 1px solid #000;
	border-radius: 10px;
	border-style: hidden;
	box-shadow: 0 0 0 1px #000;
}

#table2 td {
	width: 200px;
	height: 50px;
	text-align: center;
	border: 1px solid #000;
	vertical-align: top; /* 위 */
	vertical-align: bottom; /* 아래 */
	vertical-align: middle; /* 가운데 */
}

#name {
	font-size: 20px;
}

.space {
	padding: 7px 0;
}

.sidenav {
	background-color: gray;
	height: 60%;
	width: 800px;
	position: fixed;
	z-index: 1;
	top: 0;
	right: -800px;
	overflow-x: hidden;
	transition: 0.5s;
	padding-top: 60px;
	height: 100%;
}

.sidenav a {
	padding: 8px 8px 8px 32px;
	text-decoration: none;
	font-size: 25px;
	color: #363636;
	display: block;
	transition: 0.3s;
}

.sidenav a:hover {
	color: #A9CFE2;
}

.sidenav .closebtn {
	position: absolute;
	top: 0;
	right: 25px;
	font-size: 36px;
	margin-left: 50px;
}

#reportModal_body a {
	padding: 8px 8px 8px 32px;
	text-decoration: none;
	font-size: 25px;
	color: #363636;
	display: block;
	transition: 0.3s;
}

#reportModal_body .closebtn {
	position: absolute;
	top: 0;
	right: 25px;
	font-size: 36px;
	margin-left: 50px;
	color: gray;
}

#main {
	transition: margin-left .5s;
	padding: 16px;
}

@media screen and (max-height: 450px) {
	.sidenav {
		padding-top: 15px;
	}
	.sidenav a {
		font-size: 18px;
	}
}

#reportModal {
	position: absolute;
	justify-content: center;
	top: 0;
	left: 0;
	width: 100%;
	height: 100%;
	background-color: rgba(0, 0, 0, 0.4);
}

#reportModal_body {
	position: absolute;
	left: 40%;
	top: 50%;
	width: 300px;
	height: 200px;
	padding: 40px;
	text-align: center;
	background-color: rgb(255, 255, 255);
	border-radius: 10px;
	box-shadow: 0 2px 3px 0 rgba(34, 36, 38, 0.15);
	transform: translateY(-50%);
}

#main {
	transition: margin-left .5s;
	padding: 16px;
}

@media screen and (max-height: 450px) {
	.sidenav {
		padding-top: 15px;
	}
	.sidenav a {
		font-size: 18px;
	}
}
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="/css/styles.css" rel="stylesheet" />
<link href="/css/review.css" rel="stylesheet" />
<!-- 정렬 -->
</head>
<body>
	<!-- Navigation -->
	<%@include file="/include/navigation.jsp"%>
	<%
		if (joinCd == "join") {
	%>

	<%@include file="/join.jsp"%>

	<%
		} else {
	%>
	<div id="sail" style="width: 70%; height: 1000px">
		<div style="float: left; margin-right: 50px;">
			<%
				if (atchFileVO != null) {
			%>
			<img src="<%=request.getContextPath()%>/download.do?atchFileId=<%=atchFileVO.getAtchFileId()%>&fileSn=1" alt="..." style="width: 600px; height: 600px; border-radius: 4%">
			<%
				}
			%>
		</div>
		<div style="float: left;">
			<div class="card-body">
				<div class="small text-muted">
					<b>작성일 : </b><%=irv.getREV_DY()%></div>
				<h2 class="card-title">
					<b>물품 : </b><%=irv.getPROD_NM()%></h2>
				<div class="small text-muted">
					<b>작성자 : </b><%=irv.getMEM_NM()%>
				</div>
				<p class="card-text">
					<b>내용 : </b><%=irv.getREV_CONTENT()%></p>
			</div>
		</div>
	</div>
	<%
		}
	%>

	<!-- Footer-->
	<%@include file="/include/footer.jsp"%>
	<!-- Bootstrap core JS-->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="../js/scripts.js"></script>
</body>
</html>
