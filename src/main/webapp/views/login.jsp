<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Bootstrap Simple Login Form</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<style>
.login-form {
	width: 340px;
	margin: 50px auto;
	font-size: 15px;
}

.login-form form {
	margin-bottom: 15px;
	background: #f7f7f7;
	box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
	padding: 30px;
}

.login-form h2 {
	margin: 0 0 15px;
}

.form-control, .btn {
	min-height: 38px;
	border-radius: 2px;
}

.btn {
	font-size: 15px;
	font-weight: bold;
}

.error {
	color: red
}
</style>
</head>

<body>
	<div class="login-form" style="width: 400px">
		<form:form
			action="${pageContext.request.contextPath}/j_spring_security_check"
			method="post" modelAttribute="user">
			<h2 class="text-center">Log in</h2>
			<label style="color: red">${message}</label>
			<!-- JSP Expression -->
			<div class="form-group">
				<form:input type="text" path="username" class="form-control"
					placeholder="Username" />
				<form:errors path="username" cssClass="error" />
			</div>
			<div class="form-group">
				<form:input type="password" path="password"
					class="form-control" placeholder="Password" />
				<form:errors path="password" cssClass="error" />
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-primary btn-block">Login</button>
			</div>
			<div class="clearfix">
				<label class="float-left form-check-label"> <input
					type="checkbox"> Remember me
				</label> <a href="#" class="float-right">Forgot Password?</a>
			</div>

		</form:form>
		<p class="text-center">
			<a href="#">Create an Account</a> <a
				href="${pageContext.request.contextPath}/info">Test info</a>
		</p>
	</div>
</body>

</html>