<%@page import="java.text.DecimalFormat"%>
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
SailBoardVO salect = (SailBoardVO) request.getAttribute("salect");
AtchFileVO atchFileVO = (AtchFileVO) request.getAttribute("atchFileVO");
AtchFileVO atchFileVOs = (AtchFileVO) request.getAttribute("atchFileVOs");
int wantCount = (Integer) request.getAttribute("wantCount");
if (wantCount < 0) {
	wantCount = 0;
}
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
	width: 2000px;
	height: 1500px;
	background-color: rgba(0, 0, 0, 0.4);
}

#reportModal_body {
	position: absolute;
	left: 40%;
	top: 30%;
	width: 300px;
	height: 200px;
	padding: 40px;
	text-align: center;
	background-color: rgb(255, 255, 255);
	border-radius: 10px;
	box-shadow: 0 2px 3px 0 rgba(34, 36, 38, 0.15);
	transform: translateY(-50%);
}
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="../css/styles.css?after" rel="stylesheet" />
<!-- 정렬 -->

<!-- 폰트  -->
<link href="/css/font.css" rel="stylesheet" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Cute+Font&display=swap" rel="stylesheet">



</head>
<body>
	<!-- Navigation -->
	<%@include file="../include/navigation.jsp"%>

	<!-- Header-->
	<%@include file="../include/header.jsp"%>

	<%
		if (joinCd == "join") {
	%>

	<%@include file="join.jsp"%>

	<%
		} else {
	%>

	<!-- 판매하기 -->
	<span class="cute-font-regular"> <input type="button" id="sellButton" title="판매하기" value="판매하기" onclick="boardInsert()">
		<div id="sail" style="width: 70%; height: 1000px">
			<%
				if (loginCd != null) {
			%>
			<form action="<%=request.getContextPath()%>/insertWant.do?sale_no=<%=sbd.getSale_no()%>&mem_no=<%=loginCd.getMem_no()%>" method="post" enctype="multipart/form-data">
				<%
					}
				%>
				<div style="float: left; margin-right: 50px;">
					<%
						if (atchFileVO != null) {
					%>
					<img src="<%=request.getContextPath()%>/download.do?atchFileId=<%=atchFileVO.getAtchFileId()%>&fileSn=1" alt="..." style="width: 600px; height: 600px; border-radius: 4%">
					<%
						}
					%>
				</div>
				<div style="float: left; font-size: 20px;">
					<table>
						<tr>
							<td style="font-size: 15px"><%=salect.getPROD_CTGY_NM()%> > <%=sbd.getProd_nm()%></td>
						</tr>
						<tr>
							<td colspan=3 class="space"></td>
						</tr>
						<tr>
							<td colspan="2"><h1><%=sbd.getSale_title()%></h1></td>
						</tr>
						<tr>
							<td colspan="2"><h1><%=sbd.getProd_price()%>원
								</h1></td>
						</tr>
						<tr>
							<td colspan=3 class="space"></td>
						</tr>
						<tr>
							<td id="name" onclick="location.replace('/reviewlist.do?mem_no=<%=sbd.getMem_no()%>')" style="font-size: 20px">판매자 : <%=memNm.getMem_nm()%><img src="<%=request.getContextPath()%>/download.do?atchFileId=<%=atchFileVOs.getAtchFileId()%>&fileSn=1" alt="..." style="width: 70px; height: 70px; border-radius: 4%"></td>
							<td><button id="btnOpenModal" type="button" style="border: none; background-color: transparent;">
									<img src="../image/siren.png" alt="" width="30px" height="30px">
								</button></td>
						</tr>
						<tr>
							<td colspan=3 class="space"></td>
						</tr>
						<table id="table2">
							<tr>
								<td style="border-right: none; border-bottom: none;"></td>
								<td style="border-left: none; border-right: none; border-bottom: none;"></td>
								<td style="border-left: none; border-bottom: none;"></td>
							</tr>
							<tr>
								<td style="border-top: none; border-bottom: none;">거래방식<br> <b><%=sbd.getTrade()%></b>
								</td>
								<td style="border-top: none; border-bottom: none;">희망 거래지역<br> <%
 	if (sbd.getAddress2() == null) {
 %><p>없음</p> <%
 	} else {
 %><b><span style="cursor: pointer" onclick="openNav()"><%=sbd.getAddress2()%></span></b> <%
 	}
 %>
								</td>
								<td style="border-top: none; border-bottom: none;">찜<br> <b><%=wantCount%>회</b></td>
							</tr>
							<tr>
								<td style="border-right: none; border-top: none;"></td>
								<td style="border-left: none; border-right: none; border-top: none;"></td>
								<td style="border-left: none; border-top: none;"></td>
							</tr>
						</table>
						<br>
						<tr>
							<td colspan=3 class="space"><p><%=sbd.getProd_detail()%></p></td>
						</tr>
						<br>
						<%
							if (adv != null) {
						%>
						<tr>
							<td><input type="button" onclick="location.replace('/deleteboard.do?sale_no=<%=sbd.getSale_no()%>')" value="게시판 제거" class="admindelete"></td>
						</tr>
						<%
							} else {
						if (loginCd != null) {
						%>
						<tr>
							<td colspan=3 class="space"></td>
						</tr>
						<tr>
							<td><input type="submit" value="찜하기" class="wantButton" onclick="alert('상품이 찜 등록 되었습니다')"> <%
 	if (sbd.getTrade().equals("택배")) {
 %> <input type="button" onclick="buy(<%=sbd.getSale_no()%>, <%=loginCd.getMem_no()%>, '<%=sbd.getTrade()%>')" value="거래하기" class="buyButton"></td>
							<%
								} else if (sbd.getTrade().equals("직거래")) {
							%>
							<input type="button" id="iamportPayment" value="거래하기" class="buyButton">
							</td>
							<%
								} else {
							%>
							<input type="button" id="select" value="거래하기" class="buyButton">
							</td>
							<br>
							<div id="btndis" style="display: none">
								<input type="button" onclick="buy(<%=sbd.getSale_no()%>, <%=loginCd.getMem_no()%>, '<%=sbd.getTrade()%>')" value="직거래" class="buyButton2" style="margin-left: 300px;"> <input type="button" id="iamportPayment" value="택배" class="buyButton2" style="padding: 10px 50px;">
							</div>
							<%
								}
							%>
						</tr>
						<%
							} else {
						%>
						<tr>
							<td colspan=3 class="space"></td>
						</tr>
						<tr>
							<td><input type="button" value="찜하기" class="wantButton" onclick="location.replace('/loginForm.jsp');"> <input type="button" value="거래하기" class="wantButton" onclick="location.replace('/loginForm.jsp');"></td>
						</tr>
						<%
							}
						}
						%>
					</table>
				</div>
			</form>
		</div> <%
 	}
 %>
		<div id="mySidenav" class="sidenav" style="margin-left: 30px;">
			<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
			<div id="map2" style="width: 100%; height: 100%;"></div>
		</div> <br> <%
 	if (loginCd != null) {
 %>
		<div id="reportModal" style="display: none">
			<div id="reportModal_body">
				<a href="javascript:void(0)" class="closebtn" onclick="closeRport()">&times;</a>
				<h2>신고하기</h2>
				<br>

				<form action="/report.do?sale_no=<%=sbd.getSale_no()%>&mem_no=<%=loginCd.getMem_no()%>" method="post" enctype="multipart/form-data" style="margin-left: 40px;">
					<table>
						<tr>
							<td><select name="reportCate" style="margin-left: 25px">
									<option value="none">신고 사유 선택</option>
									<option value="1">거래신고</option>
									<option value="2">판매광고</option>
							</select></td>
						</tr>
						<tr>
							<td><input type="submit" value="신고하기" style="background-color: red; border: 1px; margin-left: 20px;"></td>
						</tr>
					</table>
				</form>
			</div>
		</div> <%
 	}
 %>
	</span>
	<!-- Footer-->
	<%@include file="../include/footer.jsp"%>
	<!-- Bootstrap core JS-->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
	<script src="../js/scripts.js"></script>
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=0f30bcc717ed1bb843b84167b56f8b91&libraries=services"></script>
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=0f30bcc717ed1bb843b84167b56f8b91&libraries=LIBRARY"></script>
	<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.2.0.js"></script>
	<script>
		var mapContainer = document.getElementById('map2'), // 지도를 표시할 div 
		mapOption = {
			center : new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
			level : 3
		// 지도의 확대 레벨
		};

		// 지도를 생성합니다    
		var map = new kakao.maps.Map(mapContainer, mapOption);

		// 주소-좌표 변환 객체를 생성합니다
		var geocoder = new kakao.maps.services.Geocoder();

		// 주소로 좌표를 검색합니다
		geocoder.addressSearch("<%=sbd.getAddress1()%>", function(result, status) {

			// 정상적으로 검색이 완료됐으면 
			if (status === kakao.maps.services.Status.OK) {

				var coords = new kakao.maps.LatLng(result[0].y, result[0].x);

				// 결과값으로 받은 위치를 마커로 표시합니다
				var marker = new kakao.maps.Marker({
					map : map,
					position : coords
				});

				// 인포윈도우로 장소에 대한 설명을 표시합니다
				var infowindow = new kakao.maps.InfoWindow({
					content : '<div style="width:150px;text-align:center;padding:6px 0;">희망 거래장소</div>'
				});
				infowindow.open(map, marker);

				// 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
				map.setCenter(coords);

			}
		});

		function openNav() {
			document.getElementById("mySidenav").style.right = 0;
			map.relayout();
		};

		function closeNav() {
			document.getElementById("mySidenav").style.right = "-800px";
			map.relayout();
			map.setCenter(center);
		};
		
		function closeRport() {
			document.getElementById("reportModal").style.display = "none";
		};
		
		
		function buy(sale_no, mem_no, trade_method){
			location.replace("/buy.do?sale_no="+sale_no+"&mem_no="+mem_no+"&trade_method="+trade_method);		
		}
			  $(document).ready(function () {
		        $("#iamportPayment").click(function () {
		          payment(); //버튼 클릭하면 호출 
		        });
		      });
			  
			  <%
				if (loginCd != null) {
					%>
					 function payment(data) {
					        IMP.init('imp52334886');//아임포트 관리자 콘솔에서 확인한 '가맹점 식별코드' 입력
					        IMP.request_pay({// param
					          pg: "kakaopay.TC0ONETIME", //pg사명 or pg사명.CID (잘못 입력할 경우, 기본 PG사가 띄워짐)
					          pay_method: "card", //지불 방법
					          merchant_uid: "<%=sbd.getSale_no()%>", //가맹점 주문번호 (아임포트를 사용하는 가맹점에서 중복되지 않은 임의의 문자열을 입력)
					          name: "<%=sbd.getProd_nm()%>", //결제창에 노출될 상품명
					          amount: <%=sbd.getProd_price()%>, //금액
					          buyer_email: "<%=loginCd.getMem_mail()%>",
					          buyer_name: "<%=loginCd.getMem_nm()%>",
					          buyer_tel: "<%=loginCd.getMem_tel()%>"
					        }, function (rsp) { // callback
					          if (rsp.success) {
					        	  buy(<%=sbd.getSale_no()%>, <%=loginCd.getMem_no()%>, '<%=sbd.getTrade()%>');
					          } else {
					            alert("결제에 실패했습니다");
					          }
					       });
					      }	
					<%
				}
			%>

		     
		
		document.querySelector('#btnOpenModal').addEventListener("click", function(){
	        	document.querySelector('#reportModal').style.display="";
	    });
		
		document.getElementById('select').addEventListener('click',function(){
			document.querySelector('#btndis').style.display = 'block';
	    });
	      
       
	</script>
</body>
</html>
