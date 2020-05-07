package day06_Shorthand_LogicalOperators;

public class logicalOperators {
    public static void main(String[] args) {
        boolean result1 = true;
        System.out.println(!result1);

        boolean result2 = 10 + 15 > 15;
        System.out.println(!result2);


        boolean R1 = "Corona Virus" != "End of the word" && "Toilet paper " == " Cure";
                             // true                &&     false ==> false

        boolean R2 = 10>15 && 15 < 13;
               // false && false ==> false

        System.out.println(R1);
        System.out.println(R2);

        boolean R3 = 'a' == 'b'-1 && 'b'+1 == 'c';
               //    97 == 98-1 && 98+1 == 99
        System.out.println(R3);



    }
}
