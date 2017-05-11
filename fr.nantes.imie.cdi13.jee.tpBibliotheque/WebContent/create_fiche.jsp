<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Création fiche Livre</title>
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<script src="js/jquery-3.1.1.js"></script>
	<script src="js/bootstrap.js" ></script>
</head>
<body>
	
	<c:url var="url" value="/livre" />
	
	<form action="${url}/update">
		Titre : <input type="text" name="titre" /><br />
		<select name="id_auteur">
  			<c:forEach var='auteur' items='${auteurs}'>
  				<option value="${auteur.id}">${auteur.prenom} ${auteur.nom}</option>
			</c:forEach>
		</select>
		
		<input type="submit" />
	</form>

</body>
</html>