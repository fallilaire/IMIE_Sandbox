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

	<p>Avant include</p>
	
	<jsp:include page="TP1JSP1_Exo8.jsp"></jsp:include>
	
	<p>Après include</p>
	
	
</body>
</html>