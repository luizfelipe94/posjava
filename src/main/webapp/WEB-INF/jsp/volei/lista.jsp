<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cadastro de Basquete</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <div class="row">
            <p class="h3">Cadastro de ingresso de basquete</p>
        </div>
        <div class="row">
            <form action="/basquete/cadastro" method="get">
                <button type="submit" class="btn btn-primary">Cadastrar</button>
            </form>
        </div>
        <div class="row">

            <c:if test="${not empty listagem}">
                <p>Listagem de ingressos de basquete (${listagem.size()})</p>
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
                                <td><a href="/futebol/${o.id}/excluir">excluir</a></td>
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