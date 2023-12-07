import java.text.SimpleDateFormat;
import java.util.Date;

public class Vacinacao {
    private String nomeVacina;
    private Date dataAplicacao;
    private Date proximaAplicacao;

    public Vacinacao(String nomeVacina, String dataAplicacao, String proximaAplicacao) {
        this.nomeVacina = nomeVacina;
        this.dataAplicacao = parseDate(dataAplicacao);
        this.proximaAplicacao = parseDate(proximaAplicacao);
    }

    private Date parseDate(String dateStr) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
        } catch (Exception e) {
            return null;
        }
    }

    // getters
}
