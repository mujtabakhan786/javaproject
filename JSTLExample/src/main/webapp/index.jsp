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
<h1>This is JSTL Example</h1>
<v:set var="i" value="12" scope="application"></v:set>
<h1><v:out value="${i}"></v:out></h1>
-
<v:choose>
<v:when test="${i>0}">
<h1>this is my case first</h1>
<h1>number is positive</h1>
</v:when>
<v:when test="i<0">
<h1>this is my second case</h1>
<h1>number is negative</h1>
</v:when>
<v:otherwise>
<h1>Default case</h1>
</v:otherwise>
</v:choose>
<hr>

<v:forEach var="j" begin="1" end="10">
<h1>Value of j is <v:out value="${j}"></v:out></h1>
</v:forEach>

<v:url var="myurl" value="https://www.google.com/search">
<v:param name="q" value="virat wiki"></v:param>
</v:url>

<v:redirect url="${myurl}"></v:redirect>


</body>
</html>