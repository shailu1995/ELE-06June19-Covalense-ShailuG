<%!public String name = "Anil kapoor";
	private int age = 50;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getName(String name) {
		return "name is:" + name;
	}
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>tag example......</title>
</head>
<body>
	<h1>jsp tag example.....</h1>
	<br><br>
	name 1:<%=name %>
	<br><br>
	name 2:<%=getName() %>
	<br><br>
	name 3:<%=getName("shailu") %>
	<br><br>
	age 1:<%=age %>
	<br><br>
	age 2:<%=getAge() %>
	<br><br> 
	
	<%
	 for(int i=0;i<5;i++){
	%>
	name 1:<%=name %>
	<br><br> 
	<%
	}
	%>
</body>
</html>