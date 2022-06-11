<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.pro.pojo.Employee"%>
<%@page import="com.pro.dao.EmployeeDao"%>
<%@page import="com.pro.daoImpl.EmployeeDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center" style="color: blue">Registration Form</h1>
	<form action="EmployeeController" method="post">
		<table align="center" border="1">
			<tr>
				<td>Id: <input type="text" name="id" readonly="readonly"
					placeholder="Don't enter anything here"></td>
			</tr>
			<tr>
				<td>Name: <input type="text" name="name"
					placeholder="Enter your name" required="required"></td>
			</tr>
			<tr>
				<td>Salary: <input type="number" name="salary"
					placeholder="Enter your salary" required="required"></td>
			</tr>
			<tr>
				<td>Address: <input type="text" name="address"
					placeholder="Enter your address" required="required"></td>
			</tr>
			<tr>
				<td align="center"><input type="submit"
					placeholder="Enter your address" required="required"></td>
			</tr>
		</table>
	
	<hr>
	<table align="center" border="1">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>SALARY</th>
			<th>ADDRESS</th>
		</tr>

		<%
		EmployeeDao empDao = null;
		Employee emp = null;
		 emp = new Employee();
		 empDao = new EmployeeDaoImpl();
		 List<Employee> list =  empDao.read();
		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
			emp = itr.next();
		%>
		<tr>
			<td><%=emp.getId()%></td>
			<td><%=emp.getName()%></td>
			<td><%=emp.getSalary()%></td>
			<td><%=emp.getAddress()%></td>
		</tr>
		<%
		}
		%>

	</table>
	</form>
</body>
</html>