<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>${header}</h2>
<h2>@{desc}</h2>

<h1>Successfully Signed up!</h1>

<h3>Welcome, ${user.name} </h3>
<h3>Your email id is, ${user.email}</h3>
<h3>Password is, ${user.password}</h3>


</body>
</html>