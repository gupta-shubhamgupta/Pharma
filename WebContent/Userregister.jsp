<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration Page</title>
<link rel="stylesheet" href="Medicine.css">
</head>
<body id="ureg">
<a href="Userlogin.jsp">Go to Userlogin Page</a>
<center>
<h1>Registration</h1>
<h3 align="center"><font color="blue">${errorMsg}</font></h3>
<form action="Registrationcontroller" method="Post">
<table  cellpadding="10" cellspacing="10" >
<tr><td id="loguname">User_id :&nbsp;&nbsp;<input type="text" name="Uid" required></td></tr>
<tr><td id="loguname">D.O.B :&nbsp;&nbsp;<input type="text" name="dob" pattern="[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{4}" required >dd-mm-yyyy</td></tr>
<tr><td id="loguname">Gender :&nbsp;&nbsp;<input type="radio" value="Male" name="gen" required>Male<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" value="Female" name="gen" required>Female</td></tr>
<tr><td id="loguname">Mobile :&nbsp;&nbsp;<input type="text" name="Mnumber" pattern="[0-9]{10}" required>Enter 10 deigit</td></tr>
<tr><td id="loguname">Email :&nbsp;&nbsp;<input type="email" name="email" required></td></tr>
<tr><td id="loguname">Password :&nbsp;&nbsp;<input type="password" name="pword" required></td></tr>
<tr><td><input type="submit" value="Submit"  id="logbutin" ></td><td>&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="Reset" id="logresin" ></td></tr>
</table>
</form>
</center>
</body>
</html>
