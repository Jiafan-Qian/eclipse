<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html style="background-color:LightGray">
<head>
<meta charset="UTF-8">
<title>MVC Application</title>
</head>
<body>
	<center>
		<h1>Registration Page</h1>
	</center>
	<div align="center">
	<table>
		<form action="insert" method="post">
		<input type="hidden" name="id" value="<c:out value='${user.userId}'/>" />
		<tr>
			<td>First Name:</td>
			<td>
				<input type="text" name="firstname" size="45" value="<c:out value='${user.firstName}'/>"/>
			</td>
		</tr>	
		<tr>
			<td>Middle Name:</td>
			<td>
				<input type="text" name="middlename" size="45" value="<c:out value='${user.middleName}'/>"/>
			</td>
		</tr>
		<tr>
			<td>Last Name:</td>
			<td>
				<input type="text" name="lastname" size="45" value="<c:out value='${user.lastName}'/>"/>
			</td>
		</tr>
		<tr>
			<td>Email:</td>
			<td>
				<input type="text" name="email" size="45" value="<c:out value='${user.userEmail}'/>"/>
			</td>
		</tr>
		<tr>
			<td>Password:</td>
			<td>
				<input type="password" name="password" size="45" value="<c:out value='${user.password}'/>"/>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="Submit" style="background-color:SkyBlue; color:White"/>
			</td>
		</tr>
		</form>
		<tr>
			<td colspan="2" align="center">
				<form action="login" method="post">
				<input type="submit" value="Click Here To Login" style="background-color:SkyBlue; color:White"/>
				</form>
			</td>
		</tr>
	</table>
	</div>
</body>
</html>