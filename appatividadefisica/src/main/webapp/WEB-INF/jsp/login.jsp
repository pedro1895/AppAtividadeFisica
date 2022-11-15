<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>App Atividades Físicas</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
  	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

    <%@include file="includes/menu.jsp" %>

    <div class="container mt-3">
        <h2>Autentica&ccedil;&atilde;o</h2>
        <form action="/login" method="post">
            <div class="form-group">
                <label>E-mail:</label>
                <input type="email" class="form-control" placeholder="Entre com o seu e-mail" name="email">
            </div>
            <div class="form-group">
                <label>Senha:</label>
                <input type="password" class="form-control" placeholder="Entre com a sua senha" name="senha">
            </div>
            <button type="submit" class="btn btn-default">Acessar</button>
        </form>

    </div>
</body>
</html>
