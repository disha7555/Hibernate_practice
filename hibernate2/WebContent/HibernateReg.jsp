<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD html 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HIBERNATE REGISTRATION PAGE</title>
</head>
<body>

	<form action="<%=request.getContextPath()%>/RegController"
		method="post">

		FIRSTNAME:<input type="text" name="fn" /><br />
		<br /> LASTNAME:<input type="text" name="ln" /><br />
		<br /> <input type="submit" value="SUBMIT" /><br />
		<br /> <a href="<%=request.getContextPath()%>/RegController">SEARCH
			HERE</a>
	</form>
</body>
</html>