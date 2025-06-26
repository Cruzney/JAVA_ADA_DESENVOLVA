import java.util.ArrayList;
import java.util.List;

public class AutoBoxUnibox {
    private static Object Integer;

    public static void main( String[] args) {
        // Autoboxing
        int i = 10;
        Integer intObj = i;
        System.out.println("Autoboxing: " + intObj);

        // Unboxing
        int i2 = intObj;
        System.out.println("Unboxing: " + i2);

        // Autoboxing
        double d = 10.5;
        Double doubleObj = d;
        System.out.println("Autoboxing: " + doubleObj);

        // Unboxing
        double d2 = doubleObj;
        System.out.println("Unboxing: " + d2);

        // Autoboxing
        char c = 'A';
        Character charObj = c;
        System.out.println("Autoboxing: " + charObj);

        // Unboxing
        char c2 = charObj;
        System.out.println("Unboxing: " + c2);

        // Autoboxing
        boolean b = true;
        Boolean booleanObj = b;
        System.out.println("Autoboxing: " + booleanObj);

        // Unboxing
        boolean b2 = booleanObj;
        System.out.println("Unboxing: " + b2);

        // Exemplo de autoboxing e unboxing em uma lista
        List<Integer> li = new ArrayList<> ();
        for (i = 1; i < 50; i += 2)
            li.add(i);
        System.out.println("Lista de números ímpares: " + li + "\n");

        // representação do código acima, acontecimento de autoboxing
        List<Integer> li2 = new ArrayList<>();
        for ( i = 1; i < 50; i += 2)
            //li2.add(Integer.valueOf(i));
            li2.add(i);
        System.out.println("Lista de números ímpares: " + li2 + "\n");

        
    }
}
