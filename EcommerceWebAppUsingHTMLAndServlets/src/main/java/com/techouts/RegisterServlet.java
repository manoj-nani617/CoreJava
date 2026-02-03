//package com.techouts;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//class UserExist extends Exception {
//	UserExist(String message) {
//		super(message);
//	}
//}
//public class RegisterServlet extends HttpServlet{
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
//		String username = (String)req.getParameter("username");
//		String email = (String)req.getParameter("email");
//		String password = (String)req.getParameter("password");
//		String confirmPassword = (String)req.getParameter("confirmPassword");
//
//		try {
//			Class.forName("org.postgresql.Driver");
//			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/EcommerceWebApp","postgres","manojkasu");
//			res.getWriter().println("Connection Successful");
//			try {
//				PreparedStatement st2 = con.prepareStatement("select count(*) from empdetails where email = ?");
//				st2.setString(1, email);
//				ResultSet rs2 = st2.executeQuery();
//				int num = 0;
//				while(rs2.next()) {
//					num = rs2.getInt(1);
//				}
//				if(num > 0) {
//					try {
//						res.getWriter().println("Entering into the User Exception");
//						throw new UserExist("User Exist Exception Occur");
//					}
//					catch(UserExist e) {
//						System.out.println(e.getMessage());
//					}
//				}
//			}
//			catch(Exception e) {
//				System.out.println("Exception Occurs");
//			}
//
//			PreparedStatement st1 = con.prepareStatement("insert into empdetails(username,email,password) values(?,?,?)");
//			st1.setString(1, username);
//			st1.setString(2, email);
//			st1.setString(3, password);
//			int rowsAffected = st1.executeUpdate();
//			HttpSession session = req.getSession();
//			session.setAttribute("email", email);
//			res.sendRedirect("AutoDelay.html");
//
//
//		}
//		catch(SQLException e) {
//			res.getWriter().println(e.getMessage());
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//
//
//	}
//
//
//}
