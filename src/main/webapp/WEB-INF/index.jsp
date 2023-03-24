<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Forum</title>
		<h1>Forum</h1>
	</head>
	<body>
		<form method="post">
			<label>Nom: </label>
			<input type="text" id="nom" name="nom"><br/>
			<label>Commentaire : </label>
			<input type="text" id="commentaire" name="commentaire"><br/>
			<input type="submit" value="Enregistrer">
		</form>
		
		<h2>Commentaires :</h2>
		${empty nom ? '' : nom }
	</body>
</html>