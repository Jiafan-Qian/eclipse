<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC Appication User List</title>
</head>
<body>
	<div align="center">
		<table border="1" cellpadding="5">
		<caption>
			<h2>List of Users</h2>
		</caption>
		<tr>
			<th>User Id</th>
			<th>First Name</th>
			<th>Middle Name</th>
			<th>Last Name</th>
			<th>email</th>
		</tr>
		<c:forEach var="user" items="${listUser}">
			<tr>
				<td><c:out value='${user.userId}'></c:out></td>
				<td><c:out value="${user.firstName}"></c:out></td>
				<td><c:out value="${user.middleName}"></c:out></td>
				<td><c:out value="${user.lastName}"></c:out></td>
				<td><c:out value="${user.email}"></c:out></td>
			</tr>
		</c:forEach>
		</table>
		
		<button onclick="window.history.back();">Back</button>
	</div>

</body>
</html>