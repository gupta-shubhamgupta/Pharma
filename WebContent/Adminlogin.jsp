<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login Page</title>
<link rel="stylesheet" href="Medicine.css">

</head>
<body id="admin">
<a href="Mainpage.jsp">Go to Main Page</a>
<center>
<h1>Admin Login</h1></center>
<h3 align="center"><font color="blue">${ffpsMsg}</font></h3>
<h3 align="center"><font color="blue">${uadMsg}</font></h3>
<h3 align="center"><font color="blue">${uaasMsg}</font></h3>
<form action="Adminlogincontroller" method="post">
<table  cellpadding="10" cellspacing="10" align="center">
<tr><td id=loguname>Admin User ID :&nbsp;&nbsp;<input type ="text" name="Add_id" required></td></tr>
<tr><td id="p1">Password :&nbsp;&nbsp;<input type ="password" name="Pas_id" required></td></tr>
<tr><td><input type="submit" value="Login" id="logbutin" ></td>
<td><input type="reset" value="Rest" id="logresin" ></td></tr>
</table>
<center>


<br>
<br>
<br>

<a href="Adminregister.jsp">Click to Register!</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="Adminforget.jsp">Forget Password</a>
</center>
</form>
</body>
</html>
