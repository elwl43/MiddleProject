<%@page import="java.io.Console"%>
<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	MemberVO mv = (MemberVO) session.getAttribute("loginCode");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
	rel="stylesheet" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="../css/styles.css" rel="stylesheet" />

<!-- 폰트  -->
<link href="/css/font.css" rel="stylesheet" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Cute+Font&display=swap" rel="stylesheet">


<style> /* 전체 스타일 */
body {
	font-family: Arial, sans-serif;
	background-color: #f5f5f5;
} /* 네비게이션 스타일 */
.navbar {
	background-color: #333;
	color: #fff;
	padding: 10px 20px;
}

.navbar a {
	color: #fff;
	text-decoration: none;
	margin-right: 20px;
} /* 회원정보 수정 섹션 스타일 */
.member-title {
	margin-top: 40px;
	font-size: 24px;
	font-weight: bold;
}

.form-signedit {
	max-width: 500px;
	margin: 0 auto;
	padding: 30px;
	background-color: #fff;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.form-label-group {
	margin-bottom: 20px;
}

.form-control {
	display: block;
	width: 100%;
	padding: 10px;
	font-size: 16px;
	border: 1px solid #ccc;
	border-radius: 5px;
}

.form-control--border {
	border-color: #6c757d;
}

.form-margin-top {
	margin-top: 10px;
}

.btn-sign-up-margin {
	margin-top: 30px;
}

.joinBtn {
	display: block;
	width: 100%;
	padding: 10px;
	font-size: 16px;
	background-color: #007bff;
	color: #fff;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}
.joinBtn2 {
	display: block;
	width: 100%;
	padding: 10px;
	font-size: 16px;
	background-color: #9E9E9E;
	color: #fff;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

.joinBtn:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>
	<!-- Navigation -->
	<%@include file="../include/navigation.jsp"%>

<span class="cute-font-regular">
	<h2 class="member-title text-center" style="font-weight: bold; font-size: 50px ">
		회원정보 수정
	</h2>
	<form class="form-signedit" method="post" method="post"
		action="<%=request.getContextPath()%> /memUpdate.do"  style="font-size: 25px">
		<lebel for=id><b>아이디</b></lebel>
		<br>
		<div class="form-input-box">
			<input type="text" class="form-control form-margin-top" name="mem_id" value="<%=mv.getMem_id()%>"  style="box-shadow: 2px 1px 2px aqua;" readonly />
		</div>
	
		<div class="form-label-group">
			<lable for="pwd"><b>비밀번호</b></lable>
			<input type="password" class="form-control form-margin-top" id="pw1" name="mem_pw" value="<%=mv.getMem_pw()%>"  style="box-shadow: 2px 1px 2px aqua;" required 
				pattern="(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[!@#\$%\^&amp;\*\(\)_\+\|]).{8,}">
		</div>
		<div class="form-label-group">
			<lable for="pwdcheck"><b>비밀번호 확인</b></lable>
			<br> <input type="password" class="form-control form-margin-top"
				id="pw2"  style="box-shadow: 2px 1px 2px aqua;" required><span id="pwspan"></span>
		</div>

		<div class="form-label-group btn-sign-up-margin">
			<label for="phone"><b>전화번호</b></label> <br> <input type="text"
				class="form-control form-margin-top" id="tel" name="mem_tel"
				value="<%=mv.getMem_tel()%>" placeholder="010-1234-5678"  style="box-shadow: 2px 1px 2px aqua;" required>
		</div>

		<div class="form-label-group">
			<label for="addr"><b>주소</b></label> <br> 
<!-- 			<input type="text" class="form-control form-margin-top" id="sample4_postcode" placeholder="우편번호"  style="box-shadow: 2px 1px 2px aqua;">  -->
			<input type="button" class="btn btn-primary" onclick="sample4_execDaumPostcode()" value="우편번호 찾기" style="margin-top:10px; font-size: 20px" > <br>
			<input type="text" class="form-control form-margin-top" id="sample4_roadAddress" name="loc" value="<%=mv.getLoc()%>"style="box-shadow: 2px 1px 2px aqua;" placeholder="도로명주소"> 
			<input type="text" class="form-control form-margin-top" id="sample4_extraAddress"  name="mem_addr" value="<%=mv.getMem_detail_addr()%>" style="box-shadow: 2px 1px 2px aqua;" placeholder="참고항목"> 
			<input type="text" class="form-control form-margin-top" id="sample4_detailAddress" name="mem_addr2" value="<%=mv.getMem_detail_addr2()%>" style="box-shadow: 2px 1px 2px aqua;"placeholder="상세주소">
		</div>

		<div class="form-label-group" >
			<label for="email"><b>이메일</b></label> <br>
			 <input type="text" class="form-control form-margin-top" name="mem_mail" value="<%=mv.getMem_mail()%>"style="box-shadow: 2px 1px 2px aqua;">
		</div>
		<input type="submit" value="정보변경하기" class="joinBtn" >
<!-- 		<button type="button" -->
<%-- 			onclick="location.href='<%=request.getContextPath()%>/mprank.do'">뒤로가기</button> --%>
	<input type="submit" class="joinBtn2" value="뒤로가기" onclick="location.href='<%=request.getContextPath()%>/mprank.do'">
	</form>
</span>
	<!-- Footer-->
	<%@include file="../include/footer.jsp"%>
	<!-- Bootstrap core JS-->
	<script
		src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	<script>
		$('#pw2').keyup(function() {
			let pass1 = $("#pw1").val();
			let pass2 = $("#pw2").val();

			if (pass1 != "" || pass2 != "") {
				if (pass1 == pass2) {
					$("#pwspan").attr('color', 'green');
					$("#pwspan").html('일치');
				} else {
					$("#pwspan").attr('color', 'red');
					$("#pwspan").html('불일치');
				}
			}
		})

		// 다음 주소 API
		function sample4_execDaumPostcode() {
			new daum.Postcode(
					{
						oncomplete : function(data) {
							// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

							// 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
							// 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
							var roadAddr = data.roadAddress; // 도로명 주소 변수
							var extraRoadAddr = ''; // 참고 항목 변수

							// 법정동명이 있을 경우 추가한다. (법정리는 제외)
							// 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
							if (data.bname !== ''
									&& /[동|로|가]$/g.test(data.bname)) {
								extraRoadAddr += data.bname;
							}
							// 건물명이 있고, 공동주택일 경우 추가한다.
							if (data.buildingName !== ''
									&& data.apartment === 'Y') {
								extraRoadAddr += (extraRoadAddr !== '' ? ', '
										+ data.buildingName : data.buildingName);
							}
							// 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
							if (extraRoadAddr !== '') {
								extraRoadAddr = ' (' + extraRoadAddr + ')';
							}

							// 우편번호와 주소 정보를 해당 필드에 넣는다.
							//                 document.getElementById('sample4_postcode').value = data.zonecode;
							document.getElementById("sample4_roadAddress").value = roadAddr;

							// 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
							if (roadAddr !== '') {
								document.getElementById("sample4_extraAddress").value = extraRoadAddr;
							} else {
								document.getElementById("sample4_extraAddress").value = '';
							}

							var guideTextBox = document.getElementById("guide");
							// 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
							if (data.autoRoadAddress) {
								var expRoadAddr = data.autoRoadAddress
										+ extraRoadAddr;
								guideTextBox.innerHTML = '(예상 도로명 주소 : '
										+ expRoadAddr + ')';
								guideTextBox.style.display = 'block';
							}
						}
					}).open();
		}
	</script>
</body>
</html>