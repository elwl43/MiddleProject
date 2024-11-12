<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.report.vo.ReportBoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	List<MemberVO> memberList = (List<MemberVO>) request.getAttribute("memberList");
	List<Integer> blackList = (List<Integer>) request.getAttribute("blackList");
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
} /* 

footer {
	background-color: #343a40;
	color: white;
	text-align: center;
	padding: 20px 0;
	position: absolute;
	bottom: 0;
	width: 100%;
}
 */
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


.table>tbody>tr {
	height: 50px;
	font-size: 20px;
}

.reportModal {
	font-size: 30px;
	position: absolute;
	z-index: 1;
	left: 0;
	top: 0;
	width: 1800px;
	height: 1600px;
	overflow: auto;
	background-color: rgba(0, 0, 0, 0.4);
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

	<div class="container" style="margin-bottom: 100px">
		<div class="btn-group" role="group">
			<input type="radio" class="btn-check" name="btnradio" id="btnradio1" autocomplete="off" onclick="location.href='<%=request.getContextPath()%>/reportBoard.do'"> <label class="btn btn-secondary" for="btnradio1">신고 관리</label>

			<div class="divider"></div>

			<input type="radio" class="btn-check" name="btnradio" id="btnradio2" autocomplete="off" onclick="location.href=''"> <label class="btn btn-secondary" for="btnradio2">사용자 관리</label>
		</div>

		<table class="table table-hover table-bordered" style="margin-top: 30px">
			<thead>
				<tr class="active">
					<th>No</th>
					<th>회원 번호</th>
					<th>아이디</th>
					<th>이름</th>
					<th>메일</th>
					<th>밴 유무</th>
				</tr>
			</thead>
			<tbody>
				<%
					if (memberList != null) {
					for (MemberVO mv : memberList) {
				%>
				<tr>
					<td><%=mv.getRownum()%></td>
					<td><%=mv.getMem_no()%></td>
					<td><%=mv.getMem_id()%></td>
					<td><%=mv.getMem_nm()%></td>
					<td><%=mv.getMem_mail()%></td>
					<td>
						<%
							int num = Integer.parseInt(mv.getMem_no());
							if (blackList.indexOf(num) >=0) {
						%>
						<input type="button" value="밴 해제" class="btn btn-danger" onclick="openModal(<%=mv.getMem_no()%>)">
						<%
						}
						%>
					</td>
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
		for (MemberVO mv : memberList) {
	%>
	<div class="reportModal" id="board<%=mv.getMem_no()%>" style="display: none">
		<div class="reportModal_body">
			<a href="javascript:void(0)" class="closebtn" onclick="closeModal(<%=mv.getMem_no()%>)">&times;</a> <br>
			<p>
				회원 번호 :
				<%=mv.getMem_no()%></p>
			<p>
				아이디 :
				<%=mv.getMem_id()%></p>
			<p>
				이름 :
				<%=mv.getMem_nm()%></p>
			<p>
				메일 :
				<%=mv.getMem_mail()%></p>
			<p>
				밴을 해제하시겠습니까 <input type="button" value="해제" onclick="banCancel(<%=mv.getMem_no()%>); closeModal(<%=mv.getMem_no()%>);">
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
		function banCancel(mem_no) {
			
			let str = "/banCancel.do?mem_no="+mem_no;
			location.href = str;
		}
		
		function openModal(mem_no) {
			document.querySelector('#board'+mem_no).style.display="";
		}
		
		function closeModal(mem_no) {
			document.querySelector('#board'+mem_no).style.display = "none";
		};
	</script>
</body>
</html>
