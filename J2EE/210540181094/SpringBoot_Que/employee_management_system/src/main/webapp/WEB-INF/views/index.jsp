<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body id="demo">
<h1>Welcome to Index Page Click on Below Link</h1>
<h2><a href="<spring:url value='department/list'/>">Display departments</a></h2>
</body>
</html>