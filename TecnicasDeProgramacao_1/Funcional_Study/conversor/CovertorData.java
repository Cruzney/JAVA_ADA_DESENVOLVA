package conversor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class CovertorData {
    /* Dado que possuo um texto para representar a data no formato dd/MM/yy
    quero converter ele para o tipo LocalDate.
    Deve ser utilizado a inteface Function
     */
    public static void main(String[] args) {
        var interconvertibility = "14/03/25";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        Function<String, LocalDate> dataConvert = (dateAsString) -> LocalDate.parse(dateAsString, dateTimeFormatter);
        var date = dataConvert.apply(interconvertibility);
        System.out.println ("Data sem conversão: " + interconvertibility);
        System.out.println("Data convertida: " + date);
    }
}
