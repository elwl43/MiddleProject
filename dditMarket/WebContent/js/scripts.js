function boardInsert(){
	location.replace("/insert.do");
}
/*공지사항 목록*/
function listNotice(){
	location.replace("/noticelist.do");
	}

/* 공지사항 등록 */
function noticeinsert(){
	location.replace("/noticeinsert.do");
	}
/* QnA 등록하기*/
function qnainsert(){
	location.replace("/qbinsert.do");
}					
/* QnA 리스트(목록)*/
function qnaList(){
	location.replace("/qblist.do");
}
function LoginStart(){
	location.replace("/loginForm.jsp");
}

/* 문의사항 목록  */
function listBoard(){
	location.replace("/Main");
}

/* 문의사항 수정  */
function updateBoard(){
	location.replace("/complainUpdate.jsp");
}


//function updateBoard(){  
//	document.frm.action = "complainUpdate.jsp";  
//	document.frm.method = "post";  
//	document.frm.submit();
//}

$('#btmysale').on('click', function() {

	$("#mpblank").empty();
	var bodyHtml = "<a href='/mySailng.do'><button id='myprod' style='background-color: gray; font-size: 20px; color: black;'>내 상품 관리</button></a>" + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<a href='/mySold.do'><button id='mysale' style='background-color: gray; font-size: 20px; color: black;'>판매내역</button></a>";
	$("#mpblank").append(bodyHtml);
});

$('#btmybuy').on('click', function() {
	$("#mpblank").empty();
	var bodyHtml = "<a href='/myWant.do'><button style='background-color: gray; font-size: 20px; color: black;'>찜 목록</button></a>" + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<a href='/myBuy.do'><button style='background-color: gray; font-size: 20px; color: black;'>구매 내역</button></a>";
	$('#mpblank').append(bodyHtml);
});

$('#popup').on('click', function(){
	$("#pop").empty();
	var bodyHtml = "<button style='background-color: gray; font-size: 20px; color: black;'>카드 결제</button></a>" + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<button style='background-color: gray; font-size: 20px; color: black;'>계좌 송금</button></a>";
	$('#pop').append(bodyHtml);
});
