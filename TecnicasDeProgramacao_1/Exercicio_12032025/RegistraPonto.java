public class RegistraPonto {
    private int horaInicial;
    private int horaFinal;
    private int minutosInicial;
    private int minutosFinal;

   public Integer StarDay(int horaInicial, int minutosInicial) {
        this.horaInicial = horaInicial;
        this.minutosInicial = minutosInicial;
       return horaInicial;
   }

    public Integer EndDay(int horaFinal, int minutosFinal) {
        this.horaFinal = horaFinal;
        this.minutosFinal = minutosFinal;
        return horaFinal;
    }

    public int getHoraInicial() {
        return this.horaInicial;
    }

    public int getHoraFinal() {
        return this.horaFinal;
    }

    public int getMinutosInicial() {
        return this.minutosInicial;
    }

    public int getMinutosFinal() {
        return this.minutosFinal;
    }

    public int getHorasTrabalhadas() {
        return this.horaFinal - this.horaInicial;
    }

    public int getMinutosTrabalhados() {
        return this.minutosFinal - this.minutosInicial;
    }
}
