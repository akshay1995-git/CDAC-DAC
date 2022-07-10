<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Department List From dept_tbl</h2>
<h2></h2>

<table class="demo" style="background-color: lightgrey;" border="1px">
<tr>
<th>Department ID</th>
<th>Department Name</th>
<th>Location</th>
<th>Strength</th>
</tr>
<c:forEach var="dept" items="${sessionScope.dept_list}">
	<tr>
	<td>${dept.id}</td>
	<td><a href="<spring:url value='/employee/hire?deptId=${dept.id}'/>">${dept.deptName}</a></td>
	<td>${dept.location}</td>
	<td>${dept.strength}</td>	
	</tr>
</c:forEach>
</table>
</body>
</html>