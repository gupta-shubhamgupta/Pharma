<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Padge</title>
<link rel="stylesheet" href="Medicine.css">
</head>
<script type="text/javascript">
        function preventBack() { window.history.forward(); }
        setTimeout("preventBack()", 0);
        window.onunload = function () { null };
    </script> 
<body>
<p align="right"><a href="Adminlogin.jsp">Log Out</a></p>
<h3 align="center"><font color="blue">${asssMsg}</font></h3>
<h3 align="center"><font color="blue">${errMsg}</font></h3>
<form action="Adminuserdelete" method="Post">
<center><h1>Enter user id to delete</h1>
<tr><td id="loguname">User_id :&nbsp;&nbsp;<input type="text" name="aaUid" ></td></tr>

<tr><td><input type="submit" value="Submit"  id="logbutin" ></td><td>&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="Reset" id="logresin" ></td></tr>


</center>
</body>
</html>