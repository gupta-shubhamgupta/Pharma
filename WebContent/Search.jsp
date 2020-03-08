<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Medicine::</title>
<link rel="stylesheet" href="Medicine.css">

</head>
<script type="text/javascript">
        function preventBack() { window.history.forward(); }
        setTimeout("preventBack()", 0);
        window.onunload = function () { null };
    </script> 
<body>
<a href="Userhome.jsp">Go to Home Page</a>
<center>
<h1>Enter the Batch code </h1>
<p align="right"><a href="Userlogin.jsp">Log Out</a></p>
<h3 align="center"><font color="blue">${errorMsg}</font> </h3>
<form action="Display" method="Post">
<table  cellpadding="10" cellspacing="10" >
<tr><td id="loguname">Batch_Code :&nbsp;&nbsp;<input type="text" name="Bcode" required></td></tr>
<tr><td ><input type="submit" value="Search" id="logbutin">&nbsp;&nbsp;<input type="reset" value="Reset"  id="logresin" ></td></tr>
</center>
</body>
</html>
