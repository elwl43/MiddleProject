<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- 폰트  -->
<link href="/css/font.css" rel="stylesheet" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Cute+Font&display=swap" rel="stylesheet">

<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<meta charset="UTF-8">
<title>회원가입</title>
<style>
 /* 전체 스타일 */ 
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

	<span class=cute-font-regular style="font-size:20px;">

	<h1 class="member-title text-center" style="font-weight: bold; font-size:40px;">회원가입</h1>
	
	<form method="post" class="form-signedit" onsubmit="valid(event)">
		<lebel for=id>
		<b>아이디</b></lebel>
		<br>
		<div class="form-input-box">
			<input type="text" class="form-control form-margin-top" id="id"
				name="mem_id" style="box-shadow: 2px 1px 2px aqua;" required
				pattern="[a-zA-Z][a-zA-Z0-9]{3,7}"> <br>
		</div>

		<div class="form-label-group">
			<lable for="pwd">
			<b>비밀번호</b></lable>
			<input type="password" class="form-control form-margin-top" id="pw1" class="pw"
				name="mem_pw" style="box-shadow: 2px 1px 2px aqua;" required
				pattern="(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[!@#\$%\^&amp;\*\(\)_\+\|]).{8,}">
		</div>
		<div class="form-label-group">
			<lable for="pwdcheck">
			<b>비밀번호 확인</b></lable>
			<input type="password" class="form-control form-margin-top" id="pw2" class="pw"
				style="box-shadow: 2px 1px 2px aqua;" required><span
				id="pwspan"></span>
		</div>

		<div class="form-label-group btn-sign-up-margin">
			<label for="phone"><b>전화번호</b></label> <input type="text"
				class="form-control form-margin-top" id="tel" name="mem_tel"
				style="box-shadow: 2px 1px 2px aqua;" placeholder="010-1234-5678"
				required>
		</div>

		<div class="form-label-group">
			<label for="name"><b>이름</b></label> <br> <input type="text"
				class="form-control form-margin-top" id="nm" name="mem_nm"
				style="box-shadow: 2px 1px 2px aqua;" required pattern="[가-힣]{2,8}">

		</div>

		<div class="form-label-group">
			<br> <label for="pnumber"><b>주민등록번호</b></label> <br> <input
				type="text" class="col-sm-" id="reg1" name="mem_regno1"
				style="width: 150px; height: 45px; border-radius: 10px; border-width: 1px; border-color: #faf0e6; box-shadow: 2px 1px 2px aqua;"
				required pattern="[0-9]{6,6}"> &nbsp;<b>-</b> &nbsp; <input
				type="text" class="col-sm-" id="reg2" name="mem_regno2"
				style="width: 150px; height: 45px; border-radius: 10px; border-width: 1px; border-color: #faf0e6; box-shadow: 2px 1px 2px aqua;"
				required pattern="[0-9]{7,7}">
		</div>
		<div class="form-label-group">
			<label for="addr"><b>주소</b></label><br>
<!-- 			<input type="text" class="form-control form-margin-top" id="sample4_postcode"	placeholder="우편번호" style="box-shadow: 2px 1px 2px aqua;"> -->
			<input type="button" class="btn btn-primary" onclick="sample4_execDaumPostcode()" value="우편번호 찾기" style="width: 150px; height: 38px; margin-top: 10px;"><br>
			<input type="text" class="form-control form-margin-top" id="sample4_roadAddress" name="loc" placeholder="도로명주소"  style="box-shadow: 2px 1px 2px aqua;">
	  		<input type="text" class="form-control form-margin-top" id="sample4_extraAddress" name="mem_detail_addr"placeholder="참고항목" style="box-shadow: 2px 1px 2px aqua;"> 
	  		<input type="text" class="form-control form-margin-top" id="sample4_detailAddress" name="mem_detail_addr2" placeholder="상세주소" style="box-shadow: 2px 1px 2px aqua;"> 
		</div>


	<div class="form-label-group">
		<label for="email"><b>이메일</b></label>
			<input type="text" class="form-control form-margin-top" name="mem_mail"  style="box-shadow: 2px 1px 2px aqua;">	
	</div>
			
			<input type="submit" value="가입하기" class="joinBtn">
			<input type="submit" class="joinBtn2" value="뒤로가기" onclick="location.href='<%=request.getContextPath()%>/index.do'">

