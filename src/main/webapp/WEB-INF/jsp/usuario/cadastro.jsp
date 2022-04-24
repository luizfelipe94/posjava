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
        <p class="h3">Cadastro de Usuario</p>
    </div>
    <div class="row">
        <form action="/usuario/incluir" method="post">
            <div class="mb-3 mt-3">
                <label for="nome" class="form-label">Nome:</label>
                <input type="text" class="form-control" id="nome" placeholder="Digite o nome" name="nome">
            </div>
            <div class="mb-3 mt-3">
                <label for="email" class="form-label">Email:</label>
                <input type="email" class="form-control" id="email" placeholder="Digite o email" name="email">
            </div>
            <div class="mb-3 mt-3">
                <label for="senha" class="form-label">Senha:</label>
                <input type="password" class="form-control" id="senha" placeholder="Digite a senha" name="senha">
            </div>
            <button type="submit" class="btn btn-primary">Cadastrar</button>
        </form>
    </div>
</div>
</body>
</html>