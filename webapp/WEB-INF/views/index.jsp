<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="icon" href="resources/images/favicon.ico" type="image/icon">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=0, maximum-scale=1">
<title>Iron Bull Restaurant</title>
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Bree+Serif'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Kaushan+Script'
	rel='stylesheet' type='text/css'>

<link rel="stylesheet" href="resources/css/flexslider.css"
	type="text/css">
<link rel="stylesheet" href="resources/css/styles.css" type="text/css">
<link rel="stylesheet" href="resources/css/layout.css" type="text/css">

</head>
<body class="sunfire">
	<a id="Top"></a>
	<div id="nav">
		<div id="navitems">
			<div id="logo">
				<a href="#Top"><img src="resources/images/logo.png" alt=""></a>
			</div>
			<ul>
				<li><a href="#Menu">Our Menu</a></li>
				<li><a href="#Specials">Specials</a></li>
				<li><a href="#Locations">Locations</a></li>
				<li><a href="#Story">Story</a></li>
				<li><a href="#Careers">Careers</a></li>
				<li><a href="#Events">Events</a></li>
			</ul>
		</div>
	</div>
	<div id="allconent">
		<div class="contentsection" id="header"
			style="background: url(resources/images/f1image.jpg) 50% 0 no-repeat; height: 645px;">
			<div class="content">
				<div id="floater">
					<img src="resources/images/floater.png" alt="">
				</div>
				<h2>40 Burger Choices</h2>
				<h1>
					Grilled Angus <br>Perfection
				</h1>
				<p>
					At our tap house, you can experiences some of the finest beef and
					drink selection in the country. <a href="#">Stop by and see for
						yourself!</a>
				</p>
				<p>
					<a href="#Menu" class="button">View Our Menu &rsaquo;</a>
				</p>
			</div>
		</div>
		<a id="Menu"></a>
		<div class="contentsection beige">
			<div class="content">
				<img src="resources/images/seal.png" class="seal" alt="">
				<h1>Our Menu</h1>
				<h2>Satisfy your hunger with our extravagant menu!</h2>
				<div id="menu">
					<c:forEach var="category" items="${categories}">
						<div class="menusection">
							<h2>
								<c:out value="${category.name}" />
								<img class="tape"
									src="resources/images/<c:out value='${category.image}'/>" alt="">
							</h2>
							<div class="cols clearfix">

								<c:forEach var="food" items="${category.foodList}" varStatus="loop">
								
									<div class="${loop.index % 2 == 0 ? 'col1' : 'col2'}">
										<div class="menuitem">
											<h3>
												<c:out value='${food.name}' />
											</h3>
											<p>
												<c:out value='${food.description}' />
											</p>
											<p class="price">
												<c:out value='${food.price}' />	$
											</p>
											<p class="calories">
												<c:out value='${food.calories}' />
												Calories
											</p>
										</div>
									</div>
								</c:forEach>

							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
		<a id="Specials"></a>
		<div class="contentsection dark">
			<div class="content">
				<div class="left">
					<h1>Specials</h1>
					<p class="callout">Our have a full bar that includes one of the
						largest selections of brews one can imagine.</p>
					<br>
					<c:forEach var="special" items="${specials}">
						<div class="special">
							<c:if test="${special.happyHour eq true }">
								<img src="resources/images/happyhour.png" alt="">
							</c:if>
							<h2>
								<c:out value='${special.name}' />
							</h2>
							<p>
								<i><c:out value='${special.timeEvent}' /></i>
							</p>
							<p>
								<c:out value='${special.description}' />
							</p>
						</div>
					</c:forEach>
				</div>
				<div id="beer"></div>
			</div>
		</div>
		<a id="Locations"></a>
		<div class="contentsection beige">
			<div class="content">
				<h1>Locations</h1>
				<p class="callout">Duis ante mi, laoreet ut, commodo eleifend,
					cursus nec, lorem.</p>
				<div id="map" data-lat="26.366649" data-long="-80.082493"></div>
				<div id="maplocations">
					<div class="locationitem clearfix" data-lat="26.711574"
						data-long="-80.036144">
						<h3>Palm Beach</h3>
						<p>This is located on the ocean front in Palm Beach Florida.
							Easily the best in town.</p>
						<p class="telephone">
							<a href="#" class="button">(305)555-3294</a>
						</p>
					</div>
					<div class="locationitem clearfix" data-lat="25.794945"
						data-long="-80.224972">
						<h3>Miami</h3>
						<p>Enjoy the city of Miami's Best burgers!</p>
						<p class="telephone">
							<a href="#" class="button">(305)555-3294</a>
						</p>
					</div>
					<div class="locationitem clearfix" data-lat="26.366649"
						data-long="-80.082493">
						<h3>Boca Raton</h3>
						<p>Visit our Boca Raton location today! Call for your
							reservation.</p>
						<p class="telephone">
							<a href="#" class="button">(305)555-3294</a>
						</p>
					</div>
				</div>
			</div>
		</div>
		<a id="Story"></a>
		<div class="contentsection orange"
			style="background-image: url(resources/images/bs.png); background-position: 92% -45px;">
			<div class="content">
				<h1>Our Story</h1>
				<h2>37 Years of family tradition.</h2>
				<p class="callout full">Lorem ipsum dolor sit amet, consectetuer
					adipiscing elit. Morbi commodo, ipsum sed pharetra gravida, orci
					magna rhoncus neque, id pulvinar odio lorem non turpis. Nullam sit
					amet enim. Suspendisse id velit vitae ligula volutpat condimentum.
					Aliquam erat volutpat. Sed quis velit.</p>
				<p class="callout full">Nulla facilisi. Nulla libero. Vivamus
					pharetra posuere sapien. Nam consectetuer. Sed aliquam, nunc eget
					euismod ullamcorper, lectus nunc ullamcorper orci, fermentum
					bibendum enim nibh eget ipsum. Donec porttitor ligula eu dolor.
					Maecenas vitae nulla consequat libero cursus venenatis. Nam magna
					enim, accumsan eu, blandit sed, blandit a, eros.</p>
				<br>
				<div id="wheel">
					<img src="resources/images/wheel.png" alt=""> 
					<img src="resources/images/wheel.png" alt="">
				</div>
			</div>
		</div>
		<a id="Careers"></a>
		<div class="contentsection gray">
			<div class="content">
				<h1>Careers</h1>
				<p class="callout">Available positions</p>
				<br> <br>
				<div class="clearfix">
					<c:forEach var="career" items="${careers}">
						<div class="jobtable">
							<p class="jobtitle">
								<c:out value="${career.name}" />
							</p>
							<p class="job">
								<c:out value="${career.description}" />
							</p>
							<ul>
								<li><c:out value="${career.positions}" /> Positions</li>
							</ul>
							<div class="apply">
								<div class="wbutton">
									<a href="#">Apply Now</a>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
				<br>
			</div>
			<div class="falloff">
				<img src="resources/images/owners.jpg" alt="">
				<img src="resources/images/pic1.jpg" alt="">
				<img src="resources/images/pic2.jpg" alt="">
			</div>
		</div>
		<a id="Events"></a>
		<div class="contentsection dark"
			style="background: url(resources/images/mastimage.jpg) 50% 50px no-repeat;">
			<div class="content">
				<div class="stage">
					<h1>Events</h1>
					<p class="callout">Tag your instagram photos with hashtag
						#ironbull to appear in our album! We will look over them and add
						your picture to our site!</p>
					<br>
					<div id="contentright">
						<div id="slideshow" class="flexslider">
							<ul class="slides">
								<li><img alt="project" src="resources/images/fun1.jpg"
									class="roid" />
									<p class="flex-caption">New Year's Eve 2012</p></li>
								<li><img alt="project" src="resources/images/fun2.jpg"
									class="roid" />
									<p class="flex-caption">Letting the good times roll.</p></li>
								<li><img alt="project" src="resources/images/fun3.jpg"
									class="roid" />
									<p class="flex-caption">Cinco De Mayo 2012</p></li>
								<li><img alt="project" src="resources/images/fun4.jpg"
									class="roid" />
									<p class="flex-caption">Random Night</p></li>
								<li><img alt="project" src="resources/images/fun5.jpg"
									class="roid" />
									<p class="flex-caption">Buy your Mom a draft night.</p></li>
							</ul>
						</div>
						<div class="polaroid">
							<img class="tape" src="resources/images/tapel.png" alt="">
						</div>
					</div>
				</div>
			</div>
		</div>
		<div id="footer">
			<div id="footercontent">
				<div class="clearfix">
					<div class="content">
						<p>
							We hoped you had fun on our interactive site. Now come try our
							food! &nbsp;&nbsp;&nbsp;<a class="button anchor" href="#Top">Back
								to Top</a>
						</p>
					</div>

				</div>
				<p class="copyright">&copy; Copyright Iron Bull 2015</p>
			</div>
		</div>
	</div>
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
	<script src="resources/js/jquery.sticky.js"></script>
	<script type="text/javascript"
		src="resources/js/jquery.mousewheel-3.0.4.pack.js"></script>
	<script src="resources/js/jqueryeasing.js"></script>
	<script src="resources/js/flexslider.js"></script>
	<script src="resources/js/site.js"></script>
	<script type="text/javascript"
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBaXBe4RxtbrU2clirhC4fpzY4E6riZC_Y&amp;sensor=false"></script>
	<script src="resources/js/maps.js"></script>
</body>
</html>