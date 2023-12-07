import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicialSwing extends JFrame {

    public TelaInicialSwing() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");
        setLayout(new BorderLayout());

        // Barra de navegação
        JPanel navPanel = new JPanel();
        navPanel.setBackground(Color.BLUE);
        navPanel.setLayout(new FlowLayout());

        JButton menuButton = new JButton(new ImageIcon("path/to/botao-de-menu.png"));
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Adicione a lógica para ação do botão de menu aqui
                toggleMenu();
            }
        });
        navPanel.add(menuButton);

        JButton notificationButton = new JButton(new ImageIcon("path/to/notificacao.png"));
        notificationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Adicione a lógica para ação do botão de notificação aqui
                toggleMenu();
            }
        });
        navPanel.add(notificationButton);

        JLabel titleLabel = new JLabel("Seja Bem Vindo!");
        titleLabel.setForeground(Color.BLACK);
        navPanel.add(titleLabel);

        add(navPanel, BorderLayout.NORTH);

        // Conteúdo principal
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new FlowLayout());

        // Primeiro bloco de conteúdo
        JPanel block1 = new JPanel();
        block1.setLayout(new BoxLayout(block1, BoxLayout.Y_AXIS));
        block1.setBackground(Color.WHITE);

        JLabel importanceLabel = new JLabel("A Importancia da Vacinação");
        importanceLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        block1.add(importanceLabel);

        JTextArea importanceText = new JTextArea("A vacinação é essencial para prevenir doenças e proteger a saúde individual e coletiva. "
                + "Ao receber vacinas, fortalecemos nosso sistema imunológico, tornando-nos mais resistentes a infecções. Além disso, "
                + "a vacinação desempenha um papel crucial na criação da imunidade de rebanho, protegendo aqueles que não podem ser vacinados, "
                + "como bebês e pessoas com certas condições médicas. Contribuir para programas de imunização não é apenas um ato de autocuidado, "
                + "mas também um gesto solidário para construir comunidades mais saudáveis.");
        importanceText.setLineWrap(true);
        importanceText.setWrapStyleWord(true);
        importanceText.setEditable(false);
        block1.add(importanceText);

        contentPanel.add(block1);

        // Segundo bloco de conteúdo
        JPanel block2 = new JPanel();
        block2.setLayout(new BoxLayout(block2, BoxLayout.Y_AXIS));
        block2.setBackground(Color.WHITE);

        JLabel transformationLabel = new JLabel("A Transformação pela Vacinação");
        transformationLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        block2.add(transformationLabel);

        JTextArea transformationText = new JTextArea("A vacinação é uma ferramenta transformadora na promoção da saúde global. Ao longo dos anos, "
                + "as vacinas têm sido responsáveis por controlar epidemias, reduzir a incidência de doenças graves e melhorar a qualidade de vida. "
                + "Além de proteger indivíduos, a vacinação é um instrumento poderoso para fortalecer a resiliência das comunidades. A rápida implementação "
                + "de programas de imunização também se revela crucial em cenários de pandemia, destacando o papel fundamental das vacinas na segurança e "
                + "no progresso socioeconômico.");
        transformationText.setLineWrap(true);
        transformationText.setWrapStyleWord(true);
        transformationText.setEditable(false);
        block2.add(transformationText);

        contentPanel.add(block2);

        add(contentPanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void toggleMenu() {
        // Adicione a lógica para ação do botão de menu ou notificação aqui
        System.out.println("Botão pressionado!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaInicialSwing());
    }
}
