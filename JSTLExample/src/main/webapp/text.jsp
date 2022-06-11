<%@ taglib prefix="v" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><v:out value="${i}"></v:out></h1>


<v:forEach var="j" begin="1" end="10">
<h1>Value of j is <v:out value="${j}"></v:out></h1>
</v:forEach>

</body>
</html>