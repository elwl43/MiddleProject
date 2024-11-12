<%@page import="kr.or.ddit.review.vo.IReviewVO"%>
<%@page import="kr.or.ddit.board.sailvo.SailBoardVO"%>
<%@ page import="kr.or.ddit.board.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String joinCd = (String) request.getAttribute("joinCode");
SailBoardVO sbd = (SailBoardVO) request.getAttribute("sbd"); // 해당 게시판의 모든 정보
IReviewVO irv = (IReviewVO) request.getAttribute("irv"); // 해당 리뷰의 모든 정보
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
<link href="../css/styles.css" rel="stylesheet" />

<!-- 폰트  -->
<link href="/css/font.css" rel="stylesheet" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Cute+Font&display=swap" rel="stylesheet">


<style>

/* 기본 폼 스타일 */
.cute-font-regular {
    font-family: 'Cute Font', cursive;
}

#insertForm {
    width: 60%;
    margin: 0 auto;
    border-collapse: collapse;
}

#insertForm td {
    padding: 20px;
    text-align: center;
}

#insertForm h2 {
    margin-bottom: 20px;
    color: #333;
}

#insertForm .header {
    background-color: #f8f9fa;
    font-weight: bold;
}

/* 파일 업로드 스타일 */
.filebox {
    position: relative;
    width: 100%;
}

.upload-name {
    display: inline-block;
    width: calc(100% - 100px);
    height: 40px;
    padding: 0 10px;
    font-size: 20px;
    vertical-align: middle;
    background-color: #f5f5f5;
    border: 2px solid #747474;
    border-radius: 5px;
    box-sizing: border-box;
}

.filebox label {
    display: inline-block;
    padding: 10px 20px;
    color: #fff;
    font-size: 18px;
    font-weight: 700;
    line-height: 40px;
    vertical-align: middle;
    background-color: #5a6268;
    cursor: pointer;
    height: 40px;
    margin-left: 10px;
    border-radius: 5px;
}

.filebox input[type="file"] {
    position: absolute;
    width: 0;
    height: 0;
    padding: 0;
    overflow: hidden;
    border: 0;
}

/* 텍스트 영역 스타일 */
textarea {
    width: calc(100% - 40px);
    padding: 20px;
    font-size: 18px;
    border: 1px solid #ddd;
    border-radius: 5px;
    resize: vertical;
     border: 2px solid #747474;
}

/* 버튼 스타일 */
input[type="submit"] {
    display: inline-block;
    padding: 10px 20px;
    font-size: 30px;
    color: #fff;
    background-color: #28a745;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    transition: background-color 0.3s ease;
}

input[type="submit"]:hover {
    background-color: #218838;
}

input[type="submit"]:last-child {
    background-color: #dc3545;
}

input[type="submit"]:last-child:hover {
    background-color: #c82333;
}

/* 반응형 디자인 */
@media (max-width: 767.98px) {
    #insertForm {
        font-size: 16px;
    }

    .upload-name,
    .filebox label,
    textarea {
        font-size: 16px;
    }

    input[type="submit"] {
        font-size: 16px;
        padding: 8px 16px;
    }
}
</style>
</head>
<body>
	<!-- Navigation-->
	<%@include file="/include/navigation.jsp"%>

	<%
		if (joinCd == "join") {
	%>
	<%@include file="/join.jsp"%>
	<%
		} else {

	String rev_no = request.getParameter("rev_no");
	%>

<span class="cute-font-regular">
	<form action="<%=request.getContextPath()%>/reviewupdate.do?rev_no=<%=rev_no%>" method="post" enctype="multipart/form-data">
		<table id="insertForm">
			<tr>
				<td colspan=3><h2 style="font-size: 60px"><b>리뷰 수정</b></h2></td>
			</tr>
			<tr>
				<td colspan=3 style="font-size: 30px"><b>첨부파일</b></td>
			</tr>
			<tr>
				<td colspan=3>
					<div class="filebox">
						<input class="upload-name" value="첨부파일" placeholder="첨부파일"> <label for="file" style=" align-items: center;">파일찾기</label> <input type="file" id="file" name="atchFile" multiple="multiple" value="">
					</div>
				</td>
			</tr>
			<tr>
				<td class="header" colspan=3 style="font-size: 30px"><b>Comment</b></td>
			</tr>
			<tr>
				<td colspan=3><textarea name="rev_content" rows="20" cols="100" style="width: 100%"><%=irv.getREV_CONTENT()%></textarea></td>
			</tr>
		</table>
		<div style="text-align: center; margin-bottom: 30px;" >
		<input type="submit" value="등록" onclick="alert('작성 완료')"> 
		<input type="submit" value="삭제" onclick="alert('삭제 완료')">
		</div>
	</form>
</span>
	<%
		}
	%>
	<!-- Footer-->
	<%@include file="/include/footer.jsp"%>

	<!-- Bootstrap core JS-->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="/js/scripts.js"></script>

	<script src="http://code.jquery.com/jquery-latest.min.js"></script>

	<script>
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
	</script>
</body>
</html>