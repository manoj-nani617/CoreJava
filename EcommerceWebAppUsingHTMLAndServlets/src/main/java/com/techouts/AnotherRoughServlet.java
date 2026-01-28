package com.techouts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class AnotherRoughServlet
 */
public class AnotherRoughServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int value = (int) req.getAttribute("value");
		res.getWriter().println("Recevied the value "+value);
	}
}
