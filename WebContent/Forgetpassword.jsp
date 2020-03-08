<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reset Password::</title>
<link rel="stylesheet" href="Medicine.css">
</head>
<body id="ufog">
<center><h1>Reset password</h1>
<form action="Forgetpassword" method="post">
<h3 align="center"><font color="blue">${rorMsg}</font></h3>
<table  cellpadding="10" cellspacing="10" align="center">
<tr><td id=loguname>Username :&nbsp;&nbsp;<input type ="text" name="User_id" required></td></tr>
<tr><td id=loguname>D.O.B :&nbsp;&nbsp;<input type ="text" name="dob" pattern="[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{4}" required>dd-mm-yyyy </td></tr>
<tr><td id=loguname>New Password :&nbsp;&nbsp;<input type ="text" name="pass" required></td></tr>
<tr><td><input type="submit" value="Submit" id="logbutin" ></td>
<td><input type="reset" value="Rest" id="logresin" ></td></tr>
</table>


</center>

</body>
</html>