<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Hire an Employee</h2>

<form:form method="post" modelAttribute="employee">
<table>
    <tr>
    <td>Name :</td>
    <td><form:input path="name" placeholder="Enter name" type="text"  /><br /></td>
    </tr>
  
    <tr>
    <td>Email :</td>
  	 <td><form:input path="email" placeholder="Enter email" type="email" /><br /></td>
    </tr>
    <tr>
    <td>Salary :</td>
  	 <td><form:input path="salary" placeholder="Enter salary" type="number"  /><br /></td>
    </tr>
    <tr>
    <td>Date-of-Birth :</td>
  	 <td><form:input path="dob" placeholder="Enter date of birth" type="date" /><br /></td>
    </tr>
</table>
    <br>
    <br>
    <a href='<spring:url value="/department/list"/>'><input type="submit" value="Hire Employee" class="btn1"/></a>
</form:form>
</body>
</html>