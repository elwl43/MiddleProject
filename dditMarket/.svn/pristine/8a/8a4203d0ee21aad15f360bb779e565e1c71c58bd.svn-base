<%@page import="kr.or.ddit.questionboard.vo.QnaBoardVO"%>
<%@page import="com.sun.java_cup.internal.runtime.virtual_parse_stack"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/css/styles.css" rel="stylesheet" />
<link href="/css/notice/noticelist.css" rel="stylesheet" />
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>

<title>Q&A 전체리스트</title>
<style>
.btn-group {
            display: flex;
            align-items: center;
            border-radius: 20px;
            background-color: transparent;
            border: 2px solid black;
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
        .btn-group label:hover {
            background-color: rgba(0, 0, 0, 0.1);
        }
        .btn-group .divider {
            width: 1px;
            background-color: black;
            height: 100%;
        }
</style>
</head>
<body>
	<!-- Navigation-->
	<%@include file="/include/navigation.jsp"%>


<%--  메인! --%>
<div class="section section-properties">
	  <div class="container">
	   	<div class="two_third first" style="height:auto">
		<%--  그림 헤더! --%>
<div class="hero page-inner overlay" 
style="background-image: url(../image/dong.jpg"); height:50vh;">

		<div class="container">
			<div class="row justify-content-center align-items-center">
				<div class="col-lg-9 text-center mt-5">
					<h1 class="heading_signup" data-aos="fade-up"></h1>
					  <br>
					  
				</div>
			</div>
		</div> 
	</div>
	  <br>

  <!-- notice list area -->
  <div class="btn-group" role="group">
        <input type="radio" class="btn-check" name="btnradio" id="btnradio1" autocomplete="off" onclick="location.href='<%=request.getContextPath()%>/noticelist.do'">
        <label class="btn btn-secondary" for="btnradio1">공지사항</label>
        
        <div class="divider"></div>
        
        <input type="radio" class="btn-check" name="btnradio" id="btnradio2" autocomplete="off" onclick="location.href='<%=request.getContextPath()%>/qblist.do'">
        <label class="btn btn-secondary" for="btnradio2">QnA</label>
    </div>
	 
	<h1 style="text-align: center;"><b>자주하는 질문<b></b></h1>
	<br>
<table>
<%
		List<QnaBoardVO> qnalist = (List<QnaBoardVO>) request.getAttribute("qnalist"); // controller 값 꺼내기
		 if (qnalist != null) {
		for(int i=0; i<qnalist.size(); i++){
		%>	
		
<div class="accordion accordion-flush" id="accordionFlushExample">
  <div class="accordion-item">
    <h2 class="accordion-header">
   <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseOne<%=i %>" aria-expanded="false" aria-controls="flush-collapseOne">
       <h5><b>💡Q.</b></h5> <h5><b> &nbsp <%=qnalist.get(i).getQnaTitle() %></b></h5>
      </button>
    </h2>
    <div id="flush-collapseOne<%=i %>" class="accordion-collapse collapse" data-bs-parent="#accordionFlushExample">
      <div class="accordion-body"><%=qnalist.get(i).getQnaContent() %></div>
    </div>
  </div>
  </div>
</table>
	<%
		}
		 }else{
	%>
		<tr>
			<td colspan="2" style="text-align: center;">QnA 없음</td>
		</tr>
	<%
		}
	%>
	
	<%	//관리자O
	if (adv != null) {
	%>
	<tr><td><button class="btn btn-secondary" onclick="qnainsert()" style="margin-bottom: 20px; margin-top: 20px">Q & A 등록</button></td></tr>
	<%
	}else{
		
	}
	%>

	<div class="hero page-inner overlay" style="background-image: url(../image/dong.jpg"); height:50vh;">
	

		<div class="container">
			<div class="row justify-content-center align-items-center">
				<div class="col-lg-9 text-center mt-5">
					<h1 class="heading_signup" data-aos="fade-up"></h1>
				</div>
			</div>
		</div> 
	</div>

	</div>
	</div>
	</div>
	
	<!-- footer.jsp -->
	<%@include file="/include/footer.jsp"%>
	
</body>
	<script src="/js/scripts.js"></script>
	<script src="https://code.jquery.com/jquery-latest.min.js"></script><!-- 아코디언 실행 script  -->
	<script>
	/*  onclick > detail */
	function detail(num) {
		location.replace("/noticedetail.do?notNo="+num);			
	}
	
	</script>
</html>