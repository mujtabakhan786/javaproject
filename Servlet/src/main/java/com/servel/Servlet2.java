package com.servel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		//getting all the cookie
		Cookie[] cookies = req.getCookies();
		boolean f=false;
		String name="";
		if(cookies==null)
		{
			out.println("<h1>You are new user go to home page</h1>");
			return;
		}
		else 
		{
			for(Cookie c:cookies )
			{
				String tname = c.getName();
				if(tname.equals("user_name"))
				{
					f=true;
					name = c.getName();
				}
			}
		}
		if(f) 
		{
			out.println("<h1>Hello " + name + " " + "welcome back to my website...</h1>");
			out.println("<h1>Thankyou</h1>");
		}
		else 
		{
			out.println("<h1>You are new user go to home page</h1>");
		}
	}
}
