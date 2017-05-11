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
	
	<c:if test="${login == null || login == false}">
		<jsp:forward page="login.jsp"></jsp:forward>
	</c:if>
	
	<p>Bienvenue sur la page ${name }</p>
	
	<c:url var="path" value="/disconnect" />
	<form action="${path}" method="get">
		<input type="submit" value="Disconnect"/><br />
	</form>

</body>
</html>