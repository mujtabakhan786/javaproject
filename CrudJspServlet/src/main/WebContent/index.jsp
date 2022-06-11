<%@page import="java.util.Iterator"%>
<%@page import="com.jsoft.pojo.Person"%>
<%@page import="java.util.List"%>
<%@page import="com.jsoft.dao.PersonDao"%>
<%@page import="com.jsoft.daoImpl.PersonDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table{border-collapse:collapse;}
</style>
</head>
<body>
	<form action="PersonController" method="post">
		<h1 align="center">Registeration Form</h1>
		<table align="center" border="1">
			<tr>
				<td>NAME: <input type="text" name="Name" required="required"></td>
			</tr>
			<tr>
				<td>EMAIL: <input type="email" name="Email" required="required"></td>
			</tr>
			<tr>
				<td>PASSWORD: <input type="password" name="Password"
					required="required"></td>
			</tr>
			<tr>
				<td>AGE: <input type="text" name="Age" required="required"></td>
			</tr>
			<tr>
				<td align="center"><input type="submit" name="Submit"
					required="required"></td>
			</tr>
		</table>
		<hr>
		<table align="center" border="1">
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>EMAIL</th>
				<th>PASSWORD</th>
				<th>AGE</th>
			</tr>
			<%
			PersonDao personDao = null;
			Person p = null;
			p = new Person();
			personDao = new PersonDaoImpl();
			List<Person> list = personDao.read();
			Iterator<Person> itr = list.iterator();
			while (itr.hasNext()) {
				p = itr.next();
			%>
			<tr>
				<td><%=p.getId()%></td>
				<td><%=p.getName()%></td>
				<td><%=p.getEmail()%></td>
				<td><%=p.getPassword()%></td>
				<td><%=p.getAge()%></td>
			</tr>
			<%
			}
			%>
		</table>
	</form>
</body>
</html>