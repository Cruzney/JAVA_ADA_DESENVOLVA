public class Stringstest {
    public static void main(String[] args){
        /*
        Num sistema de cadastros, voce precisa criar uma saudação personalizada para o cliente, informando o nome completo
        em letras maiúsculas, o número de caracteres no nome, verificar se o nome digitado é igual ao de um cliente já cadastrado,
        ignorando o formato da escrita.
        Além disso, vamos fazer a separação do nome e sobrenome, a exibição da primeira letra do nome e a posição do sobrenome.
         */
        String nomeDigitado = "Edinei Cruz";
        String nomeCadastrado = "edinei cruz";

        // Comparação dos nomes
        boolean nomeIguais = nomeDigitado.equals(nomeCadastrado);
        System.out.println("Teste de comparação de nomes, " + nomeIguais + "!");

        // Comparação dos nomes ignorando o formato da escrita
        boolean nomeIguaisIgnorandoCase = nomeDigitado.equalsIgnoreCase(nomeCadastrado);
        System.out.println("Teste de comparação de nomes ignorando o formato da escrita, " + nomeIguaisIgnorandoCase + "!");

        //Convereter para letras maiúsculas
        String nomeMaiusculo = nomeDigitado.toUpperCase();
        System.out.println("Nome em letras maiúsculas: " + nomeMaiusculo);

        //Convereter para letras minúsculas
        String nomeMinusculo = nomeDigitado.toLowerCase();
        System.out.println("Nome em letras minúsculas: " + nomeMinusculo);

        //Obter tamanho da String
        int tamanhoNome = nomeDigitado.length();
        System.out.println("O nome tem " + tamanhoNome + " caracteres!");

        //Saudação personalizada
        String saudacao = "Bem Vindo, ".concat ( nomeMaiusculo ).concat ( "!" );
        System.out.println ( saudacao );

        //Obter a primeira letra do nome
        char primeiraLetra = nomeDigitado.charAt(0);
        System.out.println("Primeira letra do nome: " + primeiraLetra);

        //Obter a posição do sobrenome
        int posicaoSobrenome = nomeDigitado.indexOf("Cruz");
        if (posicaoSobrenome != -1){
            System.out.println("Posição do sobrenome: " + posicaoSobrenome);
        }
        else {
            System.out.println("Sobrenome não encontrado!");
        }
    }
}
