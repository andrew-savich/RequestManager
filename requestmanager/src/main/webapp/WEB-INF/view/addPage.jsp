<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
        <title>Add</title>
</head>
<body>
    <c:url value="/add" var="var"/>
<form action="${var}" method="POST">
	<input type="hidden" name="id" value=0>
    <label for="title">Title</label>
    <input type="text" name="title" id="title">
    <label for="executor">Executor</label>
	<select size="1" name="executor">
	    <c:forEach items="${executors }" var="executor">
			<option value="${executor.fullName}">${executor.fullName}</option>
		</c:forEach>
    </select>
    <label for="customer">Customer</label>
    <input type="text" name="customer" id="customer">
    <label for="status">Status</label>
    <input type="text" name="status" id="status">
    <input type="submit" value="Add new request">
</form>
</body>
</html>