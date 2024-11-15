<%-- <%@page import="com.sun.xml.internal.bind.CycleRecoverable.Context"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String memId = (String) request.getAttribute("memId");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<link href="/css/styles.css" rel="stylesheet" />

<!-- 폰트  -->
<link href="/css/font.css" rel="stylesheet" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Cute+Font&display=swap" rel="stylesheet">

<title>Insert title here</title>
<style>
html, body {
	height: 100%;
}

.form-signin {
	max-width: 330px;
	padding: 1rem;
}

.form-signin .form-floating:focus-within {
	z-index: 2;
}

.form-signin input[type="id"] {
	margin-bottom: -1px;
	border-bottom-right-radius: 0;
	border-bottom-left-radius: 0;
}

.form-signin input[type="password"] {
	margin-bottom: 10px;
	border-top-left-radius: 0;
	border-top-right-radius: 0;
}
</style>
</head>
<body>
	<%@include file="../include/navigation.jsp"%>
	<%-- action="<%=request.getContextPath() %>/login.do --%>

	<span class=cute-font-regular>
		<main class="form-signin w-100 m-auto">
			<form class="form-signin" method="post" onsubmit="valid(event)">
				<!--     <img class="mb-4" src="" alt="" width="72" height="57"> -->
				<h1 class="h3 mb-3 fw-normal" style="font-size: 45px">비밀번호 찾기</h1>

				<div class="form-floating" style="margin-bottom: 10px">
					<input type="text" class="form-control" id="userId" placeholder="id" name="mem_id"> <label for="userId" style="font-size: 20px">아이디</label>
				</div>
				<div class="form-floating" style="margin-bottom: 10px">
					<input type="text" class="form-control" id="userReg" placeholder="email" name="mem_mail"> <label for="userReg" style="font-size: 20px">이메일</label>
				</div>
				<!--     <button class="btn btn-primary w-100 py-2" type="submit">아이디 찾기</button><br><br> -->
				<!--     <input type="button" class="btn btn-primary w-100 py-2" value="회원가입" onclick="join()"><br><br> -->
				<!-- 	<input type = "submit" value="임시비밀번호 보내기" style="font-size: 30px"/> -->
				<button class="btn btn-primary w-100 py-2" type="submit" style="font-size: 25px">이메일 보내기</button>
				<br>
				<br>
			</form>
		</main>
	</span>
	<div style="height: 100px">
	</div>
	<%@include file="../include/footer.jsp"%>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	<script>
	function valid(e) {
		e.preventDefault();
		let formData = $('form').serialize(); //key1=value1&key2=value2&....&key9=value9 
		console.log(formData);
		$.ajax({
			type: 'post',
			url: '/sendEmail.do',
			data: formData, //url인코딩(%인코딩)
			success:function(rs){
				 console.log("응답>>", rs);
				 if(rs == "null"){
					 alert("이메일을 확인해주세요");
					 location.href = "/loginForm.jsp";
				 }else {
					 alert("비밀번호 찾기 실패");
				 }
			},
			error:function(xhr){
					alert("상태 확인: " + xhr.status);
					location.href = "/loginForm.jsp";
				
			}
//	 	 	,dataType: '' 
		 })
	}
	const inputField = document.getElementById('userId');
    const label = document.querySelector('label[for="userId"]');

    inputField.addEventListener('focus', () => {
      label.style.display = 'none';
    });

    inputField.addEventListener('blur', () => {
      if (inputField.value == "") {
        label.style.display = 'block';
      }
    });

    const inputFiePass = document.getElementById('userReg');
    const label2 = document.querySelector('label[for="userReg"]');

    inputFiePass.addEventListener('focus', () => {
      label2.style.display = 'none';
    });

    inputFiePass.addEventListener('blur', () => {
      if (inputFiePass.value == "") {
        label2.style.display = 'block';
      }
    });
	</script>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>