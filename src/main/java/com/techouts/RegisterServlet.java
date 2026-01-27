package com.techouts;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		String msg = (String)req.getAttribute("msg");
		PrintWriter out = res.getWriter();
		out.println(msg);
		
	}
	

}
