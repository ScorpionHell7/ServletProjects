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
        <form action="submit-form" method="post">
            email :<input type="email" name="email" id="">
            <br><br>
            password :<input type="password" name="password" id="">
            <br><br>
            <input type="submit" value="Login">
        </form>
        <a href="session">Click here</a>
    </div>

    <div>
        <form action="actionname" method="get">
            My name :<input type="text" name="myname" placeholder="my name">
            <br>
            <br>
            <input type="submit" value="Login">
        </form>
        <a href="showname">click to get name</a>
    </div>


</body>
</html>