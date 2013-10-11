<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<h1>Add Employee Page</h1>
	<form:form method="post" commandName="emp" action="${ pageContext.request.contextPath }/employees/add/process.html">
	<table>
		<tbody>
		<tr>
			<td>First Name</td>
			<td><form:input path="firstName"/> </td>
		</tr>	
		<tr>	
			<td>Last Name</td>
			<td><form:input path="lastName"/> </td>
		</tr>
		<tr>
			<td>Email</td>
			<td><form:input path="email"/></td>
		</tr>
		<tr>
			<td>Telephone</td>
			<td><form:input path="telephone"/></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input value="add" type="submit" /></td>
		</tr>
		</tbody>
	</table>
	</form:form>
	<p>
		<a href="${ pageContext.request.contextPath }/index">home</a>
	</p>
</body>
</html>