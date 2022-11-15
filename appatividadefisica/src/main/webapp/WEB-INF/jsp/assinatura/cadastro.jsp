<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
  	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
  	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
	<title>Cadastramento de Assinatura</title>
</head>
<body>
	<%@include file="../includes/menu.jsp" %>

	<div class="container mt-3">

	<h2>Assinatura</h2>

	  <form action="/assinatura/incluir" method="post">
	    <div class="form-group">
	      <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com a descricao" name="descricao">
	    </div>

        <div class="form-group">
	      <label>Tipo:</label>
			<div class="form-check">
			  <input type="radio" class="form-check-input" name="web" value="true"> Web
			  <label class="form-check-label"></label>
			</div>
			<div class="form-check">
			  <input type="radio" class="form-check-input" name="web" value="false"> Loja
			  <label class="form-check-label"></label>
			</div>
	    </div>

	    <div class="form-group">
	      <label>Solicitante:</label>
	      <select name="solicitante" class="form-control">
	      	<c:forEach var="s" items="${solicitantes}">
	      		<option value="${s.id}">${s.nome}</option>
	      	</c:forEach>
	      </select>
	    </div>

	    <div class="form-group">
	      <label>Atividades:</label>
	      	<c:forEach var="a" items="${atividades}">
				<div class="form-check">
				  <input class="form-check-input" type="checkbox" name="atividades" value="${a.id}">
				  <label class="form-check-label"> ${a.nome}</label>
				</div>
			</c:forEach>
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
  
	</div>
</body>
</html>