<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Registration</title>
<link rel="stylesheet" href="Medicine.css">
</head>
<body id="register">
<a href="Adminlogin.jsp">Go to Adminlogin Page</a>
<center>
<h1>Admin Registration</h1>
<h3 align="center"><font color="blue">${adrrorMsg}</font></h3>
<form action="Adminregistration" method="Post">
<table  cellpadding="10" cellspacing="10" >
<tr><td id="loguname">User_id :&nbsp;&nbsp;<input type="text" name="Aid" required></td></tr>
<tr><td id="loguname">Password :&nbsp;&nbsp;<input type="password" name="pord" required></td></tr>
<tr><td id="loguname">D.O.B :&nbsp;&nbsp;<input type="text" name="adob" pattern="[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{4}" required>dd-mm-yyyy </td></tr>
<tr><td><input type="submit" value="Submit"  id="logbutin" ></td><td>&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="Reset" id="logresin" ></td></tr>
</table>
</form>
</body>
</html>