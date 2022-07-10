<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="valid_reg_page.jsp" method="get">
      <table style="background-color: lightgrey; margin: auto">
        <tr>
          <td>Enter Name</td>
          <td><input type="text" name="name" /></td>
        </tr>
        <tr>
          <td>Enter Party</td>
          <td><input type="text" name="party" /></td>
        </tr>
        <tr>
        <td>Date</td>
        <td><input type="date" name="dateOfBirth" /></td>
        </tr>
        <tr>
          <td><input type="submit" value="Login" /></td>
        </tr>
      </table>
    </form>
  </body>
</html>