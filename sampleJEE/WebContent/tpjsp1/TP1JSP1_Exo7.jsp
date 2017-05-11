<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>TP1 JSP1 Exo 7</title>
</head>
<body>

	<jsp:useBean id="user" scope="session" class="fr.imie.test.UserBean"/>
	
	<jsp:expression>user.getPrenom()</jsp:expression>
	
	<jsp:getProperty property="nom" name="user" />
	
	<jsp:setProperty property="nom" name="user" value="Igloo"/>
	<jsp:setProperty property="prenom" name="user" value="Captain"/>
	<br />
	<jsp:getProperty property="prenom" name="user" />
	<jsp:getProperty property="nom" name="user" />
	
	<jsp:setProperty property="nom" name="user" value="Le Roi"/>
	<jsp:setProperty property="prenom" name="user" value="Babar"/>

</body>
</html>