<%@ page import="kr.or.ddit.board.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String joinCd = (String) request.getAttribute("joinCode");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
<link href="../css/styles.css" rel="stylesheet" />

<!-- 폰트  -->
<link href="/css/font.css" rel="stylesheet" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Cute+Font&display=swap" rel="stylesheet">

<style>
/* 전체 폼 스타일 */
#insertForm {
	width: 80%;
	margin: auto;
	font-family: Arial, sans-serif;
	border-collapse: collapse;
}

/* 테이블 헤더 스타일 */
.header {
	background-color: #978b8b;
	font-weight: bold;
	border-radius: 5px;
}

/* 테이블 셀 스타일 */
#insertForm td {
	padding: 10px;
	border-bottom: 1px solid #ddd;
}

/* 입력 필드 스타일 */
#insertForm input[type=text], #insertForm textarea, #insertForm select {
	width: 80%;
	padding: 10px;
	border: 3px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}
/* 파일 업로드 스타일 */
.filebox input[type="file"] {
	position: absolute;
	width: 1px;
	height: 1px;
	padding: 0;
	margin: -1px;
	overflow: hidden;
	clip: rect(0, 0, 0, 0);
	border: 0;
}

.filebox label {
	display: inline-block;
	padding: 10px 20px;
	color: #fff;
	vertical-align: middle;
	background-color: #533b2b;
	font-weight: bold;
	border-radius: 5px;
}

.filebox .upload-name {
	display: inline-block;
	height: 40px;
	padding: 0 10px;
	vertical-align: middle;
	border: 1px solid #dddddd;
	width: 78%;
	color: #999999;
}

/* 공백 스타일 */
.space {
	height: 0px;
}
/* 등록버튼 */
.btn1 {
	font-weight: bold;
	background-color: #2612d6; /* 버튼 배경색 */
	border: none; /* 버튼 테두리 제거 */
	color: white; /* 버튼 글자색 */
	padding: 10px 20px; /* 버튼 내부 여백 */
	text-align: center; /* 버튼 내 텍스트 가운데 정렬 */
	font-size: 15px; /* 버튼 글자 크기 */
	margin: 4px 2px; /* 버튼 간격 */
	border-radius: 10px; /* 버튼 모서리 둥글게 */
}
/* 삭제버튼 */
.btn2 {
	font-weight: bold;
	background-color: #ca1010; /* 버튼 배경색 */
	border: none; /* 버튼 테두리 제거 */
	color: white; /* 버튼 글자색 */
	padding: 10px 20px; /* 버튼 내부 여백 */
	text-align: center; /* 버튼 내 텍스트 가운데 정렬 */
	font-size: 15px; /* 버튼 글자 크기 */
	margin: 10px 0px; /* 버튼 간격 */
	border-radius: 10px; /* 버튼 모서리 둥글게 */
}
/* 등록버튼 마우스 올리면 배경색 */
.btn1:hover {
	background-color: #45a049; /* 버튼에 마우스를 올리면 배경색 변경 */
}
/* 삭제버튼 마우스 올리면 배경색 */
.btn2:hover {
	background-color: #f30000; /* 버튼에 마우스를 올리면 배경색 변경 */
}
</style>

