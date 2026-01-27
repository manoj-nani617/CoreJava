package com.techouts;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		String username = (String)req.getParameter("username");
		String email = (String)req.getParameter("email");
		String password = (String)req.getParameter("password");
		String confirmPassword = (String)req.getParameter("confirmPassword");
		res.getWriter().println(username+"\n");
		res.getWriter().println(email+"\n");
		res.getWriter().println(password+"\n");
		res.getWriter().println(confirmPassword+"\n");
		
		
	}
	

}
