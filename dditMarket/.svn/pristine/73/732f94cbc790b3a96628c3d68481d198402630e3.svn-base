<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.complain.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    BoardVO bv = (BoardVO) request.getAttribute("bv");
%>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="../css/styles.css" rel="stylesheet" />
<style>
body {
    margin: 0;
    background-color: #eef2f3;
}
.container {
/*      max-width: 800px;  */
    margin: auto;  
    padding: 15px;
    border-radius: 8px;  
    box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1); 
}
h2 {
    text-align: center;
    margin-bottom: 20px;
    color: #333;
}
table {
    width: 100%;
    margin-bottom: 20px;
    border-collapse: collapse;
}
table th {
    background-color: rgb(218, 231, 255);
    text-align: center;
}
table th, table td {
    padding: 15px;
    border: 1px solid #ccc;
    text-align: center;
}
.btn-list, .btn-warning, .btn-danger {
    width: 100%;
    margin-bottom: 10px;
}
.btn-list {
    background-color: #5bc0de;
    color: white;
/*     font-size : 15px;  */
}
.btn-list:hover {
    background-color: #31b0d5;
}
.btn-warning {
    background-color: #f0ad4e;
    color: white;
}
.btn-warning:hover {
    background-color: #ec971f;
}
.btn-danger {
    background-color: #d9534f;
    color: white;
}
.btn-danger:hover {
    background-color: #c9302c;
}
/* 푸터 스타일 */
.footer {
   background-color: #343a40;
   color: white;
/*    width: 100%; */
   padding: 60px 0 !important;
/* position:absolute; */
	margin-top: 60px;
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
</style>
</head>
<body>
    <%@include file="/include/navigation.jsp"%>
	<div class="container">
    <h2>[<%=bv.getCmp_title()%>] 에 대한 답변</h2>

    <table>
        <tbody>
            <tr>
                <th>글 유형</th>
                <td><%=bv.getCmp_ctgy_nm()%></td>
                <th>작성일</th>
                <td><%=bv.getCmp_dy()%></td>
            </tr>
            <tr>
                <th>제목</th>
                <td colspan="3"><%=bv.getCmp_title()%></td>
            </tr>
            <tr>
                <th>작성자</th>
                <td colspan="3">관리자</td>
            </tr>
            <tr>
                <th>처리내역</th>
                <td colspan="3"><%=bv.getCmp_confirm()%></td>
            </tr>
        </tbody>
    </table>
    
    <div class="text-center">
        <button class="btn btn-list" onclick="listBoard()">목록</button>
    </div>
</div>

	<%@include file="/include/footer.jsp"%>
	<!-- Bootstrap core JS-->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="../js/scripts.js"></script>
</body>
</html>