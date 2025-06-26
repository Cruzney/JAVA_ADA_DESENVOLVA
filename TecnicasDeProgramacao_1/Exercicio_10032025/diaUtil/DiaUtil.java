package diaUtil;

public class DiaUtil {
    import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

    public class VencimentoUtil {

        public static LocalDate ajustarVencimento(LocalDate dataVencimento, List<LocalDate> feriados) {
            LocalDate dataAjustada = dataVencimento;
            while (dataAjustada.getDayOfWeek() == DayOfWeek.SATURDAY ||
                    dataAjustada.getDayOfWeek() == DayOfWeek.SUNDAY ||
                    feriados.contains(dataAjustada)) {
                dataAjustada = dataAjustada.plusDays(1);
            }
            return dataAjustada;
        }

        public static void main(String[] args) {
            LocalDate dataVencimento = LocalDate.of(2023, 11, 4); // Sábado
            List<LocalDate> feriados = Arrays.asList(LocalDate.of(2023, 11, 15)); // Feriado

            LocalDate dataVencimentoAjustada = ajustarVencimento(dataVencimento, feriados);
            System.out.println("Data de vencimento original: " + dataVencimento);
            System.out.println("Data de vencimento ajustada: " + dataVencimentoAjustada); // 2023-11-06
        }
    }
}
