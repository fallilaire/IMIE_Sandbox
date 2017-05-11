<!DOCTYPE html>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/test.tld" prefix="imie" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>TP1 JSP1 Exo 8</title>
</head>
<body>

	<c:set var="a" value="5" />
	<c:set var="b" value="7" />
	<div>Valeur de a : ${a}</div>
	
	<%
		Map<String, String> map = new HashMap<String, String>();
		map.put("Renaud Clio", "Citadine");
		map.put("Ferrari 166 Sport", "Sportive");
		map.put("Toyota Version", "MonoSpace");

		pageContext.setAttribute("map", map);
	%>

	<c:forEach var='item' items='${map}'>
		<c:out value='Voiture : ${item.key}, Catégorie : ${item.value}'/><br />
	</c:forEach>

	<jsp:useBean id="voitures" class="java.util.HashMap"/>
	<c:set target="${voitures}" property="Boumbo" value="Petite voiture" />
	<c:set target="${voitures}" property="Dumbo" value="Voiture volante" />
	
	<c:forEach var='item' items='${voitures}'>
		<c:out value='Voiture : ${item.key}, Catégorie : ${item.value}'/><br />
	</c:forEach>
	
	
</body>
</html>