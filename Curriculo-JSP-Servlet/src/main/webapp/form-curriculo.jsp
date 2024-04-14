<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulário</title>
    <link rel="stylesheet" href="resources/form.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">
</head>
<body>

<h1 class="py-3 text-center">Cadastro de Currículo</h1>
<div class="container bg-light py-3 my-3">
    <form action="/curriculo" class="col-8" method="post">

        <div class="mb-3">
            <label for="nome" class="form-label">Nome:</label>
            <input type="text" class="form-control" id="nome" name="nome" required>
        </div>

        <div class="mb-3">
            <label for="paragrafo" class="form-label">Destaque:</label>
            <textarea class="form-control" id="paragrafo" name="paragrafo" rows="4" required></textarea>
        </div>
        <div class="mb-3">
            <label for="sobre" class="form-label">Sobre:</label>
            <textarea class="form-control" id="sobre" name="sobre" rows="4" required></textarea>
        </div>
        <div class="mb-3">
            <label for="formacoes" class="form-label">Formações:</label>
            <textarea class="form-control" id="formacoes" name="formacoes" rows="4" required></textarea>
        </div>
        <div class="mb-3">
                    <label for="experiencia" class="form-label">Experiências:</label>
                    <textarea class="form-control" id="experiencia" name="experiencia" rows="4" required></textarea>
                </div>
        <div class="py-3">
            <button type="submit" class="btn btn-primary">Salvar</button>
        </div>
    </form>
</div>
</body>
</html>
