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
        <p class="h3">Cadastro de Pedido</p>
    </div>
    <div class="row">
        <form action="/pedido/incluir" method="post">

            <div class="mb-3 mt-3">
                <label class="form-label">Descrição:</label>
                <input type="text" class="form-control" placeholder="Digite a descrição" name="descricao">
            </div>

            <div class="mb-3 mt-3">
                <label>Torcedor:</label>
                <select name="solicitante.id" class="form-control">
                    <c:forEach var="s" items="${torcedores}">
                        <option value="${s.id}">${s.nome}</option>
                    </c:forEach>
                </select>
            </div>

            <div class="mb-3 mt-3">
                <label>Ingressos:</label>
                <div class="checkbox">
                    <c:forEach var="i" items="${ingressos}">
                        <label><input type="checkbox" value="${i.id}" name="idsIngressos" checked> ${i.titulo}</label>
                    </c:forEach>
                </div>
            </div>

            <button type="submit" class="btn btn-primary">Cadastrar</button>
        </form>
    </div>
</div>
</body>
</html>