package com.jsoft.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsoft.dao.PersonDao;
import com.jsoft.daoImpl.PersonDaoImpl;
import com.jsoft.pojo.Person;

/**
 * Servlet implementation class PersonController
 */
@WebServlet("/PersonController")
public class PersonController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String name = request.getParameter("Name");
		String email = request.getParameter("Email");
		String password = request.getParameter("Password");
		String Age = request.getParameter("Age");
		String Submit = request.getParameter("Submit");
        Person person = new Person();
        person.setName(name);
        person.setEmail(email);
        person.setPassword(password);
        person.setAge(Integer.parseInt(Age));
        PersonDao impl = new PersonDaoImpl();
        impl.create(person);
        writer.println("<h2>Record is Inserted Successfully</h2>");
	}

}
