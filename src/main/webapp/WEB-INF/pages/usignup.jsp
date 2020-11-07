<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>SignUp</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<header style="height: 30px; background-color: #e91e63;"> </header>

	<div class="container">
		<h2>SignUp Container</h2>
		<img src="img/student.png" style="height: 180px;"> <img
			src="img/images.jpg" style="height: 180px;"> <br /> <b>${message}</b>
		<hr />

		<form action="signup" method="post">
			<div class="form-group">
				<label>Username</label> <input type="text" name="username"
					class="form-control" style="width: 70%;">
			</div>

			<div class="form-group">
				<label>Password</label> <input type="password" name="password"
					class="form-control" style="width: 70%;">
			</div>
			
			
			<div class="form-group">
				<label>Email</label> <input type="email" name="email"
					class="form-control" style="width: 70%;">
			</div>
			
			<div class="form-group">
				<label>Gender</label> 
				<select  name="gender" class="form-control" style="width: 70%;">
				   <option>Male</option>
				   <option>Female</option>
				</select>
			</div>
			
			<div class="form-group">
				<label>Role</label> 
				<select  name="role" class="form-control" style="width: 70%;">
				   <option>Admin</option>
				   <option>Customer</option>
				   <option>Employee</option>
				</select>
			</div>
			
			
				<div class="form-group">
				<label>Profile Pic</label> <input type="text" name="photo"
					class="form-control" style="width: 70%;">
			</div>
			
			<div class="form-group">
				<br />
				<button type="submit" class="btn btn-primary">Sign Up</button>
				<button class="btn btn-primary">
					<span class="spinner-border spinner-border-sm"></span>
				</button>
				<a href="auth">
					<button type="button" class="btn btn-warning">Sign In</button>
				</a>

			</div>
		</form>

	</div>

</body>
</html>