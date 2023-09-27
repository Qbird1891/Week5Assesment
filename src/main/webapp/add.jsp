<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Computer Database</title>
</head>
<body>
<form action="addComputer" method="post">
		Make: <input type="text" name="make" size="25"/> 
		
		Model: <input type="text" name="model" size="25"/> 
		
		Size: <input type="text" name="size" size="25"> 
		<input type="submit"value="Submit" />
	</form>
	<br />
	<a href="index.jsp">Home</a>
</body>
</html>