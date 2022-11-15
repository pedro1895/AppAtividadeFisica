<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
	<title>Cadastramento de Artes Marciais</title>
</head>
<body>
    <%@include file="../includes/menu.jsp" %>

	<div class="container mt-3">
	  <h3>Artes Marciais: ${listagem.size()}</h3>

	  <h4><a href="/artesmarciais">Nova Arte Marcial</a></h4>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nome</th>
	        <th>Valor</th>
	        <th>Código</th>
	        <th>Professor</th>
	        <th>Turma</th>
	        <th>Equipamento</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="a" items="${listagem}">
		      <tr>
				<td>${a.id}</td>
		        <td>${a.nome}</td>
		        <td>${a.valor}</td>
		        <td>${a.codigo}</td>
		        <td>${a.professor}</td>
		        <td>${a.turma}</td>
		        <td>${a.equipamento}</td>
		        <td><a href="/artesmarciais/${a.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>