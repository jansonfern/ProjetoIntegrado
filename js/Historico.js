
    // Verifica se há dados de vacinação armazenados no localStorage
    var vacinacoes = localStorage.getItem('vacinacoes');

    // Adiciona a lógica para exibir os dados ou a mensagem correspondente
    var dataVacinacaoRecente = document.getElementById("data-vacinacao-recente");
    if (vacinacoes) {
        // Se houver vacinações, exibe a última data registrada
        var ultimaVacinacao = JSON.parse(vacinacoes)[0]; // Supondo que a lista esteja ordenada pela data
        dataVacinacaoRecente.innerText = 'Data da última vacinação registrada: ' + ultimaVacinacao.dataAplicacao;
    } else {
        // Se não houver vacinações, exibe a mensagem
        dataVacinacaoRecente.innerText = 'Sem vacinações recentes';
    }
