<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
  	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
  	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
	<title>Cadastramento de Usuários</title>
</head>
<body>
	<%@include file="../includes/menu.jsp" %>

	<div class="container mt-3">
	  <h3>Usuário: ${listagem.size()}</h3>

	  <h4><a href="/usuario">Novo Usuário</a></h4>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nome</th>
	        <th>E-mail</th>
	        <th>Senha</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="u" items="${listagem}">
		      <tr>
				<td>${u.id}</td>
		        <td>${u.nome}</td>
		        <td>${u.email}</td>
		        <td>${u.senha}</td>
		        <td><a href="/usuario/${u.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>