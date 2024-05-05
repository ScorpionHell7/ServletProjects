<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  
<!DOCTYPE html>
<%@ include file="header.jsp"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1><%= request.getAttribute("names") %></h1>
	<h2><%= session.getAttribute("sessionnames")%></h2>
	<h2><%= application.getAttribute("applicationnames")%></h2>
</body>
<%@ include file="footer.html"%>
</html>