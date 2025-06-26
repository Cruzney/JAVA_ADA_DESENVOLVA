import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
//        if (args.length == 0) {
//            System.out.println("Nenhum argumento informado!");
//            return;
//        }
//        if (args.length == 1) {
//            System.out.println("Informe apenas um argumento!");
//            System.out.printf("Heloo, %s", args[0]);
//        }else {
//        int numero = Integer.parseInt ( args[0] );
//        System.out.printf("voce informou o número %d", numero);
//        }
        Scanner sc = new Scanner (System.in);
        System.out.println("Informe o peso da primeira pessoa em kg");
        double peso1 = sc.nextDouble();
        System.out.println("Informe o peso da segunda pessoa em kg");
        double peso2 = sc.nextDouble();

        final float FATOR_CONVERSAO_KG_LB = 2.20462f;
        System.out.printf("O peso da primeira pessoa em libras é %flb.%n", (peso1 * FATOR_CONVERSAO_KG_LB));
        System.out.printf("O peso da segunda pessoa em libras é %flb.%n", (peso2 * FATOR_CONVERSAO_KG_LB));
    }
}
