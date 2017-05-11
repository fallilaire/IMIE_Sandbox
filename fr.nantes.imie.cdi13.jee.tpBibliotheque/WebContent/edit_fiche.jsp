<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Listing des utilisateurs</title>
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<script src="js/jquery-3.1.1.js"></script>
	<script src="js/bootstrap.js" ></script>
</head>
<body>
	
	<c:url var="url" value="/livre" />
	
	<form action="${url}/update">
		<input type="hidden" name="id" value="${livre.id}" />
		Titre : <input type="text" name="titre" value='${livre.getTitre()}'/><br />
		<input type="submit" />
	</form>

</body>
</html>