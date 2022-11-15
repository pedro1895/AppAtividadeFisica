<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
	<title>Cadastramento de Musculação</title>
</head>
<body>
    <%@include file="../includes/menu.jsp" %>

	<div class="container mt-3">
	  <h3>Musculação: ${listagem.size()}</h3>

	  <h4><a href="/musculacao">Nova Musculação</a></h4>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nome</th>
	        <th>Valor</th>
	        <th>Código</th>
	        <th>Personal</th>
	        <th>Spinning</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="m" items="${listagem}">
		      <tr>
				<td>${m.id}</td>
		        <td>${m.nome}</td>
		        <td>${m.valor}</td>
		        <td>${m.codigo}</td>
		        <td>${m.personal}</td>
		        <td>${m.spinning}</td>
		        <td><a href="/musculacao/${m.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>