<%@ page import= "java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1" padding = "5px">
	<%!
	public final int range = 10;
	%>
	<%
	Random r = new Random();
	for(int i=0;i<range;i++){
		String val = String.valueOf(r.nextDouble());
		String number = "+9198"+(val.substring(2,11));
		%>
		<tr>
			<td>
				<%= number%>
			</td>
		</tr>
	<% }
	%>
	</table>

</body>
</html>