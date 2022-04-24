<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>AppPedido</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<c:import url="../menu.jsp"/>
    <div class="container">
        <div class="row">
            <p class="h3">Cadastro de ingresso de volei</p>
        </div>
        <div class="row">
            <form action="/volei/cadastro" method="get">
                <button type="submit" class="btn btn-primary">Cadastrar</button>
            </form>
        </div>
        <div class="row">

            <c:if test="${not empty listagem}">
                <p>Listagem de ingressos de volei (${listagem.size()})</p>
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>Titulo</th>
                        <th>Valor</th>
                        <th>Data</th>
                        <th>Time 1</th>
                        <th>Time 2</th>
                        <th>Quadra</th>
                        <th>Acoes</th>
                    </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="o" items="${listagem}">
                            <tr>
                                <td>${o.id}</td>
                                <td>${o.titulo}</td>
                                <td>${o.valor}</td>
                                <td>${o.data}</td>
                                <td>${o.time1}</td>
                                <td>${o.time2}</td>
                                <td>${o.quadra}</td>
                                <td><a href="/volei/${o.id}/excluir">excluir</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </c:if>

            <c:if test="${empty listagem}">
                <p>Não existem registros cadastrados!!!</p>
            </c:if>

        </div>
    </div>
</body>
</html>