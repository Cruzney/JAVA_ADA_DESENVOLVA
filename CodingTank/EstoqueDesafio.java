import java.util.InputMismatchException;
import java.util.Scanner;

public class EstoqueDesafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int estoqueInicial = 5;
        int totalCompra = 0;

        while (estoqueInicial > 0) {
            try {
                System.out.print("Quantos produtos deseja comprar? : ");
                int quantProd = entrada.nextInt();

                if (quantProd > estoqueInicial) {
                    System.out.println("Não há estoque suficiente para a quantidade Desejada: " + quantProd);
                    System.out.println("Informe uma quantidade menor, Estoque Disponível = " + estoqueInicial);
                } else {
                    estoqueInicial -= quantProd;
                    totalCompra += quantProd;
                    System.out.println("Comprou: " + quantProd + " Restam: " + estoqueInicial);
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: informe um valor Inteiro");
                return;
            }
        }

        System.out.println("Compra total: " + totalCompra + " Estoque Final = " + estoqueInicial);
    }
}