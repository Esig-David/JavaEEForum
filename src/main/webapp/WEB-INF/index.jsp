<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Forum</title>
		<link rel="stylesheet" href="resources/css/style.css" media="screen" />
		
		<h1>Forum</h1>
	</head>
	<body>
		<form method="post">
			<label>Nom: </label>
			<input type="text" id="auteur" name="auteur"><br/>
			<label>Commentaire : </label>
			<textarea  maxlength='1000' minlength='1' name="commentaire"></textarea>
			<input id="submit" type="submit" value="Enregistrer">
		</form>
		
		<h2>Commentaires :</h2>
		
		<table>
			<thead>
				<tr>
					<th>Nom utilisateur</th>
					<th>Commentaire</th>
				</tr>
				
			</thead>
			<tbody>
				<c:forEach var="commentaire" items="${commentaires}">
					<tr>
						<td>${commentaire.auteur}</td> 
						<td>${commentaire.contenu}</td>
					</tr>
				</c:forEach>							
			</tbody>
		
		</table>
		
	</body>
</html>