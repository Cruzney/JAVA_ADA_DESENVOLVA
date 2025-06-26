class poo {
    // estudo java, como chamar um metodo main com parametros diversificados e intepretação especifica
    public static void main(String[] input) {
        if (input.length > 0) {
            for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
            }
        } else {
            System.out.println("Informe ao menos um parametro: ");
        }
    }
}