<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request Manager</title>
</head>
<body>
	<h2>Requests Page</h2>
	<table>
		<tr>
			<th>id</th>
			<th>title</th>
			<th>year</th>
			<th>genre</th>
			<th>watched</th>
			<th>action</th>
		</tr>
		<c:forEach var="request" items="${requests}">
			<tr>
				<td>${request.id}</td>
				<td>${request.title}</td>
				<td>${request.executor}</td>
				<td>${request.customer}</td>
				<td>${request.status}</td>
				<td><a href="/edit/${request.id}">edit</a> <a
					href="/delete/${request.id}">delete</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<h2>Add</h2>
	<c:url value="/add" var="add" />
	<a href="${add}">Add new request</a>
</body>
</html>