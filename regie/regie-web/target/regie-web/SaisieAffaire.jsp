<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta charset="UTF-8">
<title>Saisie Affaire</title>
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
				<p class="text-center">Saisie De L'affaire</p>
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
				<div class="col-lg-6 mb-lg-0 mb-4">

					<!-- Form with header -->
					<div class="card">
						<div class="card-body">
							<!-- Header -->
							<div class="form-header blue-gradient">
								<h3 class="mt-2">
									<i class="fa fa-user"></i>INFORMATION PERSONNEL
								</h3>
							</div>

							<!-- Body -->
							<div class="md-form">
								<i class="fa fa-user prefix grey-text"></i> <input type="text"
									id="form-name" class="form-control"> <label
									for="form-name">Numero de bultin</label>
							</div>
							<div class="md-form">
								<i class="fa fa-user prefix grey-text" ></i> <input type="text"
									id="annee" class="form-control" name="demandeBean.annee"> <label
									for="form-name">Aneee</label>
							</div>
							<div class="md-form">
								<i class="fa fa-user prefix grey-text"></i> <input type="text"
									id="cin" class="form-control" name="demandeBean.cin"> <label
									for="form-name">Numero de CIN</label>
							</div>
							<div class="md-form">
								<i class="fa fa-calendar prefix grey-text"></i> <input
									placeholder="Selectione la date" type="text"
									id="date" class="form-control datepicker" name="demandeBean.date">

							</div>
							<div class="md-form">
								<i class="fa fa-envelope prefix grey-text"></i> <input
									type="text" id="nom" class="form-control" name="demandeBean.nom"> <label
									for="form-email">Nom du Deposant</label>
							</div>
							<div class="md-form">
								<i class="fa fa-pencil prefix grey-text"></i>
								<textarea id="adresse" class="form-control md-textarea"
									rows="3" name="demandeBean.adress"></textarea>
								<label for="form-text">Adresse du Deposant</label>
							</div>
							<div class="md-form">
								<i class="fa fa-tag prefix grey-text"></i> <input type="text"
									id="form-Subject" class="form-control"> <label
									for="form-Subject">Nom du Receptionnistre</label>
							</div>
							
							<div class=" md-form">
	                            <input class="form-check-input" type="checkbox" id="checkbox1">
	                            <label class="form-check-label" 
	                            for="checkbox1" class="label-table" name="demandeBean.is_remise"> Montant is Remis</label>
							</div>


						</div>
					</div>
					<!-- Form with header -->

				</div>
				<!-- Grid column -->

				<!-- Grid column -->
				<div class="col-lg-6 mb-lg-0 mb-4">

					<!-- Form with header -->
					<div class="card">
						<div class="card-body">
							<!-- Header -->
							<div class="form-header blue-gradient">
								<h3 class="mt-2">
									<i class="fa fa-map-o"></i>Carte
								</h3>
							</div>

							<!-- Body -->
								
							<div class="md-form">
								<!--Blue select-->
								<s:select class="mdb-select colorful-select dropdown-secondary"
									headerKey="-1" headerValue="Select categorie Carte"
									list="categorieCarteBean" name="yourCategorieCarte" id="categorie_id"
									listKey="labelleCategorie" listValue="labelleCategorie" />
								<label>Cathegorie du carte</label>
							</div>
							
							<div class="md-form">
								<!--Blue select-->
								<s:select class="mdb-select colorful-select dropdown-secondary" id="nature_id"
									headerKey="-1" headerValue="Select categorie Carte"
									list="natureCarteBean" name="SelectednatureCarte" listKey="natureLabell"
									listValue="natureLabell" />
								<label>Nature</label>
							</div>
							
							<div class="md-form">
								<!--Blue select-->
								<select class="browser-default" 
										id="carte_id" name="yourCarteType">
								
								</select> <label>Carte</label>
							</div>
							
							<div class="md-form">
								<!--Blue select-->
								<select class="browser-default"
									 id="echelle_id"  name="yourEchelleCarte" >
									 </select>
								<label>Echelle</label>
								</div>
							
							<div class="md-form">
								<!--Blue select-->
								<select class="browser-default"
									 id="support_id"  name="yourSupportCarte" >
									 </select>
								<label>Support</label>

							</div>

							<div class="md-form">
								<i class="fa fa-user prefix grey-text" ></i> <input type="text"
									id="ref_id" class="form-control" name="carteBean.refProduit"> <label
									for="form-name">Reference produit</label>
							</div>

							<div class="md-form" >
								<i class="fa fa-user prefix grey-text" ></i> <input type="number"
									id="nomre_id"class="form-control" name="carteBean.nombre" onkeyup="myFunction()"> <label
									for="form-name">Nombre</label>
							</div>
							
							<div class="md-form">
								<i class="fa fa-user prefix grey-text" ></i> <input type="text"
									id="description_id" class="form-control" name="carteBean.description"> <label
									for="form-name">Description</label>
							</div>
							
							<div class="md-form">
								<i class="fa fa-user prefix grey-text"></i> <input type="text"
									id="prix" class="form-control" name="carteTypeBeansingle.prixunitaire" onkeyup="myFunction()" disabled>
							</div>

							<div class="md-form">
								<i class="fa fa-user prefix grey-text"></i> <input type="number"
									id="total" class="form-control"   disabled>
							</div>


							<div class="text-center">
								<a class="btn blue-gradient btn-rounded" id="ajouterPanier">Ajouter</a>
							</div>
							
						</div>
					</div>
					<!-- Form with header -->

				</div>



			</div>
		</form>
		<!-- Grid row -->


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

				<a href="" class="white-text mx-3">LES CARTES</a>

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
					<!--Table-->
					<table class="table table-hover mb-0">

						<!--Table head-->
						<thead>
							<tr>
								<th class="th-lg">Cathegorie du carte</th>
								<th class="th-lg">Nature</th>
								<th class="th-lg">Carte</th>
								<th class="th-lg">Echelle</th>
								<th class="th-lg">Support</th>
								<th class="th-lg">id</th>
								<th class="th-lg">Description</th>
								<th class="th-lg">Reference Produit</th>
								<th class="th-lg">Nombre</th>
							</tr>
						</thead>
						<!--Table head-->

						<!--Table body-->
						<tbody id="panierTable" name="">
							<!--les paniers-->
							
						</tbody>
						<!--Table body-->
					</table>
					<!--Table-->
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
							<i class="fa fa-envelope"></i> MONTANT
						</h3>
					</div>
					<div class="row">

						<div class="col-md-4 md-form">
							<input type="number" class="form-control" id="mht"></input> 
						</div>
						<div class="col-md-4 md-form">
							<i class="fa fa-pencil prefix grey-text"></i> <input type="text"
								id="form-text" class="form-control"></input> <label
								for="form-text">TVA</label>
						</div>
						<div class="col-md-4 md-form">
							<i class="fa fa-tag prefix grey-text"></i> <input type="text"
								id="form-Subject" class="form-control"> <label
								for="form-Subject">Montant à Payer</label>
						</div>
					</div>
					<div class="text-center">
						<a class="btn peach-gradient btn-rounded" type="submit" id="creation_id">création</a>
						<button class="btn purple-gradient btn-rounded">Mise à
							jour</button>
						<button class="btn blue-gradient btn-rounded">Confirmer</button>
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
			$.extend($.fn.pickadate.defaults, {
                format : 'yyyy-mm-dd',
                formatSubmit : 'yyyy-mm-dd',

 					});
			// SideNav Initialization
			$(".button-collapse").sideNav();

			new WOW().init();

			$('.datepicker').pickadate();

			// Material Select Initialization

			$('.mdb-select').material_select();
		});
	</script>
	<script type="text/javascript">
	$(document).ready(function(){
		  var natid;
		  var deptid;
		  var carteid;
		  var totale;
		  montantHT=0;
			 
		  
		$("#nature_id").change(function(){
			natid = $(this).val();
	        
	        $.ajax({
	            url: 'http://localhost:8181/regie-web/saisieaffairesupport.action',
	            type: 'post',
	            data: {SelectednatureCarte:natid},
	            success:function(response){
				
	            	//select du support
	            //var x = document.getElementById("support_id");
	            
	            var options="<option value='-1'>Select support Carte</option>";
	            var li="<li><span class='filtrable'>Select support Carte</span></li>";
	            var a =response.split(";");
	            for(var i= 0; i < a.length; i++)
	            {
	            	var b= a[i];
	            	var c = b.split("|");
	            	
	            	li+="<li><span class='filtrable'>"+c[1]+"</span></li>";
	            	options+="<option value='"+c[1]+"'>"+c[1]+"</option>";
	            	
	            }
	             
	            $('#support_id').siblings('input').attr("value", "Select support Carte");
	           // $('#support_id').siblings('ul').html(li);
	            
	            $("#support_id").html(options);
	            
	            }
	            });
	        
	        $.ajax({
	            url: 'http://localhost:8181/regie-web/saisieaffairecarte.action',
	            type: 'post',
	            data: {yourCategorieCarte:deptid,SelectednatureCarte:natid},
	            success:function(response){
				
	            	//select du support
	            //var x = document.getElementById("support_id");
	            
	            var options="<option value='-1'>Select Carte</option>";
	            var li="<li><span class='filtrable'>Select Carte</span></li>";
	            var a =response.split(";");
	            for(var i= 0; i < a.length; i++)
	            {
	            	var b= a[i];
	            	var c = b.split("|");
	            	
	            	li+="<li><span class='filtrable'>"+c[1]+"</span></li>";
	            	options+="<option value='"+c[1]+"'>"+c[1]+"</option>";
	            	
	            }
	             
	            $('#carte_id').siblings('input').attr("value", "Select support Carte");
	            $('#carte_id').siblings('ul').html(li);
	            $("#carte_id").html(options);


	            }
	            });
	        
	        
	         
	        
	    });
		
		$("#categorie_id").change(function(){
	         deptid = $(this).val();

	        $.ajax({
	            url: 'http://localhost:8181/regie-web/saisieaffairecarte.action',
	            type: 'post',
	            data: {yourCategorieCarte:deptid,SelectednatureCarte:natid},
	            success:function(response){
				
	            	//select du support
	            //var x = document.getElementById("support_id");
	            
	            var options="<option value='-1'>Select Carte</option>";
	            var li="<li><span class='filtrable'>Select Carte</span></li>";
	            var a =response.split(";");
	            for(var i= 0; i < a.length; i++)
	            {
	            	var b= a[i];
	            	var c = b.split("|");
	            	
	            	li+="<li><span class='filtrable'>"+c[1]+"</span></li>";
	            	options+="<option value='"+c[1]+"'>"+c[1]+"</option>";
	            	
	            }
	             
	            $('#carte_id').siblings('input').attr("value", "Select Carte");
	            $('#carte_id').siblings('ul').html(li);
	           //$('#carte_id').siblings('ul').find(":selected").attr("class", "active selected");
	            
	            $("#carte_id").html(options);
	            
	            
	            }
	            });
		});
		
		$("#carte_id").change(function(){
			carteid = $(this).val();
	        $.ajax({
	            url: 'http://localhost:8181/regie-web/saisieaffaireechelle.action',
	            type: 'post',
	            data: {yourCarteType:carteid},
	            success:function(response){
				
	            	//select du support
	            //var x = document.getElementById("support_id");
	            
	            var options="<option value='-1'>Select echell</option>";
	            var li="<li><span class='filtrable'>Select echelle</span></li>";
	            var a =response.split(";");
	            for(var i= 0; i < a.length; i++)
	            {
	            	var b= a[i];
	            	var c = b.split("|");
	            	
	            	li+="<li><span class='filtrable'>"+c[1]+"</span></li>";
	            	options+="<option value='"+c[1]+"'>"+c[1]+"</option>";
	            	
	            }
	             
	            $('#echelle_id').siblings('input').attr("value", "Select echelle Carte");
	            $('#echelle_id').siblings('ul').html(li);
	            
	            $("#echelle_id").html(options);
	            
	            }
	            });
	        
	        $.ajax({
	            url: 'http://localhost:8181/regie-web/saisieaffairePrixCarte.action',
	            type: 'post',
	           data:{yourCarteType:carteid},
	            success: function(response) {
	            	
	           var a =response.split("|");
	           var prix=a[2];	
	           
	           $("#prix").val(prix);
	          
	            },
            	error: function() { 
	                 alert("Error"); 
	                }  
	            });
		});
		
		var cmt=0;
		$("#ajouterPanier").click(function(){
			
			var removeIndex;
			cmt++;
			catgorieCarte = $('#categorie_id').val();
			SelectednatureCarte = $('#nature_id').val();
			yourCarteType = $('#carte_id').val();
			yourEchelleCarte = $('#echelle_id').val();
			yourSupportCarte = $('#support_id').val();
			reference = $('#ref_id').val();
			nombre = $('#nomre_id').val();
			description = $('#description_id').val();
			
			$.ajax({
	            url: 'http://localhost:8181/regie-web/saisieaffairePanier.action',
	            type: 'post',
	           data:{yourCategorieCarte:catgorieCarte,SelectednatureCarte:SelectednatureCarte,yourCarteType:yourCarteType,yourEchelleCarte:yourEchelleCarte,yourSupportCarte:yourSupportCarte
	        	   ,cmpt:cmt,'carteBean.refProduit':reference,'carteBean.nombre':nombre,'carteBean.description':description},
	            success: function(response) {
	            	
	            	 var a =response.split("|");
	            	 
						$("#panierTable").append("<tr>"+
								"<td>"+a[0]+"</td>"+
								"<td>"+a[1]+"</td>"+
								"<td>"+a[2]+"</td>"+
								"<td>"+a[3]+"</td>"+
								"<td>"+a[4]+"</td>"+
								"<td id='remove'>"+a[5]+"</td>"+
								"<td>"+a[6]+"</td>"+
								"<td>"+a[7]+"</td>"+
								"<td>"+a[8]+"</td>"+
								"<td><span class='table-remove' id='"+a[5]+"'><button type='button' class='btn btn-danger btn-rounded btn-sm my-0'>Remove</button></span></td></tr>");
								
						$('#mht').val(a[9]);
						//z = document.getElementById("mht");
						//z.value= a[9];
						$('.table-remove').click(function () {
							
							removeIndex=$(this).attr('id');
							$(this).parents('tr').detach();
							  
							  $.ajax({
						            url: 'http://localhost:8181/regie-web/saisieaffaireremoveAchat.action',
						            type: 'post',
						            data:{cmpt:removeIndex},
						            success: function(response) {
						            	var a = response;
						            	$('#mht').val(a);
						            	
						            }
							  });
							 
							  });
					
		        }       	
	        	   
			});
			//$("#mht").val($('#mht').val() + $('#total').val());
		    });
		
	});
	
	$('#creation_id').click(function () {

		  annee = $("#annee").val();
		  cin = $("#cin").val();
		  date = $("#date").val();
		  nom =  $("#nom").val();	
		  adresse = $("#adresse").val();
		  remis = $("#checkbox1").is(':checked');
		  //'yyyy-mm-dd'
		//dateParse = parseDate("yyyy-mm-dd", date); 
		  $.ajax({
	            url: 'http://localhost:8181/regie-web/saisieaffairePrixCarteSave.action',
	            type: 'post',
	           data:{'demandeBean.annee':annee,'demandeBean.date':date,'demandeBean.cin':cin,
	           	'demandeBean.nom':nom,'demandeBean.adresse':adresse,'demandeBean.is_remise':remis}
	            
		  });
	});
		 
	</script>
	
	<script>
			function myFunction() {
				var x = document.getElementById("nomre_id");
				var y = document.getElementById("prix");
				var z = document.getElementById("total");
				
			   //  $('#total').val($('#prix').val() * $('#nomre_id').val());
			   
			   z.value = x.value * y.value;
			}
	</script>


</body>
</html>