public class App {
    public static void main(String[] args) {
        RegistraPonto ponto = new RegistraPonto();


        ponto.StarDay(8, 20);
        ponto.EndDay(16, 33);

        var horasTrabalhadas = CalculaSalario.calculaSalario ( int horasTrabalhadas, double salario);

        System.out.println("Horas trabalhadas: " + ponto.getHorasTrabalhadas());



        Funcionario funcionario = new Funcionario("João", "123.456.789-00", 1000.0);
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Salário: " + funcionario.getSalario());
    }
}
