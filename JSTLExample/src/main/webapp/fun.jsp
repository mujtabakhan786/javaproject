<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="b"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="name" value="Mujtaba khan"></c:set>
	<h1>
		<c:out value="${name}"></c:out>
	</h1>
	<h1>
		Length of name is
		<c:out value="${b:length(name)}"></c:out>
	</h1>
	<h1>
		<c:out value="${b:toLowerCase(name)}"></c:out>
	</h1>
	<h1>
		<c:out value="${b:toUpperCase(name)}"></c:out>
	</h1>
	<h1>
		<c:out value="${b:contains(name,'khan')}"></c:out>
	</h1>
</body>
</html>