<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC Application</title>
</head>
<body>
	<div align="center">
		<h1>Result Page</h1>
		<h2>Welcome, ${user.firstName} ${user.middleName} ${user.lastName}</h2>
		<h3><a href="list">List all users</a></h3>
		<h3><a href="logout">Logout</a></h3>
	</div>
	
</body>
</html>