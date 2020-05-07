package day05_Unary_ShorthandOperators;

public class VariablesPractice {

    public static void main(String[] args) {
        // whole numbers: byte , short, in. long
        // Decimal numbers: float, double

        int a1 = 100;

        float f1 = a1;
            // f1 = 100L;
            // f1 = 100.0;

        System.out.println(f1);

        long l1 = (long)f1;
           // l1=100;
        System.out.println(l1);

        String name;

        // System.out.println(name); // local variables cannot be used without initializing

        name = "Cybertek"; // in java : first come fist serve

        System.out.println(name );

        
    }
}
