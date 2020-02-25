<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Edit</title>
</head>
<body>
    <c:url value="/edit" var="var"/>
<form action="${var}" method="POST">
    <input  type="hidden" name="id" value="${request.id}">
    <label for="title">Title</label>
    <input type="text" name="title" id="title" value = "${request.title }">
    <label for="executor">Executor</label>
    <input type="text" name="executor" id="executor" value = "${request.executor }">
    <label for="customer">Customer</label>
    <input type="text" name="customer" id="customer" value = "${request.customer }">
    <label for="status">Status</label>
    <input type="text" name="status" id="status" value = "${request.status }">
    <input type="submit" value="Edit request">
</form>

</body>
</html>