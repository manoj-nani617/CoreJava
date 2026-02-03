//package com.techouts;
//
//import java.io.IOException;
//import java.sql.Date;
//import java.text.SimpleDateFormat;
//import java.time.Instant;
//import java.time.LocalDateTime;
//import java.time.ZoneId;
//import java.util.Enumeration;
//
//import jakarta.servlet.Filter;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//
//public class AutoFilter implements Filter{
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
//	{
//
//		HttpServletRequest req = (HttpServletRequest) request;
//		HttpServletResponse res = (HttpServletResponse) response;
//		HttpSession session = req.getSession(false);
//		System.out.println(session);
//		if(session != null && session.getAttribute("email" )!= null)
//		{
//			chain.doFilter(req, res);
//		}
//		else {
//
//			 res.sendRedirect("Login.html");
//		}
//
//
//	}
//
//}
