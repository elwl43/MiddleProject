<%@page import="kr.or.ddit.complain.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    BoardVO bv = (BoardVO)request.getAttribute("bv");
%> 
 
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>글 수정</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link href="../css/styles.css" rel="stylesheet">
<style>
body {
    padding-top: 50px;
    background-color: #f8f9fa;
}
.container {
    max-width: 800px;
    margin: auto;
    padding: 20px;
    background-color: #fff;
    border-radius: 8px;
    box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
}
form {
    margin-top: 20px;
}
table {
    width: 100%;
    margin-bottom: 20px;
    border-collapse: collapse;
}
table td, table th {
    padding: 10px;
    border: 1px solid #ccc;
    text-align: left;
}
input[type="text"], textarea {
    width: 100%;
    padding: 8px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    margin-top: 5px;
    margin-bottom: 10px;
    resize: vertical;
}
input[type="submit"] {
    background-color: #007bff;
    color: #fff;
    border: none;
    padding: 10px 20px;
    cursor: pointer;
    border-radius: 4px;
    font-size : 15px;
    width: 760px;
}
input[type="submit"]:hover {
    background-color: #0056b3;
}
</style>
</head>
<body>
    <div class="container">
        <form id="updateForm" action="/complainupdate.do?cmp_no=<%=bv.getCmp_no()%>" method="post" enctype="multipart/form-data">
            <h2 class="text-center">글 수정</h2>
            <table>
                <tr>
                    <td>No.</td>
                    <td><%=bv.getCmp_no()%></td>
                </tr>
                <tr>
                    <td>수정할 제목</td>
                    <td><input type="text" name="cmp_title" value="<%=bv.getCmp_title()%>"></td>
                </tr>
                <tr>
                    <td>수정할 내용</td>
                    <td><textarea name="cmp_content" rows="10"><%=bv.getCmp_content() %></textarea></td>
                </tr>
            </table>
            <input type="submit" value="등록" class="btn btn-primary">
        </form>
    </div>

    <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    
    <script>
        function displayMessage() {
            alert('수정 완료!');
        }
        $(document).ready(function() {
            $('#updateForm').submit(function() {
                displayMessage();
            });
        });
    </script>
</body>
</html>