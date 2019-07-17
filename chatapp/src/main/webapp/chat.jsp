<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Online Chat</title>
</head>
<body>
	<hr/>
	<form action="ChatServlet" method="post">
		<input type="text" name="msg" required />
		<button type="submit">Send Message</button>
	</form>
	<c:forEach items="${messages}" var="m">
		${m} <br/>
	</c:forEach>
</body>
</html>