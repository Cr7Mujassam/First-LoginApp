<html>
<head>
<title>Welcome to Login App</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>

<body class="bg-primary">

<center><p style="color:Red">${Invalid}</p></center>


<form method="post">
<div class="container"><center><h1>Welcome</h1>
Enter Name:<input type="text" placeholder="Enter Your Name" class="text-primary" name="name">
<br><br>
Enter Pass:<input type="password" placeholder="Enter Your Password" class="text-danger" name="pass">
<br><br>
Confirm Pass:<input type="password" placeholder="Enter Your Password" class="text-danger" name="pass1">
<br><br>
<input type="submit" class="btn btn-success">
</center>
</div>
</form>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>