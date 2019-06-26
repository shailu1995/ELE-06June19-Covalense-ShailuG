<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>my first jsp</title>
</head>
<body>
<h1>
	Current Date and Time is:
	<%
	String currentDateTime=new Date().toString();
	%>
	<br>
	<span style="colour: red"> <%=currentDateTime %></span>
	</h1>
	
	
	
</body>
</html>