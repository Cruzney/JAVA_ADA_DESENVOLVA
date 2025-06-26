interface Funcionario {
    int calcularFerias();
}

class CLT implements BackupGitDownloadMain.ada_t1321.ada_t1321.POO.aula3.exercicio.Funcionario {
    @Override
    public int calcularFerias() {
        return 30;
    }
}

class PJ implements BackupGitDownloadMain.ada_t1321.ada_t1321.POO.aula3.exercicio.Funcionario {
    @Override
    public int calcularFerias() {
        return 0;
    }
}

class Estagiario implements BackupGitDownloadMain.ada_t1321.ada_t1321.POO.aula3.exercicio.Funcionario {
    @Override
    public int calcularFerias() {
        return 15;
    }
}

public class Funcionario {
    public static void main(String[] args) {
        BackupGitDownloadMain.ada_t1321.ada_t1321.POO.aula3.exercicio.Funcionario[] funcionarios = new BackupGitDownloadMain.ada_t1321.ada_t1321.POO.aula3.exercicio.Funcionario[3];
        funcionarios[0] = new CLT();
        funcionarios[1] = new PJ();
        funcionarios[2] = new Estagiario();

        for (BackupGitDownloadMain.ada_t1321.ada_t1321.POO.aula3.exercicio.Funcionario funcionario : funcionarios) {
            int diasFerias = funcionario.calcularFerias();
            System.out.println("Dias de férias: " + diasFerias);
        }
    }
}