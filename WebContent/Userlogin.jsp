<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User login::</title>
<link rel="stylesheet" href="Medicine.css">
</head>
<body id="uer">
<a href="Mainpage.jsp">Go to Main Page</a>
<center><h1>LOGIN</h1></center>
<form action="Logincontroller" method="post">
<h3 align="center"><font color="blue">${psMsg}</font></h3>
<h3 align="center"><font color="blue">${uMsg}</font></h3>
<h3 align="center"><font color="blue">${errorMsg}</font></h3>
<table  cellpadding="10" cellspacing="10" align="center">
<tr><td id=loguname>Username :&nbsp;&nbsp;<input type ="text" name="User_id" required></td></tr>

<tr><td id="p1">Password :&nbsp;&nbsp;<input type ="password" name="Pass_id" required></td></tr>
<tr><td><input type="submit" value="Login" id="logbutin" ></td>
<td><input type="reset" value="Rest" id="logresin" ></td></tr>
</table>
<center>

<br>
<br>
<br>

<a href="Userregister.jsp">Click to Register!</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="Forgetpassword.jsp">Forget Password</a>
</center>
</form>

</body>
</html>
