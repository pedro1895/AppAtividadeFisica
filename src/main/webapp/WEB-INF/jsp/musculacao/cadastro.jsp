<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Musculação</title>
</head>
<body>
	<%@include file="../includes/menu.jsp" %>

	<div class="container mt-3">

	<h2>Musculação</h2>
	  <form action="/musculacao/incluir" method="post">
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
	      <label>Personal:</label>
	      <input type="text" class="form-control" placeholder="Entre com o nome do personal" name="personal">
	    </div>
	    <div class="form-group">
	      <label>Spinning:</label>
	      <input type="radio" class="form-control" placeholder="Informe se terá spinning" name="spinning">
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
  
	</div>
</body>
</html>