<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
  	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
  	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
	<title>Cadastramento de Natacao</title>
</head>
<body>
	<%@include file="../includes/menu.jsp" %>

	<div class="container mt-3">

	<h2>Natação</h2>
	  <form action="/natacao/incluir" method="post">
	    <div class="form-group">
	      <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com o nome" name="nome">
	    </div>
	    <div class="form-group">
	      <label>Valor:</label>
	      <input type="text" class="form-control" placeholder="Entre com o valor" name="valor">
	    </div>
	    <div class="form-group">
	      <label>Código:</label>
	      <input type="text" class="form-control" placeholder="Entre com o código" name="codigo">
	    </div>
	    <div class="form-group">
	      <label>Instrutor:</label>
	      <input type="text" class="form-control" placeholder="Entre com o nome do instrutor" name="instrutor">
	    </div>
	    <div class="form-group">
	      <label>Frequência:</label>
	      <input type="text" class="form-control" placeholder="Entre com a frequencia" name="frequencia">
	    </div>

        <div class="form-group">
			<div class="form-check">
			  <input type="checkbox" class="form-check-input" name="aquecimento" value="true">
			  <label class="form-check-label">Aquecimento:</label>
			</div>
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
  
	</div>
</body>
</html>