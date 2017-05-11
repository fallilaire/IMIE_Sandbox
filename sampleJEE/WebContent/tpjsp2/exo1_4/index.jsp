<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>TP JSP2 Exo 1</title>
</head>
<body>

	<jsp:useBean id="monBean" scope="session" class="fr.imie.test.UserBean"/>
	
	<p>Avec getProperty</p>
	<jsp:getProperty property="prenom" name="monBean" />
	<jsp:getProperty property="nom" name="monBean" />
	
	<p>Avec EL</p>
	${monBean.getPrenom()} ${monBean.getNom()}
	
	<br />
	
	<%
		List<String> loisirs = (List<String>)request.getAttribute("loisirs");
		for (String loisir : loisirs) {
			out.println("<p>" + loisir + "</p>");
		}
	 %>
	
	<jsp:scriptlet>
	
	</jsp:scriptlet>
	
	<c:forEach var='item' items='${loisirs}'>
		<c:out value='Loisir : ${item}'/><br />
	</c:forEach>

</body>
</html>