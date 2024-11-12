<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.complain.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" /> -->
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"> -->
<link href="../css/styles.css?after" rel="stylesheet" />
<style>
html, body {
    height: 100%;
}
body {
    display: flex;
    flex-direction: column;
/*     padding-top: 50px; */
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
/* 푸터 스타일 */
.footer {
   background-color: #343a40;
   color: white;
 padding: 25px 0; 
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
</style>
</head>
<body>
    <%@include file="../include/navigation.jsp"%>

    <div class="container">
        <h2 class="text-center">문의 게시판</h2>

        <table class="table table-hover table-bordered">
            <thead>
                <tr class="active">
                    <th>No</th>
                    <th>제목</th>
                    <th>작성자</th>
                    <th>작성일</th>
                    <th>처리내역</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<BoardVO> list = (List<BoardVO>) request.getAttribute("list");
                    if (list != null) {
                        for (BoardVO board : list) {
                            String status = board.getCmp_confirm() != null ? "완료" : "대기중";
                %>
                <tr onclick="detail(<%= board.getCmp_no() %>)" style="cursor: pointer;">
                    <td><%= board.getCmp_no() %></td>
                    <td><%= board.getCmp_title() %></td>
                    <td><%= board.getCmp_writer() %></td>
                    <td><%= board.getCmp_dy() %></td>
                    <td onclick="checkStatus('<%= status %>', <%= board.getCmp_no() %>); event.stopPropagation();">
                        <%= status %>
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

        <!-- 페이징 처리 -->
        <nav aria-label="Page navigation" class="text-center">
            <ul class="pagination justify-content-center">
                <li class="prev"><a href="javascript:;">&laquo; Prev</a></li>
                <%
                    if (list != null) {
                        int sPage = (int) request.getAttribute("sPage");
                        int ePage = (int) request.getAttribute("ePage");
                        int cPage = (int) request.getAttribute("cPage");
                        for (int i = sPage; i <= ePage; i++) {
                            if (cPage == i) {
                %>
                <li class="active"><a href="javascript:;"><%= i %></a></li>
                <%
                            } else {
                %>
                <li><a href="javascript:;"><%= i %></a></li>
                <%
                            }
                        }
                    }
                %>
                <li class="next"><a href="javascript:;">Next &raquo;</a></li>
            </ul>
        </nav>
        
        <!-- 검색 Form -->
        <form class="search-form form-inline text-center" action="/Main" method="get">
            <select class="form-control" name="searchType" style="width: 70px">
                <option value="title">제목</option>
                <option value="content">내용</option>
                <option value="writer">작성자</option>
            </select>
            <input type="text" class="form-control search-input" name="searchKeyword" placeholder="검색어 입력" />
            <button type="submit" class="btn btn-primary">검색</button>
        </form>

        <div class="writeBtn" style="margin-bottom: 10px">
            <a href="/complainInsert.do">글 작성</a>
        </div>
    </div>

    <%@include file="../include/footer.jsp"%>

	<!-- Bootstrap core JS-->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="../js/scripts.js"></script>
    <script>
        // 페이지 번호 클릭 이벤트
        $('.pagination li').on('click', function(){
            location.href = "/Main?page=" + $(this).text(); 
        });

        let current;

        // next버튼 클릭 이벤트
        $('.next').on('click', function(){
            if(<%= request.getAttribute("cPage") %> == <%= request.getAttribute("ttPage") %>){
                current = <%= request.getAttribute("cPage") %>;
                alert("마지막 페이지입니다.");
            } else {
                current = <%= request.getAttribute("cPage") %> + 1;
            }
            location.href = "/Main?page=" + current; 
        });

        // prev버튼 클릭 이벤트
        $('.prev').on('click', function(){
            if(<%= request.getAttribute("cPage") %> == 1){
                current = <%= request.getAttribute("cPage") %>;
                alert("첫 페이지 입니다.");
            } else {
                current = <%= request.getAttribute("cPage") %> - 1;
            }
            location.href = "/Main?page=" + current; 
        });

        function detail(num) {
            location.replace("/complainDetail.do?cmpNo=" + num);            
        }

        function checkStatus(status, num) {
            if (status == "대기중") {
                alert("답변 준비중입니다");
            } else if (status == "완료") {
                location.replace("/complainConfirm.do?cmpNo=" + num);
            }
        }
    </script>
</body>
</html>
