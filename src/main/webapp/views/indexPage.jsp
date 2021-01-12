<!DOCTYPE html>
<html lang="en">

<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
	integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ"
	crossorigin="anonymous" />
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Index Page</title>
</head>

<body>
	<nav class="navbar navbar-light">
		<a href="#" class="navbar-brand">Partout</a> <a href="#"
			class="mr-sm-5">Admin</a>

	</nav>
	<div class="container-fluid h-100" style="background-color: #f0f0f0;">
		<div class="row h-100">
			<div class="col-md-2 col" style="margin-top: 10px;">
				<div class="card">
					<ul class="list-group list-group-flush">
						<li class="list-group-item" style="border: 0 none;">Basic
							Information</li>
						<li class="list-group-item" style="border: 0 none;">Import</li>
						<li class="list-group-item" style="border: 0 none;"><a
							href="${pageContext.request.contextPath}/view">User
								management</a></li>
						<li class="list-group-item" style="border: 0 none;">Department
							management</li>
						<li class="list-group-item" style="border: 0 none;">Position
							management</li>
						<li class="list-group-item" style="border: 0 none;">Equipment
							management</li>
						<li class="list-group-item" style="border: 0 none;">Application
							management</li>
						<li class="list-group-item" style="border: 0 none;">Workflow
							management</li>
						<li class="list-group-item" style="border: 0 none;">Time card
							management</li>
						<li class="list-group-item" style="border: 0 none;">Access
							rights management</li>
						<li class="list-group-item" style="border: 0 none;">Event Log
							Management</li>
					</ul>
				</div>
			</div>
			<div class="col-md-10" style="margin-top: 10px;">
				<div class="card">
					<div class="card-header">Basic Information</div>
					<div class="card-body">

						<div>
							<button type="button" class="btn btn-light float-right">
								<i class="fas fa-cog"></i> Configuration
							</button>
						</div>

						<div class="h5" style="margin-top: 50px;">Acces form the
							house</div>
						<hr />

						<div>
							<p>it is the address to acces from the house to the "Aipo".
								The house of the user, please contact us to this address</p>
						</div>
						<hr />

						<div>
							<div class="h5" style="display: inline;">Aipo site
								(in-house)</div>
							<div style="display: inline;">Http://1.57.209.80/</div>
						</div>
						<hr />

						<div
							style="display: flex; justify-content: center; align-items: center;">
							<button class="btn btn-light">Edit</button>
						</div>
						<hr />

						<div class="h5">Acces form outside the company</div>
						<hr />

						<div>
							<p>The address for accessing the "Aipo" from out side the
								company. The user of the outside, please contact us to this
								address.</p>
						</div>
						<hr />

						<div>
							<div class="h5" style="display: inline;">Aipo site
								(Outside)</div>
							<div style="display: inline;"></div>
						</div>
						<hr />

						<div
							style="display: flex; justify-content: center; align-items: center;">
							<button class="btn btn-light">Edit</button>
						</div>
						<hr />
					</div>
				</div>
			</div>
		</div>
	</div>
	<footer style="background-color: #f0f0f0;">
		<div class="footer-coppyright py-3 text-right">
			Mobileworld ©, Inc <a href="#">Partout</a> 8.1.1.0
		</div>
	</footer>

</body>

</html>