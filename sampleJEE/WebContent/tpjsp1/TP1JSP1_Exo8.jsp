<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/test.tld" prefix="imie" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>TP1 JSP1 Exo 8</title>
</head>
<body>
	<div>
		<imie:tag1 />
	</div>

	<c:set var="a" value="5" />
	<c:set var="b" value="7" />
	<div>Valeur de a : ${a}</div>
	
	<div>	
		<imie:tagSum firstField="${a}" secondField="${b}" />
	</div>
	
	<div>
		<imie:tagTable nbLines="10" />
	</div>
	
	<div>
		<imie:tagTablePremier nbLines="50"/>
	</div>

</body>
</html>