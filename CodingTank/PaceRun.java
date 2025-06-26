import java.util.Scanner;

public class PaceRun {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );

        System.out.print ( "Digite os minutos do pace (ex: 3): " );
        int minutos = scanner.nextInt ( );

        System.out.print ( "Digite os segundos do pace (ex: 30): " );
        int segundos = scanner.nextInt ( );

        // Convertendo minutos e segundos para segundos totais
        int segundosTotaisPorKm = minutos * 60 + segundos;

        // Calculando a velocidade em m/s
        double velocidadeMetrosPorSegundo = 1000 / (double) segundosTotaisPorKm;

        // Convertendo m/s para km/h
        double velocidadeKmPorHora = velocidadeMetrosPorSegundo * 3.6;

        System.out.printf ( "A velocidade a ser configurada na esteira é: %.2f km/h" , velocidadeKmPorHora );

        scanner.close ( );
    }
}

//No mundo da corrida existe uma unidade de ritmo chamada pace, referente a quanto tempo demora para completar um quilômetro.
//Na planilha de treinos de um aleta, conta fazer um treino de 10km a 3:30/km. O atleta precisa treinar na esteira e não sabe
//qual velocidade configurar a esteira. Ajude esse atleta definindo uma
//calculadora de pace. Leia com Scanner os minutos, depois os segundos e informa e velocidade em km/h.