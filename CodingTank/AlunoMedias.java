import java.util.Scanner;

public class AlunoMedias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println ( "Digite a nota do aluno: " );
        int nota = scanner.nextInt();
        String graducacao = "";

        if ( nota >= 90 ) {
            graducacao = "A";
        } else if ( nota < 80 && nota >= 70 ) {
            graducacao = "B";
        } else if ( nota < 70 && nota >= 60 ) {
            graducacao = "C";
        } else if ( nota < 60 && nota >= 0 ) {
            graducacao = "D";
        } else {
            graducacao = "";
        }

        switch (graducacao) {
            case "A":
            case "B":
                System.out.println("Parabéns! Sua nota é A ou B, Aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Sua nota é C ou D. NÂO APROVADO!");
                break;
            default:
                System.out.println("Nota inválida. Não Graduado!");

            scanner.close();
        }
    }
}
