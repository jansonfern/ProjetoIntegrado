import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeuPerfil extends JFrame {

    private JTextField nomeField;
    private JTextField emailField;
    private JTextField dataNascimentoField;
    private JTextField senhaField;

    public MeuPerfil() {
        setTitle("Meu Perfil");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.BLUE);

        // Componentes
        JButton menuButton = createButton("./img/botao-de-menu.png", "Toggle Menu");
        JButton voltarButton = createButton("./img/volte.png", "Voltar");

        JLabel titleLabel = new JLabel("Perfil");
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        titleLabel.setForeground(Color.WHITE);

        JLabel infoLabel = new JLabel("Informações Pessoais");
        infoLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        infoLabel.setForeground(Color.WHITE);

        // Campos de texto
        nomeField = createTextField("Seu Nome");
        emailField = createTextField("Seu Email");
        dataNascimentoField = new JTextField(10);
        senhaField = createTextField("Sua Senha");

        // Botões
        JButton atualizarNomeButton = createButton("Atualizar Nome");
        JButton atualizarEmailButton = createButton("Atualizar Email");
        JButton atualizarDataNascimentoButton = createButton("Atualizar Data de Nascimento");
        JButton atualizarSenhaButton = createButton("Atualizar Senha");

        // Adicionando componentes ao contêiner
        add(menuButton);
        add(voltarButton);
        add(titleLabel);
        add(infoLabel);
        add(createLabel("Nome"));
        add(nomeField);
        add(atualizarNomeButton);
        add(createLabel("Email"));
        add(emailField);
        add(atualizarEmailButton);
        add(createLabel("Data de Nascimento"));
        add(dataNascimentoField);
        add(atualizarDataNascimentoButton);
        add(createLabel("Senha"));
        add(senhaField);
        add(atualizarSenhaButton);

        pack();
        setLocationRelativeTo(null); // Centralizar a janela na tela
        setVisible(true);
    }

    private JButton createButton(String imagePath, String tooltip) {
        ImageIcon icon = new ImageIcon(imagePath);
        JButton button = new JButton(icon);
        button.setPreferredSize(new Dimension(30, 30));
        button.setToolTipText(tooltip);
        button.setBackground(new Color(255, 255, 255)); // Cor branca
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Adicione a lógica para lidar com o clique no botão aqui
                JOptionPane.showMessageDialog(null, "Implemente a lógica para o botão: " + tooltip);
            }
        });
        return button;
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(200, 30));
        button.setBackground(new Color(255, 255, 255)); // Cor branca
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Adicione a lógica para lidar com o clique no botão aqui
                JOptionPane.showMessageDialog(null, "Implemente a lógica para o botão: " + text);
            }
        });
        return button;
    }

    private JTextField createTextField(String placeholder) {
        JTextField textField = new JTextField(20);
        textField.setToolTipText(placeholder);
        textField.setBackground(new Color(255, 255, 255)); // Cor branca
        return textField;
    }

    private JLabel createLabel(String text) {
        JLabel label = new JLabel(text);
        label.setForeground(Color.WHITE);
        return label;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MeuPerfil());
    }
}
