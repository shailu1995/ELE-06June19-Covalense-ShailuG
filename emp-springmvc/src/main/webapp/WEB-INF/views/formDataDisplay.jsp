<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>


<html>
<%int userId=(Integer)(request.getAttribute("userId"));
String password=(String)(request.getAttribute("password")); %>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
User Id = <%=userId %>
<br>
password = <%=password %>
</body>
</html>