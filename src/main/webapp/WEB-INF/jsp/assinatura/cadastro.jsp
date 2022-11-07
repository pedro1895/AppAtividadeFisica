<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Assinatura</title>
</head>
<body>
	<%@include file="../includes/menu.jsp" %>

	<div class="container mt-3">

		        <td>${a.descricao}</td>
		        <td>${a.data}</td>
		        <td>${a.web}</td>
		        <td>${a.solicitante.nome}</td>
		        <td>${a.atividades.size()}</td>

	<h2>Natação</h2>

	  <form action="/assinatura/incluir" method="post">
	    <div class="form-group">
	      <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com a descricao" name="descricao">
	    </div>

	    <div class="form-group">
	      <label>WEB:</label>
	      <input type="radio" class="form-control" placeholder="Informe se o cadastro é pela WEB" name="web">
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
  
	</div>
</body>
</html>