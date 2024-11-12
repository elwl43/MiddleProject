<%@ page import="kr.or.ddit.complain.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String joinCd = (String) request.getAttribute("joinCode");
%>
<!DOCTYPE html>
<html lang="ko">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="../css/styles.css" rel="stylesheet" />
<style>
#insertForm {
    margin: 50px auto;
    width: 80%;
    max-width: 800px;
}
.header {
    font-weight: bold;
}
#cate {
    width: 200px;
    background-color: #999999;
    color: white;
    border: none;
}
.warning {
    margin-top: 20px;
    padding: 17px;
    background-color: #f8d7da; 
    border-color: #f5c6cb;
    border-radius: .25rem;
}
.warning-content {
    font-weight: bold;
    margin-bottom: 10px;
}
.warning ul {
    list-style-type: disc;
    margin-left: 20px;
}
.btn-primary {
   width: 800px;
   margin-top: 20px;    
    font-size : 20px !important;
} 
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
</style>
</head>
<body>
    <%@include file="../include/navigation.jsp"%>

    <div id="insertForm">
        <% if ("join".equals(joinCd)) { %>
            <%@include file="join.jsp"%>
        <% } else { %>
            <form id="complainForm" action="<%=request.getContextPath()%>/complainInsert.do" method="post" enctype="multipart/form-data" onsubmit="return validateForm()">
                <h2 class="text-center">글쓰기</h2>
                <table class="table">
                    <tr>
                        <td class="header">제목</td>
                    </tr>
                    <tr>
                        <td><input type="text" class="form-control" placeholder="제목을 입력해주세요" name="title" value=""></td>
                    </tr>
                    <tr>
                        <td>유형 선택</td>
                    </tr>
                    <tr>
                        <td>
                            <select id="cate" name="cmpCtgyId" class="form-select">
                                <option value="none">유형을 선택해주세요</option>
                                <option value="1">거래신고</option>
                                <option value="2">회원/계정</option>
                                <option value="3">결제</option>
                                <option value="4">판매광고</option>
                                <option value="5">오류/신고/제안</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td class="header">문의 내용</td>
                    </tr>
                    <tr>
                        <td><textarea class="form-control" placeholder="문의 내용을 자세히 입력해주세요." name="cmpContent" rows="10" style="resize: vertical;"></textarea></td>
                    </tr>
                </table>

                <div class="warning">
                    <div class="warning-content">유의사항</div>
                    <ul>
                        <li>상담에 필요한 정보 외 개인정보를 포함하지 않도록 주의해주세요.</li>
                        <li>산업안전 보건법에 따라 고객응대 근로자 보호조치를 시행하고 있어요. 욕설 또는 폭언을 하지 말아주세요.</li>
                        <li>자주묻는질문을 확인하면 답변을 빨리 받을 수 있어요.</li>
                        <li>접수는 24시간 가능하지만, 답변은 9시 - 18시 사이에 순차적으로 받을 수 있어요.</li>
                        <li>문의취소는 접수상태에서만 가능해요.</li>
                    </ul>
                </div>

                <div class="text-center">
                    <input type="submit" class="btn btn-primary" value="등록">
                </div>
            </form>
        <% } %>
    </div>

    <%@include file="../include/footer.jsp"%>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <script src="../js/scripts.js"></script>
    <script>
        function validateForm() {
            var category = document.getElementById("cate").value;
            if (category == "none") {
                alert("유형을 선택해주세요");
                return false;
            } else {
                alert("등록 완료");
            }
            return true;
        }
    </script>
</body>
</html>
