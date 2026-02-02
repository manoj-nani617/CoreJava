package com.techouts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LoginServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res)throws IOException {
		String name = (String)req.getParameter("username");
		String password = (String)req.getParameter("password");
		res.getWriter().println(name);
		res.getWriter().println(password);
	}
	

}
