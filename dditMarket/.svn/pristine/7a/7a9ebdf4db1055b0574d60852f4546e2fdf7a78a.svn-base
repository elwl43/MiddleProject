<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<link href="/css/styles.css" rel="stylesheet" />

<!-- 폰트  -->
<link href="/css/font.css" rel="stylesheet" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Cute+Font&display=swap" rel="stylesheet">


<title>삭제하기</title>
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

	<span class=cute-font-regular> <!--폰트  -->

		<main class="form-signin w-100 m-auto">
			<form class="form-signin" method="post" onsubmit="valid(event)">
				<!--     <img class="mb-4" src="" alt="" width="72" height="57"> -->
				<h1 class="h3 mb-3 fw-normal">회원 탈퇴하기</h1>

				<div class="form-floating">
					<input type="text" class="form-control" id="userId" placeholder="id" name="mem_id"> <label for="floatingInput">아이디</label>
				</div>
				<div class="form-floating">
					<input type="text" class="form-control" id="userReg" placeholder="주민등록번호 앞자리" name="mem_regno1"> <label for="floatingPassword">주민등록번호 앞자리 입력</label>
				</div>
				<button class="btn btn-primary w-100 py-2" type="submit">회원 탈퇴하기</button>
				<br>
				<br>
			</form>
		</main>
	</span>
	<div style="height: 150px">
	</div>
	<%@include file="../include/footer.jsp"%>.
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	<script>
		function valid(e) {
			e.preventDefault();
			let formData = $('form').serialize(); //key1=value1&key2=value2&....&key9=value9 
			console.log(formData);
			$.ajax({
				type : 'post',
				url : '/delId.do',
				data : formData, //url인코딩(%인코딩)
				success : function(rs) {
					console.log("응답>>", rs);
					if (rs != 0) {
						location.href = "/index.do";
					} else {
						location.href = "/index.do"
					}
				},
				error : function(xhr) {
					console.log("상태 확인: " + xhr.status);

				}
			//		 	 	,dataType: '' 
			})
		}
	</script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>