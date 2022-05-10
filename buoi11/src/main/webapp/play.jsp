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
	<c:choose>
		<c:when test="${!isCorrect}">
			<form action="" method="post">
			<input type="number" name="num">
			<input type="submit">
		</form>
		</c:when>
		<c:otherwise>
			<form action="rank" method="post">
				<input type="text" name="name" placeholder="Nhap ten cua ban">
				<input type="submit">
			</form>
		</c:otherwise>
	</c:choose>
	${msg}
	<c:if test="${count > 0}">
		So lan doan: ${count}
	</c:if>
</body>
</html>