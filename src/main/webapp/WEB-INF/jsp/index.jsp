<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Gestao de Ingressos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    </head>
    <body>

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

        <div class="container">
            <h3>App Gestão de Ingressos</h3>
            <p>Olá, ${usuarioLogado.nome}</p>
        </div>

    </body>
</html>