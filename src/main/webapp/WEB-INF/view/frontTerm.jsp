<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>Bootstrap Example</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="/resources/css/frontTerm.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<body style="overflow-x: hidden; overflow-y: auto;" >
	<div id="wrap">
		<div style="width: 100%; height: 100px;" class="jumbotron">
			<nav style="position: relative; top: -54px;" class="navbar navbar-inverse">
				<div class="container-fluid">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>                        
						</button>
						<a class="navbar-brand" href="#">Fitnesscare</a>
					</div>
					<div id="myNavbar" class="collapse navbar-collapse">
						<ul class="nav navbar-nav">
							<li class="active"><a href="#">Home</a></li>
							<li class="dropdown" style="margin-left: 45px; ">
								<a class="dropdown-toggle" data-toggle="dropdown"  href="#">Program<span class="caret"></span></a>
								<ul style="position: absolute; left: -35px;" class="dropdown-content">
									<li><a style="text-decoration: underline; text-decoration-color: black; color: #5D6874;" href="#">Health Program</a></li>
									<li style="margin-top: 5px;"><a style="text-decoration: underline; text-decoration-color: black; color: #5D6874;" href="#">Videos</a></li>
									<li style="margin-top: 5px;"><a style="text-decoration: underline; text-decoration-color: black; color: #5D6874;" href="#">Curriculum</a></li>
								</ul>
							</li>
							<li class="dropdown"  style="margin-left: 60px; ">
								<a class="dropdown-toggle" data-toggle="dropdown" href="#">Diet<span class="caret"></span></a>
								<ul style="position: absolute; left: -45px;" class="dropdown-content">
									<li><a style="text-decoration: underline; text-decoration-color: black; color: #5D6874;" href="#">Recommended diet</a></li>
									<li style="margin-top: 5px;"><a style="text-decoration: underline; text-decoration-color: black; color: #5D6874;" href="#">Diet menu</a></li>
									<li style="margin-top: 5px;"><a style="text-decoration: underline; text-decoration-color: black; color: #5D6874;" href="#">Diet ranking</a></li>
								</ul>
							</li>
							<li class="dropdown" style="margin-left: 60px; ">
								<a class="dropdown-toggle" data-toggle="dropdown" href="#">Shoppingmall<span class="caret"></span></a>
								<ul style="position: absolute;left: -18px;" class="dropdown-content">
									<li><a style="text-decoration: underline; text-decoration-color: black; color: #5D6874;" href="#">Functional clothing</a></li>
									<li style="margin-top: 5px;"><a style="text-decoration: underline; text-decoration-color: black; color: #5D6874;" href="#">Sprots equipment</a></li>
									<li style="margin-top: 5px;"><a style="text-decoration: underline; text-decoration-color: black; color: #5D6874;" href="#">Health booster</a></li>
								</ul>
							</li>
							<li class="dropdown" style="margin-left: 60px;">
								<a class="dropdown-toggle" data-toggle="dropdown" href="#">Community<span class="caret"></span></a>
								<ul style="position: absolute; left: -20px;" class="dropdown-content">
									<li><a style="text-decoration: underline; text-decoration-color: black; color: #5D6874;" href="#">Free bulletin board</a></li>
									<li style="margin-top: 5px;"><a style="text-decoration: underline; text-decoration-color: black; color: #5D6874;" href="#">Bulletin board</a></li>
									<li style="margin-top: 5px;"><a style="text-decoration: underline; text-decoration-color: black; color: #5D6874;" href="#">Suggestions</a></li>
								</ul>
							</li>
						</ul> <!-- end nav navbar-nav -->
						<ul class="nav navbar-nav navbar-right">
							<li class="dropdown" style="margin-right: 50px;"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user"></span> Your Account<span class="caret"></span></a>
								<ul style="position: absolute; left: -10px; " class="dropdown-content">
									<li style="margin-top: 5px; font-size: 13px; position: relative; top: -10px; left: 0px;"><a style="text-decoration: underline; text-decoration-color: black; color: #5D6874;" href="#">Login</a></li>
									<li style="margin-top: 5px; font-size: 13px; position: relative; top: -10px; left: 0px;"><a style="text-decoration: underline; text-decoration-color: black; color: #5D6874;" href="#">Sign up</a></li>
									<li style="margin-top: 5px; font-size: 13px; position: relative; top: -10px; left: 0px;"><a style="text-decoration: underline; text-decoration-color: black; color: #5D6874;" href="#">My page</a></li>
								</ul>
							</li>
							<li style="margin-right: 50px;"><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
						</ul> <!-- end nav navbar-nav navbar-right -->
						<form class="navbar-form navbar-right" role="search">
							<div class="form-group input-group">
								<input type="text" class="form-control" placeholder="Search..">
								<span class="input-group-btn">
									<button style="margin-right: 50px;" class="btn btn-default" type="button">
										<span class="glyphicon glyphicon-search"></span>
									</button>
								</span>        
							</div>
						</form>
						<div style="width: 100%; height: 135px;" id="back"></div>
					</div> <!-- end myNavbar -->
				</div> <!-- end container-fluid -->
			</nav> <!-- end nav -->
			<div style="height: 50px; width: 1530px; background-color: black; border:solid 1px black;  " class="btn-group btn-group-justified">
				<a style="background-color: black; color: white; font-weight: bold; border:solid 1px black;" href="#" class="btn btn-primary">약관동의</a>
				<a style="background-color: black; color: white; font-weight: bold; border:solid 1px black;" href="#" class="btn btn-primary">본인확인</a>
				<a style="background-color: black; color: white; font-weight: bold; border:solid 1px black;" href="#" class="btn btn-primary">회원정보입력</a>
				<a style="background-color: black; color: white; font-weight: bold; border:solid 1px black;" href="#" class="btn btn-primary">가입완료</a>
			</div>
			
			<div class="terms" style="width: 1000px; height: 1690px; border:solid 1px black; position: relative; left: 260px; top: 70px; background-color: white;">
				<h1 style="font-weight: bold; text-align:center; margin-top: 60px; font-size: 50px;">회원가입_약관동의</h1>
				<ul>
					<li style="list-style-type: disc; font-size: 20px; font-weight: bold;">이용약관</li>
				</ul>
				<div style="width: 960px; border:solid 1px #ccc; height: 500px; margin-left: 20px; overflow-y: scroll;" id="list">
					<h3 style="font-weight: bold; margin-left: 20px;">제 1장 총칙</h3>
					<h4 style="color: #08088A; font-weight: bold; margin-left: 20px;
					margin-top: 20px;">제 1조 (목적)</h4>
					<p style="font-size: 15px; font-weight: bold;">&nbsp;&nbsp;&nbsp;본 약관은 피트니스케어(이하 "본 사이트")이 제공하는 모든 서비스(이하 "서비스")의 이용조건 및 절차, 이용자와 본 사이트에 대한 권리,<br>&nbsp;&nbsp;&nbsp;의무, 책임사항과 기타 필요한 사항을 규정함을 목적으로 합니다. </p>
					<h4 style="color: #08088A; font-weight: bold; margin-left: 20px;
					margin-top: 20px;">제 2조 (약관의 효력과 변경)</h4>
					<p style="font-weight: bold; font-size: 15px;">&nbsp;&nbsp;- 귀하가 본 약관 내용에 동의하는 경우, 서비스 제공 행위 및 귀하의 서비스 사용 행위에 본 약관이 우선적으로 적용됩니다.<br>
					&nbsp;&nbsp;- 본 약관은 사전 고지 없이 변경될 수 있고, 변경된 약관은 본 사이트 내에 공지하거나 이메일을 통해 회원에게 공지하며, 공지와 동시에<br>&nbsp;&nbsp;&nbsp; 그 효력이 발생됩니다. 이용자가 변경된 약관에 동의하지 않는 경우, 이용자는 본인의 회원등록을 취소(회원탈퇴)할 수 있으며 계속 사용의 &nbsp;&nbsp;&nbsp;경우는 약관 변경에 대한 동의로 간주됩니다.
					</p>
					<h4 style="color: #08088A; font-weight: bold; margin-left: 20px; margin-top: 20px;">제 3조 (약관 외 준칙)</h4>
					<p style="font-size: 15px; font-weight: bold;">&nbsp;&nbsp;- 본 약관에 명시되지 않은 사항은 전기통신기본법, 전기통신사업법, 정보통신윤리위원회심의규정, 정보통신 윤리강령, 프로그램보호법 및<br> &nbsp;&nbsp;&nbsp;기타 관련 법령의 규정에 의합니다.</p>
					<h4 style="font-weight: bold; color: #08088A; margin-left: 20px; margin-top: 20px;">제 4조 (용어와 정의)</h4>
					<p style="font-size: 15px; font-weight: bold;">&nbsp;&nbsp;&nbsp;용어의 정의는 다음과 같습니다.</p>
					<h4 style="font-weight: bold; color: #08088A; margin-left: 20px; margin-top: 20px;">제 5조 (개인정보 관리)</h4>
					<p style="font-size: 15px; font-weight: bold;">&nbsp;&nbsp;&nbsp;개인정보 관리의 내용은 다음과 같습니다..</p>
				</div>
				<input style="margin-left: 20px; margin-top: 10px;" type="checkbox" name=""> 위 약관에 동의합니다.
				<ul>
					<li style="list-style-type: disc; font-size: 20px; font-weight: bold; margin-top: 30px;">개인정보 수집 및 이용동의(필수사항)</li>
				</ul>
				<div style="width: 960px; border:solid 1px #ccc; height: 400px; margin-left: 20px; overflow-y: scroll; margin-top: 10px;" id="list1">
					<h3 style="font-weight: bold; margin-left: 20px; margin-top: 30px;">1. 개인정보의 수집 및 이용목적</h3>
					<p style="font-size: 15px; font-weight: bold; ">&nbsp;&nbsp;&nbsp;본 사이트는 개인정보를 다음의 목적을 위해 수집합니다. 수집한 개인정보는 다음의 목적이외의 용도로는 사용되지 않으며 이용 목적이 <br>&nbsp;&nbsp;&nbsp;변경될 시에는 사전동의를 구할 예정입니다.</p>
					<h4 style="font-weight: bold; margin-left: 20px; margin-top: 10px; color: #08088A;">가.본 사이트 회원가입 및 관리</h4>
					<p style="font-size: 15px; font-weight: bold;">&nbsp;&nbsp;&nbsp;본 사이트는 개인정보를 다음의 목적을 위해 수집합니다. 수집한 개인정보는 다음의 목적이외의 용도로는 사용되지 않으며 이용 목적이 <br>&nbsp;&nbsp;&nbsp;변경될 시에는 사전동의를 구할 예정입니다.</p>
					<h4 style="font-weight: bold; margin-left: 20px; margin-top: 10px; color: #08088A;">나. 운동,식단 등의 신청 관리</h4>
					<p style="font-size: 15px; font-weight: bold;">&nbsp;&nbsp;&nbsp;운동 관리, 식단 관리,
					전문 트레이너에 의한 관리 등을 목적으로 개인정보를 처리합니다.</p>
					<h3 style="font-weight: bold; margin-left: 20px; margin-top: 10px;">2. 수집하는 개인정보의 항목</h3>
					<p style="font-size: 15px; font-weight: bold;">&nbsp;&nbsp;&nbsp;본 사이트는 서비스 제공을 위해 필요한 최소한의 범위 내에서 다음과 같은 개인정보를 수집하고 있습니다. <br>&nbsp;&nbsp;&nbsp;수집하는 개인정보의 항목 중 '선택항목'은 회원에게 더 나은 서비스를 제공하기 위해 추가로 수집하는 정보입니다. <br>&nbsp;&nbsp;&nbsp;회원이 원하지 않을 경우 해당 추가정보는 수집하지 않으며, 이로 인한 서비스 이용 상의 제한은 없습니다.</p>
				</div>
				<input style="margin-left: 20px;margin-top: 10px;" type="checkbox" name=""> 위 약관에 동의합니다.
				<ul>
					<li style="list-style-type: disc; font-size: 20px; font-weight: bold; margin-top: 30px;">개인정보 수집 및 이용동의(필수사항)</li>
				</ul>
				<div style="width: 960px; border:solid 1px #ccc; height: 400px; margin-left: 20px; overflow-y: scroll; margin-top: 10px;" id="list2">
					<h4 style="font-weight: bold; margin-left: 20px; margin-top: 30px;">1. 선택적 개인정보의 수집목적</h4>
					<p style="font-size: 15px; font-weight: bold;">&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;본 사이트 서비스 제공에 있어서 회원의 식별 지원</p>
					<h4 style="font-weight: bold; margin-left: 20px; margin-top: 30px;">2. 수집항목</h4>
					<p style="font-size: 15px; font-weight: bold;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;주소</p>
					<h4 style="font-weight: bold; margin-left: 20px; margin-top: 30px;">3. 보유 및 이용기간</h4>
					<p style="font-size: 15px; font-weight: bold;">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;회원가입 시부터 회원 탈퇴 시까지
					</p>
					<h4 style="font-weight: bold; margin-left: 20px; margin-top: 30px;">4. 거부권 및 불이익</h4>
					<p style="font-size: 15px; font-weight: bold;">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;이용신청 고객은 위 선택 개인정보 수집 및 이용목적에 대하여 동의를 거부 하실 수 있으며 선택정보를 입력하지 않은 경우에도 <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;기본적인 서비스 이용 제한은 없으나 선택정보의 추가적인 정보가 필요한 항목의 경우 서비스를 제공해 드릴 수 없습니다.
					</p>
				</div>
				<input style="margin-left: 20px;margin-top: 10px;" type="checkbox" name=""> 위 약관에 동의합니다.
			</div> <!-- end terms -->
			<a href="#"><button style="position: relative; top: 100px; left: 630px;border:0; outline: 0; border-radius: 5px;  width: 250px; height: 50px; background-color: black; color: white; text-align: center; font-weight: bold;">다음단계</button></a>
		</div>
	</div>
	<footer class="footer-section" style="margin-top: 100px; background-color: black; border: solid 1px white;">
	
		<div class="container" style="width: 1400px; border:solid 1px red; height: 150px; margin-top: 50px;">
			<div class="row">
				<div class="col-md-4">
					<div class="fitness-number">
						<h3 style="color: white; font-weight: bold; font-size: 22px; text-align: left; margin-top: -50px; ">Phone</h3>
						<p style="color: white; font-weight: bold; font-size: 17px; text-align: left; margin-top: -20px; ">(123) 118 9999 - (123) 118 9999</p>
					</div> <!-- end fitness-number -->
				</div>
				<div class="col-md-4">
					<div class="fitness-address">
						<h3 style="color: white; font-weight: bold; font-size: 22px; text-align: center; margin-top: -50px;">Address</h3>
						<p style="color: white; font-weight: bold; font-size: 17px; text-align: center;  margin-top: -20px;">KR, 26th, 3rd and 6th floors of Danseongsa Temple in Myo-dong, Jongno-gu, Seoul</p>
					</div> <!-- end fitness-number -->
				</div>
				<div class="col-md-4">
					<div class="fitness-email">
						<h3 style="color: white; font-weight: bold; font-size: 22px; text-align: right; margin-top: -50px; ">Email</h3>
						<p style="color: white; font-weight: bold; font-size: 17px; text-align: right; margin-top: -20px; ">chicmanx@Gutim.com</p>
					</div> <!-- end fitness-email -->
				</div>
			</div>
			<div class="subscribe-option set-bg" style="border:solid 1px blue; background-image: url('/resources/img/footer.jpg'); width: 1520px; height: 200px;border:solid 1px white;  background-repeat: no-repeat;  margin-left: -180px; margin-top: 70px;  ">
				<div class="so-text">
					<p style="font-weight: bold; color: white; font-size: 25px; padding-left: 60px; padding-top: 55px;">Subscribe To Our Mailing List<br> <span style="font-size: 20px; color: white; font-weight: bold;">Sign up to receive the latest information</span></p>
				</div><!-- end so-text -->
				<form action="#" class="subscribe-form">
					<input style="text-align: center; position: relative; top: -120px; left: 1017px; width: 200px; height: 50px;" type="text" placeholder="Enter Your Mail">
					<button style="position: relative; top: -102px; border:0; outline: 0; left:987px;  width: 75px; height: 50px; background-image: url('/resources/img/check1.png');"></button>
				</form>
			</div> <!-- end subscribe-option set-bg -->
		</div> <!-- end container -->
		<div class="copyright-text">
			<p style="color: white; font-weight: bold; font-size: 25px; margin-top: 280px; text-align: center;">© Copyright 2020 All rights reserved | This template is made with by CHICMANX</p>
			<div class="footer-social" style="border:solid 1px white; margin-top: -55px; word-spacing: 5px; padding-left: 40px; width: 250px; float: right;">
				<a href="https://www.kakaocorp.com/"><img style="width: 50px; height: 40px;" src="/resources/img/kakao.jfif"></a>
				<a href="https://www.facebook.com/"><img src="/resources/img/facebook.jpg"></a>
				<a href="https://www.instagram.com/?hl=ko"><img src="/resources/img/instar.png"></a>
			</div> <!-- end footer-social -->
		</div> <!-- end copyright-text -->
	
	</footer> <!-- end footer -->
	
	<script>
	$(".hover").mouseleave(
		function () {
			$(this).removeClass("hover");
		}
	);
	</script>
</body>
</html>


