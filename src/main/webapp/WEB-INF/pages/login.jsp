<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Auth</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
  <header style="height: 30px;background-color: #e91e63;">
  
  </header>
  
  <div class="container">
  	 <h2>Auth Container</h2>
  	 <img src="img/student.png" style="height:180px;">
  	  <img src="img/images.jpg" style="height:180px;">
  	  
  	  <br/>
  	  <b>${message}</b>
  	 <hr/>
  	 
  	 <form action="auth" method="post">
  	 	 <div class="form-group">
  	 	 	<label>Username</label>
  	 	 	<input type="text" name="username" class="form-control" style="width: 70%;">
  	 	 </div>
  	 	 
  	 	 	 <div class="form-group">
  	 	 	<label>Password</label>
  	 	 	<input type="password" name="password" class="form-control" style="width: 70%;">
  	 	 </div>
  	 	 	 <div class="form-group">
  	 	 	<br/>
  	 	 	<button type="submit" class="btn btn-primary">Auth User</button>
  	 	 	<button class="btn btn-primary">
  <span class="spinner-border spinner-border-sm"></span>
</button>
<a href="signup">
<button type="button" class="btn btn-warning">Sign Up</button>
</a>

<a href="psignups">
	<button type="button" class="btn btn-danger">All Records</button>
</a>

  	 	 </div>
  	 </form>
  	 
  	 <hr/>
  	  <p>Summary!:</p>            
  <table class="table table-dark table-hover">
    <thead>
      <tr>
        <th>Username</th>
        <th>Password</th>
        <th>Email</th>
        <th>Gender</th>
        <th>Role</th>
        <th>Photo</th>
        <th>Doe</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${signUp.username}</td>
        <td>${signUp.password}</td>
        <td>${signUp.email}</td>
       <td>${signUp.gender}</td>
       <td>${signUp.role}</td>
       <td>
          <img src="${signUp.photo}" style="height: 160px;"> 
       
       </td>
       <td>${signUp.doe}</td>
      </tr>
    </tbody>
  </table>
  	 
  
  </div>
 
</body>
</html>