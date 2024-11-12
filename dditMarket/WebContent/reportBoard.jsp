<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.report.vo.ReportBoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	List<ReportBoardVO> reportList = (List<ReportBoardVO>) request.getAttribute("reportList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link href="../css/styles.css" rel="stylesheet" />
<style>
html, body {
	height: 100%;
}

body {
	display: flex;
	flex-direction: column;
	padding-top: 50px;
	margin: 0;
}

.container {
	flex: 1;
}

.table-hover tbody tr:hover {
	background-color: #f5f5f5;
}

.writeBtn {
	margin-top: 20px;
	text-align: right;
}

.writeBtn a {
	display: inline-block;
	padding: 10px 20px;
	background-color: #5cb85c;
	color: white;
	border-radius: 4px;
	text-decoration: none;
}

.writeBtn a:hover {
	background-color: #4cae4c;
}

.search-form {
	margin-bottom: 20px;
}

.search-form input, .search-form select {
	display: inline-block;
	margin-right: 10px;
}

.search-form .form-control.search-input {
	width: 400px;
}

.table th, .table td {
	text-align: center;
	vertical-align: middle;
}

.pagination {
	font-size: 18px;
}

.pagination li a {
	padding: 10px 15px;
	margin: 5px;
}

.pagination .active a {
	background-color: #337ab7;
	color: white;
}

.pagination .active a:hover {
	background-color: #286090;
}

footer {
	background-color: #343a40;
	color: white;
	text-align: center;
	padding: 20px 0;
	position: absolute;
	bottom: 0;
	width: 100%;
}

.btn {
	display: inline-block;
	font-weight: 500;
	font-size: 12px;
	text-align: center;
	vertical-align: middle;
	cursor: pointer;
	padding: 0.5rem 1rem;
	border-radius: 0.25rem;
	transition: color 0.15s ease-in-out, background-color 0.15s ease-in-out, border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
}

.btn-primary {
	background-color: #007bff;
	border-color: #007bff;
}

.btn-primary:hover {
	background-color: #0069d9;
	border-color: #0062cc;
}

.btn-danger {
	background-color: #dc3545;
	border-color: #dc3545;
}

.btn-danger:hover {
	background-color: #c82333;
	border-color: #bd2130;
}

.table>tbody>tr>td {
	vertical-align: middle;
}

.reportModal {
	font-size: 30px;
	position: absolute;
	z-index: 1;
	left: 0;
	top: 0;
	width: 100%;
	height: 100%;
	overflow: auto;
	background-color: rgba(0, 0, 0, 0.4);
	top: 0;
	width: 100%;
	height: 100%;
	overflow: auto;
	position: absolute;
}

.reportModal_body {
	background-color: #fefefe;
	margin: 15% auto;
	padding: 20px;
	border: 1px solid #888;
	width: 35%;
	border-radius: 10px;
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
}

.reportModal_body a {
	padding: 8px 8px 8px 32px;
	text-decoration: none;
	font-size: 25px;
	color: #363636;
	display: block;
	transition: 0.3s;
}

.reportModal_body .closebtn {
	color: #aaa;
	float: right;
	font-size: 28px;
	font-weight: bold;
}

.closebtn:hover, .closebtn:focus {
	color: black;
	text-decoration: none;
	cursor: pointer;
}

.reportModal_body p {
	margin: 10px 0;
}

.reportModal_body p:last-child {
	display: flex;
	justify-content: space-between;
	align-items: center;
}

.reportModal_body input[type=button] {
	background-color: #dc3545;
	color: white;
	padding: 10px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

.reportModal_body input[type=button]:hover {
	background-color: #dc3545;
}
.btn-group {
	display: flex;
	align-items: center;
	border-radius: 20px;
	background-color: transparent;
	border: 2px solid black;
	margin-top: 10px;
	margin-bottom: 30px;
}

.btn-check {
	display: none;
}

.btn-group label {
	border: none;
	background-color: transparent;
	color: black;
	font-weight: bold;
	padding: 10px 20px;
	border-radius: 20px;
	text-align: center;
}

.btn-group .divider {
	width: 1px;
	background-color: black;
	height: 100%;
}

/* 버튼  */
.btn-two {
	color: #FFF;
	padding: 8px 12px;
	border: 0 none;
	font-weight: 700;
	letter-spacing: 1px;
	text-transform: uppercase;
}

.btn-two.green {
	background: #25a25a;
}

.btn-two.mini {
	font-size: 14px;
	padding: 10px 20px;
}
</style>
</head>
<body style="padding: 0">
	<%@include file="../include/navigation.jsp"%>

	<div class="container">
		<div class="btn-group" role="group">
			<input type="radio" class="btn-check" name="btnradio" id="btnradio1" autocomplete="off" onclick="location.href='<%=request.getContextPath()%>/reportBoard.do'"> <label class="btn btn-secondary" for="btnradio1">신고 관리</label>

			<div class="divider"></div>

			<input type="radio" class="btn-check" name="btnradio" id="btnradio2" autocomplete="off" onclick="location.href='<%=request.getContextPath()%>/memberBoard.do'"> <label class="btn btn-secondary" for="btnradio2">사용자 관리</label>
		</div>

		<table class="table table-hover table-bordered" style="margin-top: 30px">
			<thead>
				<tr class="active">
					<th>No</th>
					<th>제목</th>
					<th>신고 대상</th>
					<th>신고 사유</th>
					<th>처리</th>
				</tr>
			</thead>
			<tbody>
				<%
					if (reportList != null) {
					for (ReportBoardVO reportBoard : reportList) {
				%>
				<tr>
					<td><%=reportBoard.getRownum()%></td>
					<td><%=reportBoard.getSale_title()%></td>
					<td><%=reportBoard.getMem_nm()%></td>
					<td><%=reportBoard.getRe_ctgy_nm()%></td>
					<td><input type="button" value="게시글 보기" class="btn btn-primary" onclick="openBoard(<%=reportBoard.getSale_no()%>, <%=reportBoard.getMem_no()%>)"> <input type="button" value="밴" class="btn btn-danger" onclick="openModal(<%=reportBoard.getRownum()%>)"></td>
				</tr>
				<%
					}
				} else {
				%>
				<tr>
					<td colspan="5" style="text-align: center;">정보 없음</td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
	</div>
	<%
		for (ReportBoardVO reportBoard : reportList) {
	%>
	<div class="reportModal" id="board<%=reportBoard.getRownum()%>" style="display: none">
		<div class="reportModal_body">
			<a href="javascript:void(0)" class="closebtn" onclick="closeModal(<%=reportBoard.getRownum()%>)">&times;</a> <br>
			<p>
				제목 :
				<%=reportBoard.getSale_title()%></p>
			<p>
				신고대상 :
				<%=reportBoard.getMem_nm()%></p>
			<p>
				신고사유 :
				<%=reportBoard.getRe_ctgy_nm()%></p>
			<p>
				정말로 밴하시겠습니까 <input type="button" value="차단" onclick="ban(<%=reportBoard.getSale_no()%>, <%=reportBoard.getMem_no()%>); closeModal(<%=reportBoard.getRownum()%>);">
			</p>
		</div>
	</div>
	<%
		}
	%>

	<footer>
		<%@include file="../include/footer.jsp"%>
	</footer>

	<script>
		function openBoard(sale_no, mem_no) {			
			 // 팝업을 띄울 페이지 URL
			  var url = "/saleDetail.do?sale_no="+sale_no+"&mem_no="+mem_no;
			  // 팝업 창의 속성
			  var properties = "width=2000px,height=1000px,scrollbars=yes";
			  // 팝업 열기
			  window.open(url, "신고 글", properties);
		}
		
		function ban(sale_no, mem_no) {
			
			let str = "/ban.do?sale_no="+sale_no+"&mem_no="+mem_no;
			location.href = str;
		}
		
		function openModal(rownum) {
			document.querySelector('#board'+rownum).style.display="";
		}
		
		function closeModal(rownum) {
			document.querySelector('#board'+rownum).style.display = "none";
		};
	</script>
</body>
</html>
