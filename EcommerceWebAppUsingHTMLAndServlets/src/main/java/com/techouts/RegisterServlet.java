package com.techouts;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		String username = (String)req.getParameter("username");
		String email = (String)req.getParameter("email");
		String password = (String)req.getParameter("password");
		String confirmPassword = (String)req.getParameter("confirmPassword");
		try(Connection con = DriverManager.getConnection("jdbc:postgresql://localhost5432/Employee","postgres","manojkasu")) {
			
			PreparedStatement st = con.prepareStatement("insert into empdetails values(?,??)");
			st.setString(1, username);
			st.setString(2, email);
			st.setString(3, password);
			
			
			
		}
		catch(SQLException e) {
			res.getWriter().println(e.getMessage());
		}
		
		
		
	}
	

}
