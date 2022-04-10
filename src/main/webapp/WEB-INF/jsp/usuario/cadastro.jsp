<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cadastro de Usuario</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
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
            <div class="mb-3 mt-3">
                <label for="time2" class="form-label">Time 2:</label>
                <input type="text" class="form-control" id="time2" placeholder="Digite o time 2" name="time2">
            </div>
            <div class="mb-3 mt-3">
                <label for="quadra" class="form-label">Quadra:</label>
                <input type="text" class="form-control" id="quadra" placeholder="Digite o nome do quadra" name="quadra">
            </div>
            <button type="submit" class="btn btn-primary">Cadastrar</button>
        </form>
    </div>
</div>
</body>
</html>