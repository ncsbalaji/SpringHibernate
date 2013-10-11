<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employees List</title>
</head>
<body>
<h1>Employees List</h1>
<table border="1">
	<thead>
		<tr>
			<td> Id </td>
			<td> First Name </td>
			<td> Last Name </td>
			<td> Email </td>
			<td> Telephone </td>
			<td> Edit / Delete</td>
		</tr>
	</thead>
		<c:if test="${ fn: length(empList) eq 0 }">
				<tr>
					<td colspan="6"><font color="red">No Records to Display</font></td>
				</tr>
		</c:if>
		
		<c:forEach var="emp" items="${ empList }">
			<tr>
				<td>${ emp.id }</td>
				<td>${ emp.firstName }</td>
				<td>${ emp.lastName }</td>
				<td>${ emp.email }</td>
				<td>${ emp.telephone }</td>
				<td>
					<a href="${ pageContext.request.contextPath }/employee/edit/${emp.id}.html">Edit</a><br>
					<a href="${ pageContext.request.contextPath }/employee/delete/${emp.id}.html">Delete</a><br>
				</td>
			</tr>
		</c:forEach>
	
</table>
	<p>
		<a href="${ pageContext.request.contextPath }/index">home</a>
	</p>
</body>
</html>