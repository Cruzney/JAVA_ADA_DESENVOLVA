import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 101 ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }

        }

        IntStream.range(1, 101)
                .filter(numero -> numero % 2 == 0)
                .mapToObj(numero -> "O número é " + numero)
                .forEach(System.out::println);
    }
}
