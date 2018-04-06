<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<c:url value="/login" var="login_url" ></c:url>

</head>
<body>
	<h2>Login</h2>
	<form action="${login_url}" method="post">
		<p>
			<label for="username">Username</label>
			<input type="text" id="username" name="username"/>
		</p>
		<p>
			<label for="password">Password</label>
			<input type="password" id="password" name="password"/>
		</p>
		
		<c:if test="${response.error != null}">
			<p style="color : red;">${response.error}</p>
		</c:if>
		<c:if test="${response.logout != null}">
			<p style="color : red;">${response.logout}</p>
		</c:if>
	</form>
</body>
</html>