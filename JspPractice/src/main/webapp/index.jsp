<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background: red;">
<h1>First JSP page</h1>
<%!
int a=10;
int b=20;
String name="Mujtaba";
public int sum(){
	return a+b;
}
public String reverse()
{
	StringBuffer sb=new StringBuffer(name);
	return sb.reverse().toString();
}
%>
<%
out.println(a);
out.println("<br>");
out.println(b);
out.println("<br>");
out.println(sum());
out.println("<br>");
out.println(reverse());
%>
<h1><%=reverse()%></h1>
<%=sum() %>
</body>
</html>