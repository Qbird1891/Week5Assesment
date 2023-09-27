<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update a computer in the database:</title>
</head>
<body>

<form action="updateComputer" method="post">
      New Make: <input type="text" name="make" size="25">
      New Model: <input type="text" name="make" size="25">
      New Size: <input type="text" name="size" size="25">
     Enter the make of the computer to be updated: <input type="text" name="oldMake"
			size="25"> <input type="submit" value="Update" /> 

</form>
<br />
	<a href="index.jsp">Home</a>
</body>
</html>