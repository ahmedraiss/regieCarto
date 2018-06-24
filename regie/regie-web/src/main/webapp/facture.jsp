<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta charset="UTF-8">
<title>Facture</title>
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
<%
	HttpSession ss = request.getSession();
%>
<body class="fixed-sn white-skin">

	<!--Double navigation-->
	<header>
		<!-- Sidebar navigation -->
		<div id="slide-out" class="side-nav sn-bg-4 fixed">
			<ul class="custom-scrollbar">
				<!-- Logo -->
				<li>
					<div class="logo-wrapper waves-light">
						<a href="#"><img src="regie/img/logo.jpg"
							class="img-fluid flex-center"></a>
					</div>
				</li>
				<!-- Side navigation links -->
				<li>
					<ul class="collapsible collapsible-accordion">
						<li><a class="collapsible-header waves-effect arrow-r active"
							href="saisieaffaire"><i class="fa fa-chevron-right"></i>
								Demande</a></li>
						<li><a class="collapsible-header waves-effect arrow-r"
							href="facture"><i class="fa fa-hand-pointer-o"></i> Facture</a></li>
						<li><a class="collapsible-header waves-effect arrow-r"
							href="recouvrement"><i class="fa fa-envelope-o"></i>
								Recouvernement</a></li>
					</ul>
				</li>
				<!--/. Side navigation links -->
			</ul>
			<div class="sidenav-bg mask-strong"></div>
		</div>
		<!--/. Sidebar navigation -->
		<!-- Navbar -->
		<nav
			class="navbar fixed-top navbar-toggleable-md navbar-expand-lg scrolling-navbar double-nav">
			<!-- SideNav slide-out button -->
			<div class="float-left">
				<a href="#" data-activates="slide-out"
					class="button-collapse black-text"><i class="fa fa-bars"></i></a>
			</div>
			<!-- Breadcrumb-->
			<div class="breadcrumb-dn mr-autotext-center">
				<p class="text-center">Facture</p>
			</div>
			<ul class="nav navbar-nav nav-flex-icons ml-auto">
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle " href="#"
					id="navbarDropdownMenuLink" data-toggle="dropdown"
					aria-haspopup="true" aria-expanded="false"> <i
						class="fa fa-user"></i> <s:property
							value="#session.agentBean.accountName" />
				</a>
					<div class="dropdown-menu dropdown-menu-right"
						aria-labelledby="navbarDropdownMenuLink">
						<a class="dropdown-item" href="#">Action</a> <a
							class="dropdown-item" href="#">Another action</a> <a
							class="dropdown-item" href="#">Something else here</a>
					</div></li>
			</ul>
		</nav>
		<!-- /.Navbar -->
	</header>
	<!--/.Double navigation-->

	<!--Main layout-->
	<main> <!-- Section: Contact v.1 -->
	<section class="my-5">

		<form action="">
			<!-- Grid row -->
			<div class="row">

				<!-- Grid column -->
				<div>

					<!-- Form with header -->
					<div class="card">
						<div class="card-body">
							<!-- Header -->
							<!-- Header -->
							<div class="form-header blue-gradient">
								<h3 class="mt-2">
									<i class="fa fa-envelope"></i> Facture
								</h3>
							</div>
							<div class="row">
								<!-- Body -->
								<div class="col-md-6 md-form">
									<i class="fa fa-user prefix grey-text"></i> <input type="text"
										id="form-name" class="form-control"> <label
										for="form-name">N°</label>
								</div>

								<div class="col-md-6 md-form">
									<i class="fa fa-calendar prefix grey-text"></i> <input
										placeholder="Selectione la date" type="text"
										id="date-picker-example" class="form-control datepicker">
								</div>
								<div class="col-md-6 md-form">
									<i class="fa fa-user prefix grey-text"></i> <input type="text"
										id="form-name" class="form-control"> <label
										for="form-name">Nom du client</label>
								</div>

								<div class="col-md-6 md-form">
									<i class="fa  fa-address-book-o prefix grey-text"></i> <input
										type="text" id="form-name" class="form-control"> <label
										for="form-name">Adress du client</label>
								</div>
								<div class="col-md-12 md-form">
									<!--Blue select-->
								
									<select class="mdb-select colorful-select dropdown-secondary">
										<option value="1">B.C N°</option>
										<option value="2">Marche N°</option>
										<option value="3">Autre</option>
									</select> <label>Type</label>
								</div>


								<div class="col-md-4 md-form">
									<i class="fa fa-user prefix grey-text"></i> <input type="text"
										id="form-text" class="form-control"></input> <label
										for="form-text">Numero de B.C</label>
								</div>
								<div class="col-md-4 md-form">
									<i class="fa fa-calendar prefix grey-text"></i> <input
										placeholder="Selectione la date" type="text"
										id="date-picker-example" class="form-control datepicker">
								</div>
								<div class="col-md-4 md-form">
									<input type="text" id="form-Subject" class="form-control"
										disabled> <label for="form-Subject">Numero
										Bultin</label>
								</div>
							</div>
						</div>
					</div>
					<!-- Form with header -->

				</div>
				<!-- Grid column -->
	</section>
	<!-- Section: Contact v.1 -->


	<section class="my-5">

		<div class="card card-cascade narrower">

			<!--Card image-->
			<div
				class="view gradient-card-header blue-gradient narrower py-2 mx-4 mb-3 d-flex justify-content-between align-items-center">

				<div>
					<button type="button"
						class="btn btn-outline-white btn-rounded btn-sm px-2">
						<i class="fa fa-th-large mt-0"></i>
					</button>
					<button type="button"
						class="btn btn-outline-white btn-rounded btn-sm px-2">
						<i class="fa fa-columns mt-0"></i>
					</button>
				</div>

				<a href="" class="white-text mx-3">Table name</a>

				<div>
					<button type="button"
						class="btn btn-outline-white btn-rounded btn-sm px-2">
						<i class="fa fa-pencil mt-0"></i>
					</button>
					<button type="button"
						class="btn btn-outline-white btn-rounded btn-sm px-2">
						<i class="fa fa-remove mt-0"></i>
					</button>
					<button type="button"
						class="btn btn-outline-white btn-rounded btn-sm px-2">
						<i class="fa fa-info-circle mt-0"></i>
					</button>
				</div>

			</div>
			<!--/Card image-->

			<div class="px-4">

				<div class="table-wrapper">
					<table class="table table-hover mb-0">

						<!--Table head-->
						<thead>
							<tr>
								<th><input type="checkbox" id="checkbox"> <label
									for="checkbox" class="mr-2 label-table"></label></th>
								<th class="th-lg"><a>Document <i
										class="fa fa-sort ml-1"></i></a></th>
								<th class="th-lg"><a href="">Support<i
										class="fa fa-sort ml-1"></i></a></th>
								<th class="th-lg"><a href="">Echell<i
										class="fa fa-sort ml-1"></i></a></th>
								<th class="th-lg"><a href="">Quantite<i
										class="fa fa-sort ml-1"></i></a></th>
								<th class="th-lg"><a href="">Prix<i
										class="fa fa-sort ml-1"></i></a></th>
								<th class="th-lg"><a href="">Txt totale<i
										class="fa fa-sort ml-1"></i></a></th>
							</tr>
						</thead>
						<!--Table head-->

						<!--Table body-->
						<tbody>
							<tr>
								<th scope="row"><input type="checkbox" id="checkbox1">
									<label for="checkbox1" class="label-table"></label></th>
								<td>Mark</td>
								<td>Otto</td>
								<td>@mdo</td>
								<td>Mark</td>
								<td>Otto</td>
								<td>@mdo</td>
							</tr>

							<tr>
								<th scope="row"><input type="checkbox" id="checkbox1">
									<label for="checkbox1" class="label-table"></label></th>
								<td>Mark</td>
								<td>@mdo</td>
								<td>Mark</td>
								<td>Otto</td>
								<td>@mdo</td>
								<td>@mdo</td>
							</tr>

							<tr>
								<th scope="row"><input type="checkbox" id="checkbox3">
									<label for="checkbox3" class="label-table"></label></th>
								<td>Larry</td>
								<td>@twitter</td>
								<td>Larry</td>
								<td>the Bird</td>
								<td>@twitter</td>
								<td>@mdo</td>
							</tr>
							<tr>
								<th scope="row"><input type="checkbox" id="checkbox4">
									<label for="checkbox4" class="label-table"></label></th>
								<td>Paul</td>
								<td>Topolski</td>
								<td>Paul</td>
								<td>Topolski</td>
								<td>@P_Topolski</td>
								<td>@mdo</td>
							</tr>
							<tr>
								<th scope="row"><input type="checkbox" id="checkbox5">
									<label for="checkbox5" class="label-table"></label></th>
								<td>Larry</td>
								<td>the Bird</td>
								<td>@twitter</td>
								<td>Larry</td>
								<td>@twitter</td>
								<td>@mdo</td>
							</tr>
						</tbody>
						<!--Table body-->
					</table>
				</div>





			</div>
		</div>

	</section>
	<section class="my-5">

		<!-- Section heading -->


		<!-- Grid column -->
		<div>

			<!-- Form with header -->
			<div class="card">
				<div class="card-body">
					<!-- Header -->
					<div class="form-header blue-gradient">
						<h3 class="mt-2">
							<i class="fa fa-money"></i> Montant
						</h3>
					</div>
					<div class="row">
						<!-- Body -->
						<div class="col-md-6 md-form">
							<i class="fa fa-sort-amount-asc prefix grey-text"></i> <input
								type="text" id="form-name" class="form-control" disabled>
							<label for="form-name">Taux de Majoration</label>
						</div>

						<div class="col-md-6 md-form">
							<i class="fa  fa-address-book-o prefix grey-text"></i> <input
								type="text" id="form-name" class="form-control" disabled>
							<label for="form-name"> Montant Majore </label>
						</div>

						<div class="col-md-6 md-form">
							<i class="fa fa-sort-amount-desc prefix grey-text"></i> <input
								type="text" id="form-name" class="form-control" disabled>
							<label for="form-name">Taux de Remise</label>
						</div>

						<div class="col-md-6 md-form">
							<i class="fa  fa-address-book-o prefix grey-text"></i> <input
								type="text" id="form-name" class="form-control" disabled>
							<label for="form-name"> Montant Remis</label>
						</div>

						<div class="col-md-4 md-form">
							<i class="fa fa-money prefix grey-text"></i> <input type="text"
								id="form-name" class="form-control" disabled> <label
								for="form-name">Total H.T</label>
						</div>
						<div class="col-md-4 md-form">
							<i class="fa  fa-money prefix grey-text"></i> <input type="text"
								id="form-name" class="form-control" disabled> <label
								for="form-name">T.V.A</label>
						</div>
						<div class="col-md-4 md-form">
							<i class="fa  fa-money prefix grey-text"></i> <input type="text"
								id="form-name" class="form-control" disabled> <label
								for="form-name">Total T.T.C</label>
						</div>
					</div>
					<div class="text-center">
						<button class="btn peach-gradient btn-rounded">Valider</button>
						<button class="btn purple-gradient btn-rounded">Imprimer</button>
						<button class="btn blue-gradient btn-rounded">Avoir</button>
						<button class="btn aqua-gradient btn-rounded">Annuler</button>
						<button class="btn peach-gradient btn-rounded">Retour</button>
					</div>

				</div>
			</div>
			<!-- Form with header -->

		</div>
		<!-- Grid column -->

	</section>


	</main>
	<!--/Main layout-->



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

	<script>
		$(document).ready(function() {
			// SideNav Initialization
			$(".button-collapse").sideNav();

			new WOW().init();

			$('.datepicker').pickadate();
			// Data Picker Initialization
			$('.datepicker').pickadate();

			// Material Select Initialization

			$('.mdb-select').material_select();
		});
	</script>
</body>
</html>