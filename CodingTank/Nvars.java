public class Nvars {
    static void main(String[] args){
        // Tipos premitivos - São valores armazenados
        // Tipos não premitivos (Objeto) - "String não é premitivo", é imutavél, ao ser alterada é criado outro endereço na mémoria.
        // Interger (Wraper) do int, então ele envelopa um tipo premitivo, permitindo assim eu utilizar como objeto

        // Tipos de variaveis primitivas;
        byte b = 5; // 128 a 127
        short s = 6; // 32.768 a 32.767
        int inteiro = 10; //
        long lon = 100000l;
        float f = 10.5f;
        double dSimpDou = 0.0;
        char ch = 'A';
        boolean logico = false;

        // Tipos de variáveis Objetos;
        Float fObj = 1235f;
        Long lLong = 1090l;
        Double dObjDoub = 123d;
        Boolean bBole = Boolean.TRUE;
        Integer envelopINt = 1000;
        Character cCc = 'a';

        String str = "Cruz_Javeiro";



        System.out.println ( "Variaveis tipos Primitivos; \n" + b + "\n" + s + "\n" + inteiro + "\n" + lon + "\n" + f + "\n" + ch + "\n" + str + "\n" + logico + "\n" + envelopINt );

        System.out.println ( "Variaveis tipos Objetos; \n" + fObj + "\n" + lLong + "\n" + dObjDoub + "\n" + bBole + "\n" + cCc );

        if (logico) {
            System.out.println ( "Verdadeiro" );
        } else {
            System.out.println ( "Falso" );
        }

        if (b == s) {
            System.out.println ( "Iguais" + b + " " + s );
        } else {
            System.out.println ( "Diferentes" + b + " " + s );
        }

        if ( inteiro > b ) {
            System.out.println ( "Inteiro é maior que b e s" );
        } else if (b < s && s < inteiro) {
            System.out.println ( "Inteiro é menor que b e s" );
        }


    }

}
