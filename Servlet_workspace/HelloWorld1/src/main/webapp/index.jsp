<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Index.html</h1>
<a href ="today">Todays date</a>
<hr>
<h1>
<%@ page import="java.util.Date" %>
<%!
final int num = 9;
public int sayhello(int val){
	return num*val;
}
%>
<%= new Date() %>
<hr>
<%
	int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
	for(int i:arr){
%>

<%= sayhello(i) %>
<%} %>
</h1>
<hr>
<a href ="fakecc">fake credit card</a>

</body>
</html>