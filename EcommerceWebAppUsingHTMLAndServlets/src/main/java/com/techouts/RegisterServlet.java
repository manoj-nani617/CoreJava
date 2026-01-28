package com.techouts;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Employee","postgres","manojkasu");
			res.getWriter().println("Connection Successful");
			PreparedStatement st = con.prepareStatement("select count(*) from empdetails");
			int count = 0;
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				count = rs.getInt(1);
				count++;
			}
			count++;
			PreparedStatement st1 = con.prepareStatement("insert into empdetails values(?,?,?,?)");
			st1.setInt(1, count);
			st1.setString(2, username);
			st1.setString(3, email);
			st1.setString(4, password);
			int rowsAffected = st1.executeUpdate();
			res.sendRedirect("AutoDelay.html");
			
			
		}
		catch(SQLException e) {
			res.getWriter().println(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
