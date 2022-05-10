<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Hang</th>
			<th>Ten</th>
			<th>So lan doan</th>
		</tr>
		<c:forEach var="rank" items="${list}" varStatus="i">
			<tr>
				<td>${i.index+1}</td>
				<td>${rank.name}</td>
				<td>${rank.attempt}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>