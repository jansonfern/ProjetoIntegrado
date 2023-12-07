document.getElementById("registroVacinaForm").addEventListener("submit", function(event) {
    event.preventDefault();

    // Captura dos dados do formulário
    var nomeVacina = document.getElementById("nomeVacina").value;
    var dataAplicacao = document.getElementById("dataAplicacao").value;
    var proximaAplicacao = document.getElementById("proximaAplicacao").value;

    var vacinacoes = JSON.parse(localStorage.getItem('vacinacoes')) || [];
    
    vacinacoes.unshift({ nomeVacina, dataAplicacao, proximaAplicacao });

    localStorage.setItem('vacinacoes', JSON.stringify(vacinacoes));

    var mensagemDiv = document.getElementById("mensagem");
    mensagemDiv.innerHTML = "Vacina registrada";

    document.getElementById("registroVacinaForm").reset();
});