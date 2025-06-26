public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        // Tentativas de alteração de senha
        System.out.println(usuario.alterarSenha("123456"));
        System.out.println(usuario.alterarSenha("password"));
        System.out.println(usuario.alterarSenha("123456")); // Deve retornar a mensagem de erro
        System.out.println(usuario.alterarSenha("novaSenha"));
    }
}