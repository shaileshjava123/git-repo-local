<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<title>Bootstrap E-commerce Templates</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<!--[if ie]><meta content='IE=8' http-equiv='X-UA-Compatible'/><![endif]-->
		<!-- bootstrap -->
		<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">      
		<link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">		
		<link href="themes/css/bootstrappage.css" rel="stylesheet"/>
		
		<!-- global styles -->
		<link href="themes/css/flexslider.css" rel="stylesheet"/>
		<link href="themes/css/main.css" rel="stylesheet"/>

		<!-- scripts -->
		<script src="themes/js/jquery-1.7.2.min.js"></script>
		<script src="bootstrap/js/bootstrap.min.js"></script>				
		<script src="themes/js/superfish.js"></script>	
		<script src="themes/js/jquery.scrolltotop.js"></script>
		<!--[if lt IE 9]>			
			<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
			<script src="js/respond.min.js"></script>
		<![endif]-->
	</head>
    <body>		
		<!-- <div id="top-bar" class="container">
			<div class="row">
				<div class="span4">
					<form method="POST" class="search_form">
						<input type="text" class="input-block-level search-query" Placeholder="eg. T-sirt">
					</form>
				</div>
				<div class="span8">
					<div class="account pull-right">
						<ul class="user-menu">				
							<li><a href="#">My Account</a></li>
							<li><a href="cart.jsp">Your Cart</a></li>
							<li><a href="checkout.jsp">Checkout</a></li>					
							<li><a href="register.jsp">Login</a></li>			
						</ul>
					</div>
				</div>
			</div>
		</div> -->
		<div id="wrapper" class="container">
			<section class="navbar main-menu">
				<div class="navbar-inner main-menu">				
					<a href="index.jsp" class="logo pull-left"><img src="themes/images/akb logo3.png" class="site_logo" alt=""></a>
					<nav id="menu" class="pull-right">
						<!-- <ul>
							<li><a href="./products.jsp">Woman</a>					
								<ul>
									<li><a href="./products.jsp">Lacinia nibh</a></li>									
									<li><a href="./products.jsp">Eget molestie</a></li>
									<li><a href="./products.jsp">Varius purus</a></li>									
								</ul>
							</li>															
							<li><a href="./products.jsp">Man</a></li>			
							<li><a href="./products.jsp">Sport</a>
								<ul>									
									<li><a href="./products.jsp">Gifts and Tech</a></li>
									<li><a href="./products.jsp">Ties and Hats</a></li>
									<li><a href="./products.jsp">Cold Weather</a></li>
								</ul>
							</li>							
							<li><a href="./products.jsp">Hangbag</a></li>
							<li><a href="./products.jsp">Best Seller</a></li>
							<li><a href="./products.jsp">Top Seller</a></li>
						</ul> -->
					</nav>
				</div>
			</section>							
			<section class="google_map">
				<iframe width="100%" height="300" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="https://maps.google.com/maps?width=100%&height=600&hl=en&coord=28.6139391,77.20902120000005&q=new%20delhi+(akb%20india)&ie=UTF8&t=&z=14&iwloc=B&output=embed"></iframe>
			</section>
			
			
			<section class="header_text sub">
			<img class="pageBanner" src="themes/images/pageBanner.png" alt="New products" >
				<h4><span>Contact Us</span></h4>
				
				${statusMsg }
			</section>
			<section class="main-content">				
				<div class="row">				
					<div class="span5">
						<div>
							<h5>ADDITIONAL INFORMATION</h5>
							<p><strong>Phone:</strong>&nbsp;(123) 456-7890<br>
							<strong>Fax:</strong>&nbsp;+04 (123) 456-7890<br>
							<strong>Email:</strong>&nbsp;<a href="#">vietcuong_it@yahoo.com</a>								
							</p>
							<br/>
							<h5>SECONDARY OFFICE IN VIETNAM</h5>
							<p><strong>Phone:</strong>&nbsp;(113) 023-1125<br>
							<strong>Fax:</strong>&nbsp;+04 (113) 023-1145<br>
							<strong>Email:</strong>&nbsp;<a href="#">vietcuong_it@yahoo.com</a>					
							</p>
						</div>
					</div>
					<div class="span7">
						<p>Please get in touch with any enquiry you may have. We usually reply to all emails within 48 hours.</p>
						<form method="post" action="enquiry">
							<fieldset>
								<div class="clearfix">
									<label for="name"><span>Name:</span></label>
									<div class="input">
										<input tabindex="1" size="18" id="name" name="name" type="text" value="" class="input-xlarge" placeholder="Name">
									</div>
								</div>
								
								<div class="clearfix">
									<label for="email"><span>Email:</span></label>
									<div class="input">
										<input tabindex="2" size="25" id="email" name="email" type="text" value="" class="input-xlarge" placeholder="Email Address">
									</div>
								</div>
								
								<div class="clearfix">
									<label for="message"><span>Message:</span></label>
									<div class="input">
										<textarea tabindex="3" class="input-xlarge" id="message" name="message" rows="7" placeholder="Message"></textarea>
									</div>
								</div>
								
								<div class="actions">
									<button tabindex="3" type="submit" class="btn btn-inverse">Send message</button>
								</div>
							</fieldset>
						</form>
					</div>				
				</div>
			</section>			
			<section id="footer-bar">
				<div class="row">
					<!-- <div class="span3">
						<h4>Navigation</h4>
						<ul class="nav">
							<li><a href="./index.jsp">Homepage</a></li>  
							<li><a href="./about.jsp">About Us</a></li>
							<li><a href="./contact.jsp">Contac Us</a></li>
							<li><a href="./cart.jsp">Your Cart</a></li>
							<li><a href="./register.jsp">Login</a></li>							
						</ul>					
					</div>
					<div class="span4">
						<h4>My Account</h4>
						<ul class="nav">
							<li><a href="#">My Account</a></li>
							<li><a href="#">Order History</a></li>
							<li><a href="#">Wish List</a></li>
							<li><a href="#">Newsletter</a></li>
						</ul>
					</div> -->
					<div class="span5">
						<p class="logo"><img src="themes/images/akb logo3.png" class="site_logo" alt=""></p>
						<p>a-82 <br/> duggal colony <br/> devli road <br/> kanpur.</p>
						<br/>
						<span class="social_icons">
							<a class="facebook" href="#">Facebook</a>
							<a class="twitter" href="#">Twitter</a>
							<a class="skype" href="#">Skype</a>
							<a class="vimeo" href="#">Vimeo</a>
						</span>
					</div>					
				</div>	
			</section>
			<section id="copyright">
				<span><p>&copy; Copyright 2018. All Rights Reserved.</p></span>
			</section>
		</div>
		<script src="themes/js/common.js"></script>		
    </body>
</html>