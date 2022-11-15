	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
	  <div class="container-fluid">
	    <ul class="navbar-nav">
	      <li class="nav-item"><a class="nav-link" href="#">Home</a></li>
	      <c:if test="${not empty user}">
              <li class="nav-item">
                <a class="nav-link" href="/usuario/lista">Usuário</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="/assinatura/lista">Assinatura</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="/solicitante/lista">Solicitante</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="/atividadefisica/lista">Atividade Fisica</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="/artesmarciais/lista">Artes Marciais</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="/natacao/lista">Natação</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="/musculacao/lista">Musculação</a>
              </li>
          </c:if>
	    </ul>
        <ul class="nav navbar-nav navbar-right">
          <c:if test="${empty user}">
              <li class="nav-item"><a class="nav-link" href="/usuario">Sign Up</a></li>
              <li class="nav-item"><a class="nav-link" href="/login">Login</a></li>
          </c:if>

          <c:if test="${not empty user}">
              <li class="nav-item"><a class="nav-link" href="/logout">Logout ${user.nome}</a></li>
          </c:if>
        </ul>
	  </div>
	</nav>