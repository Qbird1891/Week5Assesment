<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete an Entry in Computer Database</title>
</head>
<body>
   <form action="deleteComputer" method="post">
      Enter the name/make of the computer to delete:  <input type="text" name="make" size ="25">
                                                  <input type="submit" value="delete" />
   </form>
   <br />
	<a href="index.jsp">Home</a>
</body>
</html>