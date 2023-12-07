function atualizarNome() {
    var nome = document.getElementById('nome').value;
    alert('Nome atualizado para: ' + nome);
}

function atualizarEmail() {
    var email = document.getElementById('email').value;

    var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(email)) {
        alert('Por favor, insira um e-mail válido.');
        return;
    }

    alert('Email atualizado para: ' + email);
}

function atualizarDataNascimento() {
    var dataNascimento = document.getElementById('dataNascimento').value;
    alert('Data de Nascimento atualizada para: ' + dataNascimento);
}