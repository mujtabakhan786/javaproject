<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page errorPage="ErrorPage.jsp" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Example of Taglib directive</title>
</head>
<body>
<h1>Taglib Directive tutorial :</h1>
<hr>
<c:set var="name" value="Mujtaba khan"></c:set>
<c:out value="${name}"></c:out>
<c:if test="${3<2 }"><h2>this is true</h2></h2></c:if>
<br>
<h1><c:out value="${20+20 }"></c:out></h1>
<br>
<%!
int n1=200;
int n2=0;
int division=n1/n2;
%>
<h1>Division =<%= division %></h1>
</body>
</html>