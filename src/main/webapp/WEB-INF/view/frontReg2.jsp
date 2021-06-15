<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<!-- Theme Made By www.w3schools.com - No Copyright -->
	<title>Bootstrap Theme The Band</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="/resources/css/frontReg2.css">
	<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
	<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50" style="overflow-x: hidden; ">

	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>                        
			</button>
			<a style="font-size: 20px;" class="navbar-brand" href="#myPage">FITNESSCARE</a>
			</div> <!-- end container-fluid -->
			
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul style="font-size: 11px;" class="nav navbar-nav navbar-right">
					<li style="margin-right: 80px;"><a href="#Fitnesscare">About</a></li>
					<li style="margin-right: 80px;"><a href="#program">Program</a></li>
					<li style="margin-right: 80px;"><a href="#diet">Diet</a></li>
					<li style="margin-right: 80px;"><a href="#tour">Community</a></li>
					<li style="margin-right: 80px;"><a href="#band">Shoppingmall</a></li>
					<li style="margin-right: 80px;"><a href="#">Contact</a></li>
				</ul>
			</div> <!-- end collapse navbar-collapse -->
		</div> <!-- end container-fluid -->
	</nav> <!-- end nav -->

	<h3 style="text-align: center; font-weight: bold; color: black; margin-top: 300px; ">An entry marked (*) must be entered.</h3>
	<h3 style="text-align: center; font-weight: bold;  color: black; margin-top: -10px; font-size: 17px;">(If the information is falsely written,<br> the approval may be suspended or deleted arbitrarily,<br> so please be careful.)</h3>
	<hr style="border:solid 1px black; width: 1400px; margin-top: 50px;">

	<div id="information" style="width: 1520px; height: 1000px; border:solid 1px black;">
		<hr style="width: 1400px; margin-top: 50px; border:solid 1px #F2F2F2;">
		<h3 style="margin-left: 200px;">ID<span style="color: red; position: relative; top: 5px; left: 5px;">*</span></h3>
		<form>
			<input type="text" name="" style="color: black; border:solid 1px #F2F2F2; outline: solid 1px #F2F2F2; text-align: center; width: 200px; height: 40px; position: relative; top: -60px; left: 300px;">
			<button style="width: 60px; height: 30px; position: relative; top: -60px; left: 330px; ">Check</button>
		</form>
		<h5 style="position: relative; top: -55px; left: 150px; color: black;   font-size: 15px;">Please enter the ID in English and numeric combinations of 3 to 20 characters.</h5>
		<hr style="width: 1400px; margin-top: -50px; border:solid 1px #F2F2F2;">
		<h3 style="margin-left: 75px;">Password<span style="color: red; position: relative; top: 5px; left: 5px;">*</span></h3>
		<form>
			<input type="Password" name="" style="color: black; border:solid 1px #F2F2F2; outline: solid 1px #F2F2F2; text-align: center; width: 200px; height: 40px; position: relative; top: -60px; left: 300px;">
		</form>
		<h5 style="position: relative; top: -55px; left: 150px; color: black;   font-size: 15px;">Only 4 to 12 English characters and numbers are allowed.</h5>
		<hr style="width: 1400px; margin-top: -50px; border:solid 1px #F2F2F2;">
		<h3 style="margin-left: 75px;">Confirm <br>Password<span style="color: red; position: relative; top: 5px; left: 5px;">*</span></h3>
		<form>
			<input type="Password" name="" style="color: black; border:solid 1px #F2F2F2; outline: solid 1px #F2F2F2; text-align: center; width: 200px; height: 40px; position: relative; top: -60px; left: 300px;">
		</form>
		<hr style="width: 1400px; margin-top: -50px; border:solid 1px #F2F2F2;">
		<h3 style="margin-left: 142px;">Email<span style="color: red; position: relative; top: 5px; left: 5px;">*</span></h3>
		<form>
			<input type="text" name="" style="color: black; border: solid 1px #F2F2F2; outline: solid 1px #F2F2F2; text-align: center; width: 200px; height: 40px; position: relative; top: -60px; left: 300px;"><span style="position: relative; top: -60px; left: 320px; font-size: 25px;">@</span>
			<select style="border: solid 1px #F2F2F2; outline: solid 1px #F2F2F2; position: relative; top: -60px; left: 335px; height: 40px; text-align: center;">
				<option>선택하세요</option>
				<option>naver.com</option>
				<option>hanmail.net</option>
				<option>gmail.com</option>
				<option>직접 입력하세요.</option>
			</select>
			<h5 style="position: relative; top: -55px; left: 150px; color: black;   font-size: 15px;">I will receive newsletters or notices.</h5>
			<input type="checkbox" name=""  style="width: 18px; height: 18px; position: relative; top: -87px; left: 120px;">
			<button style="width: 80px; height: 30px; position: relative; top: -130px; left: 710px; ">Certified</button>
			<hr style="width: 1400px; margin-top: -75px; border:solid 1px #F2F2F2;">
		</form>
		<button style="width: 120px; font-size: 15px; height: 35px; position: relative; left: 600px;">previous phase</button><button style=" font-size: 15px; height: 35px; width: 90px; position: relative; left: 700px;">next step</button>
	</div> <!-- end information -->

