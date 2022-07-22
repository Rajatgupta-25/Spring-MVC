<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

<h1>This is home page</h1>
<h1>Called by home controller</h1>

<%
	String name = (String)request.getAttribute("name");
	List<String> list = (List)request.getAttribute("list");
%>

<h1>Name is <%= name %></h1>

<%
	for(String s : list){
		%>
			<h1><%= s %></h1>
		<%
	}
%>

</body>
</html>