<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
  <head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>3Group 사원 관리</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template --> 
    <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="css/freelancer.min.css" rel="stylesheet">
    <link href="css/3group.css" rel="stylesheet">

    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
	<link href="http://code.jquery.com/ui/1.12.1/themes/humanity/jquery-ui.css" rel="stylesheet">

    <!-- Custom scripts for this template -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script src="js/jquery.tablesorter.min.js"></script>
	<script src="js/3group.js"></script>
	
  </head>

  <body id="page-top">

    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg bg-secondary fixed-top text-uppercase" id="mainNav">
      <div class="container-fluid">
        <a class="navbar-brand js-scroll-trigger" href="index.jsp">귀요미 지너니의 사원 관리 페이지에요~♥</a>
      </div>
    </nav>

    <!-- Header -->
    <header class="masthead bg-primary text-white text-center">
      <div class="container-fluid">
		
      	<div>
	        <img id='img' class="img-fluid mb-5 d-block mx-auto" src="img/jinwonfront.png" alt="지너니의 사진!"  onmouseover="over(this)" onmouseout="out(this)" style="width: 300px; height: 300px">
        </div>
        
        <h1 class="text-uppercase mb-0">귀요미 지너니</h1>
        <hr class="star-light">
        
       <!--
        <h2 class="font-weight-light mb-0">Web Developer - Graphic Artist - User Experience Designer</h2> 
        -->
      </div>
    </header>
    
    
	<section class="portfolio" id="portfolio">
      <div class="container-fluid">
		<div style="text-align: left">
			<input type="text" id="search">
		 	<button class="btn" id="empnosearch">사번검색</button>
      		<button class="btn" id="allsearch">전체보기</button>
	 		<button class="btn" id="empinsert">추가</button>
		</div>
		<div class="table-responsive">
	        <table class="table" id="myTable">  
				 <thead>
					 <tr>
					 	<th width="7%">사번</th> 
					 	<th width="15%">이름</th>
					 	<th width="15%">직업</th>
					 	<th width="7%">사수번호</th>
					 	<th width="15%">입사일</th>
					 	<th width="10%">급여</th>
					 	<th width="10%">수당</th>
					 	<th width="10%">부서번호</th>
					 	<th width="11%" colspan="2">작업공간</th>
					 </tr> 
				 </thead>
				 <tbody class="mybox"></tbody>
			</table>
		</div>
      	<br>
      </div>
    </section>


    <!-- Footer -->
    <footer class="footer text-center">
      <div class="container-fluid">
        <div class="row">
          <div class="col-md-4 mb-5 mb-lg-0">
            <h4 class="text-uppercase mb-4">Location</h4>
            <p class="lead mb-0">2215 John Daniel Drive
              <br>Clark, MO 65243</p>
          </div>
          <div class="col-md-4 mb-5 mb-lg-0">
            <h4 class="text-uppercase mb-4">Around the Web</h4>
            <ul class="list-inline mb-0">
              <li class="list-inline-item">
                <a class="btn btn-outline-light btn-social text-center rounded-circle" href="#">
                  <i class="fa fa-fw fa-facebook"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a class="btn btn-outline-light btn-social text-center rounded-circle" href="#">
                  <i class="fa fa-fw fa-google-plus"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a class="btn btn-outline-light btn-social text-center rounded-circle" href="#">
                  <i class="fa fa-fw fa-twitter"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a class="btn btn-outline-light btn-social text-center rounded-circle" href="#">
                  <i class="fa fa-fw fa-linkedin"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a class="btn btn-outline-light btn-social text-center rounded-circle" href="#">
                  <i class="fa fa-fw fa-dribbble"></i>
                </a>
              </li>
            </ul>
          </div>
          <div class="col-md-4">
            <h4 class="text-uppercase mb-4">About Freelancer</h4>
            <p class="lead mb-0">Freelance is a free to use, open source Bootstrap theme created by
              <a href="http://startbootstrap.com">Start Bootstrap</a>.</p>
          </div>
        </div>
      </div>
    </footer>

  </body>

</html>