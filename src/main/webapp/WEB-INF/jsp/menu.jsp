<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">GestaodeIngressos</a>
        </div>
        <c:if test="${not empty usuarioLogado}">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="/torcedor/listar">Torcedor</a></li>
                <li><a href="/pedido/listar">Pedido</a></li>
                <li><a href="/futebol/listar">Futebol</a></li>
                <li><a href="/volei/listar">Volei</a></li>
                <li><a href="/basquete/listar">Basquete</a></li>
            </ul>
        </c:if>
        <ul class="nav navbar-nav navbar-right">
            <c:if test="${empty usuarioLogado}">
                <li><a href="/usuario"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
            </c:if>
            <c:if test="${not empty usuarioLogado}">
                <li><a href="/logout"><span class="glyphicon glyphicon-log-in"></span> Logout, ${usuarioLogado.nome}</a></li>
            </c:if>
        </ul>
    </div>
</nav>