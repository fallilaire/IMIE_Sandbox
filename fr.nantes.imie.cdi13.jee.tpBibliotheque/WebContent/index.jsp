<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Ma Bibliothèque</title>
	<meta charset="UTF-8">
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<script src="js/jquery-3.1.1.js"></script>
	<script src="js/bootstrap.js" ></script>
</head>
<body>
	
	<c:url var="pathListing" value="/livre" />
	
	<div>
		<a href="${pathListing}">Liste des livres</a>
	</div>
	<div>
		<a href="${pathListing}/create">Création d'une fiche Livre</a>
	</div>

</body>
</html>