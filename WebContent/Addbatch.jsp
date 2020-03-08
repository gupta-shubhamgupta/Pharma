<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Medicine Detail</title>
<link rel="stylesheet" href="Medicine.css">
</head>
<script type="text/javascript">
        function preventBack() { window.history.forward(); }
        setTimeout("preventBack()", 0);
        window.onunload = function () { null };
    </script> 
<body id="addbatchbody">


<a href="Userhome.jsp">Go to Home Page</a>

<center>
<h1>Add Details</h1>
<p align="right"><a href="Userlogin.jsp">Log Out</a></p>
<h3 align="center"><font color="blue">${errorMsg}</font></h3>
<form action="AddMedicinecontroller" method="Post">
<table  cellpadding="10" cellspacing="10" >
<tr><td id="loguname">Batch_Code :&nbsp;&nbsp;<input type="text" name="Bid" required>
<tr><td id="loguname">Medicine_Code :&nbsp;&nbsp;
<select name="Mcode" >
<option value="Null" >Select</option>
<option value="B-01">Batch-01</option>
<option value="B-02">Batch-02</option>
<option value="B-03">Batch-03</option>
<option value="B-04">Batch-04</option>
</select></td></tr>
<tr><td id="loguname">Weight :&nbsp;&nbsp;<input type="text" name="weight" pattern="[0-9]{1,}" required></td></tr>
<tr><td id="loguname">Price :&nbsp;&nbsp;<input type="text" name="price" pattern="[0-9]{1,}" required></td></tr>
<tr><td id="loguname">Medicine Type :&nbsp;&nbsp;
<select name="Mtype" >
<option value="Null" >Select</option>
<option value="tab">Tablet</option>
<option value="med">Capsule</option>
<option value="syr">Syrup</option>
</select></td></tr>
<tr><td id="loguname">Refrigeration :&nbsp;&nbsp;<input type="radio" value="Yes" name="uu" required>Yes&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" value="No" name="uu" required>No</td></tr>
<tr><td><input type="submit" value="Add" id="logbutin" >&nbsp;&nbsp;<input type="reset" value="Reset"  id="logresin" ></td></tr>
</table>
</center>

</body>
</html>
