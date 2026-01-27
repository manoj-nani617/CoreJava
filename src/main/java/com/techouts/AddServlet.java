package com.techouts;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException
		{
		try {
			   // load and register
				Class.forName("org.postgresql.Driver");
			   Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/employee","postgres","manojkasu");
			   Statement s = con.createStatement();
//			   String uname = (String) req.getParameter("num1");
//			   String password = (String) req.getParameter("num2");
//			   System.out.println(uname+" "+password);
			   ResultSet rs = s.executeQuery("select * from UserDetails");
			   while(rs.next()) {
				   System.out.println()
			   }
			}
		catch(SQLException  | ClassNotFoundException cne) {
			   cne.printStackTrace();
			   System.out.println(cne.getMessage());
			}

	}

		 
}
        


