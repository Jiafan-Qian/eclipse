<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html style="background-color:#1947A3;">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MVC Application</title>
</head>
<body>
	<center>
		<h1 style="color:White;">Sign in to your account</h1>
	</center>
	<div align="center">
		<table style="background-color:White;" width="50%">
		<form action="signin" method="post">
		<tr>
			<td>Email address</td>
		</tr>
		<tr>
			<td>
				<input type="text" size="50" name="email" value="<c:out value='${user.userEmail}'/>"/>
			</td>
		</tr>
		
		<tr>
			<td>
				Password
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="forgotpassword">Forgot Password?</a>
			</td>
		</tr>
		<tr>
			<td>
				<input type="password" size="50" name="password" value="<c:out value='${user.password}'/>"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<input type="submit" value="Sign in" style="background-color:Green; color:White"/>
			</td>
		</tr>
		</form>
		</table>
		
		<br>
		
		<table style="background-color:White;" width="50%">
			<tr>
				<th>New User?<a href="register">Create an account</a></th>
			</tr>
		</table>
		
	</div>
</body>
</html>