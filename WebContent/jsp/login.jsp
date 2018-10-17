<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulaire</title>
</head>
<body>

	<form method="post" action="${pageContext.request.contextPath }/TestLogin">
		<div>
			<label>Login:</label> <input type="text" id="login" name="login">
		</div>
		
		<br/>
		
		<div>
			<label>password :</label><input type="password" name="password"  />
		</div>

		<button type="submit">Envoyer</button>
	</form>
</body>
</html>