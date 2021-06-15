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
	<link rel="stylesheet" href="/resources/css/frontBoard.css" type="text/css" />
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
				<ul style="font-size: 11px;"  class="nav navbar-nav navbar-right">
					<li style="margin-right: 80px;"><a href="#Fitnesscare">About</a></li>
					<li style="margin-right: 80px;"><a href="#program">Program</a></li>
					<li style="margin-right: 80px;"><a href="#diet">Diet</a></li>
					<li style="margin-right: 80px;"><a href="#tour">Community</a></li>
					<li style="margin-right: 80px;"><a href="#band">Shoppingmall</a></li>
					<li style="margin-right: 80px;"><a href="#">Contact</a></li>
				</ul>
			</div>
		  
		</div> <!-- end container-fluid -->
	</nav>
	
	<div class="dropdown">
		<button style="background-color: white; color: black; border:0; outline: 0; 
		position: absolute; left: 1180px; top: 197px;" 
		class="btn btn-primary dropdown-toggle" type="button" 
		data-toggle="dropdown">Newest First
			<span class="caret"></span>
		</button>
		<ul style="position: absolute; left: 1185px; top: 222px; 
		font-size: 10px; text-align: center; height: 90px; min-width: 45px; 
		border:solid 2px black; " class="dropdown-menu">
			<li style="width: 100px;"><a href="#">Newest First</a></li>
			<li style="width: 100px;"><a href="#">Last Update</a></li>
			<li style="width: 100px;"><a href="#">Most Popular</a></li>
			<li style="width: 100px;"><a href="#">Oldest First</a></li>
		</ul>
	</div> <!-- end dropdown div -->
 
	<div class="dropdown">
		<button style="position: relative; top: 215px; left: 1110px; 
		width: 45px; height: 40px;" class="btn btn-primary dropdown-toggle" type="button"
		data-toggle="dropdown">
			<span class="glyphicon glyphicon-search"></span>
		</button>
		<ul style="position: absolute; left: 1000px; top: 252px; 
		min-width: 250px; max-height: 100px;" class="dropdown-menu">
			<li>
				<input type="text" name="" placeholder="Keyword Search" 
				style="height: 40px; width: 210px;  border:solid 2px #58ACFA; 
				position: relative; top: 15px; left: 16px; border-radius: 5px;">   
				<button style="border:0; outline: 0; background-color: white;">
					<span style="position: relative; top: 17px; left: -20px;" 
					class="glyphicon glyphicon-search"></span>
				</button>
			</li>
		</ul>
	</div> <!-- end dropdown div -->
       
	<button style="height: 40px; width: 180px; border-radius: 5px; color: white; background-color: #58ACFA; border:0; outline: 0; font-weight: bold; position: relative; left: 850px; top: 217px;" type="button">START A DISCUSSION</button>

	<div class="container">
		<h2 style="position: relative; top: 10px; font-weight: bold; font-size: 40px;">COMMUNITY</h2>
		
		<div class="dropdown">
			<button style="background-color: white; color: black; border:0; outline: 0; 
			position: relative; top: 15px;" class="btn btn-primary dropdown-toggle" 
			type="button" data-toggle="dropdown">
				<p style="font-size: 20px; font-weight: bold;">TOPICS
					<span class="caret" style="color: #0080FF; border-width: 10px; margin-left: 10px;"></span>
				</p>
			</button>
			<ul style="position: absolute; top: 60px; height: 450px; text-align: center;" 
			class="dropdown-menu">
				<hr />
				<li class="item" style="margin-top: 10px; border:0; outline: 0; font-size: 17px;">
					<a href="#">Newest First</a>
					<ul style="position: relative; left: -17px; top: 5px; font-size: 13px;">
						<li style="text-align: center;"><a href="#">헬스 프로그램</a></li>
						<li style="text-align: center;"><a href="#">운동영상</a></li>
						<li style="text-align: center;"><a href="#">헬스 커리큘럼</a></li>
					</ul>
				</li> <!-- end item -->
				<hr />
				<hr />
				<li class="item" style="margin-top: 10px; border:0; outline: 0; font-size: 17px;">
					<a href="#">Last Update</a>
					<ul style="position: relative; top: 5px; left: -19px; font-size: 13px;">
						<li><a href="#">추천메뉴</a></li>
						<li><a href="#">추천메뉴</a></li>
						<li><a href="#">추천메뉴</a></li>
					</ul>
				</li> <!-- end item -->
				<hr />
				<hr />
				<li class="item" style="margin-top: 10px; border:0; outline: 0; font-size: 17px;">
					<a href="#">Most Popular</a>
					<ul style="position: relative; top: 5px; left: -19px; font-size: 13px;">
						<li><a href="#">기능성 의류</a></li>
						<li><a href="#">기능성 의류</a></li>
						<li><a href="#">기능성 의류</a></li>
					</ul>
				</li> <!-- end item -->
			    <hr />
			    <hr />
				<li class="item" style="margin-top: 10px; border:0; outline: 0; font-size: 17px;">
					<a href="#">Oldest First</a>
					<ul style="position: relative; top: 5px; left: -19px; font-size: 13px;">
					    <li><a href="#">자유게시판</a></li>
					    <li><a href="#">자유게시판</a></li>
					    <li><a href="#">자유게시판</a></li>
				    </ul>
				</li> <!-- end item -->
				<hr />
			</ul>
		</div> <!-- end dropdown div -->
		<div class="table-responsive">          
			<table style="margin-top: 70px;"  class="table  table table-hover table table-condensed">
				<thead>
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>작성자</th>
						<th>날짜</th>
						<th>조회수</th>
						<th>댓글수</th>
						<th>좋아요</th>
					</tr>
				 </thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>안녕하세요</td>
						<td>정지혁</td>
						<td>2020.08.31</td>
						<td>94</td>
						<td>11</td>
						<td><img src="/resources/img/great.jfif" style="width:23px; height: 20px; position: relative; top: -3px; left: -5px;">11</td>
					</tr>
					<tr>
						<td>2</td>
						<td>반갑습니다</td>
						<td>정지혁</td>
						<td>2020.08.31</td>
						<td>94</td>
						<td>29</td>
					    <td><img src="/resources/img/great.jfif" style="width:23px; height: 20px; position: relative; top: -3px; left: -5px;">11</td>
					</tr>
					<tr>
						<td>3</td>
						<td>회원가입입니다.</td>
						<td>정지혁</td>
						<td>2020.08.31</td>
						<td>11</td>
						<td>29</td>
						<td><img src="/resources/img/great.jfif" style="width:23px; height: 20px; position: relative; top: -3px; left: -5px;">11</td>
					</tr>
				    <tr>
						<td>4</td>
						<td>처음입니다.</td>
						<td>정지혁</td>
						<td>2020.08.31</td>
						<td>72</td>
						<td>24</td>
						<td><img src="/resources/img/great.jfif" style="width:23px; height: 20px; position: relative; top: -3px; left: -5px;">11</td>
					</tr>
					<tr>
						<td>3</td>
						<td>회원가입입니다.</td>
						<td>정지혁</td>
						<td>2020.08.31</td>
						<td>11</td>
						<td>29</td>
						<td><img src="/resources/img/great.jfif" style="width:23px; height: 20px; position: relative; top: -3px; left: -5px;">11</td>
					</tr>
					<tr>
						<td>3</td>
						<td>회원가입입니다.</td>
						<td>정지혁</td>
						<td>2020.08.31</td>
						<td>11</td>
						<td>29</td>
						<td><img src="/resources/img/great.jfif" style="width:23px; height: 20px; position: relative; top: -3px; left: -5px;">11</td>
					</tr>
					<tr>
						<td>3</td>
						<td>회원가입입니다.</td>
						<td>정지혁</td>
						<td>2020.08.31</td>
						<td>11</td>
						<td>29</td>
						<td><img src="/resources/img/great.jfif" style="width:23px; height: 20px; position: relative; top: -3px; left: -5px;">11</td>
					</tr>
					<tr>
						<td>3</td>
						<td>회원가입입니다.</td>
						<td>정지혁</td>
						<td>2020.08.31</td>
						<td>11</td>
						<td>29</td>
						<td><img src="/resources/img/great.jfif" style="width:23px; height: 20px; position: relative; top: -3px; left: -5px;">11</td>
					</tr>
					<tr>
						<td>3</td>
						<td>회원가입입니다.</td>
						<td>정지혁</td>
						<td>2020.08.31</td>
						<td>11</td>
						<td>29</td>
						<td><img src="/resources/img/great.jfif" style="width:23px; height: 20px; position: relative; top: -3px; left: -5px;">11</td>
					</tr>
					<tr>
						<td>3</td>
						<td>회원가입입니다.</td>
						<td>정지혁</td>
						<td>2020.08.31</td>
						<td>11</td>
						<td>29</td>
						<td><img src="/resources/img/great.jfif" style="width:23px; height: 20px; position: relative; top: -3px; left: -5px;">11</td>
					</tr>
					<tr>
						<td>3</td>
						<td>회원가입입니다.</td>
						<td>정지혁</td>
						<td>2020.08.31</td>
						<td>11</td>
						<td>29</td>
						<td><img src="/resources/img/great.jfif" style="width:23px; height: 20px; position: relative; top: -3px; left: -5px;">11</td>
					</tr>
					<tr>
						<td>3</td>
						<td>회원가입입니다.</td>
						<td>정지혁</td>
						<td>2020.08.31</td>
						<td>11</td>
						<td>29</td>
						<td><img src="/resources/img/great.jfif" style="width:23px; height: 20px; position: relative; top: -3px; left: -5px;">11</td>
					</tr>
					<tr>
						<td>3</td>
						<td>회원가입입니다.</td>
						<td>정지혁</td>
						<td>2020.08.31</td>
						<td>11</td>
						<td>29</td>
						<td><img src="/resources/img/great.jfif" style="width:23px; height: 20px; position: relative; top: -3px; left: -5px;">11</td>
					</tr>
					<tr>
						<td>3</td>
						<td>회원가입입니다.</td>
						<td>정지혁</td>
						<td>2020.08.31</td>
						<td>11</td>
						<td>29</td>
						<td><img src="/resources/img/great.jfif" style="width:23px; height: 20px; position: relative; top: -3px; left: -5px;">11</td>
					</tr>
					<tr>
						<td>3</td>
						<td>회원가입입니다.</td>
						<td>정지혁</td>
						<td>2020.08.31</td>
						<td>11</td>
						<td>29</td>
						<td><img src="/resources/img/great.jfif" style="width:23px; height: 20px; position: relative; top: -3px; left: -5px;">11</td>
					</tr>
					<tr>
						<td>3</td>
						<td>회원가입입니다.</td>
						<td>정지혁</td>
						<td>2020.08.31</td>
						<td>11</td>
						<td>29</td>
						<td><img src="/resources/img/great.jfif" style="width:23px; height: 20px; position: relative; top: -3px; left: -5px;">11</td>
					</tr>
					<tr>
						<td>3</td>
						<td>회원가입입니다.</td>
						<td>정지혁</td>
						<td>2020.08.31</td>
						<td>11</td>
						<td>29</td>
						<td><img src="/resources/img/great.jfif" style="width:23px; height: 20px; position: relative; top: -3px; left: -5px;">11</td>
					</tr>
					<tr>
						<td>3</td>
						<td>회원가입입니다.</td>
						<td>정지혁</td>
						<td>2020.08.31</td>
						<td>11</td>
						<td>29</td>
						<td><img src="/resources/img/great.jfif" style="width:23px; height: 20px; position: relative; top: -3px; left: -5px;">11</td>
					</tr>
					<tr>
						<td>3</td>
						<td>회원가입입니다.</td>
						<td>정지혁</td>
						<td>2020.08.31</td>
						<td>11</td>
						<td>29</td>
						<td><img src="/resources/img/great.jfif" style="width:23px; height: 20px; position: relative; top: -3px; left: -5px;">11</td>
					</tr>
					<tr>
						<td>3</td>
						<td>회원가입입니다.</td>
						<td>정지혁</td>
						<td>2020.08.31</td>
						<td>11</td>
						<td>29</td>
						<td><img src="/resources/img/great.jfif" style="width:23px; height: 20px; position: relative; top: -3px; left: -5px;">11</td>
					</tr>
					<tr>
						<td>3</td>
						<td>회원가입입니다.</td>
						<td>정지혁</td>
						<td>2020.08.31</td>
						<td>11</td>
						<td>29</td>
						<td><img src="/resources/img/great.jfif" style="width:23px; height: 20px; position: relative; top: -3px; left: -5px;">11</td>
					</tr>
					<tr>
						<td>3</td>
						<td>회원가입입니다.</td>
						<td>정지혁</td>
						<td>2020.08.31</td>
						<td>11</td>
						<td>29</td>
						<td><img src="/resources/img/great.jfif" style="width:23px; height: 20px; position: relative; top: -3px; left: -5px;">11</td>
					</tr>
				</tbody>
			</table>
			<hr/>
			<a class="btn btn-default pull-left">목록</a>
			<a class="btn btn-default pull-right">글쓰기</a>
		
			<div class="text-center">
			<ul style="margin-top: 20px; margin-right: 11px; " class="pagination">
				<li class="page-item"><a class="page-link" href="#"><<</a></li>
				<li class="page-item"><a class="page-link" href="#"><</a></li>
				<li class="page-item"><a class="page-link" href="#">1</a></li>
				<li class="page-item"><a class="page-link" href="#">2</a></li>
				<li class="page-item"><a class="page-link" href="#">3</a></li>
				<li class="page-item"><a class="page-link" href="#">4</a></li>
				<li class="page-item"><a class="page-link" href="#">5</a></li>
				<li class="page-item"><a class="page-link" href="#">></a></li>
				<li class="page-item"><a class="page-link" href="#">>></a></li>
		    </ul> <!-- end pagination -->
	    </div>
		</div> <!-- end table-responsive -->
	</div> <!-- end container -->


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

</body>
</html>
