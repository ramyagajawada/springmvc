<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr>
<th>firstname</th>
<th>lastname</th>
<th>email</th>
<th>address</th>
<th>phone</th>
<th>age</th>
</tr>
<c:forEach items="${usersList}" var="user">
<tr>
<td>${user.firstname}<br/></td>
<td>${user.lastname}<br/></td>
<td>${user.email}<br/></td>
<td>${user.address}<br/></td>
<td>${user.phone}<br/></td>
<c:choose>
<c:when test="${user.age<16}">
<td style="background-color:yellow;">
${user.age}<br/></td>

</c:when>
<c:otherwise>
<td style="background-color:red;">
${user.age}<br/></td>

</c:otherwise>
</c:choose>
</tr>
</c:forEach>
</table>
</body>
</html>