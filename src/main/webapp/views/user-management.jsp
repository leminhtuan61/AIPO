<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
	integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ"
	crossorigin="anonymous" />

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/user-management.css">

<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>User Page</title>

</head>

<body>
	<nav class="navbar navbar-light">
		<a href="#" class="navbar-brand">Partout</a> <a href="#"
			class="mr-sm-5">Admin</a>
	</nav>
	<div class="container-fluid h-100" style="background-color: #f0f0f0">
		<div class="row h-100">
			<div class="col-md-2 col" style="margin-top: 10px">
				<div class="card">
					<ul class="list-group list-group-flush">
						<li class="list-group-item" style="border: 0 none"><a
							href="${pageContext.request.contextPath}/index">Basic
								Information</a></li>
						<li class="list-group-item" style="border: 0 none">Import</li>
						<li class="list-group-item" style="border: 0 none">User
							management</li>
						<li class="list-group-item" style="border: 0 none">
							Department management</li>
						<li class="list-group-item" style="border: 0 none">Position
							management</li>
						<li class="list-group-item" style="border: 0 none">Equipment
							management</li>
						<li class="list-group-item" style="border: 0 none">
							Application management</li>
						<li class="list-group-item" style="border: 0 none">Workflow
							management</li>
						<li class="list-group-item" style="border: 0 none">Time card
							management</li>
						<li class="list-group-item" style="border: 0 none">Access
							rights management</li>
						<li class="list-group-item" style="border: 0 none">Event Log
							Management</li>
					</ul>
				</div>
			</div>
			<div class="col-md-10" style="margin-top: 10px">
				<div class="card">
					<div class="card-header">User management</div>
					<div class="card-body">
						<label style="color: green">${msg}</label> <label
							style="color: red">${msgErr}</label>
						<div>
							<button type="button" class="btn btn-warning"
								style="margin-bottom: 15px;" id="myBtn">To add a user</button>
						</div>

						<!-- The Modal -->
						<div id="myModal" class="modal">

							<!-- Modal content -->
							<div class="modal-content">
								<span class="close"
									style="position: absolute; right: 0; top: 0;">&times;</span>
								<div class="card">
									<div class="card-header">Add User</div>
									<div class="card-body">
										<div class="row">
											<div class="col-4">
												<label for="loginName">login name</label>
											</div>
											<div class="col-8">
												<input type="text" name="loginName" id="">
											</div>
										</div>

										<div class="row">
											<div class="col-4">
												<label for="password">Password</label>
											</div>
											<div class="col-8">
												<input type="password" name="password" id="">
											</div>
										</div>

										<div class="row">
											<div class="col-4">
												<label for="re-password">Password (for confirmation)</label>
											</div>
											<div class="col-8">
												<input type="password" name="re-password" id="">
											</div>
										</div>

										<div class="row">
											<div class="col-4">
												<label for="name">name</label>
											</div>
											<div class="col-8">
												<input type="text" name="firstName" id=""><input
													type="text" name="lastName" id="">
											</div>
										</div>

										<div class="row">
											<div class="col-4">
												<label for="nameFurigana">name: (Furigana)</label>
											</div>
											<div class="col-8">
												<input type="text" name="firstNameFurigana" id=""><input
													type="text" name="lastNameFurigana" id="">
											</div>
										</div>

										<div class="row">
											<div class="col-4">
												<label for="mailAddress">mail address</label>
											</div>
											<div class="col-8">
												<input type="email" name="email" id="">
											</div>
										</div>

										<div class="row">
											<div class="col-4">
												<label for="telephoneNumberOutSide">telephone number
													(outside line)</label>
											</div>
											<div class="col-8">
												<input type="number" name="phoneOutSide" id="">-<input
													type="number" name="phoneOutSide" id="">-<input
													type="number" name="phoneOutSide" id="">
											</div>
										</div>

										<div class="row">
											<div class="col-4">
												<label for="telephoneNumberExtension">telephone
													number (extension)</label>
											</div>
											<div class="col-8">
												<input type="number" name="phoneExtension" id="">
											</div>
										</div>

										<div class="row">
											<div class="col-4">
												<label for="telephoneNumberOutSide">telephone number
													(mobile)</label>
											</div>
											<div class="col-8">
												<input type="number" name="phoneMobile" id="">-<input
													type="number" name="phoneMobile" id="">-<input
													type="number" name="phoneMobile" id="">
											</div>
										</div>

										<div class="row">
											<div class="col-4">
												<label for="mobileEmail">Mobile e-mail address</label>
											</div>
											<div class="col-8">
												<input type="email" name="mobileEmail" id="">
											</div>
										</div>

										<div class="row">
											<div class="col-4">
												<label for="mugShot">Mug shot</label>
											</div>
											<div class="col-8">
												<input type="file" size="60" />
											</div>
										</div>

										<div class="row">
											<div class="col-4">
												<label for="Department">Department</label>
											</div>
											<div class="col-8">


												<div class="row"
													style="width: 400px; border-left: 1px solid #aaaaaa; border-right: 1px solid #aaaaaa; background-color: #f0f0f0;">
													<div class="col">Department</div>
													<div class="col">Department List</div>
													<div class="w-100"></div>
													<div class="col">
														<select name="Cars" size="5" multiple="multiple"
															style="width: 150px; height: 150px;" id="list1">

														</select>
													</div>
													<div class="col">
														<select name="Cars" size="5" multiple="multiple"
															style="width: 150px; height: 150px;" id="list2">
															<option value="Merceders">Merceders</option>
															<option value="BMW">BMW</option>
															<option value="Jaguar">Jaguar</option>
															<option value="Lamborghini">Lamborghini</option>
															<option value="Ferrari">Ferrari</option>
															<option value="Ford">Ford</option>

														</select>
													</div>
													<div class="w-100"></div>
													<div class="col">
														<input type="button" value="Delete" id="delete1">
													</div>
													<div class="col">
														<input type="button" value="Add" id="add">
													</div>
												</div>

											</div>

										</div>

										<div class="row">
											<div class="col-4">
												<label for="mugShot">Position</label>
											</div>
											<div class="col-8" id="newHere">
												<div class="input-group">
													<select class="custom-select" id="inputGroupSelect01">
														<option selected>Choose...</option>
														<option value="1">One</option>
														<option value="2">Two</option>
														<option value="3">Three</option>
													</select>
												</div>
												<button type="button" id="newInput">The new input</button>
											</div>
										</div>


										<div class="row">
											<div class="col-4">
												<label for="mugShot">Administrative privileges</label>
											</div>
											<div class="col-8">
												<input type="checkbox" id="admin" name="admin" /> <label
													for="admin">To administrator</label>
											</div>
										</div>

										<div class="row"
											style="display: flex; justify-content: center;">
											<input type="submit" value="Add" class="btn btn-warning">
											<button type="button" class="btn btn-default" id="myBtn2">Close</button>
										</div>

									</div>
								</div>
							</div>

						</div>


						<div>
							<form class="form-inline" style="margin-bottom: 15px;">
								<input class="form-control mr-sm-2" type="search"
									placeholder="Search" aria-label="Search" name="valueSearch" />
								<select id="countries" name="valueAttribute"
									class="form-control">
									<option value=loginName>User Name</option>
									<option value="firstName">First Name</option>
									<option value="lastName">Last Name</option>
								</select>

								<button class="btn btn-outline-success my-2 my-sm-0"
									type="submit">Search</button>

							</form>
						</div>

						<div style="margin-bottom: 15px;">
							<button type="button"
								contextPath="${pageContext.request.contextPath}"
								class="btn btn-light " id="deleteSelected">Remove</button>
							<button type="button" class="btn btn-light "
								contextPath="${pageContext.request.contextPath}"
								id="updateEnableSelected">to enable</button>
							<button type="button" class="btn btn-light "
								contextPath="${pageContext.request.contextPath}"
								id="updateDisableSelected">to disable</button>
							<button type="button" class="btn btn-light"
								contextPath="${pageContext.request.contextPath}"
								id="toChangeTheOrder">to change the order of the user</button>

							<p class="float-right">1- 7/7</p>
						</div>

						<div class="table" style="margin-bottom: 15px;">
							<table style="width: 100%;">
								<thead class="thead-light">
									<tr>
										<th><input type="checkbox" name="" id="checkAll"></th>
										<th>State</th>
										<th>username</th>
										<th>name</th>
										<th>Department name</th>
										<th>Title</th>
									</tr>
								</thead>
								<tbody class="userBody">
									<c:forEach items="${list}" var="user">
										<tr style="border-bottom: 1pt solid black">
											<td><input type="checkbox" value="${user.userId}"
												id="checkItem"></td>
											<td>${user.disabled}</td>
											<td>${user.loginName}</td>
											<td>${user.firstName}${user.lastName}</td>

											<td><c:forEach
													items="${user.getEipMCompany().getEipMPosts()}"
													var="postName">
													<span>${postName.postName },</span>
												</c:forEach></td>
											<td>${user.confirmValue}</td>

										</tr>
									</c:forEach>

									<c:if test="${data.size() > 0 }">
										<div class="panel-footer">
											Showing ${number+1} of ${size-1} of ${totalElements} elements
											<ul class="pagination">
												<c:forEach begin="0" end="${totalPages-1}" var="page">
													<li class="page-item"><a
														href="view?pageNumber=${page}" class="page-link">${page+1}</a>
													</li>
												</c:forEach>
											</ul>
										</div>
									</c:if>
								</tbody>
							</table>

						</div>

						<div>
							<button type="button" class="btn btn-light "
								contextPath="${pageContext.request.contextPath}"
								id="deleteSelected1">Remove</button>
							<button type="button" class="btn btn-light "
								contextPath="${pageContext.request.contextPath}"
								id="updateEnableSelected1">to enable</button>
							<button type="button" class="btn btn-light "
								contextPath="${pageContext.request.contextPath}"
								id="updateDisableSelected1">to disable</button>

							<p class="float-right">1- 7/7</p>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
	<footer style="background-color: #f0f0f0">
		<div class="footer-coppyright py-3 text-right">
			Mobileworld ©, Inc <a href="#">Partout</a> 8.1.1.0
		</div>
	</footer>


	<script
		src="${pageContext.request.contextPath}/resources/js/user-management.js"></script>



	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>
