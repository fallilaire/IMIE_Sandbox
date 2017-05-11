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
	
	<table class="table table-striped">
		<thead>
			<tr><th></th><th>Titre</th><th>Prénom Auteur</th><th>Nom Auteur</th><th>Delete</th></tr>
		</thead>
		<c:forEach var='livre' items='${livres}'>
			<tbody>
				<tr>
					<td align="center"><a href="${url}/select?id=${livre.id}">${livre.id}</a></td>
					<td><c:out value='${livre.getTitre()}'/></td>
					<td><c:out value='${livre.getAuteur().getPrenom()}'/></td>
					<td><c:out value='${livre.getAuteur().getNom()}'/></td>
					<td align="center"><a href="${url}/delete?id=${livre.id}">&#x2612;</a></td>
				</tr>
			</tbody>
		</c:forEach>
	</table>

</body>
</html>