<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Test</title>
</head>
<body>
<c:if test="${!empty sessionScope.nom && !empty sessionScope.prenom }">
<p> <c:out value="Vous etes ${sessionScope.nom } ${sessionScope.prenom }"></c:out></p>
</c:if>

<form method="post" action="bonjour">
	<p>
		<label for="nom">Nom:</label>
		<input type="text" id="nom" name="nom"/> 
	</p>
	<p>
		<label for="prenom">Prenom:</label>
		<input type="text" id="prenom" name="prenom"/> 
	</p>
	
<input type="submit"/>
</form>
<ul>
	<c:forEach var = "utilisateur" items = "${utilisateurs}">
		<li>
		<c:out value="${utilisateur.prenom}"/>  <c:out value="${utilisateur.nom}"/> 
		</li>
	
	</c:forEach>
</ul>
</body>
</html>