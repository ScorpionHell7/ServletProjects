<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
        <form action='<%= response.encodeURL("actionname")%>' method="post"> 
            <input type = "text" name = "name" placeholder="Your name">
            <br>
            <br>
            <input type = "number" name = "phone" placeholder="Your mobile">       
            <br>
            <br>
            <input type="submit" value="Login">
        </form>
        <a href='<%= response.encodeURL("show") %>'>showcontacts</a>
    </div>

</body>
</html>