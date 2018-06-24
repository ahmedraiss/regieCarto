<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>RÉGIE DE LA CARTOGRAPHIE</title>
<link rel="shortcut icon" href="regie/img/logo.ico" />
<link rel="stylesheet"
	href="third/font-awesome/css/font-awesome.min.css">
<!-- Bootstrap core CSS -->
<link href="third/mdb/css/bootstrap.min.css" rel="stylesheet">
<!-- Material Design Bootstrap -->
<link href="third/mdb/css/mdb.min.css" rel="stylesheet">
<!-- Material Design Bootstrap -->
<link href="third/mdb/css/mdb.pro.min.css" rel="stylesheet">
<!-- Your custom styles (optional) -->
<link href="regie/css/style.css" rel="stylesheet">
</head>

<body>
	<div class="bg">
		<div class="container-fluid">


			<div class="row">
				<div class="col-md-3 ">
					<img src="regie/img/logo.jpg" class="mt-3 text-center">
					<p>
						<font size="1">VENTE ET DOCUMENTATION</font><br> <font
							size="1">TECHNIQUE</font>
					</p>
				</div>
				<div class="col-md-5 mt-5 ">
					<div class="row text-center">
						<h2
							class=" font-weight-bold deep-orange-lighter-hover mb-3 blue-grey-text">RÉGIE
							DE LA CARTOGRAPHIE</h2>
					</div>
				</div>
			</div>
			<div class="row align-items-center  ">
				<div class="col-md-3 mt-4 ml-5">
					<div class="container row align-items-center">
						<!--Form-->

						<div class="card wow fadeInRight" data-wow-delay="0.3s">
							<div class="card-body">
								<!--Header-->
								<div class="text-center">
									<h3 class="white-text">
										<i class="fa fa-user white-text"></i> Register:
									</h3>
									<hr class="hr-light">
								</div>

								<s:form action="login" method="post">
									<!--Body-->
									<div class="md-form">
										<i class="fa fa-user prefix white-text active"></i>
										<input type="text" id="form3" class="form-control"
											name="agentBean.accountName">
										<label for="form3" class="active">Your name</label>
									</div>
									<div class="md-form">
										<i class="fa fa-envelope prefix white-text active"></i>
										<input type="password" id="form2" class="form-control"
											name="agentBean.password">
										<label for="form2" class="active">Password</label>
									</div>
									<div class="text-center">
										<button class="btn btn-indigo" type="submit">Sign up</button>
									</div>
								</s:form>
							</div>
						</div>

						<!--/.Form-->
					</div>
					<s:if test="%{#session.loginError != null}">
					<li>
						<div class="alert alert-danger h4-responsive" role="alert">
							<s:property value="#session.loginError"
								escapeHtml="false" />
						</div>
						<c:remove var="loginError" scope="session" />
					</li>
				</s:if>
				</div>
			</div>
		</div>
	</div>

	<!-- SCRIPTS -->
	<!-- JQuery -->

	<script type="text/javascript" src="third/mdb/js/jquery-3.2.1.min.js"></script>
	<!-- Bootstrap tooltips -->
	<script type="text/javascript" src="third/mdb/js/popper.min.js"></script>
	<!-- Bootstrap core JavaScript -->
	<script type="text/javascript" src="third/mdb/js/bootstrap.min.js"></script>
	<!-- MDB core JavaScript -->
	<script type="text/javascript" src="third/mdb/js/mdb.min.js"></script>
	<script type="text/javascript" src="third/mdb/js/mdb.pro.min.js"></script>

</body>

</html>