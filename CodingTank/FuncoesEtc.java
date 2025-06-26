import java.util.Scanner;

public class FuncoesEtc {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Qual seu nome? : " );
        String meuNome = sc.nextLine ( );
        saudacao ( meuNome );

        System.out.println ( "Informe o primeiro numero: " );
        int num01 = sc.nextInt ( );
        System.out.println ( "Informe o Segundo numero: " );
        int num02 = sc.nextInt ();

        int resultado = soma(num01, num02);
        System.out.printf ( " O valor da Soma entre %d e %d é = %d:" , num01, num02, resultado );
    }
    static void saudacao(String nome) {
        String saudacao = "Bem Vindo (a) , ".concat(nome).concat("!");
        System.out.println(saudacao);
    }

    static int soma(int x, int y) {
        return x + y;
    }

}
