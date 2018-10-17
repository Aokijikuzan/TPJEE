<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>liste des parametres</title>
</head>
<body>
	<form method="Get">
		<input type="text" name="texto"></input> 
		<input type="text" name="texto1"></input> 
		<input type="submit" name="sub"></input>
	</form>
	<%-- 
	Parameter par: <%=request.getParameter("texto") %>
	--%>
	<%@ page import="java.util.Map" %>
	<%
		Map<String,String[]> para=request.getParameterMap();
		for(String parameter : para.keySet())
		{
		
		out.println( "<br/>"+request.getParameter(parameter) );
		
		
		
		}
	%>
	<%--
	out.print(parameter);
	out.println(request.getParameter(" texto \n")); --%>
	
</body>
</html>