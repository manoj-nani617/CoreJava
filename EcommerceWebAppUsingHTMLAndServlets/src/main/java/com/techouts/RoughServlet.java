//package com.techouts;
//
//import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import javax.naming.Context;
//import javax.naming.InitialContext;
//import javax.naming.NamingException;
//import javax.print.attribute.standard.PrinterName;
//import javax.sql.DataSource;
//
//
//public class RoughServlet extends HttpServlet {
//	DataSource ds;
//	public void init() {
//		try {
//			Context con = new InitialContext();
//			ds = (DataSource)con.lookup("java:comp/env/jdbc/mydb");
//
//		}
//		catch(NamingException s) {
//			s.getMessage();
//		}
//	}
//	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		String query = "select * from empdetails";
//		try(Connection con = ds.getConnection();
//			PreparedStatement ps = con.prepareStatement(query)) {
//			ResultSet rs = ps.executeQuery();
//			while(rs.next()) {
//				res.getWriter().println(rs.getInt(1)+"\t"+rs.getString(2));
//			}
//
//
//
//		}
//		catch(SQLException s) {
//			s.printStackTrace();
//		}
//	}
//}
