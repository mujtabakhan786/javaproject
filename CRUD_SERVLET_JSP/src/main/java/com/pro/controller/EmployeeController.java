package com.pro.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.pro.dao.EmployeeDao;
import com.pro.daoImpl.EmployeeDaoImpl;
import com.pro.pojo.Employee;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String Name = request.getParameter("name");
		double Salary = Double.parseDouble(request.getParameter("salary"));
		String Address = request.getParameter("address");
		Employee employee = new Employee();
		employee.setName(Name);
		employee.setSalary(Salary);
		employee.setAddress(Address);
		System.out.println(employee);
		EmployeeDao daoImpl = new EmployeeDaoImpl();
		daoImpl.create(employee);
		daoImpl.read();
		response.sendRedirect("index.jsp");

		out.println("<h>Inserted is Successfully...!<h>");
		

	}

}
