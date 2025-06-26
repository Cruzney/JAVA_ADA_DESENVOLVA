// Em uma escola de São Paulo, um dos professores responsáveis pelas aulas de informática decidiu automatizar as apurações de notas dos alunos. Para isso, ele precisa de uma ajuda extra na construção de algumas classes.

// Para ajudar o professor, construa um método chamado calcularMediaFinal que receba como parâmetro a matrícula do aluno (matricula), duas notas de provas (nota1 e nota2) e uma nota de trabalho (nota_trabalho) e calcule a média final do aluno.

// Observações:

// Utilize os mesmos nomes de parâmetros que estão entre parenteses na descrição do exercício.
// Para calcular a média, considere: somar todas as notas e dividir por três.

// Exemplo:

// calcularMediaFinal(123, 8.0, 7.0, 6.0) // retorna 7.0

public class media { 
	 // Implemente aqui 
	 public static void main(String[] args) {
		 String matricula = "1321";
		 double nota1 = 8.0;
		 double nota2 = 7.0;
		 double nota_trabalho = 6.0;
		 double mediaFinal = calcularMediaFinal(matricula, nota1, nota2, nota_trabalho);
		 System.out.println("Media Final Aluno, Matricula: " + matricula + " Média =  " + mediaFinal);

	 }

	 public static double calcularMediaFinal(String matricula, double nota1, double nota2, double nota_trabalho) {
		 return (nota1 + nota2 + nota_trabalho) / 3;
	 }
}