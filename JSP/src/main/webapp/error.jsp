<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage = "true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "stylesheet" href = "index.css">
</head>
<body>
 <p><b>Error Occured <% out.println(exception.getMessage());%></b></p>
<div class="login-container">
    <h2>Login</h2>
   
        <label for="username">Email:</label>
        <input type="text" id="username" name="email" id = "email" >

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" id = "pass">

        <input type="submit" value="Login">
        <p>Have you not registered? <a href = "Register.html">Register</a> 
       
    
</div>

</body>
</html>