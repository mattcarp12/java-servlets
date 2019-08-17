/**
 * 
 */
package org.matt.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author mattc
 *
 */
public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println("Hello from GET method!");
		String username = request.getParameter("userName");
		out.println(username + " says hello!");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println("Hello from POST method!");
		String username = request.getParameter("userName");
		String fullname = request.getParameter("fullName");
		String prof = request.getParameter("prof");
		out.println(username + " says hello!");
		out.println("We know your full name is: " + fullname);
		out.println("You are a " + prof);
	}

}