<!-- 	    <table> -->
<!-- 	   	    	<td><h2><p class="fs-1">회원가입</p></h2></td>  -->
<!--   <tr>  -->
<!--  	    </tr>  -->
<!--  	    <tr><td>아이디</td></tr>  -->
<!--  	    <tr><td>&lt;input type=&quot;text&quot; class=&quot;text&quot; id=&quot;id&quot; name=&quot;mem_id&quot;  -'->
			<!--  	    required pattern="[a-zA-Z][a-zA-Z0-9]{3,7}"></td></tr>  -->

			<!--  	    <tr><td>비밀번호</td></tr>  -->
			<!--  	    <tr><td><input type="password" class="pw" id="pw1" name="mem_pw"  -->
			<!--  	    required pattern="(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[!@#\$%\^&amp;\*\(\)_\+\|]).{8,}"></td></tr>  -->
			<!--  	    <tr><td>비밀번호 확인</td></tr>  -->
			<!--  	    <tr><td><input type="password" class="pw" id="pw2" required><span id="pwspan" ></span></td></tr><br>  -->

			<!--  	    <tr><td>전화번호</td></tr>  -->
			<!-- 	    <tr><td><input type="text" class="text" id="tel" name="mem_tel" placeholder="010-1234-5678"  -->
			<!--  	    required></td></tr>  -->

			<!--  	    <tr><td>이름</td></tr>  -->
			<!--  	    <tr><td><input type="text" class="text" id="nm" name="mem_nm" required  -->
			<!--  	    pattern="[가-힣]{2,8}"></td></tr>  -->

			<!--  	    <tr><td>주민등록번호 입력</td></tr>  -->
			<!--  	    <tr><td><input type="text" class="text" id="reg1" name="mem_regno1" style="width:110px"  -->
			<!--  	    		required pattern="[0-9]{6,6}">  -->
			<!--  	    		<input type="text" class="text" id="reg2" name="mem_regno2" style="width:110px"  -->
			<!-- 	    		required pattern="[0-9]{7,7}"></td></tr>  -->
			<!--  	    <tr><td>  -->
			<!--  	    <input type="text" class="text" id="sample4_postcode" placeholder="우편번호">  -->
			<!-- 		<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기"><br>  -->
			<!--  		<input type="text" class="text" id="sample4_roadAddress" name="loc" placeholder="도로명주소"><br>  -->
			<!--  		<input type="text" class="text" id="sample4_detailAddress" name="mem_detail_addr2" placeholder="상세주소">  -->
			<!--  		<input type="text" class="text" id="sample4_extraAddress" name="mem_detail_addr"placeholder="참고항목">  -->
			<!--  		</td></tr>  -->

			<!--  	    <tr><td>이메일</td></tr>  -->
			<!--      	<tr><td>  -->
			<!--          <input type="text" class="text" name="mem_mail">  -->
			<!--          </td></tr>  -->

			<!--    	<tr><td><input type="submit" value="가입하기" class="joinBtn"><br>  -->
			<!--     			<span id="joinspan"></span>  -->
			<!--      	</td></tr>  -->
			<!-- 	    </table>  -->
	</form>
</span>
	<script
		src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	<script>
	function valid(e) {
		e.preventDefault();
		let pass1 = $("#pw1").val();
    	let pass2 = $("#pw2").val();
    	if (pass1 == pass2) {
		let formData = $('form').serialize(); //key1=value1&key2=value2&....&key9=value9 
		console.log(formData);
		 
		$.ajax({
			type: 'post',
			url: '/join.do',
			data: formData, //url인코딩(%인코딩)
			success:function(res){
				 console.log("응답>>", res);
				 if(res == 1){
					 alert="가입성공";
					 location.href = "loginForm.jsp";
				 }else{
					 $('#joinspan').text("가입실패..").css('color','gray');
				 }
			},
			error:function(xhr){
				alert("상태 확인: " + xhr.status);
			}
//	 	 	,dataType: '' 
		 })
    	} else {
    		$("#joinspan").html('비밀번호를 확인해주세요');
    		$("#joinspan").attr('color','red');
    	}
	}
	
// 다음 주소 API
	function sample4_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var roadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 참고 항목 변수

                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
//                 document.getElementById('sample4_postcode').value = data.zonecode;
                document.getElementById("sample4_roadAddress").value = roadAddr;
                
                // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
                if(roadAddr !== ''){
                    document.getElementById("sample4_extraAddress").value = extraRoadAddr;
                } else {
                    document.getElementById("sample4_extraAddress").value = '';
                }

                var guideTextBox = document.getElementById("guide");
                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
                if(data.autoRoadAddress) {
                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                    guideTextBox.style.display = 'block';
                }
            }
        }).open({
            left: (window.screen.width / 2) - (500 / 2),
            top: (window.screen.height / 2) - (600 / 2)
          });
    }
    
    $("#pw2").keyup(function(){
    	let pass1 = $("#pw1").val();
    	let pass2 = $("#pw2").val();
    	
    	if(pass1 != "" || pass2 != "") {
    		if(pass1 == pass2) {
    			$("#pwspan").attr('color','green');
    			$("#pwspan").html('일치');
    		} else {
    			$("#pwspan").attr('color','red');
    			$("#pwspan").html('불일치');
    		}
    	}
    })
    
    $(document).ready(function() {
		$.ajax({
			url : "캡차API로직.jsp",
			dataType:"json",
			success : function(data) {
				console.log(data.key);
				$("#key").val(data.key);
				$("#div01").html("<img src='captchaImage/"+data.captchaImageName+"'>");
			}
		});
		$("#btn01").on("click",function(){
			var form01Data = $("#form01").serialize();
			console.log(form01Data);
			$.ajax({
				url : "캡차API로직.jsp",
				data : form01Data,
				dataType:"json",
				success : function(data) {
				}
			});
		});
	});
    
</script>
</body>
</html>