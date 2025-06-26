//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class OpracaoNumeros {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome! Let's pratices JAVA ;-) \n");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        // Criar duas variaveis, atribua números inteiro para cada uma e imprima a saída para cada uma das operações aritiméticas entre as variáveis

        //java.util.Scanner entrada = new java.util.Scanner(System.in); // desta fomra se não utilizar o import
        Scanner entrada = new Scanner(System.in);

        int a , b ;
        System.out.println("Informe o 1º Número;");
        a = entrada.nextInt();
        System.out.println("Informe o 2º Número;");
        b = entrada.nextInt();

        System.out.println (); // quebra linha

        soma(a,b);
        subi(a,b);
        multi(a,b);
        divi(a,b);
        diviResto(a,b);

        entrada.nextInt();
    }

    private static void soma(int a, int b) {
        int soma = a + b;
        System.out.printf("Soma: %d + %d = %d\n", a, b, soma);
    }
    private static void subi(int a, int b) {
        var subtracao = a - b;
        System.out.printf("Subitração: %d - %d = %d\n", a, b, subtracao);
    }
    private static void multi(int a, int b){
        var multiplicacao = a * b;
        System.out.printf("Multi: %d * %d = %d\n", a, b, multiplicacao);
    }
    private static void divi(int a, int b){
        double divisao = (double) a/b; //cast
        System.out.printf("Divisão: %d / %d = %f\n", a, b, divisao);
    }
    private static void diviResto(int a, int b){
        var mod = (double) a%b; //cast
        System.out.printf("Resto Div: %d %% %d = %f\n", a, b, mod);
    }

    // ARITIMETICOS
    // + Soma
    // - Subitração
    // * Multiplicação
    // / Divisão
    // % Resto da divisão (Mod)

    //TABELA VERDADE (E AND)
    //V && V -> V
    //V && F -> F
    //F && V -> F
    //F && F -> F
    //TABELA VERDADE (OU OR)
    //V || V -> V
    //V || F -> V
    //F || V -> V
    //F || F -> F

    // ATRIBUIÇÃO
    //  = += -= *= /=

    // UNÀRIOS
    // ++ --

}


