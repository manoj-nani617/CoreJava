<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage = "error.jsp"%>
<%@ page import = "java.sql.*,java.time.*,java.time.format.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "stylesheet" href = "CrudOperations.css">
</head>
<body>

<div class = "input">
	<input class = "user" type = "text" placeholder = "enter the name">
	<button class = "button" type = "submit">submit</button>
</div>
<div class = "container">

<% 
		String name = (String)request.getParameter("username");
		String password = (String)request.getParameter("password");
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/student","postgres","manojkasu");
		PreparedStatement ps = con.prepareStatement("select * from student");
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter f =
		DateTimeFormatter.ofPattern("dd  MMM   yyyy   hh:mm:ss a");
		System.out.println(now);
		
		
%>
<table>
<% ResultSet rs= ps.executeQuery();
ResultSetMetaData meta = rs.getMetaData();
int columnCount = meta.getColumnCount();
%>
<tr>
<% for(int i = 1; i < columnCount; i++)
{
	String columnName = meta.getColumnName(i);%>
	<th><%=columnName %></th>
	
<% }%>
</tr>
<% while(rs.next()) 
{%>
<tr><td><%=rs.getInt(1)%></td><td><%=rs.getString(2)%></td><td><%=rs.getString(3)%></td><td><%=rs.getString(4)%></td></tr>
 
		<%} %>
</table>
</div>






</body>
</html>  