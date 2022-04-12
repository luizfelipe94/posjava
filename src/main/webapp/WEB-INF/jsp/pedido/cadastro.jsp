<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cadastro de Pedido</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<c:import url="../menu.jsp"/>
<div class="container">
    <div class="row">
        <p class="h3">Cadastro de ingresso de pedido</p>
    </div>
    <div class="row">
        <form action="/pedido/incluir" method="post">
            <div class="mb-3 mt-3">
                <label for="titulo" class="form-label">Titulo:</label>
                <input type="text" class="form-control" id="titulo" placeholder="Digite o titulo" name="titulo">
            </div>
            <button type="submit" class="btn btn-primary">Cadastrar</button>
        </form>
    </div>
</div>
</body>
</html>