<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
	<title>Cadastramento de Assinaturas</title>
</head>
<body>
    <%@include file="../includes/menu.jsp" %>

	<div class="container mt-3">
	  <h3>Assinaturas: ${listagem.size()}</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Descrição</th>
	        <th>Data</th>
	        <th>Web</th>
	        <th>Solicitantes</th>
	        <th>Atividades</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="a" items="${listagem}">
		      <tr>
				<td>${a.id}</td>
		        <td>${a.descricao}</td>
		        <td>${a.data}</td>
		        <td>${a.web}</td>
		        <td>${a.solicitante.nome}</td>
		        <td>${a.atividades.size()}</td>
		        <td><a href="/assinatura/${a.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>