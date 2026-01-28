package com.techouts;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import javax.print.attribute.standard.PrinterName;


public class RoughServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int val = 100;
		req.setAttribute("value", val);
		res.getWriter().println();
		RequestDispatcher rd = req.getRequestDispatcher("roughServlet");
		rd.forward(req,res);
		
		
		
	}
}