<footer style="margin-top: 100px; background-color: black; border:solid 1px white; " class="footer-section">

	<div class="container" style="width: 1400px; border:solid 1px red; height: 150px; margin-top: 50px;">
		<div class="row">
			<div class="col-md-4">
				<div class="fitness-number">
					<h3 style="color: white; font-weight: bold; font-size: 22px; text-align: left; margin-top: -50px; ">Phone</h3>
					<p style="color: white; font-weight: bold; font-size: 17px; text-align: left; margin-top: -20px; ">(123) 118 9999 - (123) 118 9999</p>
				</div>
			</div>
			<div class="col-md-4">
				<div class="fitness-address">
					<h3 style="color: white; font-weight: bold; font-size: 22px; text-align: center; margin-top: -50px;">Address</h3>
					<p style="color: white; font-weight: bold; font-size: 17px; text-align: center;  margin-top: -20px;">KR, 26th, 3rd and 6th floors of Danseongsa Temple in Myo-dong, Jongno-gu, Seoul</p>
				</div>
			</div>
			<div class="col-md-4">
				<div class="fitness-email">
					<h3 style="color: white; font-weight: bold; font-size: 22px; text-align: right; margin-top: -50px; ">Email</h3>
					<p style="color: white; font-weight: bold; font-size: 17px; text-align: right; margin-top: -20px; ">chicmanx@Gutim.com</p>
				</div>
			</div>
		</div> <!-- end row -->
		
		<div class="subscribe-option set-bg" style="border:solid 1px blue; background-image: url('C:/images/footer.jpg'); width: 1520px; height: 200px;border:solid 1px white;  background-repeat: no-repeat;  margin-left: -180px; margin-top: 70px;  ">
			<div class="so-text">
				<p style="font-weight: bold; color: white; font-size: 25px; padding-left: 60px; padding-top: 55px;">Subscribe To Our Mailing List<br> <span style="font-size: 20px; color: white; font-weight: bold;">Sign up to receive the latest information</span></p>
			</div>
			<form action="#" class="subscribe-form">
				<input style="text-align: center; position: relative; top: -120px; left: 1017px; width: 200px; height: 50px;" type="text" placeholder="Enter Your Mail">
				<button style="  position: relative; top: -102px;border:0; outline: 0; left:987px;  width: 75px; height: 50px; background-image: url('/resources/img/check.jpg');"></button>
			</form>
		</div>
	</div> <!-- end container -->
	
	<div class="copyright-text">
		<p style="color: white; font-weight: bold; font-size: 25px; margin-top: 280px; text-align: center; ">© Copyright 2020 All rights reserved | This template is made with by CHICMANX</p>
		<div style="border:solid 1px white; margin-top: -55px;word-spacing: 5px; padding-left: 40px;  width: 250px; float: right;" class="footer-social">
			<a href="https://www.kakaocorp.com/"><img style="width: 50px; height: 40px;" src="/resources/img/kakao.jfif"></a>
			<a href="https://www.facebook.com/"><img src="/resources/img/facebook.jpg"></a>
			<a href="https://www.instagram.com/?hl=ko"><img src="/resources/img/instar.png"></a>
		</div>
	</div> <!-- end copyright-text -->

</footer> <!-- end footer -->
      
</body>
</html>
