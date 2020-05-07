package day08_IfStatements;

public class MultiBranchIf {
    public static void main(String[] args) {
        int a = -7;
        /*
        boolean zero = a ==0;
        boolean negative = a < 0;
        boolean positive = a > 0;

        if(zero){
            System.out.println("Zero");
        }

        if(negative){
            System.out.println("Negativ");
        }

        if(positive){
            System.out.println("Positive");
        }
        */

        String result = " ";
        if(a==0){
           // System.out.println("Zero");
            result = "Zero";
        }else if(a > 0) {
            //System.out.println("Positive");
            result = "Positive";
        }else{
          //  System.out.println("Negative");
            result = "Negative";
        }
        System.out.println(result);
    }
}
