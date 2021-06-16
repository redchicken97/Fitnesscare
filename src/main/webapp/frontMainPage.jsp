<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<!-- Theme Made By www.w3schools.com - No Copyright -->
	<title>Bootstrap Theme The Band</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="/resources/css/frontMainPage.css" />
	<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
	<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50" style="overflow-x: hidden;">

	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>                        
				</button>
				<a style="font-size: 20px;" class="navbar-brand" href="#myPage">FITNESSCARE</a>
			</div>
			<div class="collapse navbar-collapse">
				<ul style="font-size: 11px;  "  class="nav navbar-nav navbar-right">
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

	<div class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
		</ol>
		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="/resources/img/main6.jpg" style="background-repeat: no-repeat; background-position: center; background-size: cover;" alt="New York" width="1200" height="700">
				<div class="carousel-caption">
					<h2 style=" color:#2E9AFE; font-size: 25px; font-family: sans-serif; text-align: left; position: relative;top: -250px; left: -200px;">Welcome to Fitnesscare</h2>
					<button class="btn hover3" style=" color:white;width: 140px; height: 50px; font-weight: bold; font-size: 20px;  background-color: #243B55; border-radius: 5px; border:0; outline: 0; position: relative;  top: -180px; text-align: center; left: -200px;">Get Started</button>
					<button class="btn hover3" style=" color: white; width: 140px; height: 50px; font-weight: bold; font-size: 20px; background-color: #243B55; border-radius: 5px; border:0; outline: 0; position: relative; top: -230px; left: -20px;  text-align: center;">Contact Us</button>
					<p style=" font-family: sans-serif; font-size: 40px; text-align: left; position: relative; top: -365px; left: -200px; ">Nothing happens if nothing is done.</p>
				</div> <!-- end carousel-caption -->  
			</div> <!-- end item active -->
			<div class="item">
				<img src="/resources/img/diet.jpg" style="background-size: cover; background-position: center; background-repeat: no-repeat;" alt="Chicago" width="1200" height="700">
				<div class="carousel-caption">
					<h2 style=" color:#2E9AFE; font-size: 25px; font-family: sans-serif; text-align: left; position: relative;top: -255px; left: -247px;">Welcome to Fitnesscare</h2>
					<button class="btn hover3" style=" color:white;width: 140px; height: 50px; font-weight: bold; font-size: 20px;  background-color: #243B55; border-radius: 5px; border:0; outline: 0; position: relative;  top: -180px; text-align: center; left: -245px;">Get Started</button>
					<button class="btn hover3" style=" color: white; width: 140px; height: 50px; font-weight: bold; font-size: 20px; background-color: #243B55; border-radius: 5px; border:0; outline: 0; position: relative; top: -230px; left: -65px;  text-align: center;">Contact Us</button>
					<p style=" font-family: sans-serif; font-size: 40px; text-align: left; position: relative; top: -365px; left: -250px; color: black; ">Take a healthy diet with a variety of diets.</p>
				</div> <!-- end carousel-caption --> 
			</div> <!-- end item -->
			<div class="item">
				<img src="/resources/img/main6.png" style="background-position: center; background-size: cover; background-repeat: no-repeat;" alt="Los Angeles" width="1200" height="700">
				<div class="carousel-caption">
					<h2 style=" color:#2E9AFE; font-size: 25px; font-family: sans-serif; text-align: right; position: relative;top: -350px; right: -50px;">Welcome to Fitnesscare</h2>
					<p style="font-family: sans-serif;font-size: 40px; text-align: center; position: relative;top: -365px;
					right: -420px;">There is no shortcut.<br>You have to keep plugging away</p>
				</div> <!-- end carousel-caption -->
			</div> <!-- end item -->
    	</div> <!-- end carousel inner -->
	</div> <!-- end carousel slide -->

	<!-- Container (The Band Section) -->
	<div id="Fitnesscare" class="container text-center">
		<h1>FITNESSCARE</h1>
		<p style="font-size: 20px;"><em>Let's exercise for our health.</em></p>
		<p style="font-size: 15px;">Fitnesscare is a space created for one's health. You can get information by sharing various exercise methods
		  and diets you know with others through the community. Also, you can purchase exercise equipment and supplements that you need efficiently at the shoppingmall. Through the community, you get together with other people to pass on your exercise know-how. I hope to live a better life than now through fitnesscare. Click the button below to get started right away.</p>
		<br>
		<button style="border-radius: 5px; border:0; outline: 0; width:120px; height: 40px; background-color: #2E9AFE; color: white; font-size: 20px;">Join</button>
	</div>
	<!-- Container (TOUR Section) -->
	<div id="program" class="bg-1">
		<div class="container-fluid">
			<h1 style=" color: white;" class="text-center">Various programs</h1>
			<p class="text-center" style="font-size: 20px; ">Our fitness center offers a variety of programs for our members.</p>
			<div class="row text-center">
				<div style="margin-left: -20px;" class="col-lg-12">
					<div style="text-align:center;">
						<div style="background-image: url('/Fitnesscare/resources/img/boxing.png'); background-repeat: no-repeat; color: black; text-align: center; font-weight: bold; font-size: 40px;" class="zoom"><p style="padding-top: 170px;">Boxing</p></div>
						<div style="background-image: url('/Fitnesscare/resources/img/yoga.jpg'); background-repeat: no-repeat; color: black; text-align: center; font-weight: bold; font-size: 40px;" class="zoom"><p style="padding-top: 170px;">Yoga</p></div>
						<div style="background-image: url('/Fitnesscare/resources/img/dance.jpg'); background-repeat: no-repeat; color: black; text-align: center; font-weight: bold; font-size: 40px;" class="zoom"><p style="padding-top: 170px;">Dance</p></div>
						<div style="background-image: url('/Fitnesscare/resources/img/pt.jpg'); background-repeat: no-repeat; color: black; text-align: center; font-weight: bold; font-size: 40px;" class="zoom"><p style="padding-top: 170px;">Personal training</p></div>
						<div style="background-image: url('/Fitnesscare/resources/img/running.jpg'); background-repeat: no-repeat; color: black; text-align: center; font-weight: bold; font-size: 40px;" class="zoom"><p style="padding-top: 170px;">Running</p></div>
						<div style="background-image: url('/Fitnesscare/resources/img/ft.jpg'); background-repeat: no-repeat; color: black; text-align: center; font-weight: bold; font-size: 40px;" class="zoom"><p style="padding-top: 170px;">Pilates</p></div>
						<div style="background-image: url('/Fitnesscare/resources/img/sp.jpg'); background-repeat: no-repeat; color: black; text-align: center; font-weight: bold; font-size: 40px;" class="zoom"><p style="padding-top: 170px;">Spinning</p></div>
						<div style="background-image: url('/Fitnesscare/resources/img/pushup.jpg'); background-repeat: no-repeat; color: black; text-align: center; font-weight: bold; font-size: 40px;" class="zoom"><p style="padding-top: 170px;">Calisthenics</p></div>
						<div style="background-image: url('/Fitnesscare/resources/img/pullup.jpg'); background-repeat: no-repeat; color: black; text-align: center; font-weight: bold; font-size: 40px;" class="zoom"><p style="padding-top: 170px;">Calisthenics</p></div>
						<div style="background-image: url('/Fitnesscare/resources/img/gallery-1.jpg'); background-repeat: no-repeat; color: black; text-align: center; font-weight: bold; font-size: 40px;" class="zoom"><p style="padding-top: 170px;">Weight training</p></div>
						<div style="background-image: url('/Fitnesscare/resources/img/dead.jpg'); background-repeat: no-repeat; color: black; text-align: center; font-weight: bold; font-size: 40px;" class="zoom"><p style="padding-top: 170px;">Weight training</p></div>
						<div style="background-image: url('/Fitnesscare/resources/img/bench.jpg'); background-repeat: no-repeat; color: black; text-align: center; font-weight: bold; font-size: 40px;" class="zoom"><p style="padding-top: 170px;">Weight training</p></div>
						<div style="background-image: url('/Fitnesscare/resources/img/sp.jpg'); background-repeat: no-repeat; color: black; text-align: center; font-weight: bold; font-size: 40px;" class="zoom"><p style="padding-top: 170px;">Squirt</p></div>
						<div style="background-image: url('/Fitnesscare/resources/img/gallery-3.jpg'); background-repeat: no-repeat; color: black; text-align: center; font-weight: bold; font-size: 40px;" class="zoom"><p style="padding-top: 170px;">Weight training</p></div>
						<div style="background-image: url('/Fitnesscare/resources/img/main6.png'); background-repeat: no-repeat; color: black; text-align: center; font-weight: bold; font-size: 40px;" class="zoom"><p style="padding-top: 160px;"></p>Personal training</div>
						<div style="background-image: url('/Fitnesscare/resources/img/main7.jpg'); background-repeat: no-repeat; color: black; text-align: center; font-weight: bold; font-size: 40px;" class="zoom"><p style="padding-top: 170px;">Personal training</p></div>
					</div>
				</div> <!-- end col-lg-12 -->
			</div> <!-- end row text-center -->
		</div> <!-- end container-fluid -->
	</div> <!-- end bg-1 -->
  
	<!-- Modal -->
	<div class="container" style="background-color: black; color: white; margin-top: 100px; width: 100%; height: auto;">
		<div class="container-fluid" style=" text-align:center;">
			<h1 style="font-size: 50px; font-weight: bold; color:white; margin-top: -50px; text-align: center;">professional trainer</h1>
			<p style="font-weight: bold; font-size: 20px; color: white; text-align: center;" class="row ">Here are experts to help you exercise.</p>
			<div class="col-lg-16">
				<figure style=" display: inline-block; border:solid 1px white; min-width: 392px;min-height: 431px;
				" class="trainer">
					<img style="width: 392px; height: 330px;" src="/Fitnesscare/resources/img/trainer-1.jpg">
					<figcaption>
						<h3 style="font-weight: bold; font-size: 20px; text-align: center;"> Zackary Greinke</h3>
						<p style="text-align: center;">non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem.</p>
					</figcaption>
					<a href="#"></a>
				</figure>
				<figure style="  display: inline-block; border:solid 1px white; min-width: 392px;min-height: 431px;
				" class="trainer">
					<img style="width: 392px; height: 330px;" src="/Fitnesscare/resources/img/trainer-2.jpg">
					<figcaption>
						<h3 style="font-weight: bold; font-size: 20px; text-align: center;">  Aroldis Chapman </h3>
						<p style="text-align: center;">non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem.</p>
					</figcaption>
					<a href="#"></a>
				</figure>
				<figure style=" display: inline-block; border:solid 1px white; min-width: 392px;min-height: 431px;
				" class="trainer">
					<img style="width: 392px; height: 330px;" src="/Fitnesscare/resources/img/trainer-3.jpg">
					<figcaption>
						<h3 style="font-weight: bold; font-size: 20px; text-align: center;"> Ronda Rousey</h3>
						<p style="text-align: center;">non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem.</p>
					</figcaption>
					<a href="#"></a>
				</figure>
			</div> <!-- end col-lg-16 -->
		</div> <!-- end container-fluid -->
	</div> <!-- end container -->
  
	<!-- Container (Contact Section) -->
	<div id="diet" class="container-fluid" style="width: 100%; height: 1600px; margin-top: 100px; background-color: black;">
		<h3 style="font-weight: bold; font-size: 45px; color: white; margin-top: 30px;" class="text-center">Diet menu</h3>
		<p style="font-size: 20px; margin-top: -20px; color: white;" class="text-center"><em>Let me tell you about this month's popular diet.</em></p>
		<div class="col-lg-12">
			<div class="menu" style="border:solid 3px white; width: 1200px; height: 400px;"></div>
			<div class="menu" style="border:solid 3px white; width: 1200px; height: 400px;"></div>
			<div class="menu" style="border:solid 3px white; width: 1200px; height: 400px;"></div>
		</div> <!-- end col-lg-12 -->
	</div> <!-- end container-fluid -->

	<div class="slide94" style="margin-top: 100px; width: 1559px; margin-left: -40px;">
		<ul>
			<li>
				<h3 style="text-align: center; color: white; font-size: 40px; margin-top: 100px;">Successful story</h3>
				<br><p style="text-align: center; color: white; font-size: 20px; margin-top: -25px;">I gained confidence through fitness care.</p>
				<p style="margin-top: 30px; color: white; text-align: center; font-weight: bold; font-size: 25px;">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor<br> incididunt ut labore et dolore magna aliqua. 
				Ut enim ad minim veniam, quis nostrud<br> exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
			</li>
			<li>
				<h3 style="text-align: center; color: white; font-size: 40px; margin-top: 100px;">Diet Review</h3>
				<br><p style="text-align: center; color: white; font-size:20px; margin-top: -25px;">I gained confidence through diet.</p>
				<p style="margin-top: 30px; color: white; text-align: center; font-weight: bold; font-size: 25px;">Through fitness care, I was able to succeed in dieting<br> through various help such as exercise methods and diet recommendations <br>by professional teachers.</p>
			</li>
		</ul>
	</div> <!-- end slide94 -->

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
	$(document).ready(function(){
		// Initialize Tooltip
		$('[data-toggle="tooltip"]').tooltip(); 
		
		// Add smooth scrolling to all links in navbar + footer link
		$(".navbar a, footer a[href='#myPage']").on('click', function(event) {
		
			// Prevent default anchor click behavior
			event.preventDefault();
			
			// Store hash
			var hash = this.hash;
		
			// Using jQuery's animate() method to add smooth page scroll
			// The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
			$('html, body').animate({
			  scrollTop: $(hash).offset().top
			}, 900, function(){
				// Add hash (#) to URL when done scrolling (default click behavior)
				window.location.hash = hash;
			});
		});
	})
	$(".hover").mouseleave(
		function () {
			$(this).removeClass("hover");
		}
	);
	
	</script>

</body>
</html>
