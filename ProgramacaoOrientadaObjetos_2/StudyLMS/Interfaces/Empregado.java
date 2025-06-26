import java.math.BigDecimal;

public class Empregado implements Comparable{
    private int matricula;

    public Empregado ( String joao , int i , BigDecimal bigDecimal ) {
    }

    @Override
    public int compareTo ( Object other ) {
        Empregado empregado = (Empregado) other;
        if (this.matricula < empregado.matricula) {
            return -1;
        }
        if (this.matricula > empregado.matricula) {
            return 1;
        }
        return 0;
    }
}
