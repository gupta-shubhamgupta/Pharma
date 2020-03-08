<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin forget password</title>
<link rel="stylesheet" href="Medicine.css">
</head>
<script type="text/javascript">
        function preventBack() { window.history.forward(); }
        setTimeout("preventBack()", 0);
        window.onunload = function () { null };
    </script> 
<body id="apas">
<center><h1>Reset password</h1>
<form action="Adminforgetcontroller" method="post">
<h3 align="center"><font color="blue">${fferrorMsg}</font></h3>
<h3 align="center"><font color="blue">${eyuMsg}</font></h3>
<table  cellpadding="10" cellspacing="10" align="center">
<tr><td id=loguname>Username :&nbsp;&nbsp;<input type ="text" name="fUser_id"  required ></td></tr>
<tr><td id=loguname>D.O.B :&nbsp;&nbsp;<input type ="text" name="fdob" pattern="[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{4}"  required>dd-mm-yyyy</td></tr>
<tr><td id=loguname>New Password :&nbsp;&nbsp;<input type ="text" name="fpass"  required></td></tr>
</table>


<tr><td><input type="submit" value="Submit" id="logbutin" ></td>
<td><input type="reset" value="Rest" id="logresin" ></td></tr>

</center>
</body>
</html>