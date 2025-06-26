import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Locale;
import java.util.Scanner;

public class DateTest {
    public static void main ( String[] args) {
        /*
        Funcionalidades
        * LocalDate: Representa uma data, sem incluir informações de hora ou fuso horario, armazena ano, mês e dia.
        * LoccalTime: Representa uma hora do dia, sem incluir informações de data ou fuso horario, armazena hora, minuto, segundo e frações de segundo.
        * LocalDateTime: Representa uma combinação de data e hora, sem incluir informações de fuso horario.
        * ZonedDateTime: Representa uma combinação de data e hora com um fuso horario.
        * Period: Representa um período, entre duas datas, com precisão de dias, meses e anos.
        * DateTimeFormatter: Formata datas e horas.
        -----------------------------------------------
        Uma empresa quer registrar a data de aniversário dos clientes para enviar ofertas especiais nos seus aniversários.
        * Verificar se a data do evento ocorre antes ou depois de uma data específica, exemplo hoje.
        * Armazenar a data de aniversário de um cliente, registrar data e hora de cadastros no sistema, "Incluir o fuso horário".
        * Calcular o período até o próximo aniversário do Cliente para enviar mensagem personalizada.
         */

        Scanner entrada = new Scanner (System.in);

        // Data de Hoje
        LocalDate hoje = LocalDate.now();
        System.out.println ( "Data de Hoje: " + hoje );

        // Local
        Locale brasil = new Locale("pt", "BR");
        System.out.println ( "Local: " + brasil.getDisplayCountry() );

        // Saudação
        String saudacao = "";
        System.out.println ( "Informe seu nome:" );
        String nome = entrada.nextLine ( ); // entrada de dados
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName ( java.time.format.TextStyle.FULL, brasil );
        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "Bom dia!";
        }
        else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde!";
        }
        else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite!";
        }

        System.out.printf(" Olá, %s. Hoje é %s, %s.%n ", nome, diaDaSemana, saudacao);

        System.out.println ( );

        // Cadastro do Cliente
        LocalDate dataNascimento = LocalDate.of(1986, 3, 28);
        System.out.printf( "O Sr. %s, Nasceu em, %tF  : ",  nome , dataNascimento );

        // Data e hora do cadastro do Cliente
        LocalDateTime dataHoraAcesso = LocalDateTime.now();
        System.out.println ( "Data e Hora deste Acesso: " + dataHoraAcesso );

        //Próximo aniversário do Cliente
        LocalDate hoje2 = LocalDate.now ( );
        LocalDate proximoAniversario = dataNascimento.withYear ( hoje2.getYear ( ) );
        if (proximoAniversario.isBefore ( hoje2 ) || proximoAniversario.isEqual ( hoje2 )) {
            proximoAniversario = proximoAniversario.plusYears ( 1 );
        }
        System.out.println ( "Próximo Aniversário do Cliente: " + proximoAniversario );

        //Calcular período até o próximo aniversário
        Period periodoAteProximoAniversario = Period.between ( hoje2, proximoAniversario );
        System.out.println ( "Faltam " + periodoAteProximoAniversario.getMonths ( ) +
                " meses e " + periodoAteProximoAniversario.getDays ( ) + " dias para o próximo aniversário." );

        // Verificar se a data do evento ocorre antes ou depois de uma data específica, exemplo hoje.
        LocalDate evento = LocalDate.of ( 2024, 10, 11 );
        if (proximoAniversario.isAfter ( evento )) {
            System.out.println ( "O evento ocorre depois de hoje." );
        }
        else {
            System.out.println ( "O Aniversário do Cliente é antes ou no mesmo dia do evento." );
        }


    }
}

