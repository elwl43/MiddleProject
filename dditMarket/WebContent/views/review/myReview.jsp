<%@page import="kr.or.ddit.review.vo.IReviewVO"%>
<%@page import="kr.or.ddit.file.vo.AtchSmpleVO"%>
<%@page import="kr.or.ddit.board.sailvo.SailBoardVO"%>
<%@page import="kr.or.ddit.review.vo.ReviewVO"%>
<%@page import="kr.or.ddit.notice.vo.NoticeVO"%>
<%@page import="kr.or.ddit.complain.vo.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String joinCd = (String) request.getAttribute("joinCode"); // 회원가입을 진행중인 상태인지 아닌지 join 이면 회원가입을 진행중인 상태 null 이면 회원가입중이 아님
List<SailBoardVO> sailList = (List<SailBoardVO>) request.getAttribute("sailList");
List<AtchSmpleVO> smpleList = (List<AtchSmpleVO>) request.getAttribute("smpleList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
<link href="../css/styles.css" rel="stylesheet" />

<!-- 폰트  -->
<link href="/css/font.css" rel="stylesheet" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Cute+Font&display=swap" rel="stylesheet">



<style>
div {
	margin-left: auto;
	margin-right: auto;
}
/* 기본 테이블 스타일 */
.table {
    width: 100%;
    margin-bottom: 3rem;
}

.table th,
.table td {
    padding: 1rem;
}

.table-hover tbody tr:hover {
    background-color: rgba(0, 0, 0, 0.075);
}

/* 테이블 헤더 스타일 */
.table th {
    background-color:#d1e6e9;
    font-weight: bold;
    text-align: center;
}

/* 테이블 본문 스타일 */
.table td {
    text-align: center;
}
.btn btn-outline-dark mt-auto{
background-color: red;

}

</style>
</head>
<body>
	<!-- Navigation-->
	<%@include file="/include/navigation.jsp"%>
<span class="cute-font-regular">
	<div class="col-sm-8 text-left">
		<table class="table table-hover" style="font-size: 25px" >
				<tr>
					<th>No.</th>
					<th>거래물품</th>
					<th>리뷰 내용</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>수정 및 삭제</th>
				</tr>
			<tbody style="height: 300px">
				<%
					List<IReviewVO> myReview = (List<IReviewVO>) request.getAttribute("myReview"); // controller 값 꺼내기
				if (myReview != null) {
					for (int i = 0; i < myReview.size(); i++) {
				%>
				<!-- <td onClick="함수이름()">링크로 이동</td> -->
				<tr ondblclick="location.replace('<%=request.getContextPath()%>/reviewDetail.do?rev_no=<%=myReview.get(i).getREV_NO()%>')">
					<td><%=i + 1%></td>
					<td><%=myReview.get(i).getPROD_NM()%></td>
					<td><%=myReview.get(i).getREV_CONTENT()%></td>
					<td><%=myReview.get(i).getMEM_NM()%></td>
					<td><%=myReview.get(i).getREV_DY()%></td>
					<td><a class="btn btn-outline-dark mt-auto" href="<%=request.getContextPath()%>/reviewupdate.do?rev_no=<%=myReview.get(i).getREV_NO()%>" style="background-color: red; color:white"><b>수정</b></a> 
						<a class="btn btn-outline-dark mt-auto" href="/deletereview.do?sale_no=<%=myReview.get(i).getSALE_NO() %>" style="background-color: blue; color:white">삭제</a></td>
				</tr>
				<%
					} //for end
				} else {
				%>
				<tr>
					<td colspan="5" style="text-align: center;">리뷰 없음</td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
	</div>
</span>
	<!-- Footer-->
	<%@include file="/include/footer.jsp"%>

	<script src="/js/scripts.js"></script>
</body>
</html>