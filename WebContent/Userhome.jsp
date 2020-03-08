<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Home::</title>
<link rel="stylesheet" href="Medicine.css">
</head>
<script type="text/javascript">
        function preventBack() { window.history.forward(); }
        setTimeout("preventBack()", 0);
        window.onunload = function () { null };
    </script> 
<body id="home">

<p align="right"><a href="Userlogin.jsp"><img src="logout.gif" width="100px"  height="80px">
<br><a href="About.jsp"><img src="aboutus.php" width="100px"  height="80px"></a> </a></p>
<center><h1>Home</h1>
<h3 align="center"><font color="blue">${aMsg}</font> </h3>
<h3 align="center"><font color="blue">${sMsg}</font> </h3>
<h3 align="center"><font color="blue">${msg}</font></h3>
<a href="Addbatch.jsp">Click to Add Batch</a>
<br>
<img src="add.gif" width="100px"  height="100px">
<br>
<br>
<a href="Search.jsp">Click to Search Existing Batch</a>
<br>
<img src="search.gif" width="100px"  height="100px">
<br>
<br>
<a href="Delete.jsp">Click to Delete</a>
<br>
<img src="delete.gif" width="100px"  height="100px">
<br>

</center>
</body>
</html>
