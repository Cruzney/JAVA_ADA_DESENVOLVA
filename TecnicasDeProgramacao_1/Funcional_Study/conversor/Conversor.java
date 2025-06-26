package conversor;

import java.math.BigDecimal;
import java.util.function.Function;

public class Conversor {
    // Dado que possuo um bigDecimal, quero converter ele para String
    // Utilizar a interface Function


        public static void main(String[] args) {
            BigDecimal valorBigDecimal = new BigDecimal("12345.6789");

            // Usando a interface Function para converter BigDecimal em String
            Function<BigDecimal, String> conversor = BigDecimal::toString;

            // Aplicando a função ao BigDecimal
            String valorString = conversor.apply(valorBigDecimal);

            System.out.println("BigDecimal: " + valorBigDecimal);
            System.out.println("String: " + valorString);
        }
    }
