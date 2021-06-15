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
	<link rel="stylesheet" href="/resources/css/frontReg1.css">
	<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
	<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50" style="overflow-x: hidden; ">

	<nav style="background-color: black; color: white;" class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>                        
				</button>
				<a style="font-size: 20px;" class="navbar-brand" href="#myPage">FITNESSCARE</a>
			</div> <!-- end navbar-header -->
			
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
	
	<div style="width: 1522px; margin-top: 100px;  height: 700px; border:solid 1px black;" id="Login">
		<div style="width: 760px; height: 700px; border:solid 1px black; margin-left: 380px;" id="signup">
			<h1 style="text-align: center; font-weight: bold; color: black; font-size: 50px; word-spacing: 10px;">Join</h1>
			<a href="https://ko-kr.facebook.com/login/"><img src="/resources/img/facebook2.png" style="margin-left: 105px; width: 260px; height: 45px; border-radius: 5px; margin-top: 15px;"></a>
			<a href="https://www.google.com/"><img src="/resources/img/google.png" style=" margin-left:20px; margin-top: 15px; width: 260px; height: 45px; border-radius: 5px;"></a>
			<h3 style="text-align: center; border:solid 1px gray; height: 0; width: 330px; display: inline-block;margin-left: 37px; margin-top: 30px;"></h3> <h3 style="margin-left: 20px; text-align: center; border: solid 1px gray; height: 0; width: 330px; display: inline-block;"></h3>
			<p style="text-align: center; margin-top: -52px;">OR</p>
			<form>
				<input type="text" name="" style="width: 300px; height: 40px; margin-left: 37px; margin-top: 20px; text-align: center;" placeholder="First name"><br>
				<input type="text" name="" style="width: 300px; height: 40px; margin-top: 20px; margin-left: 37px; text-align: center;" placeholder="Last name"><br>
				<input type="text" name="" style="width: 300px; height: 40px; margin-top: 20px; margin-left: 37px; text-align: center;" placeholder="Email address"><br>
				<input type="text" name="" style="width: 300px; height: 40px; margin-top: 20px; margin-left: 37px; text-align: center;" placeholder="Username"><br>
				<input type="password" name="" style="width: 300px; height: 40px; margin-top: 20px; margin-left: 37px; text-align: center;" placeholder="Password"><br>
				<input type="password" name="" style="width: 300px; height: 40px; text-align: center; margin-top: 20px; margin-left: 37px;" placeholder="Confirm Password">
			</form>
			<div style="position: relative; top: -340px; left: 400px; width: 358px; height: 340px; border:solid 1px black; box-shadow: 5px 5px 5px 5px;" id="membership benefit">
				<ul>
					<li style="font-weight: bold; font-size: 15px; color: black; margin-top: 10px; ">Key Benefits:</li>
					<img style="position: relative; top: 13px; left: -25px; width: 20px; height: 20px;" src="/resources/img/check1.png"><li style="margin-left: 5px; margin-top: -10px;">Customizable fitnesscare</li>
					<img style="position: relative; top: 13px; left: -25px; width: 20px; height: 20px;" src="/resources/img/check1.png"><li style="margin-left: 5px; margin-top: -10px;">Daily progress tracking</li>
					<img style="position: relative; top: 13px; left: -25px; width: 20px; height: 20px;" src="/resources/img/check1.png"><li style="margin-left: 5px; margin-top: -10px;">Favorite workout videos</li>
					<img style="position: relative; top: 13px; left: -25px; width: 20px; height: 20px;" src="/resources/img/check1.png"><li style="margin-left: 5px; margin-top: -10px;">24/7 community support</li>
					<img style="position: relative; top: 13px; left: -25px; width: 20px; height: 20px;" src="/resources/img/check1.png"><li style="margin-left: 5px; margin-top: -10px;">Helpful health, nutrition and<br> fitness information</li>
					<img style="position: relative; top: 13px; left: -25px; width: 20px; height: 20px;" src="/resources/img/check1.png"><li style="margin-left: 5px; margin-top: -10px;">and much, much more…</li>
				</ul>
				<button style="text-align: center; width: 300px; height: 40px; color: white; position: relative; top: 60px; left: -180px;  border-radius: 3px; background-color: #81BEF7; font-size: 20px; border:0; outline: 0;" type="button">Join</button>
				<p style="text-align: center; font-size: 14px; margin-left: -400px; margin-top: 75px;">By joining, you agree to the Fitness Blender <a style="text-decoration: none;" href="#"><span style="color: #81BEF7;">Terms of Service</span></a> and <a style="text-decoration: none;" href="#"><span style="color:#81BEF7; ">Privacy Policy</span></a> </p>
				<p style="font-size: 14px; text-align: center; margin-left: -400px; margin-top: 50px;
				">Already a member? <a style="text-decoration: none;" href="#"><span style="color: #81BEF7;">&nbsp;&nbsp;&nbsp;Sign In</span></a></p>
			</div> <!-- end #membership benefit -->
		</div> <!-- end #sign up -->
	</div> <!-- end #Login -->
	
	<footer style="margin-top: 100px; background-color: black; border: solid 1px white;" class="footer-section">
	    
		<div class="container" style="width: 1400px; border: solid 1px red; height: 150px; margin-top: 50px;">
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
						<h3 style="color: white; font-weight: bold; font-size: 22px; text-align: right; margin-top: -50px;">Email</h3>
						<p style="color: white; font-weight: bold; font-size: 17px; text-align: right; margin-top: -20px;">chicmanx@Gutim.com</p>
					</div>
				</div>
			</div> <!-- end row -->
			
			<div class="subscribe-option set-bg" style="border:solid 1px blue; background-image: url('/resources/img/footer.jpg'); width: 1520px; height: 200px;border:solid 1px white;  background-repeat: no-repeat;  margin-left: -180px; margin-top: 70px;  ">
				<div class="so-text">
					<p style="font-weight: bold; color: white; font-size: 25px; padding-left: 60px; padding-top: 55px;">Subscribe To Our Mailing List<br> <span style="font-size: 20px; color: white; font-weight: bold;">Sign up to receive the latest information</span></p>
				</div>
				<form action="#" class="subscribe-form">
					<input style="text-align: center; position: relative; top: -120px; left: 1017px; width: 200px; height: 50px;" type="text" placeholder="Enter Your Mail">
					<button style="  position: relative; top: -102px;border:0; outline: 0; left:987px;  width: 75px; height: 50px; background-image: url('/resources/img/check.jpg');"></button>
				</form>
			</div> <!-- end subscribe-option set-bg -->
		</div> <!-- end container -->
	
		<div class="copyright-text">
			<p style="color: white; font-weight: bold; font-size: 25px; margin-top: 280px; text-align: center; ">© Copyright 2020 All rights reserved | This template is made with by CHICMANX</p>
			<div class="footer-social" style="border:solid 1px white; margin-top: -55px;word-spacing: 5px; padding-left: 40px;  width: 250px; float: right;">
				<a href="https://www.kakaocorp.com/"><img style="width: 50px; height: 40px;" src="/resources/img/kakao.jfif"></a>
				<a href="https://www.facebook.com/"><img src="/resources/img/facebook.jpg"></a>
				<a href="https://www.instagram.com/?hl=ko"><img src="/resources/img/instar.png"></a>
			</div> <!-- end footer-social -->
		</div> <!-- end copyright-text -->
	
	</footer> <!-- end footer -->
  
</body>
</html>
