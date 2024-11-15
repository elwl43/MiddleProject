<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String loginFail = (String) request.getAttribute("loginFail") == null ? "log" : "loginFail";
%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 	<script src="/docs/5.3/assets/js/color-modes.js"></script> -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

<!-- 폰트  -->
<link href="/css/font.css?after" rel="stylesheet" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Cute+Font&display=swap" rel="stylesheet">

<link href="css/styles.css" rel="stylesheet" />
<title>Insert title here</title>
<style>
/* html, */
/* body { */
/*   height: 100%; */
/* } */

/* .form-floating { */
/* 	min-height: calc(100vh-35rem); */
/* } */
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
	margin-top: 5px
}

/* #fint-id { */
/* 	display:inline-block; */

/* } */
/* #fint-pw { */
/* 	display:block; */

/* } */

/* 로고  */
.ddit-market {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 30vh;
	/* 필요에 따라 조절 */
}
</style>
</head>

<body>
	<span class="cute-font-regular" style="font-size: 25px">
		<main class="form-signin w-100 m-auto">
			<form class="form-signin" method="post" action="<%=request.getContextPath()%>/login.do">
				<a class="navbar-brand" href="<%=request.getContextPath()%>/index.do">
					<div class="ddit-market">
						<img class="mb-4" src="image/dditmarket.png" alt="logo">
					</div>
				</a>
				<h1 class="h3 mb-3 fw-normal" style="text-align: center; font-size: 50px">
					<b>로그인</b>
				</h1>

				<div class="form-floating">
					<input type="text" class="form-control" id="userId" placeholder="id" name="userId"> <label for="userId">아이디 입력</label>
				</div>
				<div class="form-floating">
					<input type="password" class="form-control" id="userPw" placeholder="Password" name="userPw"> <label for="userPw">비밀번호 입력</label>
				</div>
				<!--     <div class="form-check text-start my-3"> -->
				<!--       <input class="form-check-input" type="checkbox" value="remember-me" id="flexCheckDefault"> -->
				<!--       <label class="form-check-label" for="flexCheckDefault"> -->
				<!--         Remember me -->
				<!--       </label> -->
				<!--     </div> -->
				<button class="btn btn-primary w-100 py-2" type="submit" style="font-size: 25px">로그인</button>
				<br> <br> <input type="button" class="btn btn-primary w-100 py-2" value="회원가입" onclick="join()" style="font-size: 25px"><br> <br>
				<hr>
				<a class="btn btn-primary py-2" href="memViews/findIdForm.jsp" role="button" id="find-id" style="font-size: 20px; width: 132px; margin-right: 2px">아이디찾기</a><a class="btn btn-primary py-2" href="memViews/findPwForm.jsp" role="button" id="find-pw" style="font-size: 20px; width: 132px">비밀번호찾기</a>

			</form>
	</span>
	</main>

	<%@include file="../include/footer.jsp"%>
	<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
	<script>
		if('<%=loginFail%>' == 'loginFail'){
			Swal.fire({
				  icon: "error",
				  title: "로그인 실패",
				  text: "다시 입력해주시길바랍니다.",
			  });
			
		} 
        function join() {
          location.replace("/join.do");
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

        const inputFiePass = document.getElementById('userPw');
        const label2 = document.querySelector('label[for="userPw"]');

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