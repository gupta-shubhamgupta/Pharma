<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Required Details</title>
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
<h1>Your searched result </h1>
<p align="right"><a href="Userlogin.jsp">Log Out</a></p>
<form action="Updatemedicinecontroller" method="Post">
<h3 align="center"><font color="blue">${msg}</font></h3>
<h3 align="center"><font color="blue">${errorMsg}</font></h3>
<table  cellpadding="10" cellspacing="10" >
<tr><td id="loguname">Batch_Code :&nbsp;&nbsp;<input type="text" name="Bcode" value=${sussMsg.batchcode}  readonly="readonly" ></td></tr>
<tr><td id="loguname">Medicine_Code :&nbsp;&nbsp;<input type="text" name="medicinecode" value=${sussMsg.medicinecode} required></td></tr>
<tr><td id="loguname">Weight :&nbsp;&nbsp;<input type="text" name="weight" value=${sussMsg.weight} pattern="[0-9]{1,}" required></td></tr>
<tr><td id="loguname">Price :&nbsp;&nbsp;<input type="text" name="price" value=${sussMsg.price} pattern="[0-9]{1,}" required></td></tr>
<tr><td id="loguname">Medicine_Type :&nbsp;&nbsp;<input type="text"  name="mtype" value=${sussMsg.medicinetype} required></td></tr>
<tr><td id="loguname">Refrigeration :&nbsp;&nbsp;<input type="text" name="ref" value=${sussMsg.refrigeration} required></td></tr>
<tr><td align="center"><input type="submit" value="Update" id="logbutin" ></td></tr>
</table>
</form>
<form>
<script>
function myFunction() {
  window.print();
}
</script> 
<table cellpadding="30"  cellpacing"=10" align="center">
<tr><td  ><button onclick="myFunction()"  id="logbutin">Print this page</button></td><td>
</center>
</body>
</html>
