import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        /*
        String [] produtos = new String[10];
        produtos[0] = "smartphone".toUpperCase ();
        produtos[1] = "carregador";
        produtos[2] = "";
        produtos[3] = "";
        produtos[4] = "";
        produtos[5] = "";
        produtos[6] = "";
        produtos[7] = "";
        produtos[8] = "";
        produtos[9] = "";


        */
        //

         //Outra forma de declarar um array
         String [] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
         for (int k = 0; k < letras.length; k++) {
             System.out.println(letras[k]);
         }

         int [] numeros = {1, 2, 14, 4, 5, 50, 7, 8, 9, 10};
         int maior = numeros[0];
         int menor = numeros[0];
         int soma = 0;
         int media2 = 0;

         for (int j = 0;  j < numeros.length; j++) {
             if (numeros[j] > maior) {
                 maior = numeros[j];
             }
             if (numeros[j] < menor) {
                 menor = numeros[j];
             }

                soma += numeros[j];
                media2 = soma / numeros.length;
         }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media2);



        String [] produtos = new String[3];
        Double [] precos = new Double[3];

        Scanner entrada = new Scanner ( System.in ); // Atribuição de uma variavel em classe objeto

        for (int i = 0; i < produtos.length; i++) {
            System.out.println(" Informe o nome do produto º" + (i + 1) + ":");
            produtos[i] = entrada.nextLine ();
            System.out.println(" Informe o preço do produto º" + (i + 1) + ":");
            precos[i] = entrada.nextDouble ();

            // limpeza do buffer
            entrada.nextLine ();
        }
        double media = 0;
        for (int i = 0; i < precos.length; i++) {
            System.out.println("O produto " + produtos[i] + ", Custa R$ \n" + precos[i]);
            media += precos[i];

        }

        media = (media / precos.length);

        System.out.println(" A média de preço dos Produtos é R$ \n" + media);

        for (int i = 0; i < precos.length; i++) {
            if (precos[i] < media)
                System.out.printf("O produto %s Esta abaixo da média %.2f , Custa R$ %.2f\n", produtos[i], media, + precos[i]);

        }

        entrada.close ();

    }
}