</head>
<body>
	<!-- Navigation-->
	<%@include file="../include/navigation.jsp"%>

	<%
		if (joinCd == "join") {
	%>
	<%@include file="join.jsp"%>
	<%
		} else {
	%>


	<form action="<%=request.getContextPath()%>/insert.do" method="post" enctype="multipart/form-data">

		<table id="insertForm">
			<tr>
				<td colspan=3><h2 style="font-weight: bold;">상품 등록</h2></td>
			</tr>
			<tr>
				<td colspan=3 class="header">&nbsp&nbsp제&nbsp목</td>
			</tr>
			<tr>
				<td colspan=3><input type="text" placeholder="제목을 입력하세요" name="title" value="" style="width: 100%"></td>
			</tr>
			<tr>
				<td colspan=3 class="space"></td>
			</tr>
			<tr>
				<td>카테고리</td>
				<td>물품명</td>
				<td>가격</td>
			</tr>
			<tr>
				<td><select id="cate" name="cate">
						<option value="none">선택</option>
						<option value="1">문구류</option>
						<option value="2">전자제품</option>
						<option value="3">가전제품</option>
						<option value="4">의류</option>
						<option value="5">신발</option>
						<option value="6">가방/지갑</option>
						<option value="7">시계</option>
						<option value="8">쥬얼리</option>
						<option value="9">스포츠/레저</option>
				</select></td>
				<td style="width: 270px"><input type="text" placeholder="물품명" name="prodName" id='prodNm' size="30px" value=""></td>
				<td><input type="text" placeholder="가격" name="prodPrice" size="30px" value=""></td>
			</tr>
			<tr>
				<td colspan=3 class="space"><input type="hidden" id="tradeResult" value='택배' name='trade'></td>
			</tr>
			<tr>
				<td>거래방법</td>
				<td colspan=2>희망 거래지</td>
			</tr>
			<tr>
				<td colspan=1>
					<div id="optionDiv">
						<input type="checkbox" id="inlineCheckbox1" value="택배" checked="checked" onclick="trades()"><label for="inlineCheckbox1">&nbsp;택배</label> <span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> <input type="checkbox" id="inlineCheckbox2" value="직거래" onclick="dis(); trades();"> <label for="inlineCheckbox1">&nbsp;직거래</label>
					</div>
				</td>
				<td colspan=1><input type="text" id="loc" name="address2" placeholder="직거래 선택시 활성화됩니다" style="margin-right: 25px; width: 130%;" disabled="disabled"></td>
				<td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><input type="button" id="daumMap" onclick="sample4_execDaumPostcode()" value="우편번호 찾기" style="text-align: center; margin-right: 150px" disabled="disabled"></td>
			</tr>
			<tr>
				<td colspan=3 class="space"><input type="hidden" id="address2" value="" name='address2'></td>
			</tr>
			<tr>
				<td colspan=3>첨부파일</td>
			</tr>
			<tr>
				<td colspan=3>
					<div class="filebox">
						<input class="upload-name" value="첨부파일" placeholder="첨부파일"> <label for="file">파일찾기</label> <input type="file" id="file" name="atchFile" multiple="multiple">
					</div>
				</td>
			</tr>
			<tr>
				<td colspan=3 class="space"><input type="hidden" id="sample4_roadAddress" value="" name='address1'></td>
			</tr>
			<tr>
				<td class="header" colspan=3>&nbsp&nbsp내용</td>
			</tr>
			<tr>
				<td colspan=3><textarea placeholder="내용을 입력하세요" name="detail" rows="20" cols="100" style="width: 100%; resize: none;" value=""></textarea></td>
			</tr>
		</table>
		<div style="margin-left: 1550px;">
			<input type="submit" value="등록" class="btn1"> <input type="submit" value="삭제" class="btn2">
		</div>
	</form>
	<%
		}
	%>
	<!-- Footer-->
	<%@include file="../include/footer.jsp"%>

	<!-- Bootstrap core JS-->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="../js/scripts.js"></script>
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>

	<script>
		let i = 0;

		document.querySelector('#file').addEventListener('change', function() {
			if (i == 0) {
				document.querySelector('.upload-name').value = '';
			}
			var fileName = document.querySelector('#file').value;
			console.log(fileName);
			var file = fileName.substring((fileName.lastIndexOf('\\') + 1), fileName.length);
			console.log(file);
			if (i == 0) {
				document.querySelector('.upload-name').value += file;
				i++;
			} else {
				document.querySelector('.upload-name').value += ', ' + file;
			}
		});

		function sample4_execDaumPostcode() {
			new daum.Postcode({
				oncomplete : function(data) {
					// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

					// 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
					// 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
					var roadAddr = data.roadAddress; // 도로명 주소 변수
					var addr = data.sigungu; // 주소 변수
					// 법정동명이 있을 경우 추가한다. (법정리는 제외)
	                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
	                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
	                	addr +=' '+ data.bname;
	                }

					// 우편번호와 주소 정보를 해당 필드에 넣는다.
					//	                 document.getElementById('sample4_postcode').value = data.zonecode;
					document.getElementById("sample4_roadAddress").value = roadAddr;
					document.getElementById("loc").value = addr;
					document.getElementById("address2").value = addr;
				}
			}).open({
		        left: (window.screen.width / 2) - (500 / 2),
		        top: (window.screen.height / 2) - (600 / 2),
		      });
		};
		
		
		function dis() {
			if(document.getElementById('inlineCheckbox2').checked == true){
				document.getElementById('daumMap').disabled = false;
				document.getElementById('loc').disabled = false;
			}else{
				document.getElementById('daumMap').disabled = true;
				document.getElementById('loc').disabled = true;
			}
		};
		
		function trades() {
			let str = '';
			
			if(document.getElementById('inlineCheckbox1').checked == true){
				str += document.getElementById('inlineCheckbox1').value;
			}
			if(document.getElementById('inlineCheckbox2').checked == true){
				if(!str){
				str += document.getElementById('inlineCheckbox2').value;					
				}else{
					str += '/' + document.getElementById('inlineCheckbox2').value;	
				}				
			}
			document.getElementById('tradeResult').value = str;
		};
	</script>
</body>
</html>