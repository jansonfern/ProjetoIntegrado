import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroUsuario extends JFrame {

    private JTextField userNameField;
    private JTextField userEmailField;
    private JTextField userDataField;
    private JPasswordField userPasswordField;
    private JPasswordField userConfirmarPasswordField;

    public CadastroUsuario() {
        setTitle("Cadastro de Usuário");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Componentes
        JLabel nameLabel = new JLabel("Nome:");
        userNameField = new JTextField(20);

        JLabel emailLabel = new JLabel("E-mail:");
        userEmailField = new JTextField(20);

        JLabel dataLabel = new JLabel("Data de Nascimento:");
        userDataField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Senha:");
        userPasswordField = new JPasswordField(20);

        JLabel confirmPasswordLabel = new JLabel("Confirmar Senha:");
        userConfirmarPasswordField = new JPasswordField(20);

        JButton cadastrarButton = new JButton("Cadastrar");

        // Adicionando componentes ao contêiner
        add(nameLabel);
        add(userNameField);

        add(emailLabel);
        add(userEmailField);

        add(dataLabel);
        add(userDataField);

        add(passwordLabel);
        add(userPasswordField);

        add(confirmPasswordLabel);
        add(userConfirmarPasswordField);

        add(cadastrarButton);

        // Adicionando evento de clique ao botão
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarUsuario();
            }
        });

        pack();
        setLocationRelativeTo(null); // Centralizar a janela na tela
        setVisible(true);
    }

    private void cadastrarUsuario() {
        // Implementar lógica de cadastro de usuário aqui
        String userName = userNameField.getText().trim();
        String userEmail = userEmailField.getText().trim();
        String userData = userDataField.getText();
        String userPassword = new String(userPasswordField.getPassword());
        String userConfirmarPassword = new String(userConfirmarPasswordField.getPassword());

        // Validações de senha e email podem ser adicionadas aqui se necessário

        // Simulação: exibir mensagem de sucesso
        JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!");

        // Redirecionar para a próxima tela ou executar a lógica necessária após o cadastro
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroUsuario();
            }
        });
    }
}
