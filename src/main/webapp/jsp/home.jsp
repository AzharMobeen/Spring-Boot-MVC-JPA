<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>Welcome to ${message}</h1>
	</div>

	<table class="table table-dark">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Name2</th>
				<th scope="col">Phone</th>
				<th scope="col">Email</th>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach items="${userList}" var="user">
				<tr>
					<th scope="row"><c:out value="${user.id}"/></th>
					<td><c:out value="${user.name}"/></td>
					<td><c:out value="${user.phoneNumber}"/></td>
					<td><c:out value="${user.email}"/></td>
				</tr>
				
			</c:forEach>						
		</tbody>
	</table>


</body>
</html>