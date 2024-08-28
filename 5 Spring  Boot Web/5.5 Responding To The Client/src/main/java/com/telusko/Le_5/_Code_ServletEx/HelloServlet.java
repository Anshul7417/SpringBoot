package com.telusko.Le_5._Code_ServletEx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void Service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("In Service");
		res.setContentType("text/html");    // if not sent then it will show tags as it is

		PrintWriter out = res.getWriter();

		out.println("<h2><b>Hello World</h2></b>");

		// res.getWriter().println("Hello World");       same way
	}

}
