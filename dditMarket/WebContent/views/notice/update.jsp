<%@page import="kr.or.ddit.notice.vo.NoticeVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>

<%
   NoticeVO nv = (NoticeVO) request.getAttribute("nv");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/css/styles.css" rel="stylesheet" />
<title>회원정보 변경</title>
</head>
<body>
   <!-- Navigation-->
   <%@include file="/include/navigation.jsp"%>

   <div class="col-sm-8" style= "align-content: center; margin-left:15%";>
      <table class="table table-hover">
                  <hr/>
                  <%--  그림 헤더! --%>
                  <div class="hero page-inner overlay" style="background-image: url(../image/dong.jpg"); height:50vh;">
                        <div class="row justify-content-center align-items-center">
                           <div class="col-lg-9 text-center mt-5">
                              <h1 class="heading_signup" data-aos="fade-up"></h1>
                           </div>
                        </div>
                  </div>


         <div class="section section-properties" style="text-align: center;" >
            <div class="container">
               <div class="two_third first" style="height: auto">
                  <div class="col-lg-12">
                     <h2 class="font-weight-bold text-primary heading">
                     
                     <hr/>
                        <b style="color: black;">공지사항 수정하기</b>
                     </h2>
                     <hr/>
                     
                     <form action="/noticeupdate.do?notNo=<%=nv.getNotNo()%>"
                        method="post" enctype="multipart/form-data">
                        <table class="table" style="text-align: center;">
                           <tr>
                           <th class="text-right"><h6><b>No.</b></h6></th>
                           <td style="text-align: left;"><%=nv.getNotNo()%></td> 
                           <tr>
                              <th class="text-right"><h6><b>Title</b></h6></th>
                                    <td><input type=text name="notTitle" style="box-sizing: border-box;  width: 100%; height: 100%; overflow: auto; resize: none; value="<%=nv.getNotTitle()%> ></td>
                              </td>
                           </tr>
                           <tr>
                              <th class="text-right"><h6><b>Content</b></h6></th>
                              <td> <textarea name="notContent" style="box-sizing: border-box;  width: 100%; height: 100%; overflow: auto; resize: none; value="<%=nv.getNotContent() %> ></textarea></td>
                           </tr>
                        </table>
                        <form id="noticeForm">
                       <button type="submit" class="btn btn-success" onclick="alert('수정 완료!')">공지사항 수정등록</button>
                        </form>
               <div class="two_third first" style="height: auto">
                  <hr />
                  <%--  그림 헤더! --%>
                  <div class="hero page-inner overlay" style="background-image: url(../image/dong.jpg"); height:50vh;">
                        <div class="row justify-content-center align-items-center">
                           <div class="col-lg-9 text-center mt-5">
                              <h1 class="heading_signup" data-aos="fade-up"></h1>
                           </div>
                        </div>
                              </div>
                        </div>
                     </form>
                     </div>
               </div>
            </div>
         </div>
      </table>
   </div>
   
</body>

<!-- footer.jsp -->
<%@include file="/include/footer.jsp"%>
<script>
document.getElementById('noticeForm').addEventListener('submit', function(event) {
    event.preventDefault(); // 폼의 기본 제출 동작을 막음
    alert("수정이 성공적으로 완료되었습니다!");
});

</script>
</html>