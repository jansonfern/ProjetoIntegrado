<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro de Vacinação</title>
</head>
<body>
    <h1>Registro de Vacinação</h1>

    <form action="${pageContext.request.contextPath}/registroVacina" method="post">
        <label for="nomeVacina">Nome da Vacina:</label>
        <input type="text" id="nomeVacina" name="nomeVacina" required>

        <label for="dataAplicacao">Data de Aplicação:</label>
        <input type="date" id="dataAplicacao" name="dataAplicacao" required>

        <label for="proximaAplicacao">Próxima Aplicação:</label>
        <input type="date" id="proximaAplicacao" name="proximaAplicacao" required>

        <button type="submit">Registrar Vacina</button>
    </form>

    <div>${mensagem}</div>
</body>
</html>
