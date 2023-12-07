     // Simulação de dados de usuários
    const users = [];

    class Usuario {
        constructor(nome, email, data, senha, confirmarSenha) {
            this.nome = nome;
            this.email = email;
            this.data = data;
            this.senha = senha;
            this.confirmarSenha = confirmarSenha;
        }
    }

    function limparErros() {
        // Limpar mensagens de erro
        document.getElementById('emailError').innerText = '';
        document.getElementById('passwordError').innerText = '';
    }

    function cadastrarUsuario() {
        limparErros();

        const userName = document.getElementById('userName').value.trim();
        const userEmail = document.getElementById('userEmail').value.trim();
        const userDataNasc = document.getElementById('userData').value;
        const userPassword = document.getElementById('userPassword').value;
        const userConfirmarPassword = document.getElementById('userConfirmarPassword').value;

        // Validações de senha e email podem ser adicionadas aqui se necessário

        // Simulação: adicionar usuário à lista
        users.push({ nome: userName, email: userEmail, senha: userPassword });

        // Simulação: armazenar usuários localmente
        localStorage.setItem('registeredUsers', JSON.stringify(users));

        // Exibir mensagem de sucesso
        document.getElementById('output').innerHTML = `
            <p class="success-message">Usuário cadastrado com sucesso!</p>
        `;

        // Redirecionar para login.html após 3 segundos
        setTimeout(function () {
            window.location.href = 'login.html';
        }, 3000);
    }
