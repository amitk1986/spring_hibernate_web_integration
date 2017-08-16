<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${!empty employees}">
	<table align="left" border="1">
		<tr>
			<th>Employee ID</th>
			<th>Employee First Name</th>
			<th>Employee Last Name</th>
			<th>Employee Email</th>
			<th>Employee Mobile</th>
		</tr>

		<c:forEach items="${employees}" var="employee">
			<tr>
				<td><c:out value="${employee.id}"/></td>
				<td><c:out value="${employee.fname}"/></td>
				<td><c:out value="${employee.lname}"/></td>
				<td><c:out value="${employee.email}"/></td>
				<td><c:out value="${employee.mob}"/></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>