import javax.swing.*;
import java.awt.*;

public class HistoricoVacina extends JFrame {

    private JLabel dataVacinacaoRecenteLabel;

    public HistoricoVacina() {
        setTitle("Histórico");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.BLUE);

        // Componentes
        JLabel titleLabel = new JLabel("Histórico de Vacina");
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        titleLabel.setForeground(Color.WHITE);

        dataVacinacaoRecenteLabel = new JLabel("");
        dataVacinacaoRecenteLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        dataVacinacaoRecenteLabel.setForeground(Color.WHITE);

        JButton backButton = new JButton("Voltar");
        backButton.addActionListener(e -> {
            // Adicione a lógica para voltar à tela inicial aqui
            JOptionPane.showMessageDialog(this, "Implemente a lógica para voltar à tela inicial");
        });

        // Adicionando componentes ao contêiner
        add(titleLabel);
        add(dataVacinacaoRecenteLabel);
        add(backButton);

        pack();
        setLocationRelativeTo(null); // Centralizar a janela na tela
        setVisible(true);

        // Lógica de verificação de dados de vacinação
        verificarDadosVacinacao();
    }

    private void verificarDadosVacinacao() {
        // Verifica se há dados de vacinação armazenados no localStorage (simulado)
        String vacinacoes = localStorageSimulado("vacinacoes");

        // Adiciona a lógica para exibir os dados ou a mensagem correspondente
        if (vacinacoes != null && !vacinacoes.isEmpty()) {
            // Se houver vacinações, exibe a última data registrada (simulado)
            String ultimaVacinacao = JSON.parse(vacinacoes)[0]; // Supondo que a lista esteja ordenada pela data
            dataVacinacaoRecenteLabel.setText("Data da última vacinação registrada: " + ultimaVacinacao.dataAplicacao);
        } else {
            // Se não houver vacinações, exibe a mensagem
            dataVacinacaoRecenteLabel.setText("Sem vacinações recentes");
        }
    }

    // Simulação do localStorage
    private String localStorageSimulado(String key) {
        // Implemente a lógica de leitura do localStorage aqui (pode ser substituída por uma solução real)
        return null;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HistoricoVacina());
    }
}
