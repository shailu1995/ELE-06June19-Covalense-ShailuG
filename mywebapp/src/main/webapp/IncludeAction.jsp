
<!DOCTYPE html>
<html>

</head>
<body>
	11111111111111
	<br>

	<jsp:include page="index.html">
		<br>
	 22222222222222
	<br>
		<jsp:include page="currentDate">
			<br> 
	33333333333333333
	<br>
	<jsp:include page="currentDate?fname='jsdhj'&lname='hgjg'">
	<br>
	44444444444
	<br>
	<jsp:forward page="currentDate"></jsp:forward>
	<jsp:param name="fname" value="shailu" />
	<jsp:param name="lname" value="G" />
	</jsp:include>
	55555555555555
	<br>
	<jsp:include page="currentDateJSP">
	<br>
	</body>
</html>