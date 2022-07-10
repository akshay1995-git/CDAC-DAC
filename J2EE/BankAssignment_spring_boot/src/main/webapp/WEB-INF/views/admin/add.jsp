<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form:form method="post" modelAttribute="bankUser">
		<table style="background-color: cyan; margin: auto;">
			<tr>
				<td>Enter User Name</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Enter User Email</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><form:password path="password" /></td>
			</tr>
			<tr>
				<td><form:input type="hidden" path="role" value="USER" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register Vendor" /></td>
			</tr>
		</table>
	</form:form>
	
	<a href="<spring:url value='/admin/list'/>">Show All Users</a>
	
</body>
</html>