<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Computer database</title>
</head>
<body>
	List of all Computers make/model/year:
	<table>
		<c:forEach items="${requestScope.allComputers}" var="currentcomputer">
			<tr>
				<td>${currentcomputer.make}|</td>
				<td>${currentcomputer.model}|</td>
				<td>${currentcomputer.size}</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="index.jsp">Home</a>
</body>
</html>