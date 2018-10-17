<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="ex" uri="WEB-INF/tp4.tld"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<ex:Date dat="<%= LocalDate.now() %>" pattern="dd/MM/yyyy" />
</body>
</html>