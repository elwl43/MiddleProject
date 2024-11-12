<%@page import="kr.or.ddit.board.sailvo.SailBoardVO"%>
<%@ page import="kr.or.ddit.board.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String joinCd = (String) request.getAttribute("joinCode");
SailBoardVO sbd = (SailBoardVO) request.getAttribute("sbd"); // 해당 게시판의 모든 정보
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
<link href="../css/styles.css" rel="stylesheet" />
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

<style>
.star_rating {
  width: 100%; 
  box-sizing: border-box; 
  display: inline-flex; 
  float: left;
  flex-direction: row; 
  justify-content: flex-start;
}
.star_rating .star {
  width: 25px; 
  height: 25px; 
  margin-right: 10px;
  display: inline-block; 
  background: url('https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FE2bww%2FbtsviSSBz4Q%2F5UYnwSWgTlFt6CEFZ1L3Q0%2Fimg.png') no-repeat; 
  background-size: 100%; 
  box-sizing: border-box; 
}
.star_rating .star.on {
  width: 25px; 
  height: 25px;
  margin-right: 10px;
  display: inline-block; 
  background: url('https://blog.kakaocdn.net/dn/b2d6gV/btsvbDoal87/XH5b17uLeEJcBP3RV3FyDk/img.png') no-repeat;
  background-size: 100%; 
  box-sizing: border-box; 
}

.star_box {
  width: 400px;
  box-sizing: border-box;
  display: inline-block;
  margin: 15px 0;
  background: #F3F4F8;
  border: 0;
  border-radius: 10px;
  height: 100px;
  resize: none;
  padding: 15px;
  font-size: 13px;
  font-family: sans-serif;
}
.btn02 {
  display:block;
  width: 200px;
  height: 50px;
  font-weight: bold;
  border: 0;
  border-radius: 10px;
  padding: 15px 0;
  font-size: 1.1em;
  text-align: center;
  background:rgb(206, 185, 159);
  margin-top: 20px; 
  margin-bottom: 0px;
}
.star_rating {
  display: flex;
  justify-content: center;
  align-items: center;
}
</style>
 
</head>
<body>
	<%
		if (joinCd == "join") {
	%>
<%@include file="/join.jsp"%>
	<%
		} else {

	String sale_no = request.getParameter("sale_no");
	%>
<form action="<%=request.getContextPath()%>reviewinsert.do?sale_no=<%=sale_no%>" method="post" enctype="multipart/form-data" style="text-align: center; display: flex; flex-direction: column; align-items: center; justify-content: center; height: 100vh;">
  <h1 style="margin-top: 0;"><b>후기작성</b></h1>
  <div class="star_rating" style="margin-top: 20px; margin-bottom: 20px;">
    <span class="star on" value="1"> </span>
    <span class="star" value="2"> </span>
    <span class="star" value="3"> </span>
    <span class="star" value="4"> </span>
    <span class="star" value="5"> </span>
  </div>
  <textarea class="star_box" name="rev_content" value="" placeholder="리뷰 내용을 작성해주세요." style="width: 80%; height: 100px; margin-bottom: 20px;"></textarea>
  <div class="filebox" style="margin-bottom: 0px;">
    <input class="upload-name" value="첨부파일" placeholder="첨부파일" style="align-items: center;"> 
    <input type="file" id="file" name="atchFile" multiple="multiple">
  </div>
<!--   <div id="btn_submit" style="padding: 50px 20px; margin-top: 0px; margin-bottom: 0px; "> -->
    <input type="submit" class="btn02" value="리뷰 등록" >
<!--  </div>   -->
</form>
<%
		}
%>
   <!-- jQuery 라이브러리 추가 -->
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script>
	/* 별점 주기 */
	 $('.star_rating > .star').click(function() {
	      $(this).parent().children('span').removeClass('on');
	      $(this).addClass('on').prevAll('span').addClass('on');
	    });
	
		let i = 0;

		document.querySelector('#file').addEventListener(
				'change',
				function() {
					if (i == 0) {
						document.querySelector('.upload-name').value = '';
					}
					var fileName = document.querySelector('#file').value;
					console.log(fileName);
					var file = fileName.substring(
							(fileName.lastIndexOf('\\') + 1), fileName.length);
					console.log(file);
					if (i == 0) {
						document.querySelector('.upload-name').value += file;
						i++;
					} else {
						document.querySelector('.upload-name').value += ', '
								+ file;
					}
				});
	        // 팝업창 닫기
// 	        $(document).ready(function() {
// 	            $(".btn02").on('click', function(){
// 	            alert("등록되었습니다");
// 	            self.close();
// 	        });
// 	    });
	        
	$(function() {
    	$(".btn02").click( function() {
        	 $('.btn02').submit();
         	 setTimeout(function() {
        		 alert("등록되었습니다.");
             		window.close();
          	}, 100);
      	});
	 });
		
	</script>
</body>
</html>