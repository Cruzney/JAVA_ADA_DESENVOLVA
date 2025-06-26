import java.util.Scanner;

public class Condicional {
    public static void main ( String[] args ) {
        // While, repitir ate determinada condição
        Scanner entrada = new Scanner(System.in);
        String senha = "Meli123@#";
        int contador = 0;
        boolean senhaCorreta = false;
        // laço de repetição infinito
        while (!senhaCorreta){
            System.out.println("Digite sua senha");
            String senhaDigitada = entrada.nextLine();
            if(senhaDigitada.equals(senha)){
                System.out.println("Login efetuado com sucesso.");
                senhaCorreta = true;
//                break;
            }else if(contador < 3){
                contador++;
            }else {
                System.out.printf("Conta Bloqueada, mais de %d tentativas incorretas!\n", contador);
                break;
            }
            System.out.printf("Senha inválida, %d° Tentativa\n", contador);

        }
        entrada.close();






//        int cont = 0;
//        while(cont < 10){
//            System.out.println("Passagem..." + cont);
//            cont++;
//
//        }


//        double valorCompra = 500;
//        double ValorMinimoCompra = 300;
//        boolean cupom = true;
//        boolean clienteVip = true;
//
//        if(cleinetVip || ValorCompra >= valorMinimoCompra && cupom){
//            System.out.println ( "Cupom validado com sucesso" );
//            valorCompra -= 10.00;
//        } else {
//
//        }
//
//        System.out.println("Valor de Compra" + valorCompra);



//        int horarioParque = 9;
//        int horarioCafe = 11;
//        System.out.println ( "Qual horario que acordei? :" );
//        Scanner scanner = new Scanner ( System.in );
//        int horaQueAcordei = scanner.nextInt ();
//
//        if ( horaQueAcordei <= horarioCafe ) {
//            System.out.println ( "Vou ao Parque!!" );
//        } else if (horaQueAcordei <= horarioCafe ){
//            System.out.println ( "Toamr café e comer pao de queijo :-) " );
//        } else {
//            System.out.println ( "Almoçar:-) " );
//        }
//
//        scanner.close ( );
    }
}
