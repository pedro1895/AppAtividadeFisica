<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
	<title>Cadastramento de Natação</title>
</head>
<body>
    <%@include file="../includes/menu.jsp" %>

	<div class="container mt-3">
	  <h3>Natação: ${listagem.size()}</h3>

	  <h4><a href="/natacao">Nova Natação</a></h4>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nome</th>
	        <th>Valor</th>
	        <th>Código</th>
	        <th>Instrutor</th>
	        <th>Frequência</th>
	        <th>Aquecimento</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="n" items="${listagem}">
		      <tr>
				<td>${n.id}</td>
		        <td>${n.nome}</td>
		        <td>${n.valor}</td>
		        <td>${n.codigo}</td>
		        <td>${n.instrutor}</td>
		        <td>${n.frequencia}</td>
		        <td>${n.aquecimento}</td>
		        <td><a href="/natacao/${n.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>