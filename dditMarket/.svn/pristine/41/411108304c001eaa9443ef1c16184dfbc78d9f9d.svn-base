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
<style>
div {
	margin-left: auto;
	margin-right: auto;
}

.footer {
	top: 200px;
}

</style>
</head>
<body>
	<!-- Navigation-->
	<%@include file="/include/navigation.jsp"%>
	
	<div class="col-sm-8 text-left">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>No.</th>
					<th>거래물품</th>
					<th>리뷰 내용</th>
					<th>작성자</th>
					<th>작성일</th>
				</tr>
			</thead>
			<tbody>
				<%
					List<IReviewVO> reviewList = (List<IReviewVO>) request.getAttribute("reviewList"); // controller 값 꺼내기
				if (reviewList != null) {
					for (int i = 0; i < reviewList.size(); i++) {
						//	for (NoticeVO nv : noticeList) {
				%>
				<!-- <td onClick="함수이름()">링크로 이동</td> -->
				<tr onclick="location.replace('<%=request.getContextPath()%>/reviewDetail.do?rev_no=<%=reviewList.get(i).getREV_NO()%>')">
					<td><%=i + 1%></td>
					<td><%=reviewList.get(i).getPROD_NM() %></td>
					<td><%=reviewList.get(i).getREV_CONTENT()%></td>
					<td><%=reviewList.get(i).getMEM_NM()%></td>
					<td><%=reviewList.get(i).getREV_DY()%></td>
				</tr>
				<%
					} //for end
				} else {
				%>
				<tr>
					<td colspan="4" style="text-align: center;">리뷰 없음</td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
	</div>

	<!-- Footer-->
	<%@include file="/include/footer.jsp"%>

	<script src="/js/scripts.js"></script>
</body>
</html>