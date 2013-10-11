<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1>home page</h1>
	<p>
		${ message }<br>
		<a href="${ pageContext.request.contextPath }/employees/add.html">Add Employee</a><br>
		<a href="${ pageContext.request.contextPath }/employees/list.html">Employee List</a><br>
	</p>
</body>
</html>