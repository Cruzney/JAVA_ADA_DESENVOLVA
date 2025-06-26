// Crie uma classe Usuario com um atributo privado senhas e um método alterarSenha.

// Caso a nova senha seja igual as três últimas fornecidas, o método alterarSenha deverá retornar "Senha não pode ser igual as três últimas utilizadas";
// Caso seja diferente, deve retornar "Senha alterada com sucesso".

class Usuario {
    private String[] senhas = new String[3];

    public Usuario(String senha1, String senha2, String senha3) {
        senhas[0] = senha1;
        senhas[1] = senha2;
        senhas[2] = senha3;
    }

    public Usuario(String senhaInicial) {
        senhas[0] = senhaInicial;
        senhas[1] = "";
        senhas[2] = "";
    }

    public String alterarSenha(String novaSenha) {
        for (String senha : senhas) {
            if (senha.equals(novaSenha)) {
                return "Senha não pode ser igual as três últimas utilizadas";
            }
        }
        senhas[2] = senhas[1];
        senhas[1] = senhas[0];
        senhas[0] = novaSenha;
        return "Senha alterada com sucesso";
    }
}
