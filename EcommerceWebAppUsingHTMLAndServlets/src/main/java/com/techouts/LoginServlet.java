//package com.techouts;
//
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import javax.naming.Context;
//import javax.naming.InitialContext;
//import javax.naming.NamingException;
//import javax.sql.DataSource;
//
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//
//public class LoginServlet extends HttpServlet {
//
//	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		String username = (String) req.getParameter("email");
//		String password  = (String) req.getParameter("password");
//		try {
//			Class.forName("org.postgresql.Driver");
//			Connection  con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/EcommerceWebApp","postgres","manojkasu");
//			System.out.println("Connection Success");
//			PreparedStatement ps = con.prepareStatement("select count(*) from empdetails where email = ? and password = ?");
//			ps.setString(1, username);
//			ps.setString(2, password);;
//			int count = 0;
//			ResultSet rs2 = ps.executeQuery();
//			while(rs2.next()) {
//				count = rs2.getInt(1);
//			}
//			if(count > 0) {
//				HttpSession session = req.getSession();
//				session.setAttribute("email", username);
//				session.setAttribute("password",password);
//				res.sendRedirect("AutoDelay.html");
//
//
//			}
//			else res.sendRedirect("LoginFailure.html");
////			else res.sendRedirect("Login.html");
//			rs2.close();
//			ps.close();
//			con.close();
//		} catch (SQLException | ClassNotFoundException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//
//
//	}
//
//}
