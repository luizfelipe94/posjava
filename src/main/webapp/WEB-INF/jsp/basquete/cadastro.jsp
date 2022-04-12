<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cadastro de Basquete</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
    <c:import url="../menu.jsp"/>
    <div class="container">
        <div class="row">
            <p class="h3">Cadastro de ingresso de basquete</p>
        </div>
        <div class="row">
            <form action="/basquete/incluir" method="post">
                <div class="mb-3 mt-3">
                    <label for="titulo" class="form-label">Titulo:</label>
                    <input type="text" class="form-control" id="titulo" placeholder="Digite o titulo" name="titulo">
                </div>
                <div class="mb-3 mt-3">
                    <label for="valor" class="form-label">Valor:</label>
                    <input type="text" class="form-control" id="valor" placeholder="Digite o valor" name="valor">
                </div>
<%--                <div class="mb-3 mt-3">--%>
<%--                    <label for="data" class="form-label">Data:</label>--%>
<%--                    <input type="datetime-local" class="form-control" id="data" placeholder="Escolha a data" name="data">--%>
<%--                </div>--%>
                <div class="mb-3 mt-3">
                    <label for="time1" class="form-label">Time 1:</label>
                    <input type="text" class="form-control" id="time1" placeholder="Digite o time 1" name="time1">
                </div>
                <div class="mb-3 mt-3">
                    <label for="time2" class="form-label">Time 2:</label>
                    <input type="text" class="form-control" id="time2" placeholder="Digite o time 2" name="time2">
                </div>
                <div class="mb-3 mt-3">
                    <label for="quadra" class="form-label">Quadra:</label>
                    <input type="text" class="form-control" id="quadra" placeholder="Digite o nome da quadra" name="quadra">
                </div>
                <button type="submit" class="btn btn-primary">Cadastrar</button>
            </form>
        </div>
    </div>
</body>
</html>