package com.techouts;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String username = (String) req.getParameter("email");
		String password  = (String) req.getParameter("password");s
		try {
			// load and register
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Employee", "postgres",
					"manojkasu");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from empdetails");
			while(rs.next()) {
				res.getWriter().println(rs.getInt(1) +"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
			PreparedStatement ps = con.prepareStatement("select count(*) from empdetails where email = ? and password = ?");
			ps.setString(1, username);
			ps.setString(2, password);;
			int count = 0;
			ResultSet rs2 = ps.executeQuery();
			while(rs2.next()) {
				count = rs2.getInt(1);
			}
			if(count > 0) res.sendRedirect("AutoDelay.html");
		} catch (SQLException | ClassNotFoundException cne) {
			cne.printStackTrace();
			System.out.println(cne.getMessage());
		}

	}

}
