import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registroVacina")
public class RegistroVacinaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private final List<Vacinacao> vacinacoes = new ArrayList<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("registroVacina.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nomeVacina = request.getParameter("nomeVacina");
        String dataAplicacao = request.getParameter("dataAplicacao");
        String proximaAplicacao = request.getParameter("proximaAplicacao");

        Vacinacao vacinacao = new Vacinacao(nomeVacina, dataAplicacao, proximaAplicacao);
        vacinacoes.add(vacinacao);

        request.setAttribute("mensagem", "Vacina registrada com sucesso!");
        request.getRequestDispatcher("registroVacina.jsp").forward(request, response);
    }
}
