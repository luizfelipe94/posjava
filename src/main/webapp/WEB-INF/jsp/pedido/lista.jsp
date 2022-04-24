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

<div class="container mt-3">
    <h2>Cadastramento de Pedidos</h2>
    <form action="/pedido" method="get">
        <button type="submit" class="btn btn-primary">Novo Pedido</button>
    </form>

    <c:if test="${not empty listagem}">
        <p>Listagem de pedidos (${listagem.size()}):</p>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>ID</th>
                <th>Descrição</th>
                <th>Data</th>
                <th>Ingressos</th>
                <th>Torcedor</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="o" items="${listagem}">
                <tr>
                    <td>${o.id}</td>
                    <td>${o.descricao}</td>
                    <td>${o.data}</td>
                    <td>${o.ingressos.size()}</td>
                    <td>${o.torcedor.nome}</td>
                    <td><a href="/pedido/${o.id}/excluir">excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>

    <c:if test="${empty listagem}">
        <p>Não existem registros cadastrados!!!</p>
    </c:if>
</div>
</body>
</html>