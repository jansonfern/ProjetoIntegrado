function login() {
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

    // Your login logic here
    if (username === 'admin' && password === 'admin') {
        alert('Sucesso');
        window.location.href = 'TelaInicial.html';
    } else {
        alert('Login ou senha incorretos');
    }
}

function esqueceuSenha() {
    var email = prompt('Digite seu e-mail para recuperar a senha:');

    var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (email && emailRegex.test(email)) {
        alert('Um e-mail de recuperação foi enviado para: ' + email);
    } else {
        alert('E-mail inválido. Tente novamente.');
    }
}