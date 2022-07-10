<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>

<body>

	<table style="background-color: lightgrey; margin: auto;">
		<caption>All Available Courses</caption>
		<c:forEach var="title" items="${requestScope.course_list}">
			<tr>
				<td>${title}</td>
				<td><a
					href="<spring:url value='/courses/delete?courseTitle=${title}'/>">Delete</a></td>
				<td><a
					href="<spring:url value='/students/admit?courseTitle=${title}'/>">Admit
						Student</a></td>
				<td><a
					href="<spring:url value='/courses/details?courseTitle=${title}'/>">Course
						Details</a></td>

			</tr>
		</c:forEach>
	</table>

</body>
</html>