<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="b"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<h1>All user are :</h1>
	<b:setDataSource driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/youtube" user="root" password="root"
		var="ds" />
	<b:query var="rs" dataSource="${ds}">select * from user;</b:query>
	<div class="container">
		<table class="table">
			<tr>
				<td>User Id</td>
				<td>User Name</td>
				<td>User Password</td>
				<td>User email</td>
			</tr>
			<c:forEach items="${rs.rows}" var="row">
				<tr>
					<td><c:out value="${row.id}"></c:out></td>
					<td><c:out value="${row.name}"></c:out></td>
					<td><c:out value="${row.password}"></c:out></td>
					<td><c:out value="${row.email}"></c:out></td>
				</tr>
			</c:forEach>

		</table>

	</div>
</body>
</html>