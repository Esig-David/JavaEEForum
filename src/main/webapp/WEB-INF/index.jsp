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
			<input type="text" id="auteur" name="auteur"><br/>
			<label>Commentaire : </label>
			<input type="text" id="commentaire" name="commentaire"><br/>
			<input type="submit" value="Enregistrer">
		</form>
		
		<h2>Commentaires :</h2>
		
		<c:forEach var="commentaire" items="${commentaires}">
			<li>${commentaire.auteur}: ${commentaire.commentaire}</li>
		
		</c:forEach>
	</body>
</html>