<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page isELIgnored="false" %>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>

<%-- <%
	String name =  (String)request.getAttribute("name");
	Integer rollNo = (Integer)request.getAttribute("rollNo");
%> --%>

<%-- 
<h1>Name: <%= name %></h1>
<h1>Roll No: <%= rollNo %></h1>
 --%>


<!-- By using JSP Expression Language -->
<h1>Name is : ${name}</h1> 
<h1>Roll is : ${rollNo}</h1>

 <c:forEach var="item" items="${marks}">
 
 	<h1>
 		<c:out value="${item }"></c:out>
 	</h1>
 
 </c:forEach>
 
</body>
</html>