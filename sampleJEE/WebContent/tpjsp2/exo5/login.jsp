<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>TP JSP2 Exo 5</title>
</head>
<body>

	<c:url var="path" value="/login">
	</c:url>
	<form action="${path}" method="get">
		Login <input type="text" name="login" /><br />
		Email <input type="email" name="email" /><br />
		Password<input type="password" name="password" /><br />
		<input type="submit" /><br />
	</form>

</body>
</html>