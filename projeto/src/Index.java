import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicial extends JFrame {

    public TelaInicial() {
        setTitle("Tela Inicial");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        getContentPane().setBackground(Color.BLUE);

        // Componentes
        JLabel welcomeLabel = new JLabel("Bem-vindo");
        welcomeLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        welcomeLabel.setForeground(Color.WHITE);

        JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.setPreferredSize(new Dimension(200, 40));
        cadastrarButton.setBackground(new Color(76, 175, 80)); // Cor verde
        cadastrarButton.setForeground(Color.WHITE);
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Adicione a lógica para ir para a tela de cadastro aqui
                JOptionPane.showMessageDialog(null, "Implemente a lógica para ir para a tela de cadastro");
            }
        });

        JButton loginButton = new JButton("Login");
        loginButton.setPreferredSize(new Dimension(200, 40));
        loginButton.setBackground(new Color(76, 175, 80)); // Cor verde
        loginButton.setForeground(Color.WHITE);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Adicione a lógica para ir para a tela de login aqui
                JOptionPane.showMessageDialog(null, "Implemente a lógica para ir para a tela de login");
            }
        });

        // Adicionando componentes ao contêiner
        add(Box.createVerticalGlue()); // Espaço vertical no topo
        add(welcomeLabel);
        add(Box.createRigidArea(new Dimension(0, 20))); // Espaço vertical
        add(cadastrarButton);
        add(Box.createRigidArea(new Dimension(0, 20))); // Espaço vertical
        add(loginButton);
        add(Box.createVerticalGlue()); // Espaço vertical na parte inferior

        pack();
        setLocationRelativeTo(null); // Centralizar a janela na tela
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaInicial());
    }
}
