//     Em uma escola de São Paulo, um dos professores responsáveis pelas aulas de informática decidiu automatizar as apurações de notas dos alunos. 
// Para isso, ele precisa de uma ajuda extra na construção de algumas classes.

// O professor já deixou pronto um método chamado calcularMediaFinal que recebe como parâmetro a matrícula do aluno,
// duas notas de provas e uma nota de trabalho e retorna a média final do aluno. Além deste primeiro método, 
// ele já deixou a estrutura do método verificarPromocaoAluno pronta, porém não deu tempo de implementar a lógica necessária.

// O método verificarPromocaoAluno deverá conferir a média final do aluno e determinar se o aluno foi aprovado.
// Caso tenha sido aprovado, deverá retornar a seguinte mensagem: "Aluno aprovado com média X", onde X é a média final do aluno. 
//Em caso de reprovação, a mensagem deverá ser: "Aluno reprovado com média X", onde X é a média final do aluno.

// Observações:
// Para ser aprovado, o aluno deverá ter uma média final maior ou igual a 7.

public class Solution { 
    public static double calcularMediaFinal(String matricula, double nota1, double nota2, double nota_trabalho) { 
        return (nota1 + nota2 + nota_trabalho) / 3; 
    } 

    public static String verificarPromocaoAluno(String matricula, double nota1, double nota2, double nota_trabalho) { 
        double mediaFinal = calcularMediaFinal(matricula, nota1, nota2, nota_trabalho);
        if (mediaFinal >= 7) {
            return "Aluno aprovado com média " + mediaFinal;
        } else {
            return "Aluno reprovado com média " + mediaFinal;
        }
    } 
}

